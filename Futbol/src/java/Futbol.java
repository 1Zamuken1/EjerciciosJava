/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author Administrador
 */
@WebServlet(urlPatterns = {"/Futbol"})
public class Futbol extends HttpServlet {

    private Connection con;
    private Statement set;
    private ResultSet rs;
    String cad;
        
        
        public void init(ServletConfig cfg) throws ServletException{
            String sURL="jdbc:mysql://localhost/BDJugadores";
            super.init(cfg);
            String userName = "root";
            String password = "admin";
            
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(sURL, userName, password);
                System.out.println("Se ha conectado");
            }
            catch(Exception e){
                System.out.println("No se ha conectado");
            }
        }


        
        public void doPost(HttpServletRequest req, HttpServletResponse res)
                throws ServletException, IOException, IOException{
                
                    // Obtener la sesion
                    HttpSession S = req.getSession(true);
                    
                    // Guardar el nombre del cliente en la sesión
                    // para poderlo utilizar en el siguiente servlet
                    String nombreP=(String)req.getParameter("txtNombre");
                    S.putValue("nombreCliente", nombreP);
                    
                    String nombre=(String)req.getParameter("R1");
                    
                    if(nombre.equals( "Otros" ))
                        nombre=(String)req.getParameter("txtOtros");
                    boolean existe = false;
                    
                    try{
                        set=con.createStatement();
                        
                        rs = set.executeQuery("SELECT * FROM Jugadores");
                        while (rs.next()){
                            cad=rs.getString("Nombre");
                            cad=cad.trim();
                            if(cad.compareTo(nombre.trim())==0)
                                existe=true;
                        }
                        rs.close();
                        set.close();
                    }
                    catch(Exception e){
                        System.out.println("No lee de la tabla");
                    }
                    try{
                        set=con.createStatement();
                        if(existe)
                            set.executeUpdate("UPDATE Jugadores SET votos= votos+1"+"WHERE nombre LIKE '%"+nombre+"%'");
                        else
                            set.executeUpdate("INSERT INTO Jugadores"+"(nombre,votos) VALUES ('"+ nombre +"',1)");
                        rs.close();
                        set.close();
                    }
                    catch(Exception e){
                        System.out.println("No inserta ni modifica la tabla");
                    }
                    
                    //Llamada al servlet que nos visualisa
                    // las estadisticas de jugadores
                    res.sendRedirect(res.encodeRedirectURL("./Tablavotos.jsp"));
        }
        
        
        
        public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException{
            try{doPost(req,res);}catch(Exception e){
            }
        }
        
        public void destroy(){
            try{
                con.close();
            }
            catch (Exception e){
            }
            super.destroy();
            }
}
