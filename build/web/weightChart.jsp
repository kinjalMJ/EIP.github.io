


<%@page import="java.awt.geom.Rectangle2D"%>
<%@page import="com.itextpdf.awt.DefaultFontMapper"%>
<%@page import="java.awt.Graphics2D"%>
<%@page import="com.itextpdf.text.pdf.PdfTemplate"%>
<%@page import="com.itextpdf.text.pdf.PdfContentByte"%>
<%@page import="com.itextpdf.text.Document"%>
<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@page import="org.jfree.data.category.DefaultCategoryDataset"%>
<%@page import="org.jfree.chart.plot.PlotOrientation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*" %>
<%@page import="java.sql.*" %>
<%@page import="logic.logicFunction"%>

<%@page import="org.jfree.chart.JFreeChart" %>
<%@page import="org.jfree.chart.ChartUtilities" %>
<%@page import="org.jfree.chart.ChartFactory" %>
<%@page import="org.jfree.data.general.DefaultPieDataset" %>



<%
 try
 {      HttpSession s1=request.getSession(true);
        String operation=logicFunction.checkRequestNull(request,"opr").trim();
        
        String  uid="";
         if(session.getAttribute("userId")!=null)
        {
            uid= session.getAttribute("userId").toString();
            
        }
      //  uid="7";
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        con=logicFunction.getConnection();
        st=con.createStatement();
        String title;
        String x;
        String y;
        String q=""; 
        if(operation.equalsIgnoreCase("1"))
        {
            title="Weight Chart";
            x="Age (In months)";
            y="Weight (In kg)";
            q="select vr.Wieght,vd.age_range from vaccination_record vr inner join vaccine_dose vd on vr.Vaccine_Dose_Id=vd.Vaccine_Dose_Id where Patient_Id="+uid+" order by vd.Age_Range asc";
        }
        else if(operation.equalsIgnoreCase("2"))
        {
            title="Height Chart";
            x="Age (In months)";
            y="Height (In ft)";
            q="select vr.height ,vd.age_range from vaccination_record vr inner join vaccine_dose vd on vr.Vaccine_Dose_Id=vd.Vaccine_Dose_Id where Patient_Id="+uid+" order by vd.Age_Range asc";
        }
        else 
        {
            title="Pulse Chart";
            x="Age (In months)";
            y="Pulse (In Htz)";
            q="select vr.Pluses ,vd.age_range from vaccination_record vr inner join vaccine_dose vd on vr.Vaccine_Dose_Id=vd.Vaccine_Dose_Id where Patient_Id="+uid+" order by vd.Age_Range asc";
        }
        rs=st.executeQuery(q);
        float w;
        String a;
        while(rs.next())
        {
            w = Float.parseFloat(rs.getString(1));
            a = rs.getString(2);
            dataSet.setValue(w, title , a);
        }
        JFreeChart chart=null;        
        if(operation.equalsIgnoreCase("3"))
        {
            chart=ChartFactory.createLineChart3D(title, x, y,dataSet, PlotOrientation.VERTICAL,true, true, false);
        }
        else
        {
            chart=ChartFactory.createBarChart3D(title, x, y,dataSet, PlotOrientation.VERTICAL, true, true, false);
        }         
        File f=new File("D:/");
        File image = File.createTempFile("image", "tmp",f);
     //JFreeChart chart1=ChartFactory.createBarChart("try", "cus", "mea", dataSet, true, true, true, true);
 // Assume that we have the chart
 ChartUtilities.saveChartAsPNG(image,chart, 900, 300);
 FileInputStream fileInStream = new FileInputStream(image);
 OutputStream outStream = response.getOutputStream();
 long fileLength;
 byte[] byteStream;
 fileLength = image.length();
 byteStream = new byte[(int)fileLength];
 fileInStream.read(byteStream, 0, (int)fileLength);
 response.setContentType("image/png");
 response.setContentLength((int)fileLength);
 response.setHeader("Cache-Control","no-store,no-cache, must-revalidate, post-check=0, pre-check=0");
 response.setHeader("Pragma", "no-cache");
 fileInStream.close();
 outStream.write(byteStream);
 outStream.flush();
 outStream.close();
 PdfWriter writer = null;
 int width=200;
 int height=500;
 Document document = new Document();
 String fileName="C://barchart.pdf";
 document.open();
 PdfContentByte contentByte = writer.getDirectContent();
PdfTemplate template = contentByte.createTemplate(width, height);
Graphics2D graphics2d = template.createGraphics(width, height,new DefaultFontMapper());
Rectangle2D rectangle2d = new Rectangle2D.Double(0, 0, width,height);
chart.draw(graphics2d, rectangle2d);
graphics2d.dispose();
contentByte.addTemplate(template, 0, 0);
 }
 catch (IOException e)
 {
 System.err.println("Problem occurred creating chart.");
 }

%>