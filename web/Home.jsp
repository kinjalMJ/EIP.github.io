<%-- 
    Document   : HomeJsp
    Created on : 14 Oct, 2014, 5:10:09 PM
    Author     : Jarodiya Kinjal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title> Immunization And Electronic Health Record </title>
        <link rel="stylesheet" href="css/layout.css" type="text/css"/>
        <link href="themes/6/js-image-slider.css" rel="stylesheet" type="text/css"/>
        <script src="themes/6/mcVideoPlugin.js" type="text/javascript"></script>
        <script src="themes/6/js-image-slider.js" type="text/javascript"></script>
        <SCRIPT>
        expireDate = new Date
        expireDate.setMonth(expireDate.getMonth()+6)
        jcount = eval(cookieVal("jaafarCounter"))
        jcount++
        document.cookie = "jaafarCounter="+jcount+";expires=" + expireDate.toGMTString()

        function cookieVal(cookieName) {
        thisCookie = document.cookie.split("; ")
        for (i=0; i<thisCookie.length; i++){
        if (cookieName == thisCookie[i].split("=")[0]){
        return thisCookie[i].split("=")[1]
        }
        }
        return 0
        }

        function page_counter(){
        for (i=0;i<(7-jcount.toString().length);i++)
        document.write('<span class="counter">0</span>')
        for (y=0;y<(jcount.toString().length);y++)
        document.write('<span class="counter">'+jcount.toString().charAt(y)+'</span>')
        }
        </SCRIPT>



    </head>
    <body>
        <div class="wrapper col1">
            <div id="topbar">
                <ul>
                    <li>
                        <a href="Home.jsp" class="current"><span></span>Home</a></li>
                    <li><a href="AboutUs.jsp"><span></span>About Us</a></li>         
                    <li><a href="VISHome.jsp"><span></span>VIS</a></li>
                    <li><a href="Contact.jsp"><span></span>Contact</a></li>
                </ul>
                <br class="clear" />
            </div>
        </div>
        <div class="wrapper col2">
            <div id="header">
                <div class="fl_left">
                    <table cellpadding="5px" cellspacing="0" border="0">
                        <tr>
                            <td><a href="#"><img src="images/Logo.png" alt="logo"/></a></td>
                            <td><h1><a href="#">Immunize and</a></h1>
                                <p><h3>eHealthcare</h3></p></td>
                        </tr>
                    </table>
                </div>
                <div class="fl_right"></div>
                <br class="clear"/>
            </div>
        </div>
        <div class="wrapper col3">
            <div id="topnav">
                <table>
                    <tr>
                        <td>   
                            <div id="sliderFrame">
                                <div id="slider">
                                    <a href="#">
                                    <img src="themes/images/image-slider-1.jpg" alt=""/>
                                    </a>
                                    <a href="#">
                                        <img src="themes/images/image-slider-2.jpg" alt=""/>
                                    </a>
                                    <a href="#">
                                        <img src="themes/images/image-slider-3.jpg" alt=""/>
                                    </a>
                                    <a href="#">
                                        <img src="themes/images/image-slider-4.jpg" alt="" height="100" width="1000"/>
                                    </a>
                                    <a href="#">
                                        <img src="themes/images/image-slider-5.jpg" alt=""/>
                                    </a>
                                </div>
                            </div>
                        </td>
                        <td>  
                            <div>
                                <div id="login">
                                    <h2>Log In</h2>
                                    <%
                                        if(request.getParameter("err")!=null)
                                            out.println(request.getParameter("err"));
                                    %>
                                    <form method="get" action="LoginServlet1" id="form1" name="formRe">
                                        <fieldset id="inputs">
                                                    <input id="un" type="text" class="username" name="uname" placeholder="Username" autocomplete="off" autofocus required>
                                                    <input id="ps" type="password" class="password" name="pass" placeholder="Password" required>
                                                    <select id="type1"  name="tp" required>
                                                    <option value="admin">Admin</option>
                                                    <option value="HealthcareProvider">Healthcare Provider</option>
                                                   <!-- <option value="Moderator">Moderator</option>-->
                                                    <option value="Patient">Patient</option>
                            
                                                </select>
                                        </fieldset>               
                                        <fieldset id="actions">
                                            <input type="submit" name="submit" id="submit" class="submitbtn" value="Log in"/>
                                        </fieldset>
                                        <fieldset id="Mylink">
                                            <a href="forgetPassword.jsp">Forgot your password?</a> 
                                        </fieldset>
                                    </form>
                                </div> 
                            </div>
                        </td>                    
                    </tr>
                </table>
                <br class="clear" />
            </div>
        </div>
        <div id="preLoaderDiv">
                <img id="preloaderAnimation" src="loading.gif"/>
                <style>
                .counter
                {
                background-color:white;
                color:blue;
                font-weight:bold;
                font-size: xx-large
                }
                </style> 
                
                <label id="counter" name="visitors" style="color: red;font-size: xx-large ">Visitors</label>
                <script>
                page_counter(jcount);
                    </script>
               
        </div>

            <div class="wrapper col6">
                <div id="footer">
                <center>
                <div class="footbox">
                    <h2>Vaccination</h2>
                    <p> A vaccine is an antigenic preparation used to produce active immunity to a disease, in order to prevent or reduce the effects of infection by any natural or "wild" pathogen.</p>
                </div>
                <div class="footbox">
                    <h2>Our Programs</h2>
                    <p>"Programs" Includes Immunization information, Chronic Disease and Health Promotion, Family Health checkup and Environmental Health.</p>
                </div>
                <div class="footbox">
                    <h2>Our Services</h2>
                    <p>"Services" provides information on clinical, preventive, and outreach work; training for consumers and business partners, work we do with other governmental entities, professionals, and advisory boards.</p>
                </div>
                <div class="footbox">
                    <h2>Health Records</h2>
                    <p> Health Information" provides a variety of topics such as specific diseases and conditions, family health, environmental health, and workplace health records and safety.</p>
                </div>
                <br class="clear"/>
                </center>
            </div>
        </div>                               

        <div class="wrapper col7">
            <div id="copyright">
                <p class="fl_left">Copyright &copy; 2015 - All Rights Reserved - 
                <a href="www.ImmunizeYourBaby.co.in">ImmunizeYourBaby.co.in</a></p>
                <br class="clear"/>
            </div>
        </div>
                <div id="bottom"></div>
    </body>
</html>