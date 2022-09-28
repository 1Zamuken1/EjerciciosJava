<%-- 
    Document   : TablaVotos
    Created on : 28/09/2022, 01:32:27 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//w3c//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.io.*" %>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>


<html>
    <head><title>JDBC</title></head>
    <body><font size=10>
        <h1>Ejemplo de JDBC</h1>
        <table border=1>
            <tr><td><b>Jugador</b></td></tr>
    <%
        Connection con;
        Statement set;
        ResultSet rs;
        String sURL="jdbc:mysql://localhost/BDJugadores";
        String userName = "root";
        String password = "admin";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(sURL, userName, password);
            System.out.println("Se ha conectado");
            String nombre;
            int votos;
            set = con.createStatement();
            rs = set.executeQuery("SELECT * FROM Jugadores");
            while (rs.next()){
                nombre = rs.getString("Nombre");
                votos = rs.getInt("Votos");
                out.println("<tr><td>"+ nombre +"</td><td>" + votos + "</td></tr>");
            }
            rs.close();
            set.close();
            con.close();
        }
        catch(Exception e){
            System.out.println("Error en acceso a BD");
        }
    %>
        </table>
        <h3>Muchas gracias por su visita</h3>
    </form></font></body>
</html>
