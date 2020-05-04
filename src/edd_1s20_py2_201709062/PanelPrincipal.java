/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_1s20_py2_201709062;


import Estructuras.*;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.toIntExact;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PanelPrincipal extends javax.swing.JFrame {
    Core auxcore;
    List<Data> listaBloque;
    int index;
    ListaDoble listablocks;
    public PanelPrincipal(Core core,List paraBloque, int ind,ListaDoble list) {
        initComponents();
        jRadioButton1.setMnemonic(KeyEvent.VK_B);
        jRadioButton2.setMnemonic(KeyEvent.VK_B);
        jRadioButton1.setSelected(true);
        txtBuscarTitulo.setEditable(false);//jRadioButton1.addActionListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        
        this.auxcore=core;
        this.listaBloque=paraBloque;
        this.index=ind;
        this.listablocks=list;
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
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
                                .addComponent(jLabel1)
                                .addGap(298, 298, 298)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50)
                                .addComponent(txtNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                                .addComponent(btnNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Borrar Cattegoria");

        jTabbedPane1.addTab("Categorias", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", jPanel5);

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
                                    .addComponent(jButton3)
                                    .addComponent(jLabel18)
                                    .addComponent(txtMoYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtMoEdicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(txtMoCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtMoIdioma1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)
                                        .addComponent(btnBorrarLibro))
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
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel23)
                                                .addGap(178, 178, 178)
                                                .addComponent(jLabel25))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ComboBorrarLb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtBuscarISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtBuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(59, 59, 59)
                                                        .addComponent(jLabel24))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(43, 43, 43)
                                                        .addComponent(btnBuscar)))
                                                .addGap(30, 30, 30)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                .addContainerGap(142, Short.MAX_VALUE))
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
                                    .addComponent(ComboBorrarLb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addGap(9, 9, 9)
                                .addComponent(txtMoEdicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMoCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMoIdioma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBorrarLibro)))
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
                                        .addComponent(txtBuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnCargaMasiva)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Libros", jPanel2);

        jButton1.setText("Salir");

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
            block=new Boque(index, listaBloque, "0000");
            block.minar(block.juntarParaHash());
            block.mostrarString();
            listablocks.insert(block);
            listablocks.NodosToString();
        }else{
            block=new Boque(index, listaBloque, listablocks.returnLastHash());
            block.minar(block.juntarParaHash());
            block.mostrarString();
            listablocks.insert(block);
            listablocks.NodosToString();
        }
        index++;
        listaBloque.clear();
    }//GEN-LAST:event_btnGuardarBloqueActionPerformed

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
        String categoria=txtCategoria.getText();
        NodoAVL existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
        if(existeCategori==null){
            auxcore.arbolAVL.root=auxcore.arbolAVL.insertar(auxcore.arbolAVL.root, categoria, EDD_1S20_PY2_201709062.curSession);
            existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
            existeCategori.getArbolb().insertar(Integer.valueOf(txtIsn.getText()), Integer.valueOf(txtYear.getText()), txtIdioma.getText(), txtTitulo.getText()
            , txtEitorial.getText(), txtAutor.getText(), Integer.valueOf(txtEdicion.getText()), txtCategoria.getText(), EDD_1S20_PY2_201709062.curSession);
        }else{
            existeCategori.getArbolb().insertar(Integer.valueOf(txtIsn.getText()), Integer.valueOf(txtYear.getText()), txtIdioma.getText(), txtTitulo.getText()
            , txtEitorial.getText(), txtAutor.getText(), Integer.valueOf(txtEdicion.getText()), txtCategoria.getText(), EDD_1S20_PY2_201709062.curSession);
        }
        listaBloque.add(new CrearLibro(Integer.valueOf(txtIsn.getText()), Integer.valueOf(txtYear.getText()), txtIdioma.getText(), txtTitulo.getText()
            , txtEitorial.getText(), txtAutor.getText(), Integer.valueOf(txtEdicion.getText()), txtCategoria.getText(), EDD_1S20_PY2_201709062.curSession));
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
        System.out.println(auxcore.arbolAVL.root.getCategoria()+" "+ auxcore.arbolAVL.root.getArbolb().root.libros[0].getAutor());
        if(jRadioButton1.isSelected()){
            Libro libroBuscado=auxcore.buscarLibro(auxcore.arbolAVL.root, Integer.valueOf(txtBuscarISBN.getText()));
            if(libroBuscado!=null){
                txtBoTitulo3.setText(libroBuscado.getTitulo());
            }else{
                JOptionPane.showMessageDialog(null, "El libro no fue encontrado");
            }
            
        }else if(jRadioButton2.isSelected()){
            LinkedList<LinkedList<Libro>> listaListasLibros=auxcore.buscarSubString(auxcore.arbolAVL.root, txtBuscarTitulo.getText());
            if(listaListasLibros.size()>0){
                ComboBorrarLb1.removeAllItems();
                String datosLibros="";
                for (LinkedList<Libro> lista1 : listaListasLibros) {
                    for (Libro libro : lista1) {
                        ComboBorrarLb1.addItem(Integer.toString(libro.getISBN()));
                        datosLibros+=libro.getTitulo()+"\n";
                    }
                }
                txtBoTitulo3.setText(datosLibros);
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
                        System.out.println(Isbn+" "+titu);
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
                        existeCategori.getArbolb().insertar(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), cate, EDD_1S20_PY2_201709062.curSession);
                        listaBloque.add(new CrearLibro(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), categoria, EDD_1S20_PY2_201709062.curSession));
                        System.out.println(Isbn+" "+titu);
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
    private javax.swing.JComboBox<String> ComboBorrarLb1;
    private javax.swing.JButton btnBorrarCategoria;
    private javax.swing.JButton btnBorrarLibro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarModificar;
    private javax.swing.JButton btnCargaMasiva;
    private javax.swing.JButton btnGuardarBloque;
    private javax.swing.JButton btnGuardarLibro;
    private javax.swing.JButton btnNuevaCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JLabel lbUsuario;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextArea txtBoTitulo3;
    private javax.swing.JTextField txtBuscarISBN;
    private javax.swing.JTextField txtBuscarModificar;
    private javax.swing.JTextField txtBuscarTitulo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtEdicion;
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
}
