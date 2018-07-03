<%-- 
    Document   : VISHome
    Created on : 19 Mar, 2015, 2:41:06 PM
    Author     : Kinjal Jarodiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vaccine Information System</title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
    
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
                            <td><a href="#"><img src="images/folder.png" alt="logo" /></a></td>
                            <td><h1><a href="#">vaccine Information</a></h1><p><h3> System</h3></p></td>
                        </tr>
                    </table>
                </div>
                <div class="fl_right" align="Right" > </div>
                <br class="clear" />
            </div>
        </div>
     
        </div>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Vaccine Information Syatem</p>
            </div>
            <form method="get" action="" id="form24" name="formVaccine" >
                <div align="left">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    
                <tr>
                 <div align="center">  
                 <label style="font-size: xx-large; color: #ff0000 ;font-style: italic"></label>Multi-, Routine-, & Non-Routine-Vaccine VIS</label>
                 </div>
                 <form id="form01" name="Multi" >
               
                <fieldset>
                <legend>Multi Vaccine</legend>
                <p><a href="multipleVaccines.jsp" target="blank">Multi</a>
                 Multiple Vaccines (DTaP, Hib, Hepatitis B, Polio, and PCV13)</p>
                 This VIS may be used in place of the individual VISs for DTaP, Hib, Hepatitis B, Polio, and PCV13 when two or more of these vaccines are administered during the same visit. It may be used for infants through children receiving their routine 4-6 year vaccines.</p>
               
                </fieldset></br>
                </form>
            <!-------------------------------------------------------------------------------------->
            
            <form id="form02" name="Routine">
                <fieldset>
                    <legend><a href="">Routine</a></legend>
                   
            <ul>
                <li><a href="DTaP.jsp" target="blank"> DTaP</a></li>
                <li><a href="hepatitisA.jsp" target="blank" > Hepatitis A</a></li>
                <li><a href="HepatitisB.jsp" target="blank"> Hepatitis B</a></li>
                <li><a href="HepatitisB.jsp" target="blank">Hib (Haemophilus Influenzae type b)</a></li>
                <li><a href="HepatitisB.jsp" target="blank">HPV - Cervarix</a> </li>
                <li><a href="HepatitisB.jsp" target="blank">HPV - Gardasil</a></li>
                <li><a href="HepatitisB.jsp" target="blank">Influenza - Live, Intranasal</a></li>
                <li><a href="HepatitisB.jsp" target="blank">Influenza - Inactivated </a></li>
                <li><a href="HepatitisB.jsp" target="blank">Measles/Mumps/Rubella (MMR)</a> </li>
                <li><a href="HepatitisB.jsp" target="blank">Measles/Mumps/Rubella & Varicella (MMRV) </a></li>
                <li><a href="HepatitisB.jsp" target="blank">Meningococcal</a> </li>
                <li><a href="HepatitisB.jsp" target="blank">Pneumococcal Conjugate (PCV13) </a></li>
                <li><a href="HepatitisB.jsp" target="blank">Pneumococcal Polysaccharide (PPSV23)</a></li>
                <li><a href="HepatitisB.jsp" target="blank">Polio</a></li>
                <li><a href="HepatitisB.jsp" target="blank">Rotavirus</a></li>
                <li><a href="HepatitisB.jsp" target="blank">Shingles (Herpes Zoster)</a></li>
                <li><a href="HepatitisB.jsp" target="blank">Tdap (Tetanus, Diphtheria, Pertussis)</a> </li>
                <li><a href="HepatitisB.jsp" target="blank">Td (Tetanus, Diphtheria)</a> </li>
                <li><a href="HepatitisB.jsp" target="blank">Varicella (Chickenpox)</a> </li>
            </ul>
            </fieldset></br>
            </form>
     
            <form id="form02" name="Routine">
            <fieldset>
            <legend><a href="">Non-Routine</a></legend>
            <ul>
            <li><a href="HepatitisB.jsp" target="blank">Adenovirus</a></li>
          
            <li><a href="HepatitisB.jsp" target="blank">Anthrax</a></li>
            <li><a href="HepatitisB.jsp" target="blank">Japanese Encephalitis</a></li>
            <li><a href="HepatitisB.jsp" target="blank">Rabies</a></li>
            <li><a href="HepatitisB.jsp" target="blank">Smallpox (Vaccinia)</a>
            <p>Medical Guide for vaccination with ACAM2000 Adobe PDF file [227 KB, 6 pages] This medication guide replaces the Smallpox VIS. It is to be used before one receives the vaccination. This guide is not available in other languages.</p></li>
            <li><a href="HepatitisB.jsp" target="blank">Typhoid</a></li>
            <li><a href="HepatitisB.jsp" target="blank">Yellow Fever</a></li>
            </ul>
            </fieldset></br>
            </form>
                    </tr>         
                   <tr>
                        <td></td>
                        <td></td>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Submit" /></td>
                                    <td><input type="button" name="reset" id="reset" value="Reset" class="submitbtn" /></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table> 
                </div>
            </form>
        </div>
    </div> 
  </body>
  <jsp:include page="/FooterPage.jsp"/>
</html>
