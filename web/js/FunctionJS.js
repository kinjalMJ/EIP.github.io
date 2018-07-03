/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

            function validate()
            {
                var b = document.getElementById("ps").value;
                var c = document.getElementById("rps").value;
                var status=true;                              
                document.getElementById("txtRpass").innerHTML="";
                if(c!=b)
                {
                    //alert("Enter a number");
                    document.getElementById("txtRpass").innerHTML="please enter Re-Password as Password";
                    status= false;
                    document.getElementById("rps").value="";
                    document.getElementById("rps").focus();
                }
                 return status;
            }
            function checkMin()
            {
                alert("in function");
                var num=mn.value;
                if(num.length<10)
                    {
                        document.getElementById("len1").innerHTML="";
                        document.getElementById("len1").focus();
                    }
                
                
            }
            function reForm()
            {
                document.getElementById("un").value="";
                document.getElementById("ps").value="";
                document.getElementById("rps").value="";
                document.getElementById("txtFirstName").value="";
                document.getElementById("txtLastName").value="";
                document.getElementById("txtEmailId").value="";
                document.getElementById("type1").value="";
               
            }
            function  ValidatePass()
            {
                document.getElementById("error").innerHTML="";
                var b = document.getElementById("ps").value;
                var c = document.getElementById("rps").value;
                var d = document.getElementById("op").value;
                var status=true;                              
               
                if(c!=b)
                {
                    //alert("Enter a number");
                    document.getElementById("txtRpass").innerHTML="please enter Re-Password as Password";
                    status= false;
                    document.getElementById("rps").value="";
                    document.getElementById("rps").focus();
                }
                 return status;
            }
            function GetXmlHttpObject()   
            {
                var xmlHttp=null;
                try
                {
                    // Firefox, Opera 8.0+, Safari, Chrome
                    xmlHttp=new XMLHttpRequest();
                }
                catch (e)
                {
                    //Internet Explorer
                    try
                    {
                        xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
                    }
                    catch (e)
                    {
                        xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                    }
                }
                return xmlHttp;
            }
            function loadType()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="OpenLoadType.jsp";
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=pageload;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function pageload()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            //alert(newStatus);
                            var k=newStatus.split(",");
                            var optn=document.formRe.tp;
                            for(var j=0;j<optn.options.length;j++)
                            {
                                    optn.options[j]=null;
                            }
                            optn[0]=new Option("Select Category","-1");
                            var typeId,typeName;
                            for(var i=0; i<k.length;i++)
                                {
                                    typeId=k[i].substring(0, k[i].indexOf('$')).trim();
                                    typeName=k[i].substring(k[i].indexOf('$')+1).trim();
                                    //alert("id"+typeId);
                                    //alert("name"+typeName);
                                    optn[i+1]=new Option(typeName,typeId);
                                }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function LoadPatientUname()
            {
                //alert("in function LoadPatientUname");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        //alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="PatientUname.jsp";
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=PatientUnameLoad;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function PatientUnameLoad()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                   // alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            //alert(newStatus);
                            var k=newStatus.split(",");
                            var optn=document.patientForm.PatientUname;
                            for(var j=0;j<optn.options.length;j++)
                            {
                                    optn.options[j]=null;
                            }
                            var typeName;
                            optn[0]=new Option("Select patient",-1);
                            for(var i=0; i<k.length;i++)
                                {
                                    typeName=k[i].substring(k[i].indexOf('$')+1).trim();
                                   // alert("name"+typeName);
                                    optn[i+1]=new Option(typeName,typeName);
                                }
                    }
                     else
                    {
                            //alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
             function duplicat()
            {
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var uname=document.getElementById("un").value;
                    //alert(uname);
                    var type=document.getElementById("type1").value;
                    //alert(type);
                    var url="UniqueUserName.jsp?uname="+uname+"&type="+type;
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=duplicatUserName;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function duplicatUserName()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            document.getElementById("txtUname").innerHTML=newStatus;
                            if((newStatus.trim()).length>0)
                            {
                                //alert("Length= "+newStatus.length);
                                document.getElementById("un").value="";
                                document.getElementById("un").focus();
                            }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function checkCptcha()
            {
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var captcha = document.getElementById("captchaCode").value;
                    //alert(captcha);
                    var url="checkCaptcha.jsp?Captcha="+captcha;
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=UpdateCaptcha;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function UpdateCaptcha()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            document.getElementById("txtCaptcha").innerHTML=newStatus;
                            if((newStatus.trim()).length>0)
                                {
                                    document.getElementById("captchaCode").value="";
                                    document.getElementById("captchaCode").focus();
                                    //alert("Length= "+newStatus.length);
                                }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function displayUserName()
            {
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        //alert ("Browser does not support HTTP Request")
                        return
                    }
                    var type=document.getElementById("type1").value;
                    //alert(type);
                    var url="UsernameDisplay.jsp?type="+type;
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=UserNameType;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function UserNameType()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            //alert(newStatus);
                            var k=newStatus.split(",");
                            
                            var th=document.getElementById("thDiv");
                            var table=document.createElement("table");
                            var row=table.insertRow(0)
                            var cell=row.insertCell(0);
                            var element=document.createElement("label");
                            element.innerHTML="Select User:";
                            cell.appendChild(element);
                            th.appendChild(table);
                            
                            var optn=document.formRe.uname;
                            for(var i=0;i<optn.options.length;i++)
                            {
                                optn.options[i]=null
                            }
                            var userId,userName;
                            optn[0]=new Option("Select",-1);
                            for(var i=0; i<k.length;i++)
                                {
                                    userId=k[i].substring(0, k[i].indexOf('$')).trim();
                                    userName=k[i].substring(k[i].indexOf('$')+1).trim();
                                    //alert("id"+userId);
                                    //alert("name"+userName);
                                    optn[i+1]=new Option(userName,userId);
                                }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function displayTable()
            {
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        //alert ("Browser does not support HTTP Request")
                        return
                    }
                    var type = document.getElementById("type1").value;
                    var userid=document.getElementById("uname1").value;
                    //alert(type);
                    var url="TableDataMenu.jsp?type="+type+"&userid="+userid;
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=CreateTable;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function CreateTable()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            //alert(newStatus);
                            var k=newStatus.split(",");
                            document.getElementById("rightsDiv").innerHTML="";
                            document.getElementById("rightsTable").innerHTML = "";
                            var table = document.getElementById("rightsTable");
                            var row ;
                                row= table.insertRow(0);
                                var cell = row.insertCell(0);
                                var element = document.createElement("label");
                                cell.style.font="bold";
                                cell.appendChild(element);
                                cell.innerHTML="Select";
                                
                                
                                var cell = row.insertCell(1);f
                                var element = document.createElement("label");
                                cell.style.font="bold";
                                cell.appendChild(element);
                                cell.innerHTML="Menu";
                                
                                for(var i=0;i<k.length;i++)
                                {
                                    var chk="";
                                    var ch=k[i].indexOf("#");
                                    if(ch>=0)
                                        chk="checked";
                                        
                                    var menuName=k[i].substring(0, k[i].indexOf('$')-1).trim();
                                    //alert(menuName);
                                    var menuId = k[i].substring(k[i].indexOf('$')+1).trim();
                                    //alert(menuId);
                            
                                    row= table.insertRow(i+1);      
                                    
                                    var cell = row.insertCell(0);
                                    var element = document.createElement("input");
                                    element.type = "checkbox";
                                    element.name = "chk"+i;
                                    element.checked=chk;
                                    cell.appendChild(element);
                                    
                                   
                                    
                                    var cell = row.insertCell(1);
                                    var element = document.createElement("label");
                                    cell.appendChild(element);
                                    cell.innerHTML=menuName;
                                    
                                    var cell = row.insertCell(2);
                                    var element = document.createElement("input");
                                    element.type = "hidden";
                                    element.name = "hdn"+i;
                                    element.value= menuId;
                                    
                                    cell.appendChild(element);
                                }
                                var dv = document.getElementById("rightsDiv");
                                var element = document.createElement("input");
                                element.type = "submit";
                                element.name = "submit";
                                element.value = "Save";
                                element.className="submitbtn";
                                dv.appendChild(element);
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }   
            }
            function doseTable()
            {
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                            var noDose = document.getElementById("noOfDose").value;
                            //document.getElementById("mydiv").innerHTML="";
                            document.getElementById("tableid").innerHTML = "";
                            if(document.getElementById("noOfDose").value>=1)
                                {
                            var table = document.getElementById("tableid");
                            var row 
                            
                                row= table.insertRow(0);
                                
                                var cell = row.insertCell(0);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="grey";
                                cell.style.color="#000000";
                                cell.appendChild(element);
                                cell.innerHTML="Dose";
                                
                                var cell = row.insertCell(1);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="grey";
                                cell.style.color="#000000";
                                cell.appendChild(element);
                                cell.innerHTML="Age(in month)";
                                
                                var cell = row.insertCell(2);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="grey";
                                cell.style.color="#000000";
                                cell.appendChild(element);
                                cell.innerHTML="Requierment";
                                var cell = row.insertCell(3);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="grey";
                                cell.style.color="#000000";
                                cell.appendChild(element);
                                cell.innerHTML="Discription";
                                var cell = row.insertCell(4);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="grey";
                                cell.style.color="#000000";
                                cell.appendChild(element);
                                cell.innerHTML="Remove";
                                for(var i=1;i<=noDose;i++)
                                {
                                    row= table.insertRow(i);
                                    var cell = row.insertCell(0);
                                    var element = document.createElement("label");
                                    
                                    cell.style.color="#000000";
                                    cell.appendChild(element);
                                    cell.innerHTML="Dose"+i;
                                    var cell = row.insertCell(1);
                                    var element = document.createElement("input");
                                    element.type = "text";
                                    element.name = "age"+i;
                                    cell.appendChild(element);
                                    var cell = row.insertCell(2);
                                    var element = document.createElement("select");
                                    element.style.align="center";
                                    element.name = "optional_Mandatory"+i;
                                    var optn1 = document.createElement("option");
                                    optn1.name = "optional"+i;
                                    optn1.value="optional";
                                    optn1.innerHTML="Optional";
                                    element.add(optn1,null);
                                    var optn2 = document.createElement("option");
                                    optn2.name = "mandatory"+i;
                                    optn2.value="mandatory";
                                    optn2.innerHTML="Mandatory";
                                    element.add(optn2,null);
                                    cell.appendChild(element);
                                    var cell = row.insertCell(3);
                                    var element = document.createElement("input");
                                    element.type = "text";
                                    element.name = "des"+i;
                                    cell.appendChild(element);
                                    
                                    var cell = row.insertCell(4);
                                    var t = document.createElement('IMG');
                                    //link = document.createElement("a");
                                    //link.setAttribute("href","removeRow")
                                    t.setAttribute('src',"Cross.png");
                                    //link.appendChild(t);
                                    t.onclick="return RowDelete();"
                                    cell.appendChild(t);
                                    
                                }
            }
            }
            function RowDelete()
            {
                alert("in click event of remove button");
            }
            function vaccineTable()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="VaccineTable.jsp";
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=CreateVaccineTable;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function CreateVaccineTable()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            //alert(newStatus);
                            var k=newStatus.split(",");
                            //alert(k);
                            var table = document.getElementById("vaccineTable");
                            //alert(table);
                            var row ;
                                row= table.insertRow(0);
                              
                                var cell = row.insertCell(0);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="#333333";
                                cell.style.color="red";
                                cell.appendChild(element);
                                cell.innerHTML="Vaccine";
                                
                                var cell = row.insertCell(1);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="#333333";
                                cell.style.color="red";
                                cell.appendChild(element);
                                cell.innerHTML="Dose_Id";
                                
                                var cell = row.insertCell(2);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="#333333";
                                cell.style.color="red";
                                cell.appendChild(element);
                                cell.innerHTML=" Schedule Date";
                                
                                var cell = row.insertCell(3);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="#333333";
                                cell.style.color="red";
                                cell.appendChild(element);
                                cell.innerHTML=" Taken Date";
                                
                                var vaccine,VaccineDate,doseId,noOfDose,prevVaccine,tkndate;
                                for(var i=0; i<k.length;i++)
                                {
                                    //alert("in for");
                                    vaccine=k[i].substring(0, k[i].indexOf('$')).trim();
                                    //alert(vaccine);
                                    doseId=k[i].substring(k[i].indexOf('$')+1,k[i].indexOf('#')).trim();
                                    //alert(doseId);
                                    VaccineDate=k[i].substring(k[i].indexOf('#')+1,k[i].indexOf('@')).trim();
                                    tkndate=k[i].substring(k[i].indexOf('@')+1,k[i].indexOf('*')).trim();
                                    noOfDose=k[i].substring(k[i].indexOf('*')+1);
                                    //alert(VaccineDate);
                                    var flag=1;
                                   // alert("vaccine: "+vaccine);
                                    //alert("prevVaccine: "+prevVaccine);
                                    if(i!=0)
                                        {
                                            if(vaccine==prevVaccine)
                                                flag=0;
                                        }
                                       
                                    row= table.insertRow(i+1);
                                    var x=0;
                                    //alert("flag= "+flag);
                                    if(flag==1)
                                    {
                                        var cell = row.insertCell(x);
                                        cell.setAttribute("rowSpan",noOfDose);
                                        var element = document.createElement("label");
                                        cell.style.backgroundColor="#999999";
                                        cell.style.color="#000000";
                                        cell.appendChild(element);
                                        cell.innerHTML=vaccine;
                                        x++;
                                    }
                                    var cell = row.insertCell(x);
                                    var element = document.createElement("label");
                                    cell.style.backgroundColor="#999999";
                                    cell.style.color="#000000";
                                    cell.appendChild(element);
                                    cell.innerHTML=doseId;
                                    x++;
                                    var cell = row.insertCell(x);
                                    var element = document.createElement("label");
                                    cell.style.backgroundColor="#999999";
                                    cell.style.color="#000000";
                                    cell.appendChild(element);
                                    cell.innerHTML=VaccineDate;
                                    prevVaccine=vaccine;
                                    x++;
                                    var cell = row.insertCell(x);
                                    var element = document.createElement("label");
                                    cell.style.backgroundColor="#999999";
                                    cell.style.color="#000000";
                                    cell.appendChild(element);
                                    if(tkndate=="null")
                                    {
                                        cell.innerHTML="";
                                    }
                                    else
                                    {
                                        cell.innerHTML=tkndate;
                                    }
                                    
                                }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }   
            }
            function allUser()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        //alert ("Browser does not support HTTP Request")
                        return
                    }
                    var type;
                    type=document.getElementById("hdn").value.trim();
                    //alert(type);
                    var url="UserDataDisplay.jsp?tp="+type;
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=UserDataTable;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function UserDataTable()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                    {
                        //alert("in ready state 4 page");
                        if(xmlHttp.status==200)
                            {
                                var newStatus=xmlHttp.responseText;
                                //alert(newStatus);
                                newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.lastIndexOf("]"));
                                //alert(newStatus);
                                var k=newStatus.split(",");
                                //alert(k);
                                document.getElementById("example").innerHTML = "";
                                var table = document.getElementById("example");
                                var row ,i,list,data,dataLen;
                                for(i=0;i<k.length;i++)
                                    {
                                            list=k[i];
                                            data=list.split("*");
                                            dataLen=data.length;
                                           
                                            //alert("Length of Data :"+dataLen);
                                            row= table.insertRow(i);
                                            //alert("Data : "+data);
                                            var cell = row.insertCell(0);
                                            if(i==0)
                                                {
                                                    var element = document.createElement("label");
                                                    cell.style.backgroundColor="red";
                                                    cell.style.color="#000000";
                                                    cell.appendChild(element);
                                                    cell.innerHTML=data[i];
                                                }
                                            else
                                                {
                                                    var link = document.createElement("a");
                                                    //alert("MyData?label=yes&un="+data[0]);
                                                    var type=document.getElementById("hdn").value.trim();
                                                    alert(type);
                                                    link.setAttribute("href","MyData?label=yes&tp="+type+"&un="+data[0]);
                                                    link.className = "someCSSclass";
                                                    // For IE only, you can simply set the innerText of the node.
                                                    // The below code, however, should work on all browsers.
                                                    var linkText = document.createTextNode(data[0]);
                                                    link.appendChild(linkText);
                                                    // Add the link to the previously created TableCell.
                                                    cell.appendChild(link);
                                                }
                                            var h;
                                            //alert("Length of Data before enter in loop :"+dataLen);
                                            for(h=1;h<dataLen;h++)
                                                {
                                                    var cell = row.insertCell(h);
                                                    var element = document.createElement("label");
                                                    if(i==0)
                                                        {
                                                    cell.style.backgroundColor="red";
                                                    cell.style.color="#000000";
                                                        }
                                                    else
                                                        {
                                                        cell.style.backgroundColor="#999999";
                                                    cell.style.color="#000000";
                                                        }
                                                    cell.appendChild(element);
                                                    cell.innerHTML=data[h];
                                                    //alert("H in Loop :"+h);
                                                }
                                            cell = row.insertCell(h);
                                            if(i==0)
                                                {
                                                    var element = document.createElement("label");
                                                    cell.style.backgroundColor="red";
                                                    cell.style.color="#000000";
                                                    cell.appendChild(element);
                                                    cell.innerHTML="Edit";
                                                }
                                            else
                                                {
                                                    cell.style.backgroundColor="#999999";
                                                 var t = document.createElement('IMG');
                                                    link = document.createElement("a");
                                                    link.setAttribute('href','editByAdmin?uname='+data[0])
                                                    t.setAttribute('src',"Edit.png");
                                                    link.appendChild(t);
                                                    cell.appendChild(link);
                                                }
                                            cell = row.insertCell(h+1);
                                            if(i==0)
                                                {
                                                    var element = document.createElement("label");
                                                    cell.style.backgroundColor="red";
                                                    cell.style.color="#000000";
                                                    cell.appendChild(element);
                                                    cell.innerHTML="Remove";
                                                }
                                            else
                                                {
                                                    cell.style.backgroundColor="#999999";
                                                    var t = document.createElement('IMG');
                                                    link = document.createElement("a");
                                                    link.setAttribute("href","")
                                                    t.setAttribute('src',"Cross.png");
                                                    link.appendChild(t);
                                                    cell.appendChild(link);
                                                }
                                    }
                        }
                        else
                        {
                                alert("Error! request status is "+xmlHttp.status);
                        }
                    }   
            }
            function allRights()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        //alert ("Browser does not support HTTP Request")
                        return
                    }
                    var type;
                    type=document.getElementById("hdn").value.trim();
                    //alert(type);
                    var url="UserRightsDisplay.jsp?tp="+type;
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=CreateGridMenuRights;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function CreateGridMenuRights()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            var menuName=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            var userMenu=newStatus.substring(newStatus.indexOf("#")+2,newStatus.lastIndexOf("]"));
                            var userData=userMenu.split(",");
                            var k=menuName.split(",");
                            document.getElementById("example").innerHTML = "";
                            var table = document.getElementById("example");
                            var row ,i;
                            
                            var thr=document.createElement("thead");
                            thr.style.backgroundColor="#000000";
                            
                            row= thr.insertRow(0);
                            var th=document.createElement("th");
                            row.appendChild(th);
                            /*var cell = row.insertCell(0);
                            var element = document.createElement("label");
                            cell.appendChild(element);*/
                            th.innerHTML="User Name";
                            for(i=0;i<k.length;i++)
                            {
                                //alert(k[i]);
                                var th=document.createElement("th");
                                row.appendChild(th);
                                /*
                                var cell = row.insertCell(i+1);
                                var element = document.createElement("label");
                                cell.appendChild(element);*/
                                th.innerHTML=k[i];
                            }
                            table.appendChild(thr);
                            var tb=document.createElement("tbody");
                            
                            for(var i=0;i<userData.length;i++)
                            {
                                var row=document.createElement("tr");
                                tb.appendChild(row);
                                var menu=userData[i].split("$");
                                var cell = row.insertCell(0);
                                /*var element = document.createElement("label");
                                cell.appendChild(element);
                                cell.innerHTML=menu[0];*/
                            var link = document.createElement("a");
                            //alert("MyData?label=yes&un="+data[0]);
                            link.setAttribute("href","MyData?label=yes&un="+menu[0]);
                            link.className = "someCSSclass";
                            // For IE only, you can simply set the innerText of the node.
                            // The below code, however, should work on all browsers.
                            var linkText = document.createTextNode(menu[0]);
                            link.appendChild(linkText);
                            // Add the link to the previously created TableCell.
                            cell.appendChild(link);
                                
                                for(var j=0;j<k.length;j++)
                                {
                                    var cell = row.insertCell(j+1);
                                    
                                    //var element = document.createElement("input");
                                    //element.type = "checkbox";
                                    //element.name = "chk"+i;
                                    //alert("userData[i]: "+userData[i]);
                                    //alert("k[j]:"+k[j]);
                                    //alert("index: "+userData[i].indexOf(m.trim()));
                                    if(userData[i].indexOf(k[j].trim())>=0) 
                                    {    
                                       var t = document.createElement('IMG');
                                        t.setAttribute('src',"Tick.png");
                                        cell.appendChild(t);
                                    }
                                    else
                                    {
                                        //cell.appendChild(element);
                                    }
                            }
                            table.appendChild(tb);
                            }
                            
                    }
                    else
                        {
                                alert("Error! request status is "+xmlHttp.status);
                        }
                    }   
            }
            function displayVaccineTable()
            {
                alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        //alert ("Browser does not support HTTP Request")
                        return
                    }
                    var name=document.getElementById("patientNameId").value;
                    alert(name);
                    var url="PatientVaccineData.jsp?pname="+name;
                    alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=CreateVaccineTableData;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function CreateVaccineTableData()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert("newStatus:"+newStatus);
                            var newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            //alert("alert satatus :"+newStatus);
                            var vaccineData=newStatus.split(",");
                            
                            document.getElementById("tableid").innerHTML = "";
                            var table = document.getElementById("tableid");
                            table.width="100%";
                            table.borderColor = "Black";
                            var row, vaccineDisplay;
                            
                                    row= table.insertRow(0);

                                    var cell = row.insertCell(0);
                                    var element = document.createElement("label");
                                    cell.style.backgroundColor="#777777";
                                    cell.align="middle";
                                    cell.style.color="#000000";
                                    cell.appendChild(element);
                                    cell.innerHTML="Vaccine";          
                                    
                                    for(var j=0;j<25;j++)
                                    {                                    
                                        var cell = row.insertCell(j+1);
                                        var element = document.createElement("label");
                                        cell.style.backgroundColor="#666666";
                                        cell.align="middle";
                                        cell.style.color="#000000";
                                        cell.appendChild(element);
                                        cell.innerHTML=j;
                                    }
                                    var vaccineNo="";
                            for(var i=0;i<=vaccineData.length;i++)
                            {
                                    row= table.insertRow(i+1);
                                    
                                    vaccineDisplay=vaccineData[i].split("#");
                                    var vaccineName=vaccineDisplay[0].trim();
                                    //alert(vaccineName);
                                    var doseIdAge=vaccineDisplay[1].split("$");
                                    var doseId=doseIdAge[0].trim();
                                    //alert(doseId);
                                    var cell = row.insertCell(0);
                                    var element = document.createElement("label");
                                    cell.style.backgroundColor="#777777";
                                    cell.style.color="#111111";
                                    cell.appendChild(element);
                                    if(vaccineName==vaccineNo)
                                    {
                                        k++;
                                    }
                                    else
                                        k=1;
                                    var vaccineLabel=vaccineName+"/dose"+k+"-"+doseId;
                                    cell.innerHTML=vaccineLabel;
                                    vaccineNo=vaccineName;
                                        
                                for(var j=0;j<25;j++)
                                {
                                    //alert("in for");
                                    var cell = row.insertCell(j+1);
                                    cell.style.color="#000000";
                                    var ageRange=doseIdAge[1].split("&");
                                    //alert(ageRange[0]);
                                    if(j==ageRange[0].trim())
                                    {
                                      //  alert("in if for age range");
                                      //  alert(ageRange[1]);
                                        if(ageRange[1]!="True")
                                        {
                                        //    alert("in if");
                                            var patientName=document.getElementById("patientNameId").value;
                                            var element = document.createElement("a");
                                            element.href="/Immunization_and_E.H.R/InteractionCheckServlet?vaccineData="+vaccineLabel+"&patientName="+patientName;
                                            element.className = "someCSSclass";
                                            element.title=vaccineLabel;
                                            var linkText = document.createTextNode(j);
                                            element.appendChild(linkText);
                                            cell.align="middle";
                                            cell.style.backgroundColor="red";
                                        }
                                        else
                                        {
                                           // alert("in else");
                                            var element = document.createElement("label");
                                            cell.style.backgroundColor="green";
                                        }
                                        cell.appendChild(element);
                                    }
                                    else
                                    {                   
                                        var element = document.createElement("label");
                                        cell.style.backgroundColor="#999999";
                                        cell.appendChild(element);
                                        cell.innerHTML="";
                                    }
                                    
                                }
                            }
                    }
                    else
                        {
                                alert("Error! request status is "+xmlHttp.status);
                        }
                    }   
            }
          function  bloodGroup()
          {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        //alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="BloodGroup.jsp";
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=BloodGroupDisplay;  // function call to update page using retrieved data
                    xmlHttp.send(null);
          }
          function BloodGroupDisplay()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            //alert(newStatus);
                     
                            var k=newStatus.split(",");
                            var val=document.formRe.hdnBloodGroup.value;
                            //alert(val);
                            var optn=document.formRe.optionBloodGroup;
                            for(var j=0;j<optn.options.length;j++)
                            {
                                    optn.options[j]=null;
                            }
                            for(var i=0; i<k.length;i++)
                                {
                                    optn[i]=new Option(k[i],k[i]);
                                    if(k[i]==val)
                                        optn[i].selected=true;
                                }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function duplicatevaccine()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    document.getElementById("error").innerHTML="";
                    var name=document.formRe.txtvaccineName.value;
                    //alert("vaccine Name "+name);
                    var url="vaccineName.jsp?name="+name;
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=DuplicateVaccine;  // function call to update page using retrieved data
                    xmlHttp.send(null);   
            }
            function DuplicateVaccine()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus.trim().length);
                            if(newStatus.trim().length==0)
                                {
                            document.getElementById("txtDecId").focus();
                                }else
                                    {
                                document.getElementById("error").innerHTML=newStatus;
                            document.getElementById("txtvaccineName").focus();
                                    }
                            
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }