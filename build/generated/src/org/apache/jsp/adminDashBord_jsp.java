package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logic.logicFunction;
import java.sql.*;
import java.awt.geom.Rectangle2D;
import com.itextpdf.awt.DefaultFontMapper;
import java.awt.Graphics2D;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.PlotOrientation;
import java.io.*;
import java.util.*;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;

public final class adminDashBord_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

 try
 {     
       Connection con=null;
    String query=null;    
    
        con=logicFunction.getConnection();
       // ArrayList a1=new ArrayList();
        Statement st=con.createStatement();
                                   
        
       String q="select count(vr.Vaccine_Id),vr.vaccine_Id,v.Vaccine_name from vaccination_record vr inner join vaccine v on vr.Vaccine_Id=v.Vaccine_Id group by vr.Vaccine_Id";
        ResultSet rs=st.executeQuery(q);
      
     DefaultPieDataset dataSet = new DefaultPieDataset();
        
        String title="Total Vaccination";
        String x="";
        String y="";
         //DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        int w;
        String  a="";
     
                while(rs.next())
                {
                    w = Integer.parseInt(rs.getString(1));
                    a = rs.getString("Vaccine_name") + " [ "+w + " ]";
                    dataSet.setValue(a, w);
                }


        JFreeChart chart=null;        
        chart=ChartFactory.createPieChart(title,dataSet, true, true, true);
        File f=new File("D:/");
        File image = File.createTempFile("image", "tmp",f);

     //JFreeChart chart1=ChartFactory.createBarChart("try", "cus", "mea", dataSet, true, true, true, true);


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


      out.write(' ');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
