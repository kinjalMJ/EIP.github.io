<%@page import="java.util.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Menu</title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
        <link rel="stylesheet" type="text/css" href="css/Bluemenu.css"/>
    </head>
   <%
            Map m=new HashMap();
            ArrayList mn=new ArrayList();
            ArrayList subMenu;
            if(session.getAttribute("mainMenu")!=null)
            {
                mn=(ArrayList)session.getAttribute("mainMenu");
            }
            if(session.getAttribute("menu")!=null)
            {
                m=(HashMap)session.getAttribute("menu");
            }
    //System.out.println("mn in jsp: "+mn);
    //System.out.println("m in jsp: "+m);
    %>
    <body>
        <div cbreadcrumblass="wrapper col3">
        <div id="topnav">
           
          <ul id="Bluenav">
            <%
            if(mn!=null)
            {    
            for(int i=0;i<mn.size();i++)
                {
                    subMenu=new ArrayList();
                    String val1=mn.get(i).toString().trim();
                    //System.out.println("@@@@@@@@@a: "+val1);
                    String mName1=val1.substring(0,val1.indexOf("$")).trim();
                    //System.out.println("@@@@@@@@@@b: "+mName1);
                    String pg1=val1.substring(val1.indexOf("$")+1).trim();
                    //System.out.println("@@@@@@@@c: "+pg1);
            %>
                <li>
                    <%
                    if(pg1!=null && pg1.length()>4)
                    {
                    %>
                        <a href="<%=pg1%>"><%=mName1%></a> 
                    <%
                    }
                    else
                    {
            %>
                        <a><%= mName1%> </a>
            <%
                        subMenu=(ArrayList)m.get(mName1);
                        if(subMenu!=null)
                        {
            %>
                            <ul>
            <%                    
                                for(int j=0;j<subMenu.size();j++)
                                {
                                    String val=subMenu.get(j).toString().trim();
                                    String mName=val.substring(0,val.indexOf("$"));
                                    String pg=val.substring(val.indexOf("$")+1);
            %>
                                <li><a href="<%=pg%>" ><%=mName%></a></li>
            <%
                                }
            %>
                            </ul>
            <%
                        }
                    }
            %>
                </li> 
                    
            <%
                }
            }   
            %> 
            </ul>
      <br class="clear" />
        </div>
        </div>
    </body>
</html>