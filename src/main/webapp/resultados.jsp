<%-- 
    Document   : resultados
    Created on : 17-09-2022, 01:59:21
    Author     : demozath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String resultado = (String)request.getAttribute("resultado");
    String capitalTotal = (String)request.getAttribute("capitalTotal");
    String interesAnual = (String)request.getAttribute("interesAnual");
    String cantidadAnios = (String)request.getAttribute("cantidadAnios");
    
                %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> RESULTADOS </h1>
            <div>
                <p><b>Con un capital de:</b> $<%=capitalTotal%></p>
                <p><b>Una tasa anual del:</b> <%=interesAnual%>%</p>
                <p><b>En</b> <%=interesAnual%> <b>años</b></p>
            </div>
            <div>
                <h2> Genera un interés simple de: <b> <%=resultado%> </b></h2>
            </div>
            
                      
    </body>
</html>