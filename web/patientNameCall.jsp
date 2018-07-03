<%-- 
    Document   : patientNameCall
    Created on : 29 Mar, 2015, 1:12:27 PM
    Author     : Kinjal Jarodiya
--%>

<%@ page  import="java.io.*"%> 
<%@ page  import="java.sql.Connection"%> 
<%@ page  import="java.sql.DriverManager"%>
<%@ page  import="java.util.HashMap"%>
<%@ page  import="java.util.Map"%>
<%@ page  import="net.sf.jasperreports.engine.*"%>
 
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Connection conn = null;
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EIP", "root", "");
            } 
            catch (Exception ex) 
            {
                ex.printStackTrace();
            }
            File reportFile = new File(application.getRealPath("reports//patientNameReport.jasper"));//your report_name.jasper file
            Map parameters = new HashMap();
            String name=request.getParameter("txtCpatientName");
            parameters.put("nm",name);
            byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), parameters, conn);
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            ServletOutputStream outStream = response.getOutputStream();
            outStream.write(bytes, 0, bytes.length);
            outStream.flush();
            outStream.close();
        %>
    </body>
</html>
