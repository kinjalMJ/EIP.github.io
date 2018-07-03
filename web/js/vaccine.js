/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
            
            function patientData()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="patientsUserName.jsp";
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=displayPatients;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function displayPatients()
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
                            var optn=document.patientDataForm.patientName;
                            for(var j=0;j<optn.options.length;j++)
                            {
                                    optn.options[j]=null;
                            }
                            for(var i=0; i<k.length;i++)
                                {
                                    optn[i+1]=new Option(k[i],k[i]);
                                }
                                optn[0]=new Option("Select patient","-1");
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            
            /*function loadVaccine()
            {
                alert("in function load vaccine");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="vaccineName.jsp";
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=displayVaccineName;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function displayVaccineName()
            {
                alert("in displayVaccineName");
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            alert(newStatus);
                            newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            alert(newStatus);
                            var k=newStatus.split(",");
                            
                            var optn=document.interactionForm.vaccineName;
                            
                            for(var j=0;j<optn.options.length;j++)
                                {
                                    optn.options[j]=null;
                                }
                                
                            for(var i=0; i<k.length;i++)
                                {
                                    optn[i+1]=new Option(k[i],k[i]);
                                }
                                optn[0]=new Option("Select vaccine","-1");
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }*/
            function displayInteraction()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    document.getElementById("error").innerHTML="";
                    var url="interactionData.jsp";
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=displayInteractionData;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function displayInteractionData()
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
                            
                            var drugDiv=document.getElementById("dataDivId");
                            var table=document.createElement("table");
                            
                            var row=table.insertRow(0)
                            
                            var cell=row.insertCell(0);
                            var element=document.createElement("label");
                            element.innerHTML="Select Drug:";
                            cell.appendChild(element);
                            drugDiv.appendChild(table);
                            
                            var div=document.getElementById("drugDiv");

                            var table=document.createElement("table");
                            
                            var row=table.insertRow(0)
                            
                            var cell=row.insertCell(0);
                            var element = document.createElement("select");
                            element.style.width="200px";
                            element.name = "drug";
                            element.id = "drugId";
                            for(var i=0;i<k.length;i++)
                                {
                                    var optn1 = document.createElement("option");
                                    optn1.name = k[i]+i;
                                    optn1.value=k[i]
                                    optn1.innerHTML=k[i];
                                    element.add(optn1,null);
                                }
                            cell.appendChild(element);
                            div.appendChild(table);
                            document.getElementById("com").innerHTML="*";
                            
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function loadVaccineGrid()
            {
                //alert("in loadVaccineGrid function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="vaccineInteractionGrid.jsp";
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=displayInteractionGrid;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function displayInteractionGrid()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                   // alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            // alert(newStatus);
                            var HeaderName=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            // alert(HeaderName);
                            var interaction=newStatus.substring(newStatus.indexOf("&")+2,newStatus.lastIndexOf("]"));
                            //alert(interaction);
                            var userData=interaction.split(",");
                            //alert(userData);
                            var k=HeaderName.split("*");
                            //alert(k);
                            document.getElementById("tableid").innerHTML = "";
                            var table = document.getElementById("tableid");
                            //alert("table= "+table);
                            var row ,i;
                            row= table.insertRow(0);
                            for(i=0;i<k.length;i++)
                            {
                                var cell = row.insertCell(i);
                                var element = document.createElement("label");
                                cell.appendChild(element);
                                cell.innerHTML=k[i];
                            }
                            for(var i=0;i<userData.length;i++)
                            {
                                row= table.insertRow(i+1);
                                var data=userData[i].split("$");
                                for(var j=0;j<k.length;j++)
                                {
                                var cell = row.insertCell(j);
                                var element = document.createElement("label");
                                cell.appendChild(element);
                                cell.innerHTML=data[j];
                                }
                            }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function loadMedicines()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="medicineData.jsp";
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=displayMedicinesData;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function displayMedicinesData()
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
                            var optn=document.patientForm.txtDrugId;
                            for(var j=0;j<optn.options.length;j++)
                            {
                                    optn.options[j]=null;
                            }
                            optn[0]=new Option("Select Medicine","-1");

                            var drugName,drugId;
                            for(var i=0; i<k.length;i++)
                                {
                                    drugName=k[i].substring(0, k[i].indexOf('&')).trim();
                                    drugId=k[i].substring(k[i].indexOf('&')+1).trim();
                                    
                                    optn[i+1]=new Option(drugName,drugId);
                                }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function patientName()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="PatientUname.jsp";
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=displayPatientsName;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function displayPatientsName()
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
                            var optn=document.patientForm.patientId;
                            for(var j=0;j<optn.options.length;j++)
                            {
                                    optn.options[j]=null;
                            }
                            var patientName,patientId;
                            optn[0]=new Option("Select Patient","-1");
                            for(var i=0; i<k.length;i++)
                                {
                                    patientId=k[i].substring(0, k[i].indexOf('$')).trim();
                                    patientName=k[i].substring(k[i].indexOf('$')+1).trim();
                                
                                    optn[i+1]=new Option(patientName,patientId);
                                }
                                
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function nullDrop()
            {
                //alert("in function");
                document.getElementById("dataDivId").innerHTML="";
                document.getElementById("com").innerHTML="";
                document.getElementById("error").innerHTML="";
                
            }
            function displayDrugs()
            {
             //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var drug=document.getElementById("drugNameId").value;
                    //alert(drug);
                    var url="medicineData.jsp?drug="+drug;
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=displayMedicines;  // function call to update page using retrieved data
                    xmlHttp.send(null);   
            }
            function displayMedicines()
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
                            var optn=document.changeMedicineForm.txtDrugId;
                            for(var j=0;j<optn.options.length;j++)
                            {
                                    optn.options[j]=null;
                            }
                                
                            var drugName,drugId;
                            for(var i=0; i<k.length;i++)
                                {
                                    drugName=k[i].substring(0, k[i].indexOf('&')).trim();
                                    drugId=k[i].substring(k[i].indexOf('&')+1).trim();
                                    
                                    optn[i+1]=new Option(drugName,drugId);
                                }
                                optn[0]=new Option("Select Medicine","-1");
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function duplicateInteraction()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    document.getElementById("error").innerHTML="";
                    
                    var DrugInteraction=document.getElementById("interactionDrugId").checked;
                    var interaction=document.getElementById("interactionId").checked;
                    if(interaction==true)
                        {
                            return;
                        }
                    var vaccine=document.getElementById("vaccineNameId").value;
                    var drug=document.getElementById("interactionDrugId").value;
                    //alert("interaction "+interaction);
                    //alert("Drug interaction "+DrugInteraction);
                    var drug;
                        drug=document.getElementById("drugId").value;
                    var url="DuplicateInteractionData.jsp?vaccine="+vaccine+"&drug="+drug;
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=duplicateDrugInteraction;  // function call to update page using retrieved data
                    xmlHttp.send(null); 
            }
            function duplicateDrugInteraction()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    //alert(xmlHttp.status);
                    if(xmlHttp.status==200)
                    {
                           var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                           
                           //alert("newStatus: "+newStatus);
                            //alert(newStatus.trim().length);
                            if(!newStatus.trim().length==0)
                            {
                                document.getElementById("error").innerHTML=newStatus;
                                document.getElementById("desId").value="";
                                                                document.getElementById("vaccineNameId").focus();
                            }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
            function historyButton()
            {
                alert("in function");
                document.getElementById("History").innerHTML="";
                document.getElementById("patientTxt").innerHTML="";
                document.getElementById("tableid").innerHTML ="";
                var dv = document.getElementById("History");
                var element = document.createElement("input");
                element.type = "bUTTON";
                element.name = "HISTORY";
                element.value = "Patient History";
                element.className="submitbtn";
                element.onclick=function patientHistory(){buttonClick();};
                dv.appendChild(element);
            }
           function buttonClick()
            {
                alert(" in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    
                    var name=document.getElementById("patientNameId").value;
                    alert(name);
                    //alert(drug);
                    var url="medicineHistory.jsp?name="+name;
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=MedicinesHistory;  // function call to update page using retrieved data
                    xmlHttp.send(null); 
            }
            function MedicinesHistory()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                 alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                        var newStatus=xmlHttp.responseText;
                         alert(newStatus);
                        newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
 
                        var PatientData=newStatus.split(",");
                        if(newStatus.trim().length!=0)
                        {
                        document.getElementById("tableid").innerHTML = "";
                        var table = document.getElementById("tableid");
                        table.border=1;
                        
                        var row ,i;
                        
                        row= table.insertRow(0);
                            var cell = row.insertCell(0);
                            var element = document.createElement("label");
                            element.style.align="middle";
                            cell.appendChild(element);
                            cell.innerHTML="Complain";
                            var cell = row.insertCell(1);
                            var element = document.createElement("label");
                            cell.appendChild(element);
                            cell.innerHTML="Drug Name";
                            var cell = row.insertCell(2);
                            var element = document.createElement("label");
                            element.style.align="middle";
                            cell.appendChild(element);
                            cell.innerHTML="Date";
                            alert("before for");
                            alert("len"+PatientData.length);
                        for(var i=0;i<PatientData.length;i++)
                        {
                            alert("in if for data ");
                            row= table.insertRow(i+1);
                            var data=PatientData[i].split("$");
                            for(var j=0;j<data.length;j++)
                            {
                                
                            alert("in for for display data");
                            var cell = row.insertCell(j);
                            var element = document.createElement("label");
                            cell.appendChild(element);
                            cell.innerHTML=data[j];
                            }
                        }
                        }
                        else
                            {
                                document.getElementById("patientTxt").innerHTML="History not available.";
                            }
                }
                else
                {
                        alert("Error! request status is "+xmlHttp.status);
                }
            }    
                            }