package conexionMYSQL;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static sun.jvm.hotspot.debugger.x86.X86ThreadContext.PS;
public class conectarMYSQL extends javax.swing.JFrame {

    private String programadores;
    private JLabel jLabel1;
    private JTextField JtxtApellidos;
    private JButton JbtnSalir;
    private JTextField JtxtNombres;
    private JTextField JtxtTelefono;
    private JLabel JlbTelefono;
    private JLabel JlbDireccion;
    private JButton JbtnNuevo;
    private JButton JbtnGuardar;
    private JTextField JtxtDireccion;
    private JLabel JlbNombres;
    private JLabel JlbApellidos;
    private JLabel JlbTitulo;
    private JButton JbtnConsulta;
    private JButton JbtnUltimoPrimero;
    private JButton JbtnBuscar;
    private JButton JbtnPrevio;
    private JButton irventanatres;
    private JLabel JlbEdad;
    private JTextField JtxtEdad;
    private JButton irventanados1;
    private JLabel JlbeMail;
    private JTextField JtxtEmail;
    private JButton JbtnEliminar;
    private JLabel jLabel2;
    public conectarMYSQL() {
        //setLocationRelativeTo(null);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("clientesasas");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/images.jpg")).getImage());
         irventanatres.setForeground(Color.orange);
         irventanatres.setBackground(Color.blue);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JtxtApellidos = new javax.swing.JTextField();
        JbtnSalir = new javax.swing.JButton();
        JtxtNombres = new javax.swing.JTextField();
        JtxtTelefono = new javax.swing.JTextField();
        JlbTelefono = new javax.swing.JLabel();
        JlbDireccion = new javax.swing.JLabel();
        JbtnNuevo = new javax.swing.JButton();
        JbtnGuardar = new javax.swing.JButton();
        JtxtDireccion = new javax.swing.JTextField();
        JlbNombres = new javax.swing.JLabel();
        JlbApellidos = new javax.swing.JLabel();
        JlbTitulo = new javax.swing.JLabel();
        JbtnConsulta = new javax.swing.JButton();
        JbtnUltimoPrimero = new javax.swing.JButton();
        JbtnBuscar = new javax.swing.JButton();
        JbtnPrevio = new javax.swing.JButton();
        irventanatres = new javax.swing.JButton();
        JlbEdad = new javax.swing.JLabel();
        JtxtEdad = new javax.swing.JTextField();
        irventanados1 = new javax.swing.JButton();
        JlbeMail = new javax.swing.JLabel();
        JtxtEmail = new javax.swing.JTextField();
        JbtnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(255, 0, 0), null, null));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("clientes");
        setBounds(new java.awt.Rectangle(520, 320, 0, 0));
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtxtApellidos.setBackground(new java.awt.Color(204, 204, 204));
        JtxtApellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JtxtApellidos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JtxtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(JtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 240, -1));

        JbtnSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JbtnSalir.setForeground(new java.awt.Color(0, 204, 204));
        JbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PNG-24/Exit.png"))); // NOI18N
        JbtnSalir.setText("SALIR");
        JbtnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JbtnSalir.setBorderPainted(false);
        JbtnSalir.setContentAreaFilled(false);
        JbtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JbtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JbtnSalir.setIconTextGap(0);
        JbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 90, 30));

        JtxtNombres.setBackground(new java.awt.Color(204, 204, 204));
        JtxtNombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JtxtNombres.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JtxtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtNombresActionPerformed(evt);
            }
        });
        getContentPane().add(JtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 240, -1));

        JtxtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        JtxtTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JtxtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JtxtTelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        JtxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(JtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 240, -1));

        JlbTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlbTelefono.setForeground(new java.awt.Color(255, 255, 255));
        JlbTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JlbTelefono.setText("TELEFONO");
        getContentPane().add(JlbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 90, 30));

        JlbDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlbDireccion.setForeground(new java.awt.Color(255, 255, 255));
        JlbDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JlbDireccion.setText("DIRECCION");
        getContentPane().add(JlbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, 30));

        JbtnNuevo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JbtnNuevo.setForeground(new java.awt.Color(0, 204, 204));
        JbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PNG-24/Modify.png"))); // NOI18N
        JbtnNuevo.setText("NUEVO");
        JbtnNuevo.setContentAreaFilled(false);
        JbtnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JbtnNuevo.setIconTextGap(0);
        JbtnNuevo.setPreferredSize(new java.awt.Dimension(149, 89));
        JbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 130, 30));

        JbtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbtnGuardar.setForeground(new java.awt.Color(0, 204, 204));
        JbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PNG-24/Save.png"))); // NOI18N
        JbtnGuardar.setBorder(null);
        JbtnGuardar.setBorderPainted(false);
        JbtnGuardar.setContentAreaFilled(false);
        JbtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JbtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JbtnGuardar.setIconTextGap(0);
        JbtnGuardar.setLabel("GUARDAR");
        JbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, 30));

        JtxtDireccion.setBackground(new java.awt.Color(204, 204, 204));
        JtxtDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JtxtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JtxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(JtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 240, -1));

        JlbNombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlbNombres.setForeground(new java.awt.Color(255, 255, 255));
        JlbNombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JlbNombres.setText("NOMBRES");
        getContentPane().add(JlbNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, 30));

        JlbApellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlbApellidos.setForeground(new java.awt.Color(255, 255, 255));
        JlbApellidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JlbApellidos.setText("APELLIDOS");
        getContentPane().add(JlbApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 30));

        JlbTitulo.setFont(new java.awt.Font("Segoe Marker", 3, 36)); // NOI18N
        JlbTitulo.setText("INGRESO DATOS CLIENTE");
        getContentPane().add(JlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 50));

        JbtnConsulta.setText("Primero-ultimo");
        JbtnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, 30));

        JbtnUltimoPrimero.setText("ultimo-primero");
        JbtnUltimoPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnUltimoPrimeroActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnUltimoPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, 30));

        JbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PNG-24/Search.png"))); // NOI18N
        JbtnBuscar.setText("Buscar");
        JbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        JbtnPrevio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PNG-24/Next.png"))); // NOI18N
        JbtnPrevio.setText(">>");
        JbtnPrevio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnPrevioActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnPrevio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 80, 30));

        irventanatres.setBackground(new java.awt.Color(51, 102, 255));
        irventanatres.setText("IR A VENTANA TRES");
        irventanatres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irventanatresActionPerformed(evt);
            }
        });
        getContentPane().add(irventanatres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 200, 60));

        JlbEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlbEdad.setForeground(new java.awt.Color(255, 255, 255));
        JlbEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JlbEdad.setText("EDAD");
        getContentPane().add(JlbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 90, 30));

        JtxtEdad.setBackground(new java.awt.Color(204, 204, 204));
        JtxtEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JtxtEdad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JtxtEdad.setCaretColor(new java.awt.Color(255, 255, 255));
        JtxtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtEdadActionPerformed(evt);
            }
        });
        getContentPane().add(JtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 240, -1));

        irventanados1.setText("IR A VENTANADOS");
        irventanados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irventanados1ActionPerformed(evt);
            }
        });
        getContentPane().add(irventanados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 190, 60));

        JlbeMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlbeMail.setForeground(new java.awt.Color(255, 255, 255));
        JlbeMail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JlbeMail.setText("EMAIL");
        getContentPane().add(JlbeMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, 30));

        JtxtEmail.setBackground(new java.awt.Color(204, 204, 204));
        JtxtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JtxtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JtxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(JtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 240, -1));

        JbtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbtnEliminar.setForeground(new java.awt.Color(0, 204, 204));
        JbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PNG-24/Save.png"))); // NOI18N
        JbtnEliminar.setText("Eliminar");
        JbtnEliminar.setBorder(null);
        JbtnEliminar.setBorderPainted(false);
        JbtnEliminar.setContentAreaFilled(false);
        JbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JbtnEliminar.setIconTextGap(0);
        JbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conexionMYSQL/paisaje.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/conexionMYSQL/pollo.jpg"))); // NOI18N
        jLabel2.setName(""); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 1350, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void JbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSalirActionPerformed
        //System.exit(0);
        dispose();
    }//GEN-LAST:event_JbtnSalirActionPerformed
    private void JtxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtTelefonoActionPerformed
    }//GEN-LAST:event_JtxtTelefonoActionPerformed
    private void JbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_JbtnNuevoActionPerformed
    public void nuevo() {
        JOptionPane.showMessageDialog(null, "toy blanquiao");
        JtxtNombres.setText("");
        JtxtApellidos.setText("");
        JtxtEmail.setText("");
        JtxtDireccion.setText("");
        JtxtTelefono.setText("");
        JtxtEdad.setText("");
    }

    

   public class conectar 
    {
    Connection con=null;
    public Connection conexion()
     {
         try 
          {
              //cargar nuestro driver
              Class.forName("com.mysql.jdbc.Driver");//jdbc:mysql://localhost:3306/programadores
              con=DriverManager.getConnection("jdbc:mysql://localhost/programadores","root","");
              System.out.println("conexion establecida");
              JOptionPane.showMessageDialog(null, "Conexion Realizada");
          } 
         catch (ClassNotFoundException | SQLException e) 
          {
              System.out.println("error de conexion");
              JOptionPane.showMessageDialog(null, "Error en la conexion "+e);
          }
         return con;
     }
 }
    
    private void JbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnGuardarActionPerformed
        conectar con=new conectar();
        Connection reg=con.conexion();
        String nombres,apellidos,email,direccion,telefono, edad;
        String sql;
        nombres=JtxtNombres.getText();
        apellidos=JtxtApellidos.getText();
        email = JtxtEmail.getText();
        direccion = JtxtDireccion.getText();
        telefono=JtxtTelefono.getText();
        edad=JtxtEdad.getText();
        sql="INSERT INTO clientes (cli_nombres,cli_apellidos,cli_email,cli_direccion,cli_telefono,edad)VALUES (?,?,?,?,?,?)";
        try 
            {
                PreparedStatement pst=reg.prepareStatement(sql);
                pst.setString(1,nombres);
                pst.setString(2,apellidos);
                pst.setString(3,email);
                pst.setString(4,direccion);
                pst.setString(5,telefono);
                pst.setString(6,edad);
                int n=pst.executeUpdate();
                if (n>0)
                    {
                        System.out.println("Registro Añadido con exito");
                        JOptionPane.showMessageDialog(null,"Registro Añadido");
                    }
             } 
        catch (SQLException ex) 
            {
                Logger.getLogger(conectarMYSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_JbtnGuardarActionPerformed

    private void JbtnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnConsultaActionPerformed
        try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/programadores","root","");
                Statement st= conexion.createStatement();
                ResultSet rs=st.executeQuery("SELECT * FROM clientes"); 
                while(rs.next())
                {               
                    JOptionPane.showMessageDialog(this, rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3)+" "+rs.getObject(4)+" "+rs.getObject(5)+" "+rs.getObject(6));
                    JtxtNombres.setText(rs.getString("cli_nombres"));
                    JtxtApellidos.setText(rs.getString("cli_apellidos"));
                    JtxtEmail.setText(rs.getString("cli_email"));
                    JtxtDireccion.setText(rs.getString("cli_direccion"));
                    JtxtTelefono.setText(rs.getString("cli_telefono"));
                    JtxtEdad.setText(rs.getString("edad"));
                }               
            } 
        catch (HeadlessException | ClassNotFoundException | SQLException e) 
            {
            }        
    }//GEN-LAST:event_JbtnConsultaActionPerformed

    private void JbtnUltimoPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnUltimoPrimeroActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/programadores","root","");
            Statement st= conexion.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM clientes"); 
            rs.afterLast();//ANTES DEL ULTIMO
            while (rs.previous()) 
                {               
                    JOptionPane.showMessageDialog(this, "Codigo: " +rs.getString(1) +" Nombres: " +rs.getString(2) + "  Apellidos: " + rs.getString(3) +" Email: " +rs.getString(4) + "  Direccion: " + rs.getString(5)+"  Telefono: "+rs.getObject(6)+"  Edad: "+rs.getObject(7));
                    JtxtNombres.setText(rs.getString("cli_nombres"));
                    JtxtApellidos.setText(rs.getString("cli_apellidos"));
                    JtxtEmail.setText(rs.getString("cli_email"));
                    JtxtDireccion.setText(rs.getString("cli_direccion"));
                    JtxtTelefono.setText(rs.getString("cli_telefono"));
                    JtxtEdad.setText(rs.getString("edad"));
                }     
            } 
        catch (HeadlessException | ClassNotFoundException | SQLException e) 
            {    //e.printStackTrace();//Se utiliza para imprimir el registro del stack donde se ha iniciado la excepción. esto es opcional, obviamente
                 e.printStackTrace(System.err); // esto es opcional, obviamente
                 throw new RuntimeException(e);
            }               
    }//GEN-LAST:event_JbtnUltimoPrimeroActionPerformed

    private void JbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnBuscarActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/programadores","root","");
            Statement st= conexion.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM clientes WHERE cli_nombres='"+JtxtNombres.getText()+"' xor cli_apellidos='"+JtxtApellidos.getText()+"'"); 
            if(rs.next())
               { //JOptionPane.showMessageDialog(this, "digite el nombre a buscar");
                 JOptionPane.showMessageDialog(this, rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3)+" "+rs.getObject(4)+" "+rs.getObject(5)+" "+rs.getObject(6)+" "+rs.getObject(7));
                 JtxtNombres.setText(rs.getString("cli_nombres"));
                 JtxtApellidos.setText(rs.getString("cli_apellidos"));
                 JtxtEmail.setText(rs.getString("cli_email"));
                 JtxtDireccion.setText(rs.getString("cli_direccion"));
                 JtxtTelefono.setText(rs.getString("cli_telefono")); 
                 JtxtEdad.setText(rs.getString("edad")); 
               }
            else
               {
                 JOptionPane.showMessageDialog(this, "No Existo");
               }
            } 
        catch (ClassNotFoundException | SQLException | HeadlessException e) 
            {
                System.out.println(""+e);
            } 
    }//GEN-LAST:event_JbtnBuscarActionPerformed

    private void JbtnPrevioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnPrevioActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");           
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/programadores","root","");        
            Statement st= conexion.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM clientes"); 
            rs.beforeFirst();//ANTES DEL ULTIMO
               if(rs.next())
                 {
                   JOptionPane.showMessageDialog(this, rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3)+" "+rs.getObject(4)+" "+rs.getObject(5)+" "+rs.getObject(6));
                   JtxtNombres.setText(rs.getString("cli_nombres"));
                   JtxtApellidos.setText(rs.getString("cli_apellidos"));
                   JtxtApellidos.setText(rs.getString("cli_email"));
                   JtxtDireccion.setText(rs.getString("cli_direccion"));
                   JtxtTelefono.setText(rs.getString("cli_telefono"));
                   JtxtEdad.setText(rs.getString("edad"));
                 }  
               else
                 {
                   JOptionPane.showMessageDialog(this,"No hay registros"); 
                 }
            } 
        catch (ClassNotFoundException | SQLException e) 
            { 
               System.out.println(e);
            } 
    }//GEN-LAST:event_JbtnPrevioActionPerformed

    private void irventanatresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irventanatresActionPerformed
      ventas obj=new ventas();
      obj.setVisible(true);
      dispose();  
    }//GEN-LAST:event_irventanatresActionPerformed

    private void JtxtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtEdadActionPerformed

    private void irventanados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irventanados1ActionPerformed
      conexionMYSQL obj=new conexionMYSQL();
      obj.setVisible(true);
      dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_irventanados1ActionPerformed

    private void JtxtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtNombresActionPerformed

    private void JtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtEmailActionPerformed

    private void JtxtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtDireccionActionPerformed

    private void JtxtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtApellidosActionPerformed

    private void JbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnEliminarActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");           
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/programadores","root","");        
            Statement st= conexion.createStatement();
            JOptionPane.showMessageDialog(this, "conectadoas");
            
            String sql;
            sql=("delete from clientes where cli_nombres='"+JtxtNombres.getText()+"'");
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"grabadito");
            
        }catch (ClassNotFoundException | SQLException e) 
            { 
               System.out.println(e);
            } 
    }
    
        
 public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(conexionMYSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conexionMYSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conexionMYSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conexionMYSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new conectarMYSQL().setVisible(true);
            }
        });
    }
    }//GEN-LAST:event_JbtnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnBuscar;
    private javax.swing.JButton JbtnConsulta;
    private javax.swing.JButton JbtnEliminar;
    private javax.swing.JButton JbtnGuardar;
    private javax.swing.JButton JbtnNuevo;
    private javax.swing.JButton JbtnPrevio;
    private javax.swing.JButton JbtnSalir;
    private javax.swing.JButton JbtnUltimoPrimero;
    private javax.swing.JLabel JlbApellidos;
    private javax.swing.JLabel JlbDireccion;
    private javax.swing.JLabel JlbEdad;
    private javax.swing.JLabel JlbNombres;
    private javax.swing.JLabel JlbTelefono;
    private javax.swing.JLabel JlbTitulo;
    private javax.swing.JLabel JlbeMail;
    private javax.swing.JTextField JtxtApellidos;
    private javax.swing.JTextField JtxtDireccion;
    private javax.swing.JTextField JtxtEdad;
    private javax.swing.JTextField JtxtEmail;
    private javax.swing.JTextField JtxtNombres;
    private javax.swing.JTextField JtxtTelefono;
    private javax.swing.JButton irventanados1;
    private javax.swing.JButton irventanatres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}