package conexionMYSQL;
import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class conexionMYSQL extends javax.swing.JFrame {
    
    Connection conexion;
    ResultSet rs;
    PreparedStatement pst;
    
    public conexionMYSQL() {
        initComponents();
        cargardatos();
        setLocationRelativeTo(null);//para q se pocicione en el centrfo de la pantalla
        //setResizable(false);
        setTitle("Ejemplo");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/fondo.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
      
            }
    private void cargardatos(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/programadores","root","");
            pst=conexion.prepareStatement("Select * from clientes");
           rs=pst.executeQuery(); 
           rs.next();
           //datosText();
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
    private void datosText(){
        try {
            this.JtxtCodigo.setText(rs.getObject(1).toString());
            this.JtxtNombres.setText(rs.getObject(2).toString());
            this.JtxtApellidos.setText(rs.getObject(3).toString());
            this.JtxtDireccion.setText(rs.getObject(4).toString());
            this.JtxtTelefono.setText(rs.getObject(5).toString());
            //this.JtxtNombres.setText(rs.getObject(2).toString());
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        JbtnPrimero = new javax.swing.JButton();
        JbtnAnterior = new javax.swing.JButton();
        JbtnSiguiente = new javax.swing.JButton();
        JbtnGuardar = new javax.swing.JButton();
        JbtnUltimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JtxtCodigo = new javax.swing.JTextField();
        JtxtApellidos = new javax.swing.JTextField();
        JtxtNombres = new javax.swing.JTextField();
        JtxtDireccion = new javax.swing.JTextField();
        JtxtTelefono = new javax.swing.JTextField();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplica = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        pasarainicio = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        operacines = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setForeground(java.awt.Color.orange);

        JbtnPrimero.setText("<<");
        JbtnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnPrimeroActionPerformed(evt);
            }
        });

        JbtnAnterior.setText("<");
        JbtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnAnteriorActionPerformed(evt);
            }
        });

        JbtnSiguiente.setText(">");
        JbtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSiguienteActionPerformed(evt);
            }
        });

        JbtnGuardar.setText("Guardar");
        JbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnGuardarActionPerformed(evt);
            }
        });

        JbtnUltimo.setText(">>");
        JbtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnUltimoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Direccion");

        jLabel5.setText("Telefono");

        JtxtCodigo.setText("Codigo");
        JtxtCodigo.setAlignmentX(10.0F);
        JtxtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtxtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtxtCodigoFocusLost(evt);
            }
        });
        JtxtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtxtCodigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JtxtCodigoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtxtCodigoMousePressed(evt);
            }
        });
        JtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtCodigoActionPerformed(evt);
            }
        });

        suma.setText("Suma");
        suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sumaMouseEntered(evt);
            }
        });
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setText("Resta");
        resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restaMouseEntered(evt);
            }
        });
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multiplica.setText("Multiplica");
        multiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicaActionPerformed(evt);
            }
        });

        divide.setText("Divide");
        divide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divideMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                divideMouseEntered(evt);
            }
        });
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        jButton5.setText("mover");
        jButton5.setToolTipText("dame clic para ver tus operaciones");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        pasarainicio.setText("ir ventana1");
        pasarainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarainicioActionPerformed(evt);
            }
        });

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        operacines.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        operacines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conexionMYSQL/pollo.jpg"))); // NOI18N
        operacines.setText("Operaciones");
        operacines.setToolTipText("OPRIMEME PARA VER TUS OPERACIONES");
        operacines.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        operacines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacinesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("EMPRESA DE NEGOCIOS EL VELADERO");

        jLabel9.setBackground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("jLabel9");
        jLabel9.setToolTipText("");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setText("jLabel8");

        jMenuBar1.setForeground(new java.awt.Color(255, 102, 102));

        jMenu1.setText("Archivo");
        jMenu1.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
                jMenu1MenuDragMouseExited(evt);
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });

        jMenu3.setText("Guardar");
        jMenu3.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu3MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenu1.add(jMenu3);

        jMenuItem2.setText("cerrar sesion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(multiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(operacines, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JbtnPrimero)
                        .addGap(11, 11, 11)
                        .addComponent(JbtnAnterior)
                        .addGap(9, 9, 9)
                        .addComponent(JbtnGuardar)
                        .addGap(19, 19, 19)
                        .addComponent(JbtnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JbtnUltimo)
                        .addGap(9, 9, 9)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(pasarainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(JtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(JtxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(JtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(JtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(suma))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(multiplica))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(divide))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(resta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(operacines, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbtnPrimero)
                    .addComponent(JbtnAnterior)
                    .addComponent(JbtnGuardar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JbtnSiguiente)
                        .addComponent(JbtnUltimo)
                        .addComponent(jButton7))
                    .addComponent(pasarainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtCodigoActionPerformed

    private void JbtnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnPrimeroActionPerformed
        try {
            rs.first();
            datosText();
        } catch (Exception e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnPrimeroActionPerformed

    private void JbtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnAnteriorActionPerformed
 try {
            rs.previous();
            datosText();
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnAnteriorActionPerformed

    private void JbtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSiguienteActionPerformed
 try {
            rs.next();
            datosText();
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnSiguienteActionPerformed

    private void JbtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnUltimoActionPerformed
 try {
            rs.last();
            datosText();
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnUltimoActionPerformed

    private void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public class conectar 
    {
    Connection con=null;
    public Connection conexion()
     {
         try 
          {
              //cargar nuestro driver
              Class.forName("com.mysql.jdbc.Driver");
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
        //conectarMYSQL.conectar con=new conectarMYSQL.conectar();
        //Connection reg=con.conexion();
        String nombres,apellidos,direccion,telefono;
        String sql;
        nombres=JtxtNombres.getText();
        apellidos=JtxtApellidos.getText();
        direccion=JtxtDireccion.getText();
        telefono=JtxtTelefono.getText();
        sql="INSERT INTO clientes (cli_nombres,cli_apellidos,cli_direccion,cli_telefono)VALUES (?,?,?,?)";
        try 
            {
                //PreparedStatement pst=reg.prepareStatement(sql);
                pst.setString(1,nombres);
                pst.setString(2,apellidos);
                pst.setString(3,direccion);
                pst.setString(4,telefono);
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
            }        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnGuardarActionPerformed

    private void pasarainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarainicioActionPerformed
   conectarMYSQL obj=new conectarMYSQL();
        obj.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_pasarainicioActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String sql="DELETE FROM clientes WHERE cli_nombres="+JtxtNombres;
        try 
            {   //java.sql.Statement borrar = rs.createStatement();
                int resultado =pst.executeUpdate(sql);
                if (resultado == 1)
                    { //Una fila modificada
                       JOptionPane.showMessageDialog(null,"Un registro modificado");
                    }
            } 
        catch (SQLException ex)
            {
                System.err.println(ex.getMessage());
            } 
        finally 
            {
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       jTextField15.getText(); 
       jTextField16.setText(jTextField15.getText().toLowerCase());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        double n1=Double.parseDouble(jTextField8.getText());
        double n2=Double.parseDouble(jTextField1.getText());
        double suma=n1+n2;
        jTextField7.setText("Esta es la suma"+suma);
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        double n1=Double.parseDouble(jTextField8.getText());
        double n2=Double.parseDouble(jTextField1.getText());
        double resta=n1-n2;
        jTextField7.setText(" "+resta);
    }//GEN-LAST:event_restaActionPerformed

    private void multiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicaActionPerformed
        double n1=Double.parseDouble(jTextField8.getText());
        double n2=Double.parseDouble(jTextField1.getText());
        double multiplica=n1*n2;
        jTextField7.setText(" "+multiplica);
    }//GEN-LAST:event_multiplicaActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
         
       double n1,n2,divide;
       try {   
                 n1=Double.parseDouble(jTextField8.getText());
                 n2=Double.parseDouble(jTextField1.getText());
                 divide=n1/n2;
                jTextField7.setText(""+divide); 
            }  
        catch (NumberFormatException ex)
            {
                 JOptionPane.showMessageDialog(null,"Ingreso valores no numericos"+ex);
            }
        catch (ArithmeticException chulo)    
            {
                System.out.println("Division por cero.\n"+chulo);
               JOptionPane.showMessageDialog(null,"division entre 0"+chulo);
            }
    }//GEN-LAST:event_divideActionPerformed

    private void operacinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacinesActionPerformed
        try {       
        double n1=Double.parseDouble(jTextField8.getText());
        double n2=Double.parseDouble(jTextField1.getText());
        double suma=n1+n2;
        jTextField7.setText("sumas"+suma);
        double resta=n1-n2;
        jTextField2.setText(""+resta);
        double multimplica=n1*n2;
        jTextField3.setText(""+multimplica);
        double divide=n1/n2;
        jTextField4.setText(""+divide);
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"ingrese datos");
        }
    }//GEN-LAST:event_operacinesActionPerformed

    private void sumaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumaMouseEntered
        try {   
                double n1=Double.parseDouble(jTextField8.getText());
                double n2=Double.parseDouble(jTextField1.getText());
                double suma=n1+n2;
                jTextField7.setText(""+suma); 
            }  
        catch (NumberFormatException ex)
            {
                 JOptionPane.showMessageDialog(null,"Ingreso valores no numericos"+ex);
            }
        catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null,"Ingrese datos"+e);
            }
    }//GEN-LAST:event_sumaMouseEntered

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void divideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideMouseEntered
        //JOptionPane.showMessageDialog(null,"me estas dividiendo");
    }//GEN-LAST:event_divideMouseEntered

    private void restaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaMouseEntered
        JOptionPane.showMessageDialog(null,"me has tocado !!!Ingrese datos para la resta");
    }//GEN-LAST:event_restaMouseEntered

   private void divideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideMouseClicked
JOptionPane.showMessageDialog(null,"me has oprimido");
      
   }//GEN-LAST:event_divideMouseClicked

   private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
      // TODO add your handling code here:
      JOptionPane.showMessageDialog(null,"copiandome");
   }//GEN-LAST:event_jButton5KeyPressed

   private void JtxtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtxtCodigoFocusGained
      // TODO add your handling code here:
   }//GEN-LAST:event_JtxtCodigoFocusGained

   private void JtxtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtxtCodigoFocusLost

   }//GEN-LAST:event_JtxtCodigoFocusLost

   private void JtxtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtxtCodigoMouseClicked

   }//GEN-LAST:event_JtxtCodigoMouseClicked

   private void JtxtCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtxtCodigoMousePressed

   }//GEN-LAST:event_JtxtCodigoMousePressed

   private void JtxtCodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtxtCodigoMouseEntered
      // TODO add your handling code here:
      JtxtCodigo.setText(" ");
        //JOptionPane.showMessageDialog(null, "toy blanquiao");
   }//GEN-LAST:event_JtxtCodigoMouseEntered

   private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jTextField8ActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu1MenuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenu1MenuDragMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MenuDragMouseExited

    private void jMenu3MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu3MenuKeyPressed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MenuKeyPressed
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
                new conexionMYSQL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnAnterior;
    private javax.swing.JButton JbtnGuardar;
    private javax.swing.JButton JbtnPrimero;
    private javax.swing.JButton JbtnSiguiente;
    private javax.swing.JButton JbtnUltimo;
    private javax.swing.JTextField JtxtApellidos;
    private javax.swing.JTextField JtxtCodigo;
    private javax.swing.JTextField JtxtDireccion;
    private javax.swing.JTextField JtxtNombres;
    private javax.swing.JTextField JtxtTelefono;
    private javax.swing.JButton divide;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton multiplica;
    private javax.swing.JButton operacines;
    private javax.swing.JButton pasarainicio;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
