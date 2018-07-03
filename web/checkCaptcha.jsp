<%-- 
    Document   : checkCaptcha
    Created on : 15 Oct, 2014, 1:44:15 PM
    Author     : Jarodiya Kinjal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String captcha="";
    String c1="";
    if(session.getAttribute("CAPTCHA_KEY")!=null)
    {
        captcha = session.getAttribute("CAPTCHA_KEY").toString();
        System.out.println("captcha in jsp "+captcha);
    }
    else{
       System.out.println("in else null");  
       captcha="sdgfrt";
    }
       if(request.getParameter("Captcha")!=null)
    {
        c1=request.getParameter("Captcha");
        System.out.println("enter captcha: "+c1);
        if(!c1.equalsIgnoreCase(captcha))
             out.println("re-enter captcha!!");
    }
%>
