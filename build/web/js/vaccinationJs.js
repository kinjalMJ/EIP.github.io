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
            
            function checkOverRuled(a)
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var status;
                    var size=a;
                    //alert(size);
                    var flag=0;
                    for(var i=1;i<=size;i++)
                        {
                            //alert("in for");
                            var st=document.checkInteractionForm.overRuled1.checked;
                            //alert(st);
                            if(st==false)
                                {
                                    alert("You Have To Overwrite DrugInteraction Or Change The Drug !!");
                                    flag=1;
                                    //alert(flag);
                                    break;
                                    
                                }
                        }
                    if(flag==1)
                            status= false;
                    else
                            status= true;

                        return status;
            }
            function overRuledDone(q)
            {
                
                var st=q.checked;
                //alert(st);
                if(st==true)
                                {
                                    alert("You Had Overwrite DrugInteraction!!");
                                }
            }
            function allVaccineData()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        //alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="vaccineGridData.jsp";
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=VaccineDataGrid;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function VaccineDataGrid()
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
                                document.getElementById("example").innerHTML="";
                                var thd = document.getElementById("example");
                                var row ,i,list,data,dataLen;
                                
                                            list=k[0];
                                            data=list.split("*");
                                            dataLen=data.length;
                                            //alert("Length of Data :"+dataLen);
                                            row=thd.insertRow(0);
                                            //alert("Data : "+data);
                                            var cell = row.insertCell(0);
                                            var element = document.createElement("label");
                                            cell.style.backgroundColor="red";
                                            cell.style.color="#000000";
                                            cell.appendChild(element);
                                            cell.innerHTML=data[0];
                                               
                                            var h;
                                            //alert("Length of Data before enter in loop :"+dataLen);
                                            for(h=1;h<dataLen;h++)
                                                {
                                                    var cell = row.insertCell(h);
                                                    var element = document.createElement("label");
                                                    cell.style.backgroundColor="red";
                                                    cell.style.color="#000000";
                                                    cell.appendChild(element);
                                                    cell.innerHTML=data[h];
                                                    //alert("H in Loop :"+h);
                                                }
                                for(i=1;i<k.length;i++)
                                    {
                                            list=k[i];
                                            data=list.split("*");
                                            dataLen=data.length;
                                            //alert("Length of Data :"+dataLen);
                                           
                                            row=thd.insertRow(i);
                                            //alert("Data : "+data);
                                            var cell = row.insertCell(0);
                                            cell.style.backgroundColor="#ffffff";
                                            var link = document.createElement("a");
                                            link.setAttribute("href","")
                                            link.className = "someCSSclass";
                                            // For IE only, you can simply set the innerText of the node.
                                            // The below code, however, should work on all browsers.
                                            var linkText = document.createTextNode(data[0]);
                                            link.appendChild(linkText);
                                            // Add the link to the previously created TableCell.
                                            cell.appendChild(link);
                                            var h;
                                            //alert("Length of Data before enter in loop :"+dataLen);
                                            for(h=1;h<dataLen;h++)
                                                {
                                                    var cell = row.insertCell(h);
                                                    var element = document.createElement("label");
                                                    cell.style.backgroundColor="#999999";
                                                    cell.style.color="#992244";
                                                    cell.appendChild(element);
                                                    cell.innerHTML=data[h];
                                                    //alert("H in Loop :"+h);
                                                }
                                                
                                    }
                        }
                        else
                        {
                                alert("Error! request status is "+xmlHttp.status);
                        }
                    }   
            }