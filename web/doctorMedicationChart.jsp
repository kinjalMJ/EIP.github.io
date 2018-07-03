

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.awt.geom.Rectangle2D"%>
<%@page import="com.itextpdf.awt.DefaultFontMapper"%>
<%@page import="java.awt.Graphics2D"%>
<%@page import="com.itextpdf.text.pdf.PdfTemplate"%>
<%@page import="com.itextpdf.text.pdf.PdfContentByte"%>
<%@page import="com.itextpdf.text.Document"%>
<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@page import="org.jfree.data.category.DefaultCategoryDataset"%>
<%@page import="org.jfree.chart.plot.PlotOrientation"%>
<%@page import="java.io.*" %>
<%@page import="java.sql.*" %>
<%@page import="logic.logicFunction "%>
<%@page import="org.jfree.chart.JFreeChart" %>
<%@page import="org.jfree.chart.ChartUtilities" %>
<%@page import="org.jfree.chart.ChartFactory" %>
<%@page import="org.jfree.data.general.DefaultPieDataset" %>



<%
 try
 {
     String uid= "";   
     if(session.getAttribute("UserId")!=null)
        {
            uid= session.getAttribute("UserId").toString();
        }
                                      
        DefaultPieDataset dataSet = new DefaultPieDataset();
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        con=logicFunction.getConnection();
        st=con.createStatement();
        String title="Prescribe Medicines";
        String x="";
        String y="";
        String  q="select count(m.Drugs_Id),d.Drugs_Name from medication m inner join drugs d on m.Drugs_Id=d.Drugs_Id  group by m.Drugs_Id";
       
        rs=st.executeQuery(q);
        //DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        int w;
        String  a="";
        while(rs.next())
        {
            w = Integer.parseInt(rs.getString(1));
            a = rs.getString(2)+"["+w+"]";
            dataSet.setValue(a, w);
        }

                
        JFreeChart chart=null;        
        chart=ChartFactory.createPieChart(title,dataSet, true, true, true);
        File f=new File("D:/");
        File image = File.createTempFile("image", "tmp",f);

 // Assume that we have the chart
 ChartUtilities.saveChartAsPNG(image,chart, 500, 300);

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
 out.println("createddddddddddddddd");
 fileInStream.close();
 outStream.write(byteStream);
 outStream.flush();
 outStream.close();
 PdfWriter writer = null;
 int width=400;
 int height=500;
 Document document = new Document();
 String fileName="C://barchart.pdf";
 writer = PdfWriter.getInstance(document, new FileOutputStream(fileName));
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
