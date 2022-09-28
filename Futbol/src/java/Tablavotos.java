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

@WebServlet(urlPatterns = {"/Tablavotos"})
public class Tablavotos extends HttpServlet {
    private Connection con;
    private Statement set;
    private ResultSet rs;
    
    public void init(ServletConfig cfg)throws ServletException{
        String sURL="jdbc:mysql://localhost/BDJugadores";
        super.init(cfg);
        String userName="root";
        String password="admin";
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(sURL, userName, password);
            System.out.println("Se ha conectado");
        }
        catch(Exception e){
            System.out.println("No se ha conectado");
        }
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)
            throws ServletException, IOException{
            HttpSession s = req.getSession(true);
            //Leer el nombre del cliente de la sesion para darle las gracias al final
            String nombreP=(String)s.getValue("nombreCliente");
            PrintWriter out = res.getWriter();
            res.setContentType("text/html");
            out.println("<html><head><title>JDBC</title></head>");
            out.println("<body><font size=10>");
            out.println("<h1>Ejemplo de JDBC</h1>");
            out.println("<table border=1>");
            out.println("<tr><td><b>Jugador</b></td><td><b>Votos" + "</b></td></tr>");
            
            try{
                String nombre;
                int votos;
                set = con.createStatement();
                rs=set.executeQuery("SELECT * FROM Jugadores");
                while(rs.next()){
                    nombre=rs.getString("Nombre");
                    votos=rs.getInt("Votos");
                    out.println("<tr><td>" + nombre + "</td><td>" + votos + "</td></tr>");
                }
                rs.close();
                set.close();
            }
            catch(Exception e){
                System.out.println("No lee de la tabla");
            }
            out.println("</table>");
            out.println("<h3>Muchas gracias "+ nombreP +" por su visita </h3> ");
            out.println("</form></font></body></html>");
            out.close();
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException{
        try{doPost(req,res);}catch(Exception e){}
    }
    public void destroy(){
        try{con.close();}
        catch(Exception e){}
        super.destroy();
    }
}

//pg 12
