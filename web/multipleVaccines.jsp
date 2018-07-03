<%-- 
    Document   : multipleVaccines
    Created on : 19 Mar, 2015, 3:19:42 PM
    Author     : Kinjal Jarodiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
    
    </head>
    <body>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Multi Vaccine </p>
            </div>
            <form method="get" action="" id="form24" name="formVaccine" >
                <div align="left">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    
                <tr>
                <form id="form01" name="Multi" >
                <label><h1>Multi-, Routine-, & Non-Routine-Vaccine VISs</h1></label>
                <fieldset>
                <legend>What you need to know</legend>
                <label>Your baby will get one or more of these vaccines today:</label>
                <li>DTaP</li>
                <li>Hib</li>
                <li>Hepatitis B</li>
                <li>Polio</li>
                <li>PCV13</li>
                
            </fieldset>
            </form>
            </tr>
                    <!-------------------------------------------------------------------------------------->
                
                <tr>
                <form id="form02" name="Routine">
                <fieldset>
                <legend>Why get vaccinated?</legend>
                <p>These vaccines can protect your baby from 7 childhood diseases:</p>
                <ol>
                 <li>diphtheria</li>
                    <p>
                    <ul><li>Signs and symptoms include a thick coating in the back of the throat that can make it hard to breathe.</li>
                        <li>Diphtheria can lead to breathing problems, paralysis and heart failure.</li>
                        <li>About 15,000 people died each year in the U.S. from diphtheria before there was a vaccine</li>
                    </ul>
                    </p>
                 <li>Tetanus (Lockjaw)</li>
                 <p>
                    <ul>
                        <li>Signs and symptoms include painful tightening of the muscles, usually all over the body.</li>
                        <li>Tetanus can lead to stiffness of the jaw that can make it difficult to open the mouth or swallow.</li>
                        <li>Tetanus kills 1 person out of every 5 who get it.</li>
                        <li></li>
                    
                    </ul>
                    </p>
                    
                 <li>Pertussis (Whooping Cough)</li>
                 <p>
                 
                 <ul>
                     <li>Signs and symptoms include violent coughing spells that can make it hard for an infant to eat, drink, or breathe. These spells can last for several weeks.</li>
                     <li>Pertussis can lead to pneumonia, seizures, brain damage, or death.</li>
                    
                 </ul>
                 </p>
                 <li>Hib (Haemophilus influenzae type b)</li>
                 <p>
                 <ul>
                     <li>Signs and symptoms can include fever, headache, stiff neck, cough, and shortness of breath. There might not be any signs or symptoms in mild cases.</li>
                     <li>Hib can lead to meningitis (infection of the brain and spinal cord coverings); pneumonia; infections of the blood, joints, bones, and covering of the heart; brain damage; and deafness.</li>
                     <li>Before there was a vaccine, Hib disease was the leading cause of bacterial meningitis in children under 5 years of age in the U.S.</li>
                 </ul>
                 </p>
                 <li>Hepatitis B</li>
                 <ul>
                     <li>Signs and symptoms include tiredness, diarrhea and vomiting, jaundice (yellow skin or eyes), and pain in muscles, joints and stomach. But usually there are no signs or symptoms at all.</li>
                      <li>Hepatitis B can lead to liver damage, and liver cancer. Some people develop chronic (long term) hepatitis B infection. These people might not look or feel sick, but they can infect others.</li>
                       <li>Hepatitis B can cause liver damage and cancer in 1 child out of 4 who are chronically infected.</li>
                 </ul>
                 <li>Pneumococcal Disease</li>
                 <ul>
                     <li>Signs and symptoms include fever, chills, cough, and chest pain.</li>
                     <li>Pneumococcal disease can lead to meningitis (infection of the brain and spinal cord coverings), blood infections, ear infections, pneumonia, deafness, and brain damage.</li>
                    
                 </ul>
            </p>
                </ol>
                </fieldset>
                </form>
                </tr>
                <tr>
                <form>
                 <fieldset>
                 <legend>
                    <table align="center" width="100%" id="tableid" border="1" >
                    <thead style="background-color: silver">
                    <th>Vaccine</th>
                    <th>No Of Doses</th>
                    <th>Recommanded Ages</th>
                    <th>Other Information</th>
                  </thead>
                  <tbody>
                      <tr>
                          <td>DTaP (Diphtheria, Tetanus, Pertussis)</td>
                          <td>5</td>
                          <td>2 months, 4 months, 6 months, 15-18 months, 4-6 years</td>
                          <td>Some children should not get pertussis vaccine. These children can get a vaccine called DT (diphtheria & tetanus).</td>
                      </tr>
                      <tr>
                          <td>Hepatitis B</td>
                          <td>3</td>
                          <td>Birth, 1-2 months, 6-18 months</td>
                          <td></td>
                      </tr>
                      <tr>
                          <td>Polio</td>
                          <td>4</td>
                          <td>2 months, 4 months, 6-18 months, 4-6 years.</td>
                          <td>An additional dose of polio vaccine may be recommended for travel to certain countries.</td>
                      </tr>
                      <tr>
                          <td>Hib (Haemophilus influenzae type b)</td>
                          <td>3 or 4</td>
                          <td>2 months, 4 months, (6 months), 12-15 months</td>
                          <td>There are several Hib vaccines. With one of them the 6-month dose is not needed.</td>
                      </tr>
                      <tr>
                          <td>PCV13 (pneumococcal)</td>
                          <td>4</td>
                          <td>2 months, 4 months, 6 months, 12-15 months</td>
                          <td>Older children with certain health conditions may also need this vaccine.</td>
                      </tr>
                  </table>
                  </tbody>
                  </legend>
                  </form>
                  </tr>
                  </fieldset> 
                  </table> 
                  </div>
                  </form>
                  </div>
                  </div> 
                  </body>
  <jsp:include page="/FooterPage.jsp"/>
</html>
