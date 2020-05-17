
package edd_1s20_py2_201709062;

import Estructuras.CrearUsuario;
import Estructuras.Data;
import Estructuras.Boque;
import Estructuras.ListaDoble;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import Estructuras.Usuario;
import static java.lang.Math.toIntExact;
import java.util.List;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Core auxcore;
    List<Data> listaBloque;
    ListaDoble listablocks;
    PanelPrincipal ventanaPanel;
    String puerto;
    public Login(Core core,List paraBloque, ListaDoble list,String puerto) {
        initComponents();
        setTitle("Puerto: "+puerto);
        this.auxcore=core;
        this.listaBloque=paraBloque;
        this.listablocks=list;
        this.puerto=puerto;
        this.ventanaPanel=new PanelPrincipal(core, paraBloque,  list,this,puerto);
        ventanaPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        textCarnet = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textCarrera = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCargaMasiva = new javax.swing.JButton();
        btnCrearBolque = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginTab.setToolTipText("Login");
        loginTab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtUserName.setToolTipText("Número de Carné");

        btnIniciar.setText("Iniciar");
        btnIniciar.setToolTipText("Iniciar Sesión");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jButton2.setText("Reportar Salida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(btnIniciar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))))
                        .addGap(0, 159, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(39, 39, 39)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnIniciar)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        loginTab.addTab("Iniciar Sesión", null, jPanel1, "Iniciar Sesión");

        textCarnet.setToolTipText("Carnet");

        textApellido.setToolTipText("Apellido");

        jLabel1.setText("Carné");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Carrera");

        jLabel5.setText("Contraseña");

        btnRegistrar.setText("Registrar");
        btnRegistrar.setToolTipText("Registrar Datos");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCargaMasiva.setText("Carga Masiva");
        btnCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaActionPerformed(evt);
            }
        });

        btnCrearBolque.setText("Crear Bloque");
        btnCrearBolque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearBolqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textCarnet)
                        .addComponent(textNombre)
                        .addComponent(textApellido)
                        .addComponent(textCarrera)
                        .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(btnCargaMasiva)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCrearBolque))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCrearBolque)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCargaMasiva))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        loginTab.addTab("Registro de Usuarios", null, jPanel2, "Registrarse");

        jLabel6.setText("IP");

        jLabel7.setText("Puerto");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        loginTab.addTab("Inresar nodos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaActionPerformed
        JFileChooser fc =new JFileChooser();
        int response= fc.showOpenDialog(fc);
        if(response== JFileChooser.APPROVE_OPTION){
            String path=fc.getSelectedFile().getAbsolutePath();
            JSONParser parser = new JSONParser();
            try {
                Object obj = parser.parse(new FileReader(path));
                JSONObject jsonObject = (JSONObject) obj;
                JSONArray usuarios = (JSONArray) jsonObject.get("Usuarios");
                Iterator<JSONObject> iterator = usuarios.iterator();
                while (iterator.hasNext()) {
                    JSONObject user =iterator.next();
                    Long carnet=(Long)user.get("Carnet");
                    String nombre=(String)user.get("Nombre");
                    String apellido=(String)user.get("Apellido");
                    String carrera=(String)user.get("Carrera");
                    String password=(String)user.get("Password");
                    auxcore.insertarUsuario(carnet, nombre, apellido, carrera, password);
                    int auxint=toIntExact(carnet);
                    listaBloque.add(new CrearUsuario(auxint, nombre, apellido, carrera, password));
                    System.out.println(user.get("Carnet")+" "+ user.get("Nombre"));
                }
            } catch (ParseException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCargaMasivaActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        String carne=txtUserName.getText();
        int carnet=Integer.valueOf(carne);
        String passwor=txtPass.getText();
        Usuario curSesion=auxcore.buscarUsuario(carnet, passwor);
        if(curSesion!=null){
            EDD_1S20_PY2_201709062.curSession=curSesion.getCarne();
            PanelPrincipal.lbUsuario.setText(Integer.toString(curSesion.getCarne()));
            ventanaPanel.setVisible(true);
            setVisible(false);
            txtPass.setText("");
            txtUserName.setText("");
            //JOptionPane.showMessageDialog(null, "Todo Chileron");
        }else{
            JOptionPane.showMessageDialog(null, "Carnet o contraseña incorrecta");
        }
        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String carne=textCarnet.getText();
        Long car=Long.valueOf(carne);
        String nombr=textNombre.getText();
        String apellido=textApellido.getText();
        String carrer=textCarrera.getText();
        String pass=textPassword.getText();
        auxcore.insertarUsuario(car, nombr, apellido, carrer, pass);
        int auxint=toIntExact(car);
        listaBloque.add(new CrearUsuario(auxint, nombr, apellido, carrer, pass));
        textCarnet.setText("");
        textNombre.setText("");
        textApellido.setText("");
        textCarrera.setText("");
        textPassword.setText("");
        JOptionPane.showMessageDialog(null, "Usuario ingresado con éxito");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCrearBolqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearBolqueActionPerformed
        Boque block;
        String bloqueToString;
        if(listablocks.estaVacia()){
            block=new Boque(EDD_1S20_PY2_201709062.indexBloque, listaBloque, "0000");
            block.minar(block.juntarParaHash());
            bloqueToString= block.mostrarString();
            listablocks.insert(block);
            listablocks.NodosToString();
        }else{
            block=new Boque(EDD_1S20_PY2_201709062.indexBloque, listaBloque, listablocks.returnLastHash());
            block.minar(block.juntarParaHash());
            bloqueToString= block.mostrarString();
            listablocks.insert(block);
            listablocks.NodosToString();
        }
        EDD_1S20_PY2_201709062.indexBloque++;
        listaBloque.clear();
        auxcore.listaip.actualizarNodo(bloqueToString);
        JOptionPane.showMessageDialog(null, "Bloque creado");
    }//GEN-LAST:event_btnCrearBolqueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String interprotocol=jTextField1.getText();
        String utpport=jTextField2.getText();
        if(!interprotocol.isEmpty() || !utpport.isEmpty()){
            auxcore.listaip.ingresar(interprotocol, Integer.valueOf(utpport));
            System.out.println(auxcore.listaip.primero.getIp());
        }
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        auxcore.listaip.reportarSalida("127.0.0.1:"+puerto);
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargaMasiva;
    private javax.swing.JButton btnCrearBolque;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTabbedPane loginTab;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textCarnet;
    private javax.swing.JTextField textCarrera;
    private javax.swing.JTextField textNombre;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
