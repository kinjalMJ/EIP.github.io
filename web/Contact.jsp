<%-- 
    Document   : Contact
    Created on : 31 Jan, 2015, 5:13:38 PM
    Author     : Kinjal Jarodiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
          <title></title>
    <link rel="stylesheet" href="css/layout.css" type="text/css" />
    <script language="javascript" type="text/javascript" src="js/FunctionJS.js"> </script>
     <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
    <script type="text/javascript">

        var map;
        function initialize() {
            var latlng = new google.maps.LatLng(23.189786000000000000, 72.6369220999999990000);
            var myOptions = {
                zoom: 16,
                center: latlng,
                mapTypeId: google.maps.MapTypeId.ROADMAP
            };
            map = new google.maps.Map(document.getElementById("map"), myOptions);
            var marker = new google.maps.Marker
                                                    (
                                                        {
                                                            position: new google.maps.LatLng(23.189786000000000000, 72.6369220999999990000),
                                                            map: map,
                                                            title: 'Click me'

                                                        }
                                                    );

            var infowindow = new google.maps.InfoWindow({
                content: 'BISAG:<br/>Gandhinagar-Ahmedabad Road</br>Infocity</br>Gandhinagar</br>Gujarat</br>India'
            });
            google.maps.event.addListener(marker, 'click', function () {
                // Calling the open method of the infoWindow 
                infowindow.open(map, marker);
            });
            infowindow.open(map, marker);
        }
        
    </script>
    <script type="text/javascript">

        var map1;
        function initialize1() {
            var latlng = new google.maps.LatLng(23.189786000000000000, 72.6369220999999990000);
            var myOptions = {
                zoom: 16,
                center: latlng,
                mapTypeId: google.maps.MapTypeId.ROADMAP
            };
            map1 = new google.maps.Map(document.getElementById("map1"), myOptions);
            var marker = new google.maps.Marker
                                                    (
                                                        {
                                                            position: new google.maps.LatLng(23.189786000000000000, 72.6369220999999990000),
                                                            map: map1,
                                                            title: 'Click me'

                                                        }
                                                    );

            var infowindow = new google.maps.InfoWindow({
                content: 'BISAG:<br/>Gandhinagar-Ahmedabad Road</br>Infocity</br>Gandhinagar</br>Gujarat</br>India<br />CALL: 9909912765, 7878512765'
            });
            google.maps.event.addListener(marker, 'click', function () {
                // Calling the open method of the infoWindow 
                infowindow.open(map1, marker);
            });
            infowindow.open(map1, marker);
        }
      
    </script>
    <script type="text/javascript">
        function loadmaps() {
            initialize();
            initialize1();
        }
        window.onload = loadmaps;
    </script>
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
                    <table cellpadding="5px" cellspacing="0" border="0"   >
                        <tr>
                            <td><a href="#"><img src="images/Logo.png" alt="logo" /></a></td><td><h1><a href="#">Immunize and</a></h1><p><h3>eHealthcare</h3></p></td>
                        </tr>
                    </table>
                </div>
                <div class="fl_right"></div>
                <br class="clear" />
            </div>
        </div>
        
    <div class="wrapper col5">
        <div id="container">
            <h5>Have questions about our services?&nbsp; Here?s how to contact us:</h5>
            <table cellspacing="10px" >
                <tr>
                    <td width="50%" valign="top">
                        <table cellpecing="10px">
                              <tr>
                                <td>
                                    <h3>Address One</h3>
               
                                </td>
                            </tr>
                             <tr>
                                <td>
                                  <div id="map1" style="width: 400px; height: 270px">
                                </td>
                            </tr>
                            
                        </table>
                        
                        
                        
                        
                        
                    </td>
                    <td valign="top" width="50%">
                        <table cellpecing="10px">
                            <tr>
                                <td>
                                    BISAG:<br/>
                                    Gandhinagar-Ahmedabad Road</br>
                                    Infocity</br>Gandhinagar</br>
                                    Gujarat</br> India<br/>
                       CALL: 9909912765, 7878512765<br />
                9 a.m.-8 p.m. Monday-Thursday, GMT<br />
                9 a.m.-6 p.m. Friday, GMT<br />
                  
                         Fax:(022) 2656 5500</P>                                </td>
                            </tr>
                             <tr>
                                <td>
                                 <div id="map" style="width: 400px; height: 270px">
                                </td>
                            </tr>
                           
                        </table>
                        
                    </td>
                </tr>
                <tr>
                    <td>
                        <h2>Contact Form</h2>
                    <form method="post" name="contact" action="#">
                        <table cellpadding="0" cellspacing="0">
                            <tr>
                                <td>
                                    <label for="author">Name:</label> 
                                    
                                </td>
                                <td>
                                    <input type="text" id="author" name="author" class="required input_field" />
                                </td>
                            </tr>
                            
                            <tr>
                                <td>
                                    <label for="email">Email:</label>
                                   
                                </td>
                                 <td>
                                     <input type="text" id="email" name="email" class="validate-email required input_field" />    
                                </td>
                            </tr>
                           
                            <tr>
                                <td>
                                    <label for="url">Phone:</label>
                                   
                                </td>
                                 <td>
                                      <input type="text" name="url" id="url" class="input_field" />
                                </td>
                            </tr>
                          
                            <tr>
                                <td>
                                    <label for="text">Message:</label>
                                   
                                </td>
                                 <td>
                                       <textarea id="text" name="text" rows="0" cols="0" class="required"></textarea>
                                </td>
                            </tr>
                          
                            <tr>
                                <td></td>
                                <td>
                                    <table cellpadding="0" cellspacing="0">
                                        <tr>
                                            <td>
                                                <input style="font-weight: bold;" type="submit" class="submitbtn" name="submit" id="submit" value=" Send " />
                                            </td>
                                            <td>
                                                <input style="font-weight: bold;" type="reset" class="submitbtn" name="reset" id="reset" value=" Reset " />
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </form>
                        
                    </td>
                    
                </tr>
            </table>
             
        </div>
    </div>
        
        
      
          <div class="wrapper col6">
            <div id="footer">
                <div id="newsletter">
                    <h2>About Us</h2>
                    <p>"Programs" Includes Immunization information, Chronic Disease and Health Promotion, Family Health checkup and Environmental Health.</p>
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
                    <p>Health Information" provides a variety of topics such as specific diseases and conditions, family health, environmental health, and workplace health records and safety.</p>
                </div>
                <br class="clear" />
            </div>
        </div>                               

        <div class="wrapper col7">
            <div id="copyright">
                <p class="fl_left">Copyright &copy; 2014 - All Rights Reserved - <a href="www.MagicHorse.co.in">MagicHorse.co.in</a></p>
                <br class="clear" />
            </div>
        </div>
                    <div id="bottom"></div>
    </body>
</html>