<%-- 
    Document   : adminJsp
    Created on : 24 Jan, 2015, 11:40:49 AM
    Author     : Kinjal Jarodiya
--%>


<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<jsp:include page="HeaderPage.jsp" />
<%
ArrayList pT=new ArrayList();
ArrayList pN=new ArrayList();
if(request.getAttribute("task")!=null)
{
    pT=(ArrayList)request.getAttribute("task");
}
if(request.getAttribute("data")!=null)
{
    pN=(ArrayList)request.getAttribute("data");
}
String tp="Admin";
if(session.getAttribute("Type")!=null)
    tp=session.getAttribute("Type").toString();
/*pT.add("pendingTask1");
pT.add("pendingTask2");
pT.add("pendingTask3");
pT.add("pendingTask4");
pT.add("pendingTask5");


pN.add("Patient1");
pN.add("Patient2");
pN.add("Patient3");
pN.add("Patient4");
pN.add("Patient5");*/


%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Home page</title>
    <link rel="stylesheet" href="css/layout.css" type="text/css" />
    <script language="javascript" type="text/javascript" src="js/FunctionJS.js"></script>
<style type="text/css">
.marqueecontainer
{
position: relative;
width: 195px; /*marquee width */
height: 295px; /*marquee height */
background-color: #fff;
color:#000;
overflow: hidden;
border:  1px solid black;
padding: 2px;
padding-left: 4px;
}
.marqueecontainer h3
{
    color:black;
}
.marqueeTd
{
background-color: gray;
color:black;
border-bottom: 1px solid black;
}


</style>
<script type="text/javascript">

/***********************************************
* Cross browser Marquee II- © Dynamic Drive (www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit http://www.dynamicdrive.com/ for this script and 100s more.
***********************************************/

var delayb4scroll=2000 //Specify initial delay before marquee starts to scroll on page (2000=2 seconds)
var marqueespeed=2 //Specify marquee scroll speed (larger is faster 1-10)
var pauseit=1 //Pause marquee onMousever (0=no. 1=yes)?

////NO NEED TO EDIT BELOW THIS LINE////////////
/*
var copyspeed=marqueespeed
var pausespeed=(pauseit==0)? copyspeed: 0
var actualheight=''

function scrollmarquee(){
if (parseInt(cross_marquee.style.top)>(actualheight*(-1)+8)) //if scroller hasn't reached the end of its height
cross_marquee.style.top=parseInt(cross_marquee.style.top)-copyspeed+"px" //move scroller upwards
else //else, reset to original position
cross_marquee.style.top=parseInt(marqueeheight)+8+"px"
}

function initializemarquee(){
cross_marquee=document.getElementById("vmarquee")
cross_marquee.style.top=0
marqueeheight=document.getElementById("marqueecontainer").offsetHeight
actualheight=cross_marquee.offsetHeight //height of marquee content (much of which is hidden from view)
if (window.opera || navigator.userAgent.indexOf("Netscape/7")!=-1){ //if Opera or Netscape 7x, add scrollbars to scroll and exit
cross_marquee.style.height=marqueeheight+"px"
cross_marquee.style.overflow="scroll"
return
}
setTimeout('lefttime=setInterval("scrollmarquee()",30)', delayb4scroll)
}

if (window.addEventListener)
window.addEventListener("load", initializemarquee, false)
else if (window.attachEvent)
window.attachEvent("onload", initializemarquee)
else if (document.getElementById)
window.onload=initializemarquee*/
</script>
</head>
<body>
<jsp:include page="/adminMenu.jsp"/>
<div class="wrapper col5">
<div id="container">
<div id="breadcrumb">
<p>Dash Board</p>
</div>
<div class="SubDiv">
<table>
<tr >
<td align="center" valign="top"> 
                        
<div class="marqueecontainer" >
<h3 style="color:black; font-weight:bold; padding-top: 5px">Pending Task</h3>
<marquee  scrollamount="2" direction="up" loop="true" width="100%" onmouseover="stop();"  onmouseout="start();"> 
<center> <font color="#555555">
<strong>  <table  width="100%">
<thead>
<tr><th></th></tr></thead>
<%
Iterator ivp = pT.iterator();
while (ivp.hasNext()) {
String task = ivp.next().toString();
String taskData[]=task.split(":");
%>   
<tr><td class="marqueeTd" align="center"><a  style="background-color: gray; color:white;" href="viewTask?task=<%=taskData[0]%>"><%=taskData[1]%></a></td></tr>
<%
}
%>
</table>
</strong>
</font>
</center>
</marquee></div> 
</td>
<td  align="center"> 
<table>
<%
if(tp.equalsIgnoreCase("admin"))
{
%>
<tr>
<td><img src="adminDashBord.jsp" alt="Progress chart" /></td>
</tr>
<%}
else
{%>
<tr>
<td><img src="doctorMedicationChart.jsp" alt="Progress chart" /></td>
</tr>                               
<%}                                                                       
%>
</table>

</td>
<td align="center" valign="top"> 
                           
<div class="marqueecontainer" >
<h3 style="color:black;">Recent Patient</h3>
<marquee  scrollamount="2" direction="up" loop="true" width="100%" onmouseover="stop();"  onmouseout="start();"> 
<center> <font color="#ffffff">
<strong>
<table  width="100%">
<tr><th></th></tr>
<%
Iterator iv = pN.iterator();
while (iv.hasNext()) {
String uname = iv.next().toString();
%>   
<tr><td class="marqueeTd" align="center"><a  style="background-color: gray;  color:white;" href="MyData?label=yes&tp=3&un=<%=uname%>"><%=uname%></a></td></tr>
<%
}
%>
</table>
</strong>
</font>
</center>
</marquee>
</div></td></tr>
</table>
</div>
            
<div class="SubDiv">
<table>
<tr>
<td>
<div class="marqueeTd" >
<img src="doctorMedicationChart.jsp" alt="Progress chart" />

</div> 
</td>
<td>

</td>
<td>
<div class="marqueecontainer" >adsfadf</div>
</td>
</tr></table>

</div>
</div>
</div>
</table>
</body>
</html>
<jsp:include page="FooterPage.jsp" />