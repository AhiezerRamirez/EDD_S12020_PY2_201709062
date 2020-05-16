/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_1s20_py2_201709062;


import Estructuras.*;
import java.awt.event.ItemEvent;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.toIntExact;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PanelPrincipal extends javax.swing.JFrame {
    Core auxcore;
    List<Data> listaBloque;
    ListaDoble listablocks;
    javax.swing.JFrame VentanaLogin;
    String infolibro;//Es para expandir la info del libro
    String auxinfolibro;
    //private final ItemHandler handler;
    public PanelPrincipal(Core core,List paraBloque, ListaDoble list,javax.swing.JFrame loginFrame) {
        initComponents();
        jRadioButton1.setMnemonic(KeyEvent.VK_B);
        jRadioButton2.setMnemonic(KeyEvent.VK_B);
        jRadioButton1.setSelected(true);
        txtBuscarTitulo.setEditable(false);//jRadioButton1.addActionListener(this);
        this.VentanaLogin=loginFrame;
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        
        this.auxcore=core;
        this.listaBloque=paraBloque;
        this.listablocks=list;
        //handler=new ItemHandler();
        //NavegacionC.addItemListener(handler);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNuevaCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNuevaCategoria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnBorrarCategoria = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        textCarnet = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        textApellido = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        textCarrera = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        btnCargaMasiva1 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        LbCarnetEditar = new javax.swing.JLabel();
        txtEditNombre = new javax.swing.JTextField();
        txtEditApellido = new javax.swing.JTextField();
        txtEditCarrera = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        PasswordEdit = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnEditar = new javax.swing.JToggleButton();
        jLabel37 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelx = new javax.swing.JLabel();
        NavegacionC = new javax.swing.JComboBox<>();
        NavegacionL = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        NavegacionInfo = new javax.swing.JTextArea();
        NavegacionMasInfo = new javax.swing.JCheckBox();
        jLabelx1 = new javax.swing.JLabel();
        BusquedaNavegacion = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        NavegacionBuscar = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        scrollAVL = new javax.swing.JScrollPane();
        lbArbolAVL = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        scrollBtree = new javax.swing.JScrollPane();
        lbArbolB = new javax.swing.JLabel();
        btnBtreeGraph = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        lbTablaHash = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        scrollPreorder = new javax.swing.JScrollPane();
        lbPreorder = new javax.swing.JLabel();
        scrollInorder = new javax.swing.JScrollPane();
        lbInorder = new javax.swing.JLabel();
        scrollPostorder = new javax.swing.JScrollPane();
        lbPostOrder = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        scrollBlackChain = new javax.swing.JScrollPane();
        lbBlockChain = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtIsn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtEitorial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEdicion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnGuardarLibro = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMoTitulo1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMoAutor1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtMoEitorial1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMoYear1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtMoEdicion1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtMoCategoria1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtMoIdioma1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtBuscarISBN = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtBuscarTitulo = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        ComboBorrarLb1 = new javax.swing.JComboBox<>();
        btnBorrarLibro = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCargaMasiva = new javax.swing.JButton();
        txtBuscarModificar = new javax.swing.JTextField();
        btnBuscarModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBoTitulo3 = new javax.swing.JTextArea();
        CategoriaBorrar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lbUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarBloque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Borrar Categoria");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nueva Categoria");

        btnNuevaCategoria.setText("Crear Categoria");
        btnNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Crear Categoria");

        btnBorrarCategoria.setText("Borrar Categoria");
        btnBorrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCategoriaActionPerformed(evt);
            }
        });

        jButton2.setText("Refrescar");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50)
                                .addComponent(txtNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                                .addComponent(btnNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(298, 298, 298)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBorrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnNuevaCategoria))
                .addGap(154, 154, 154)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarCategoria))
                .addGap(120, 120, 120)
                .addComponent(jButton2)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Borrar Cattegoria");

        jTabbedPane1.addTab("Categorias", jPanel1);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel26.setText("Crear Usuario");

        jLabel27.setText("Carné");

        textCarnet.setToolTipText("Carnet");

        jLabel28.setText("Nombre");

        jLabel29.setText("Apellido");

        textApellido.setToolTipText("Apellido");

        jLabel30.setText("Carrera");

        jLabel31.setText("Contraseña");

        btnRegistrar.setText("Registrar");
        btnRegistrar.setToolTipText("Registrar Datos");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCargaMasiva1.setText("Carga Masiva");
        btnCargaMasiva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasiva1ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel32.setText("Editar Mi Informacion");

        txtEditNombre.setEditable(false);

        txtEditApellido.setEditable(false);

        txtEditCarrera.setEditable(false);

        jLabel33.setText("Nombre");

        jLabel34.setText("Apellido");

        jLabel35.setText("Carrera");

        jLabel36.setText("Contraseña");

        PasswordEdit.setEditable(false);

        jCheckBox1.setText("¿Editar?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel37.setText("Borrar Mi perfil");

        jButton4.setText("Eliminar Perfil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(395, 395, 395)
                                .addComponent(LbCarnetEditar))
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textCarnet)
                                    .addComponent(textNombre)
                                    .addComponent(textApellido)
                                    .addComponent(textCarrera)
                                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(170, 170, 170)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36)
                                    .addComponent(txtEditNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txtEditApellido)
                                    .addComponent(txtEditCarrera)
                                    .addComponent(PasswordEdit)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(btnRegistrar)))
                                .addGap(279, 279, 279)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37)))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnCargaMasiva1)
                        .addGap(268, 268, 268)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)))))
                .addGap(148, 148, 148))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel32)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(LbCarnetEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEditNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEditCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargaMasiva1)
                    .addComponent(btnEditar)
                    .addComponent(jButton4))
                .addGap(91, 91, 91))
        );

        jTabbedPane1.addTab("Usuario", jPanel3);

        jLabelx.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelx.setText("Navegación Por Categoria");

        NavegacionC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));
        NavegacionC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NavegacionCItemStateChanged(evt);
            }
        });

        NavegacionL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libros" }));
        NavegacionL.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NavegacionLItemStateChanged(evt);
            }
        });

        NavegacionInfo.setColumns(20);
        NavegacionInfo.setRows(5);
        jScrollPane2.setViewportView(NavegacionInfo);

        NavegacionMasInfo.setText("Más Información");
        NavegacionMasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NavegacionMasInfoActionPerformed(evt);
            }
        });

        jLabelx1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelx1.setText("Búsqueda de Libros");

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        NavegacionBuscar.setColumns(20);
        NavegacionBuscar.setRows(5);
        jScrollPane3.setViewportView(NavegacionBuscar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NavegacionC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NavegacionL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(359, 359, 359)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelx1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(BusquedaNavegacion)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(NavegacionMasInfo)))
                .addGap(241, 241, 241))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelx)
                    .addComponent(jLabelx1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NavegacionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusquedaNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NavegacionL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(NavegacionMasInfo)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Biblioteca", jPanel4);

        jButton6.setText("Refrescar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lbArbolAVL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd_1s20_py2_201709062/arbolAVL.jpg"))); // NOI18N
        lbArbolAVL.setText(".");
        scrollAVL.setViewportView(lbArbolAVL);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollAVL, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollAVL, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Árbol AVL", jPanel7);

        jButton7.setText("Mostrar gráfica");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        lbArbolB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd_1s20_py2_201709062/arbolAVL.jpg"))); // NOI18N
        lbArbolB.setText(".");
        scrollBtree.setViewportView(lbArbolB);

        jLabel38.setText("Ingreasar Categoria");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollBtree, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(btnBtreeGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(btnBtreeGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBtree, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Arbol B", jPanel8);

        jButton8.setText("Refrescar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        lbTablaHash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd_1s20_py2_201709062/arbolAVL.jpg"))); // NOI18N
        lbTablaHash.setText(".");
        scrollTabla.setViewportView(lbTablaHash);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Tabla Dispersion", jPanel9);

        jButton9.setText("Refrescar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        lbPreorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd_1s20_py2_201709062/arbolAVL.jpg"))); // NOI18N
        lbPreorder.setText(".");
        scrollPreorder.setViewportView(lbPreorder);

        lbInorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd_1s20_py2_201709062/arbolAVL.jpg"))); // NOI18N
        lbInorder.setText(".");
        scrollInorder.setViewportView(lbInorder);

        lbPostOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd_1s20_py2_201709062/arbolAVL.jpg"))); // NOI18N
        lbPostOrder.setText(".");
        scrollPostorder.setViewportView(lbPostOrder);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollInorder)
                    .addComponent(scrollPreorder, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollPostorder))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPreorder, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollInorder, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPostorder, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Recorridos AVL", jPanel10);

        jButton10.setText("Refrescar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        lbBlockChain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd_1s20_py2_201709062/arbolAVL.jpg"))); // NOI18N
        lbBlockChain.setText(".");
        scrollBlackChain.setViewportView(lbBlockChain);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollBlackChain, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBlackChain, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Listas Block Chain", jPanel11);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Reportes", jPanel5);

        jLabel5.setText("ISBN");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Crear Libro");

        jLabel7.setText("Título");

        jLabel8.setText("Autor");

        jLabel9.setText("Editorial");

        jLabel10.setText("Año");

        jLabel11.setText("Edición");

        jLabel12.setText("Categoria");

        jLabel13.setText("Idioma");

        btnGuardarLibro.setText("Guardar");
        btnGuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLibroActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Modificar Libro");

        jLabel15.setText("Título");

        jLabel16.setText("Autor");

        jLabel17.setText("Editorial");

        jLabel18.setText("Año");

        jLabel19.setText("Edición");

        jLabel20.setText("Categoria");

        jLabel21.setText("Idioma");

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Borrar Libro");

        jLabel23.setText("ISBN");

        jLabel24.setText("Título");

        jRadioButton1.setText("ISBN");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Título");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btnBorrarLibro.setText("Borrar");
        btnBorrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarLibroActionPerformed(evt);
            }
        });

        jLabel25.setText("Título");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCargaMasiva.setText("Carga Massiva");
        btnCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaActionPerformed(evt);
            }
        });

        btnBuscarModificar.setText("Buscar");
        btnBuscarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarModificarActionPerformed(evt);
            }
        });

        txtBoTitulo3.setColumns(20);
        txtBoTitulo3.setRows(5);
        jScrollPane1.setViewportView(txtBoTitulo3);

        jLabel39.setText("Razón");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtEitorial, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardarLibro))
                                .addGap(105, 105, 105)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(txtMoYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtMoEdicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtMoIdioma1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(txtMoAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnBuscarModificar))
                                            .addComponent(txtMoTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)
                                            .addComponent(txtMoEitorial1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel23)
                                        .addGap(178, 178, 178)
                                        .addComponent(jLabel25))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMoCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3)
                                            .addComponent(jLabel20))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ComboBorrarLb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtBuscarISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                    .addComponent(txtBuscarTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(59, 59, 59)
                                                        .addComponent(jLabel24))
                                                    .addComponent(CategoriaBorrar)
                                                    .addComponent(jTextField1)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(43, 43, 43)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel39)
                                                            .addComponent(btnBuscar))))
                                                .addGap(30, 30, 30))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBorrarLibro)
                                                .addGap(94, 94, 94)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(239, 239, 239)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(250, 250, 250)
                                            .addComponent(txtBuscarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(txtIsn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(345, 345, 345))))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(btnCargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(jLabel22))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBuscarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarModificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEitorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarLibro)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMoTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMoAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMoEitorial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMoYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CategoriaBorrar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMoEdicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBorrarLb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMoCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMoIdioma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtBuscarISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBorrarLibro))
                                    .addComponent(jScrollPane1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnCargaMasiva)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Libros", jPanel2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Configuarcion", jPanel6);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbUsuario.setText("jLabel4");

        jLabel4.setText("Bienvenido: ");

        btnGuardarBloque.setText("Guardar Bloque");
        btnGuardarBloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBloqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUsuario)
                        .addGap(309, 309, 309)
                        .addComponent(btnGuardarBloque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnGuardarBloque))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbUsuario)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Libros");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarUsuario(){
        Usuario cur=auxcore.buscarLogin(EDD_1S20_PY2_201709062.curSession);
        txtEditNombre.setText(cur.getNombre());
        txtEditApellido.setText(cur.getApellido());
        txtEditCarrera.setText(cur.getCarrera());
        PasswordEdit.setText(cur.getPassword());
    }
    
    private void btnNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaActionPerformed
        String categoria=txtNuevaCategoria.getText();
        auxcore.arbolAVL.root=auxcore.arbolAVL.insertar(auxcore.arbolAVL.root, categoria, EDD_1S20_PY2_201709062.curSession);
        LinkedList<String> auxcategoria=auxcore.arbolAVL.getOwnersCategories(auxcore.arbolAVL.root, EDD_1S20_PY2_201709062.curSession);
        listaBloque.add(new CrearCategoria(categoria, EDD_1S20_PY2_201709062.curSession));
        jComboBox1.removeAllItems();
        auxcategoria.forEach((string) -> {
            jComboBox1.addItem(string);
        });
        txtNuevaCategoria.setText("");
        //********************************Acutaliza las categorias para navegar*****************************************
        NavegacionC.removeAllItems();
        LinkedList<String> auxcatego=auxcore.arbolAVL.getAllCategoris(auxcore.arbolAVL.root);
                    auxcatego.forEach((string) -> {
                    NavegacionC.addItem(string);
                });
    }//GEN-LAST:event_btnNuevaCategoriaActionPerformed

    private void btnBorrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCategoriaActionPerformed
        String auxcategoria=(String)jComboBox1.getSelectedItem();
        NodoAVL existe=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, auxcategoria);
        if(existe!=null){
            if(existe.propietario==EDD_1S20_PY2_201709062.curSession){
                auxcore.arbolAVL.root=auxcore.arbolAVL.borrar(auxcore.arbolAVL.root, auxcategoria);
                LinkedList<String> auxcatego=auxcore.arbolAVL.getOwnersCategories(auxcore.arbolAVL.root, EDD_1S20_PY2_201709062.curSession);
                listaBloque.add(new BorrarCategoria(auxcategoria, EDD_1S20_PY2_201709062.curSession));
                jComboBox1.removeAllItems();
                auxcatego.forEach((string) -> {
                    jComboBox1.addItem(string);
                });
                actualizarCategorias();
            }else{
                JOptionPane.showMessageDialog(null, "Usted no es el propietario de la categoria");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Categoria no encontrada");
        }
        
    }//GEN-LAST:event_btnBorrarCategoriaActionPerformed

    private void btnGuardarBloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBloqueActionPerformed
        Boque block;
        if(listablocks.estaVacia()){
            block=new Boque(EDD_1S20_PY2_201709062.indexBloque, listaBloque, "0000");
            block.minar(block.juntarParaHash());
            block.mostrarString();
            listablocks.insert(block);
            
        }else{
            block=new Boque(EDD_1S20_PY2_201709062.indexBloque, listaBloque, listablocks.returnLastHash());
            block.minar(block.juntarParaHash());
            block.mostrarString();
            listablocks.insert(block);
        }
        EDD_1S20_PY2_201709062.indexBloque++;
        listaBloque.clear();
        JOptionPane.showMessageDialog(null, "Bloque Creado");
    }//GEN-LAST:event_btnGuardarBloqueActionPerformed

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
        String categoria=txtCategoria.getText();
        NodoAVL existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
        if(existeCategori==null){
            auxcore.arbolAVL.root=auxcore.arbolAVL.insertar(auxcore.arbolAVL.root, categoria, EDD_1S20_PY2_201709062.curSession);
            //listaBloque.add(new CrearCategoria(categoria, EDD_1S20_PY2_201709062.curSession));
            existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
            existeCategori.getArbolb().insertar(Integer.valueOf(txtIsn.getText()), Integer.valueOf(txtYear.getText()), txtIdioma.getText(), txtTitulo.getText()
            , txtEitorial.getText(), txtAutor.getText(), Integer.valueOf(txtEdicion.getText()), txtCategoria.getText(), EDD_1S20_PY2_201709062.curSession);
            actualizarCategorias();
            listaBloque.add(new CrearLibro(Integer.valueOf(txtIsn.getText()), Integer.valueOf(txtYear.getText()), txtIdioma.getText(), txtTitulo.getText()
            , txtEitorial.getText(), txtAutor.getText(), Integer.valueOf(txtEdicion.getText()), txtCategoria.getText(), EDD_1S20_PY2_201709062.curSession));
        }else{
            Libro existeLibro=existeCategori.getArbolb().buscar(Integer.valueOf(txtIsn.getText()));
            if(existeLibro==null){
                existeCategori.getArbolb().insertar(Integer.valueOf(txtIsn.getText()), Integer.valueOf(txtYear.getText()), txtIdioma.getText(), txtTitulo.getText()
            , txtEitorial.getText(), txtAutor.getText(), Integer.valueOf(txtEdicion.getText()), txtCategoria.getText(), EDD_1S20_PY2_201709062.curSession);
            listaBloque.add(new CrearLibro(Integer.valueOf(txtIsn.getText()), Integer.valueOf(txtYear.getText()), txtIdioma.getText(), txtTitulo.getText()
            , txtEitorial.getText(), txtAutor.getText(), Integer.valueOf(txtEdicion.getText()), txtCategoria.getText(), EDD_1S20_PY2_201709062.curSession));
            }else{
                System.out.println("El libro ya existe");
            }
        }
        
        txtIsn.setText("");
        txtYear.setText("");
        txtIdioma.setText("");
        txtTitulo.setText("");
        txtEitorial.setText("");
        txtAutor.setText("");
        txtEdicion.setText("");
        txtCategoria.setText("");
        
    }//GEN-LAST:event_btnGuardarLibroActionPerformed

    private void btnBuscarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarModificarActionPerformed
        Libro libroBuscado=auxcore.buscarLibro(auxcore.arbolAVL.root, Integer.valueOf(txtBuscarModificar.getText()));
        if(libroBuscado!=null){
            txtMoTitulo1.setText(libroBuscado.getTitulo());
            txtMoAutor1.setText(libroBuscado.getTitulo());
            txtMoEitorial1.setText(libroBuscado.getEditorial());
            txtMoYear1.setText(Integer.toString(libroBuscado.getYear()));
            txtMoEdicion1.setText(Integer.toString(libroBuscado.getEdicion()));
            txtMoCategoria1.setText(libroBuscado.getCategoria());
            txtMoIdioma1.setText(libroBuscado.getIdioma());
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró el libro indicado");
        }
    }//GEN-LAST:event_btnBuscarModificarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Libro libroBuscado=auxcore.buscarLibro(auxcore.arbolAVL.root, Integer.valueOf(txtBuscarModificar.getText()));
        if(libroBuscado!=null){
            libroBuscado.setTitulo(txtMoTitulo1.getText());
            libroBuscado.setTitulo(txtMoAutor1.getText());
            libroBuscado.setEditorial(txtMoEitorial1.getText());
            libroBuscado.setYear(Integer.valueOf(txtMoYear1.getText()));
            libroBuscado.setEdicion(Integer.valueOf(txtMoEdicion1.getText()));
            libroBuscado.setCategoria(txtMoCategoria1.getText());
            libroBuscado.setIdioma(txtMoIdioma1.getText());
            txtMoTitulo1.setText("");
            txtMoAutor1.setText("");
            txtMoEitorial1.setText("");
            txtMoEdicion1.setText("");
            txtMoCategoria1.setText("");
            txtMoIdioma1.setText("");
            txtMoYear1.setText("");
            txtMoIdioma1.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró el libro indicado");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        txtBuscarISBN.setEditable(true);
        txtBuscarTitulo.setEditable(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        txtBuscarISBN.setEditable(false);
        txtBuscarTitulo.setEditable(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //System.out.println(auxcore.arbolAVL.root.getCategoria()+" Con código "+ auxcore.arbolAVL.root.getArbolb().root.libros[0].getISBN());
        //System.out.println(auxcore.arbolAVL.obtenerCodigoDot(auxcore.arbolAVL.root));
        ComboBorrarLb1.removeAllItems();
        if(jRadioButton1.isSelected()){
            Libro libroBuscado=auxcore.buscarLibro(auxcore.arbolAVL.root, Integer.valueOf(txtBuscarISBN.getText()));
            
            if(libroBuscado!=null){
                ComboBorrarLb1.addItem(libroBuscado.getISBN()+";"+libroBuscado.getCategoria());
                txtBoTitulo3.setText(libroBuscado.getTitulo());
            }else{
                JOptionPane.showMessageDialog(null, "El libro no fue encontrado");
            }
            
        }else {
            LinkedList<LinkedList<Libro>> listaListasLibros=auxcore.buscarSubString(auxcore.arbolAVL.root, txtBuscarTitulo.getText());
            if(listaListasLibros.size()>0){
                
                String datosLibros="";
                for (LinkedList<Libro> lista1 : listaListasLibros) {
                    for (Libro libro : lista1) {
                        ComboBorrarLb1.addItem(Integer.toString(libro.getISBN())+";"+libro.getCategoria());
                        datosLibros+=libro.getTitulo()+"\n";
                    }
                }
                txtBoTitulo3.setText(datosLibros);
                //CategoriaBorrar.setText(libroBuscado.getCategoria());
            }else{
                JOptionPane.showMessageDialog(null, "No hay coincidencias");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaActionPerformed
        
        JFileChooser fc =new JFileChooser();
        int response= fc.showOpenDialog(fc);
        if(response== JFileChooser.APPROVE_OPTION){
            String path=fc.getSelectedFile().getAbsolutePath();
            JSONParser parser = new JSONParser();
            try {
                Object obj = parser.parse(new FileReader(path));
                JSONObject jsonObject = (JSONObject) obj;
                JSONArray usuarios = (JSONArray) jsonObject.get("libros");
                Iterator<JSONObject> iterator = usuarios.iterator();
                while (iterator.hasNext()) {
                    JSONObject libro =iterator.next();
                    String categoria=(String)libro.get("Categoria");
                    NodoAVL existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
                    if(existeCategori==null){
                        auxcore.arbolAVL.root=auxcore.arbolAVL.insertar(auxcore.arbolAVL.root, categoria, EDD_1S20_PY2_201709062.curSession);
                        existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
                        Long Isbn=(Long)libro.get("ISBN");
                        Long ano=(Long)libro.get("Año");
                        String idiom=(String)libro.get("Idioma");
                        String titu=(String)libro.get("Titulo");
                        String edito=(String)libro.get("Editorial");
                        String aut=(String)libro.get("Autor");
                        Long edici=(Long)libro.get("Edicion");
                        String cate=(String)libro.get("Categoria");
                        existeCategori.getArbolb().insertar(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), cate, EDD_1S20_PY2_201709062.curSession);
                        listaBloque.add(new CrearLibro(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), categoria, EDD_1S20_PY2_201709062.curSession));
                        //System.out.println(Isbn+" "+titu);
                        actualizarCategorias();
                    }else{
                        existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
                        Long Isbn=(Long)libro.get("ISBN");
                        Long ano=(Long)libro.get("Año");
                        String idiom=(String)libro.get("Idioma");
                        String titu=(String)libro.get("Titulo");
                        String edito=(String)libro.get("Editorial");
                        String aut=(String)libro.get("Autor");
                        Long edici=(Long)libro.get("Edicion");
                        String cate=(String)libro.get("Categoria");
                        Libro existeLibro=existeCategori.getArbolb().buscar(toIntExact(Isbn));
                        if(existeLibro==null){
                            existeCategori.getArbolb().insertar(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), cate, EDD_1S20_PY2_201709062.curSession);
                            listaBloque.add(new CrearLibro(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), categoria, EDD_1S20_PY2_201709062.curSession));
                        }else{
                            System.out.println("El libro ya existe");
                        }
                        //System.out.println(Isbn+" "+titu);
                    }
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

    private void btnBorrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarLibroActionPerformed
        if(ComboBorrarLb1.getItemCount() > 0){
            String libroAborrar=(String)ComboBorrarLb1.getSelectedItem();
            String[] info=libroAborrar.split(";");
            NodoAVL auxcategoria=auxcore.arbolAVL.buscar(auxcore.arbolAVL.root, info[1]);
            Libro auxlibro=auxcategoria.getArbolb().buscar(Integer.valueOf(info[0]));
            if(auxlibro.getPropietario()==EDD_1S20_PY2_201709062.curSession){
                auxcore.borrarLibro(auxcore.arbolAVL.root, info[1],Integer.valueOf(info[0]));
                listaBloque.add(new BorrarLibro(Integer.valueOf(info[0]), auxlibro.getTitulo(), info[1]));
            }else{
                JOptionPane.showMessageDialog(null, "El libro no es tuyo");
            }
            
            txtBuscarISBN.setText("");
            txtBoTitulo3.setText("");
            ComboBorrarLb1.removeAllItems();
        }else{
            JOptionPane.showMessageDialog(null, "No hay libros para borrar");
        }
    }//GEN-LAST:event_btnBorrarLibroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jComboBox1.removeAllItems();
        LinkedList<String> auxcatego=auxcore.arbolAVL.getOwnersCategories(auxcore.arbolAVL.root, EDD_1S20_PY2_201709062.curSession);
        auxcatego.forEach((string) -> {
                    jComboBox1.addItem(string);
                });
        
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void btnCargaMasiva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasiva1ActionPerformed
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
    }//GEN-LAST:event_btnCargaMasiva1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            llenarUsuario();
            txtEditNombre.setEditable(true);
            txtEditApellido.setEditable(true);
            txtEditCarrera.setEditable(true);
            PasswordEdit.setEditable(true);
            btnEditar.setEnabled(true);
        }else{
            txtEditNombre.setEditable(false);
            txtEditApellido.setEditable(false);
            txtEditCarrera.setEditable(false);
            PasswordEdit.setEditable(false);
            btnEditar.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String nom=txtEditNombre.getText();
        String ape=txtEditApellido.getText();
        String carre=txtEditCarrera.getText();
        String pass=PasswordEdit.getText();
        auxcore.editarUsuario(EDD_1S20_PY2_201709062.curSession, nom, ape, carre, pass);
        listaBloque.add(new EditarUsuario(EDD_1S20_PY2_201709062.curSession,nom,ape,carre,pass));
        JOptionPane.showMessageDialog(null, "Usuario Editado Exitosamente");
        llenarUsuario();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        auxcore.eliminarUsuario(EDD_1S20_PY2_201709062.curSession);
        JOptionPane.showMessageDialog(null, "Usuario Eliminado con éxito");
        VentanaLogin.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void NavegacionCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NavegacionCItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            //if (!NavegacionC.getSelectedItem().toString().equals("Categoria")) {
                String auxcategoriaN = (String) NavegacionC.getSelectedItem();
                NodoAVL auxcategorias = auxcore.arbolAVL.buscar(auxcore.arbolAVL.root, auxcategoriaN);
                if (auxcategorias != null) {
                    LinkedList<Integer> allbooks = auxcategorias.getArbolb().getAllBooks();
                    NavegacionL.removeAllItems();
                    allbooks.forEach((string) -> {
                        NavegacionL.addItem(string.toString());
                    });
                }
            //}
        }
    }//GEN-LAST:event_NavegacionCItemStateChanged

    private void NavegacionLItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NavegacionLItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(NavegacionL.getItemCount()>0){
                String auxisdn=(String)NavegacionL.getSelectedItem();
                String auxcate=(String)NavegacionC.getSelectedItem();
                NodoAVL auxcategorias = auxcore.arbolAVL.buscar(auxcore.arbolAVL.root, auxcate);
                if(auxcategorias!=null){
                    Libro auxlibro= auxcategorias.getArbolb().buscar(Integer.valueOf(auxisdn));
                    if(auxlibro!=null){
                        infolibro=auxlibro.getTitulo()+"\n";
                        auxinfolibro=auxlibro.getTitulo()+"\n";
                        infolibro+=auxlibro.getAutor()+"\n";
                        auxinfolibro+=auxlibro.getAutor()+"\n";
                        infolibro+=auxlibro.getEdicion()+"\n";
                        infolibro+=auxlibro.getCategoria()+"\n";
                        infolibro+=auxlibro.getEditorial()+"\n";
                        infolibro+=auxlibro.getIdioma()+"\n";
                        infolibro+=auxlibro.getYear()+"\n";
                        NavegacionInfo.setText(auxinfolibro);
                    }else{
                        JOptionPane.showMessageDialog(null, "Libro no encontrado");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Categoria no encontrada");
                }
            }
        }
    }//GEN-LAST:event_NavegacionLItemStateChanged

    private void NavegacionMasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NavegacionMasInfoActionPerformed
        if(NavegacionMasInfo.isSelected()){
            NavegacionInfo.setText(infolibro);
        }else{
            NavegacionInfo.setText(auxinfolibro);
        }
    }//GEN-LAST:event_NavegacionMasInfoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Libro libroBuscado=auxcore.buscarLibro(auxcore.arbolAVL.root, Integer.valueOf(BusquedaNavegacion.getText()));
        
        if(libroBuscado!=null){
            String auxbuscarLibro="";
            auxbuscarLibro+=libroBuscado.getTitulo()+"\n";
            auxbuscarLibro+=libroBuscado.getTitulo()+"\n";
            auxbuscarLibro+=libroBuscado.getEditorial()+"\n";
            auxbuscarLibro+=Integer.toString(libroBuscado.getYear())+"\n";
            auxbuscarLibro+=Integer.toString(libroBuscado.getEdicion())+"\n";
            auxbuscarLibro+=libroBuscado.getCategoria()+"\n";
            auxbuscarLibro+=libroBuscado.getIdioma()+"\n";
            NavegacionBuscar.setText(auxbuscarLibro);
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró el libro indicado");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            auxcore.arbolAVL.obtenerCodigoDot(auxcore.arbolAVL.root);
            TimeUnit.SECONDS.sleep(2);
            lbArbolAVL.setIcon(new ImageIcon(ImageIO.read( new File("./BloquesJson/Graficas/arbolAVL.jpg"))));
            scrollAVL.setViewportView(lbArbolAVL);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(!btnBtreeGraph.getText().isEmpty()){
            NodoAVL auxavl=auxcore.arbolAVL.buscar(auxcore.arbolAVL.root, btnBtreeGraph.getText());
            if(auxavl!=null){
                try {
                    auxavl.getArbolb().imprimir(btnBtreeGraph.getText());
                    TimeUnit.SECONDS.sleep(2);
                    BufferedImage img = ImageIO.read(new File("./BloquesJson/Graficas/"+btnBtreeGraph.getText()+"_arbolB.jpg"));
                    ImageIcon icon = new ImageIcon(img);
                    lbArbolB.setIcon(icon);
                    scrollBtree.setViewportView(lbArbolB);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Categoria no encontrada");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Area de búsqueda vacía");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        auxcore.tabla.obetnerCodDot();
        try {
            TimeUnit.SECONDS.sleep(2);
            BufferedImage img = ImageIO.read(new File("./BloquesJson/Graficas/tablaHash.jpg"));
            ImageIcon icon = new ImageIcon(img);
            lbTablaHash.setIcon(icon);
            scrollTabla.setViewportView(lbTablaHash);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        auxcore.arbolAVL.graficarPreorder(auxcore.arbolAVL.root);
        auxcore.arbolAVL.graficarInorder(auxcore.arbolAVL.root);
        auxcore.arbolAVL.graficarPostorder(auxcore.arbolAVL.root);
        try {
            TimeUnit.SECONDS.sleep(2);
            lbPreorder.setIcon(new ImageIcon(ImageIO.read( new File("./BloquesJson/Graficas/preOrder.jpg"))));
            scrollPreorder.setViewportView(lbPreorder);
            lbInorder.setIcon(new ImageIcon(ImageIO.read( new File("./BloquesJson/Graficas/inOrder.jpg"))));
            scrollInorder.setViewportView(lbInorder);
            lbPostOrder.setIcon(new ImageIcon(ImageIO.read( new File("./BloquesJson/Graficas/postOrden.jpg"))));
            scrollPostorder.setViewportView(lbPostOrder);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        VentanaLogin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        listablocks.NodosToString();
        try {
            TimeUnit.SECONDS.sleep(2);
            lbBlockChain.setIcon(new ImageIcon(ImageIO.read(new File("./BloquesJson/Graficas/BlocChain.jpg"))));
            scrollBlackChain.setViewportView(lbBlockChain);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void actualizarCategorias(){
        NavegacionC.removeAllItems();
        LinkedList<String> auxcatego=auxcore.arbolAVL.getAllCategoris(auxcore.arbolAVL.root);
                    auxcatego.forEach((string) -> {
                    NavegacionC.addItem(string);
                });
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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
              //  new PanelPrincipal().setVisible(true);
            //}
        //});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BusquedaNavegacion;
    private javax.swing.JLabel CategoriaBorrar;
    private javax.swing.JComboBox<String> ComboBorrarLb1;
    private javax.swing.JLabel LbCarnetEditar;
    private javax.swing.JTextArea NavegacionBuscar;
    private javax.swing.JComboBox<String> NavegacionC;
    private javax.swing.JTextArea NavegacionInfo;
    private javax.swing.JComboBox<String> NavegacionL;
    private javax.swing.JCheckBox NavegacionMasInfo;
    private javax.swing.JPasswordField PasswordEdit;
    private javax.swing.JButton btnBorrarCategoria;
    private javax.swing.JButton btnBorrarLibro;
    private javax.swing.JTextField btnBtreeGraph;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarModificar;
    private javax.swing.JButton btnCargaMasiva;
    private javax.swing.JButton btnCargaMasiva1;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JButton btnGuardarBloque;
    private javax.swing.JButton btnGuardarLibro;
    private javax.swing.JButton btnNuevaCategoria;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelx;
    private javax.swing.JLabel jLabelx1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbArbolAVL;
    private javax.swing.JLabel lbArbolB;
    private javax.swing.JLabel lbBlockChain;
    private javax.swing.JLabel lbInorder;
    private javax.swing.JLabel lbPostOrder;
    private javax.swing.JLabel lbPreorder;
    private javax.swing.JLabel lbTablaHash;
    public static javax.swing.JLabel lbUsuario;
    private javax.swing.JScrollPane scrollAVL;
    private javax.swing.JScrollPane scrollBlackChain;
    private javax.swing.JScrollPane scrollBtree;
    private javax.swing.JScrollPane scrollInorder;
    private javax.swing.JScrollPane scrollPostorder;
    private javax.swing.JScrollPane scrollPreorder;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textCarnet;
    private javax.swing.JTextField textCarrera;
    private javax.swing.JTextField textNombre;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextArea txtBoTitulo3;
    private javax.swing.JTextField txtBuscarISBN;
    private javax.swing.JTextField txtBuscarModificar;
    private javax.swing.JTextField txtBuscarTitulo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditApellido;
    private javax.swing.JTextField txtEditCarrera;
    private javax.swing.JTextField txtEditNombre;
    private javax.swing.JTextField txtEitorial;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtIsn;
    private javax.swing.JTextField txtMoAutor1;
    private javax.swing.JTextField txtMoCategoria1;
    private javax.swing.JTextField txtMoEdicion1;
    private javax.swing.JTextField txtMoEitorial1;
    private javax.swing.JTextField txtMoIdioma1;
    private javax.swing.JTextField txtMoTitulo1;
    private javax.swing.JTextField txtMoYear1;
    private javax.swing.JTextField txtNuevaCategoria;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
/*
    private class ItemHandler implements ItemListener{
    
        @Override
        public void itemStateChanged(ItemEvent event) {
            if(event.getSource()==NavegacionC){
                if(!NavegacionC.getSelectedItem().equals("Categoria")){
                    String auxcategoriaN=(String)NavegacionC.getSelectedItem();
                    NodoAVL auxcategorias=auxcore.arbolAVL.buscar(auxcore.arbolAVL.root, auxcategoriaN);
                    if(auxcategorias!=null){
                        LinkedList<Integer> allbooks=auxcategorias.getArbolb().getAllBooks();
                        NavegacionL.removeAllItems();
                        allbooks.forEach((string) -> {
                    NavegacionL.addItem(string.toString());
                });
                }
                
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }}*/
}
