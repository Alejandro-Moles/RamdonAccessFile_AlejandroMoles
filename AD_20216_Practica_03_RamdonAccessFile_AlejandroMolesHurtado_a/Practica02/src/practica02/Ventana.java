/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Ventana extends javax.swing.JFrame {
    private Double nota;
    private int id;
    private String nombre, apellido;
    //Se crea el array deonde se gauradarn los alumnos creados
    ArrayList<Alumno> alumnos = new ArrayList<>();
    //se declara el randomaccessfile
    RandomAccessFile raf;
    boolean existe;
    
    public Ventana() {
        initComponents();
        num(texto_A_Matricula);
        numDoble(texto_A_Nota);
        num(texto_S_Matricula);
        num(texto_B_Matricula);
        numDoble(texto_M_Nota);
        num(texto_M_Matricula);
        
        letras(texto_A_Nombre);
        letras(texto_M_Nombre);
        letras(texto_A_Sexo);
        letras(texto_M_Sexo);
        
        tabla2.setRowHeight(50);
        jScrollPane1.setSize(400, 950);
        
        try {
            crear_modificartabla();
        } catch (IOException ex) {
            
        }
    }
    
    //metodo que hacer que no se puedan poner letras en el campo donde iria un doble y tambien hace que no se puedan poner dos puntos
    private void numDoble(JTextField a){
         a.addKeyListener(new KeyAdapter(){
             public void keyTyped(KeyEvent e){
                 char c = e.getKeyChar();
                 if(!Character.isDigit(c) && c != '.'){
                     e.consume();
                 }
                 if(c == '.' && a.getText().contains(".")){
                     e.consume();
                 }   
             }
         });
    }
    //metodo que permite que en los camopos donde solo puede haber int, no se permitan letras
    private void num(JTextField a){
         a.addKeyListener(new KeyAdapter(){
             public void keyTyped(KeyEvent e){
                 char c = e.getKeyChar();
                 if(!Character.isDigit(c)){
                     e.consume();
                 }
                 
             }
         });
    }
    
    //metodo q permite que en los campos donde solo puede haber letras no haya numeros
     private void letras(JTextField b){
         b.addKeyListener(new KeyAdapter(){
             public void keyTyped(KeyEvent e){
                 char c = e.getKeyChar();
                 if(!Character.isLetter(c)){
                     e.consume();
                 }
                 
             }
         });
    }
     
    
     //
    //metodo que hacer que el boton de alta este desactivado hasta que todos los campos esten rellenos
    private void ActivarBoton_A(){
       
        if(!texto_A_Matricula.getText().isEmpty() && !texto_A_Nota.getText().isEmpty() && !texto_A_Nombre.getText().isEmpty() && !texto_A_Sexo.getText().isEmpty()){
            Boton_Alta.setEnabled(true);
        }else{
            Boton_Alta.setEnabled(false);
        }
    }
    //metodo que hacer que el boton de baja este desactivado hasta que todos los campos esten rellenos
     private void ActivarBoton_B(){
        if(!texto_B_Matricula.getText().isEmpty()){
            Boton_Baja.setEnabled(true);
        }else{
            Boton_Baja.setEnabled(false);
        }
    }
    
     //metodo que hacer que el boton de modificar este desactivado hasta que todos los campos esten rellenos
      private void ActivarBoton_M(){
        if(!texto_M_Matricula.getText().isEmpty() && !texto_M_Nota.getText().isEmpty() && !texto_M_Nombre.getText().isEmpty() && !texto_M_Sexo.getText().isEmpty()){
            Boton_Modificar.setEnabled(true);
        }else{
            Boton_Modificar.setEnabled(false);
        }
    }
      
      //metodo que hacer que el boton de Buscar este desactivado hasta que todos los campos esten rellenos
       private void ActivarBoton_S(){
        if(!texto_S_Matricula.getText().isEmpty()){
            Boton_Buscar.setEnabled(true);
        }else{
            Boton_Buscar.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_modificar = new javax.swing.JPanel();
        etiqueta7 = new javax.swing.JLabel();
        etiqueta8 = new javax.swing.JLabel();
        etiqueta9 = new javax.swing.JLabel();
        Boton_Modificar = new javax.swing.JButton();
        texto_M_Matricula = new javax.swing.JTextField();
        texto_M_Nota = new javax.swing.JTextField();
        etiqueta13 = new javax.swing.JLabel();
        texto_M_Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        texto_M_Sexo = new javax.swing.JTextField();
        panel_buscar = new javax.swing.JPanel();
        etiqueta10 = new javax.swing.JLabel();
        etiqueta11 = new javax.swing.JLabel();
        Boton_Buscar = new javax.swing.JButton();
        texto_S_Matricula = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panel_baja = new javax.swing.JPanel();
        etiqueta4 = new javax.swing.JLabel();
        etiqueta5 = new javax.swing.JLabel();
        Boton_Baja = new javax.swing.JButton();
        texto_B_Matricula = new javax.swing.JTextField();
        panel_alta = new javax.swing.JPanel();
        etiqueta1 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        Boton_Alta = new javax.swing.JButton();
        texto_A_Matricula = new javax.swing.JTextField();
        texto_A_Nota = new javax.swing.JTextField();
        etiqueta6 = new javax.swing.JLabel();
        etiqueta12 = new javax.swing.JLabel();
        texto_A_Nombre = new javax.swing.JTextField();
        texto_A_Sexo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        panel_tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_modificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_modificar.setPreferredSize(new java.awt.Dimension(700, 200));

        etiqueta7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        etiqueta7.setText("Modificar");

        etiqueta8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        etiqueta8.setText("Nº Matricula");

        etiqueta9.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        etiqueta9.setText("Nota");

        Boton_Modificar.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        Boton_Modificar.setText("Modificar");
        Boton_Modificar.setActionCommand("Baja");
        Boton_Modificar.setEnabled(false);
        Boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ModificarActionPerformed(evt);
            }
        });

        texto_M_Matricula.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_M_Matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_M_MatriculaKeyReleased(evt);
            }
        });

        texto_M_Nota.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_M_Nota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_M_NotaKeyReleased(evt);
            }
        });

        etiqueta13.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        etiqueta13.setText("Nombre");

        texto_M_Nombre.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_M_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_M_NombreKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Sexo");

        texto_M_Sexo.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_M_Sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_M_SexoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_modificarLayout = new javax.swing.GroupLayout(panel_modificar);
        panel_modificar.setLayout(panel_modificarLayout);
        panel_modificarLayout.setHorizontalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modificarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta7)
                    .addComponent(etiqueta9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_M_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_M_Nota, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiqueta13, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addComponent(texto_M_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(Boton_Modificar))
                    .addComponent(texto_M_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        panel_modificarLayout.setVerticalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_M_Matricula)
                    .addComponent(etiqueta13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_M_Nombre)
                    .addComponent(Boton_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_M_Nota)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_M_Sexo))
                .addContainerGap())
        );

        panel_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_buscar.setPreferredSize(new java.awt.Dimension(700, 200));

        etiqueta10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        etiqueta10.setText("Buscar");

        etiqueta11.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        etiqueta11.setText("Nº Matricula");

        Boton_Buscar.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        Boton_Buscar.setText("Buscar");
        Boton_Buscar.setActionCommand("Baja");
        Boton_Buscar.setEnabled(false);
        Boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarActionPerformed(evt);
            }
        });

        texto_S_Matricula.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_S_Matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_S_MatriculaKeyReleased(evt);
            }
        });

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Nota", "Sexo"
            }
        ));
        tabla2.setToolTipText("");
        jScrollPane3.setViewportView(tabla2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Datos del alumno seleccionado : ");

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarLayout.createSequentialGroup()
                .addGroup(panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_buscarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta10)
                            .addGroup(panel_buscarLayout.createSequentialGroup()
                                .addComponent(etiqueta11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(texto_S_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boton_Buscar))))
                    .addGroup(panel_buscarLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta11)
                    .addComponent(texto_S_Matricula)
                    .addComponent(Boton_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        panel_baja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_baja.setPreferredSize(new java.awt.Dimension(700, 200));

        etiqueta4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        etiqueta4.setText("Baja");

        etiqueta5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        etiqueta5.setText("Nº Matricula");

        Boton_Baja.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        Boton_Baja.setText("Baja");
        Boton_Baja.setEnabled(false);
        Boton_Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BajaActionPerformed(evt);
            }
        });

        texto_B_Matricula.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_B_Matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_B_MatriculaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_bajaLayout = new javax.swing.GroupLayout(panel_baja);
        panel_baja.setLayout(panel_bajaLayout);
        panel_bajaLayout.setHorizontalGroup(
            panel_bajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bajaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_bajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_bajaLayout.createSequentialGroup()
                        .addComponent(etiqueta4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_bajaLayout.createSequentialGroup()
                        .addComponent(etiqueta5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_B_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        panel_bajaLayout.setVerticalGroup(
            panel_bajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_bajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_B_Matricula)
                    .addComponent(Boton_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        panel_alta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_alta.setPreferredSize(new java.awt.Dimension(700, 200));

        etiqueta1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        etiqueta1.setText("Alta");

        etiqueta2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        etiqueta2.setText("Nº Matricula");

        Boton_Alta.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        Boton_Alta.setText("Alta");
        Boton_Alta.setEnabled(false);
        Boton_Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AltaActionPerformed(evt);
            }
        });

        texto_A_Matricula.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_A_Matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_A_MatriculaKeyReleased(evt);
            }
        });

        texto_A_Nota.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_A_Nota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_A_NotaKeyReleased(evt);
            }
        });

        etiqueta6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        etiqueta6.setText("Nombre ");

        etiqueta12.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        etiqueta12.setText("Nota");

        texto_A_Nombre.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_A_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_A_NombreKeyReleased(evt);
            }
        });

        texto_A_Sexo.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        texto_A_Sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_A_SexoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Sexo");

        javax.swing.GroupLayout panel_altaLayout = new javax.swing.GroupLayout(panel_alta);
        panel_alta.setLayout(panel_altaLayout);
        panel_altaLayout.setHorizontalGroup(
            panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_altaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta2))
                .addGap(43, 43, 43)
                .addGroup(panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texto_A_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_A_Nota, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta6)
                    .addComponent(jLabel3))
                .addGroup(panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_altaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(texto_A_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_altaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_A_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_altaLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(etiqueta12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(558, 558, 558)))
        );
        panel_altaLayout.setVerticalGroup(
            panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_altaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_A_Matricula)
                    .addComponent(etiqueta6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_A_Nombre)
                    .addComponent(Boton_Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_A_Nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_A_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(panel_altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_altaLayout.createSequentialGroup()
                    .addContainerGap(116, Short.MAX_VALUE)
                    .addComponent(etiqueta12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)))
        );

        panel_tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 850));

        tabla.setAutoCreateRowSorter(true);
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.Matricula", "Nombre", "Nota", "Sexo"
            }
        ));
        tabla.setEnabled(false);
        tabla.setMaximumSize(new java.awt.Dimension(250, 850));
        tabla.setMinimumSize(new java.awt.Dimension(400, 850));
        tabla.setName(""); // NOI18N
        tabla.setPreferredSize(new java.awt.Dimension(200, 850));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout panel_tablaLayout = new javax.swing.GroupLayout(panel_tabla);
        panel_tabla.setLayout(panel_tablaLayout);
        panel_tablaLayout.setHorizontalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_tablaLayout.setVerticalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                            .addComponent(panel_baja, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                            .addComponent(panel_alta, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                        .addGap(31, 31, 31)))
                .addComponent(panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_alta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(462, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Boton_AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AltaActionPerformed
        if(texto_A_Sexo.getText().charAt(0) != 'V' ){ //comprueba que en el campo "Sexo" no hay letras diferentes a V
            if( texto_A_Sexo.getText().charAt(0) != 'M'){ //comprueba que en el campo "Sexo" no hay letras diferentes a M
                JOptionPane.showMessageDialog(rootPane, "Por favor, introduzca una M(si es mujer), o una V(si es hombre) en el cmapo Sexo");
            }else{
                if(texto_A_Nota.getText().charAt(0) == '.'){//comprueba que en campo nota no hay solo un punto
                JOptionPane.showMessageDialog(rootPane, "Por favor, introduzca una nota con este formato (X.XX)");
                }else{
                    id = Integer.parseInt(texto_A_Matricula.getText());
                    int pos = (id-1)*34;//24 es el numero de bytes que ocuopa cada registro de mi programa
                    Alta_MeterMatriculas();
                }   
            }
        }else{
            if(texto_A_Nota.getText().charAt(0) == '.'){
                JOptionPane.showMessageDialog(rootPane, "Por favor, introduzca una nota con este formato (X.XX)");
            }else{
            id = Integer.parseInt(texto_A_Matricula.getText());
            int pos = (id-1)*34;
            Alta_MeterMatriculas();
            }
        }
            texto_A_Nota.setText("");
            texto_A_Matricula.setText("");
            texto_A_Nombre.setText("");
            texto_A_Sexo.setText("");
            Boton_Alta.setEnabled(false);
    }//GEN-LAST:event_Boton_AltaActionPerformed

    
    
    private void Boton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscarActionPerformed
        try {
            leerArchivo();
        } catch (IOException ex) {
            
        }
        
        texto_S_Matricula.setText("");
        Boton_Buscar.setEnabled(false);
    }//GEN-LAST:event_Boton_BuscarActionPerformed

    
    
    private void Boton_BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BajaActionPerformed
        int pos;
        
        id = Integer.parseInt(texto_B_Matricula.getText()); 
        pos = (id-1)*34; 
        
        //muestra un JOptionPane que pregunta opciones, depende de lo que elijas estra en el if o no
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "Quieres borrar el archivo?","Alerta", JOptionPane.YES_NO_OPTION);
          
        if(respuesta == JOptionPane.YES_OPTION){
           Baja_YesOption(pos);   
        }else{
            JOptionPane.showMessageDialog(rootPane, "Accion no realizada");
            texto_B_Matricula.setText("");
            Boton_Baja.setEnabled(false);
            texto_B_Matricula.setText("");
        }    
    }//GEN-LAST:event_Boton_BajaActionPerformed

    
    
    
    private void Boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ModificarActionPerformed
        //Las mismas comprobaciones que en el boton de alta
        if(texto_M_Nota.getText().charAt(0) == '.'){
            JOptionPane.showMessageDialog(rootPane, "Por favor, introduzca una nota con este formato (X.XX)");
        }else{
            int pos;
            id = Integer.parseInt(texto_M_Matricula.getText()); 
            nota = Double.valueOf(texto_M_Nota.getText());
            pos = (id-1)*34; 
            if( nota > 10){
                JOptionPane.showMessageDialog(rootPane, "Error, la nota debe estar entre 0 y 10");
            }else{
                if(texto_M_Sexo.getText().charAt(0) != 'V' ){
                    if( texto_M_Sexo.getText().charAt(0) != 'M'){
                        JOptionPane.showMessageDialog(rootPane, "Por favor, introduzca una M(si es mujer), o una V(si es hombre) en el cmapo Sexo");
                
                    }else{
                        Modificar_Modificando(pos);
                    }
                }else{
                    if(texto_M_Nota.getText().charAt(0) == '.'){
                        JOptionPane.showMessageDialog(rootPane, "Por favor, introduzca una nota con este formato (X.XX)");
                    }else{
                        Modificar_Modificando(pos);
                    }
            
                }
            }
        }
        
        texto_M_Sexo.setText("");
        texto_M_Nombre.setText("");
        texto_M_Matricula.setText("");
        texto_M_Nota.setText("");
        Boton_Modificar.setEnabled(false);
        //Borra todos los campos y pone el boton desactivado
    }//GEN-LAST:event_Boton_ModificarActionPerformed

    
    //Una key paar todos los textField para los metodos activarboton
    private void texto_A_MatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_A_MatriculaKeyReleased
        ActivarBoton_A();
    }//GEN-LAST:event_texto_A_MatriculaKeyReleased

    private void texto_A_NotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_A_NotaKeyReleased
        ActivarBoton_A();
    }//GEN-LAST:event_texto_A_NotaKeyReleased

    private void texto_B_MatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_B_MatriculaKeyReleased
        ActivarBoton_B();
    }//GEN-LAST:event_texto_B_MatriculaKeyReleased

    private void texto_M_MatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_M_MatriculaKeyReleased
        ActivarBoton_M();
    }//GEN-LAST:event_texto_M_MatriculaKeyReleased

    private void texto_M_NotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_M_NotaKeyReleased
        ActivarBoton_M();
    }//GEN-LAST:event_texto_M_NotaKeyReleased

    private void texto_S_MatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_S_MatriculaKeyReleased
        ActivarBoton_S();
    }//GEN-LAST:event_texto_S_MatriculaKeyReleased

    private void texto_A_NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_A_NombreKeyReleased
        ActivarBoton_A();
    }//GEN-LAST:event_texto_A_NombreKeyReleased

    private void texto_M_NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_M_NombreKeyReleased
        ActivarBoton_M();
    }//GEN-LAST:event_texto_M_NombreKeyReleased

    private void texto_M_SexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_M_SexoKeyReleased
       ActivarBoton_M();
    }//GEN-LAST:event_texto_M_SexoKeyReleased

    private void texto_A_SexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_A_SexoKeyReleased
        ActivarBoton_A();
    }//GEN-LAST:event_texto_A_SexoKeyReleased

    
   //con este metodo introduzco un registro en el fichero 
    private void crearEscribirarchivo(int pos){
        try{
            char sexo = texto_A_Sexo.getText().charAt(0);
            alumnos.add(new Alumno(id, nota, nombre, sexo)); //meto en el arraylist los alumnos
            raf = new RandomAccessFile("ejemplo.txt", "rw");//instancio en objeto raf
            
                for(int i = 0; i<alumnos.size();i++){//recorro el arraylist y escribo los registros
                        raf.seek(pos);
                        raf.writeInt(alumnos.get(i).getMatricula());//escribo el entero
                        
                        //Hago que el String temga un tamaño maximo
                        StringBuilder sb = new StringBuilder(alumnos.get(i).getNombre());
                        sb.setLength(10);
                        
                        raf.writeChars(sb.toString());//escribo el String
                        raf.writeDouble(alumnos.get(i).getNota());//escribo el doble
                        raf.writeChar(sexo);//escribo el char
                }   
                raf.close();
                crear_modificartabla();    
        }catch(EOFException ex){
             
        }catch(IOException ex){
            JOptionPane.showMessageDialog(rootPane, "Error de IOException");
        }
    }
    
    
   //con este metodo leo el fichero e introduzco el registro que de me ha pedido por el boton buscar en una tabla
    private void leerArchivo() throws IOException{
        int pos, readId;
        Double readNota;
        char readSexo;
        DefaultTableModel modelo = (DefaultTableModel)tabla2.getModel();
        modelo.setRowCount(0);
        
        id = Integer.parseInt(texto_S_Matricula.getText());
        String readNombre = "";
        pos = (id-1)*34;
        try {
            raf = new RandomAccessFile("ejemplo.txt", "r");//instancio el objeto
            raf.seek(pos);//lo posiciono
            
           if(raf.readInt()== 0){
               JOptionPane.showMessageDialog(rootPane, "Error, matricula inexistente");//compruebo que esa matricula existe
           }else{
               raf.seek(pos);
               readId = raf.readInt();//leo el int
               
               for(int i =0;i<10;i++){
                   readNombre += raf.readChar();//leo 1 por 1 los caracteres del String y los voy metiendo en una variable tipo String
               }
               readNota = raf.readDouble();//leo el doble
               
               readSexo = raf.readChar();//leo el char
               
               modelo.addRow(new Object[] {readId, readNombre, readNota, readSexo});//lo introduzco todo en la tabla.
               raf.close();
           }
        } catch (FileNotFoundException ex) {
               JOptionPane.showMessageDialog(rootPane, "Archivo no encontrado");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error, matricula inexistente");
        }  
    }
    
    //metodo que comprueba si el registro existe y devuelve en boolean
    private boolean Existe(int id){
        for(int i = 0; i<alumnos.size();i++){
         if(alumnos.get(i).getMatricula() == id){
              return false;
         }
        }
        return true;
    }
    
    //Metodo para modificar los registros
    private void Modificarmatricula(int pos) throws FileNotFoundException, IOException{
        raf = new RandomAccessFile("ejemplo.txt", "rw");//instancio el objeto
        id = Integer.parseInt(texto_M_Matricula.getText());
        nota = Double.valueOf(texto_M_Nota.getText());
        nombre = texto_M_Nombre.getText();
        char Sexo = texto_M_Sexo.getText().charAt(0);
        
        raf.seek(pos);//lo posiciono
        raf.writeInt(id);//escribo el int
        
        StringBuilder sb = new StringBuilder(nombre);
        sb.setLength(10);
        raf.writeChars(sb.toString());//escribo el String
        
        raf.writeDouble(nota);//escribo el doble
        raf.writeChar(Sexo);//escribo el char
        raf.close();//lo cierro
        crear_modificartabla();
        
    }
    
    //metodo para crear la matricula si salta el mensaje de "Esta matricula no existe, deseas crearla?" en el boton modificar
    private void Modificar_CrearMatriculaMayor(int pos){
        //Muestra una ventana y pregunta si quieres crearla, dependiendo de lo que elijas entra en el if
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "Error, matricula no creada, quieres crearla?","Alerta", JOptionPane.YES_NO_OPTION);
        if(respuesta == JOptionPane.YES_OPTION){
            try{
            String nombre = texto_M_Nombre.getText();  
            char Sexo = texto_M_Sexo.getText().charAt(0);
            alumnos.add(new Alumno(id, nota, nombre, Sexo));//introduzco en el arraylist los alumnos 
            raf = new RandomAccessFile("ejemplo.txt", "rw");//instancio el objeto
                for(int i = 0; i<alumnos.size();i++){//recorro el array y escribo los registros
                        raf.seek(pos);
                        raf.writeInt(alumnos.get(i).getMatricula());//escribo el int
                       
                        StringBuilder sb = new StringBuilder(alumnos.get(i).getNombre());
                        sb.setLength(10);
                        
                        raf.writeChars(sb.toString());//escribo el String
                        raf.writeDouble(alumnos.get(i).getNota());//escribo el doble
                        raf.writeChar(Sexo);//escribo el char
                }
        
                raf.close();//lo cierro
                crear_modificartabla();
            }catch(IOException ex){
             JOptionPane.showMessageDialog(rootPane, "Error, no se puede escribir una matricula 0");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Accion no realizada");
        }
    }
   
    
    //metodo que se ejecuta si se ha dado a la opcion yes en el boton baja
    private void Baja_YesOption(int pos){
        try{
            raf = new RandomAccessFile("ejemplo.txt", "rw");
            raf.seek(pos);
            
            if(raf.readInt() == 0){//comprueba si ya se ha borrado
                JOptionPane.showMessageDialog(rootPane, "Error, esta matricula ya ha sido borrada");
                texto_B_Matricula.setText("");
                Boton_Baja.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Accion realizada");
                for(int i = 0; i<alumnos.size();i++){
                    alumnos.remove(i);
                }
                //lo quita del array de alumnos
                
                //escribe un cero en la matricula, para que se "borre" el registro
                raf.seek(pos);
                raf.writeInt(0);
                
                Boton_Baja.setEnabled(false);
                raf.close();
                
                texto_B_Matricula.setText("");
                
                crear_modificartabla(); 
            }
            }catch(IOException ex){
             JOptionPane.showMessageDialog(panel_baja, "Error, esta matricula no ha sido creada");
             Boton_Baja.setEnabled(false);
             texto_B_Matricula.setText("");
            }
    }
   
    //metodo el cual se ejecuta al pulsar el btotn mofificar y se han comprobado las excepciones
    private void Modificar_Modificando(int pos){
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "Quieres modificar el archivo?","Alerta", JOptionPane.YES_NO_OPTION);
           
        if(respuesta == JOptionPane.YES_OPTION){
           try{
            raf = new RandomAccessFile("ejemplo.txt", "rw");
            raf.seek(pos);
            if(raf.readInt() == 0){
                
               int respuesta2 = JOptionPane.showConfirmDialog(rootPane, "Error matricula no creada, quieres crearla?","Alerta", JOptionPane.YES_NO_OPTION);
               if(respuesta2 == JOptionPane.YES_OPTION){
                   pos = (id-1)*34;  
                   Modificarmatricula(pos);//llama al metodo
                   
               }else{
                 JOptionPane.showMessageDialog(rootPane, "Accion no realizada");
               }
            }else{
                raf.seek(pos);
                
                raf.writeInt(id);//escribe el int
               
                
                StringBuilder sb = new StringBuilder(texto_M_Nombre.getText());
                sb.setLength(10);
                        
                raf.writeChars(sb.toString());//escribe el string
                raf.writeDouble(nota); //escribe el double
                raf.writeChar(texto_M_Sexo.getText().charAt(0));//escribe el char
                
                raf.close();//cierra
                crear_modificartabla();
                JOptionPane.showMessageDialog(rootPane, "Accion realizada");
            }
            
            }catch(EOFException ex){
                Modificar_CrearMatriculaMayor(pos);
            }catch(IOException ex){
             JOptionPane.showMessageDialog(panel_baja, ex);
            }   
        }else{
            JOptionPane.showMessageDialog(rootPane, "Accion no realizada");
        }
    }
    
    //metodo que se ejecuta al pulsar el boton Alta y comprobar las excepiciones
    private void Alta_MeterMatriculas(){
        int pos;
        nota = Double.valueOf(texto_A_Nota.getText());
        id = Integer.parseInt(texto_A_Matricula.getText());
        nombre = texto_A_Nombre.getText();
        
        existe = Existe(id);
        
        if(existe){
            if( nota > 10){
                JOptionPane.showMessageDialog(rootPane, "Error, la nota debe estar entre 0 y 10");
            }else{
                pos = (id-1)*34;  
                crearEscribirarchivo(pos);
            }   
        }else{
            JOptionPane.showMessageDialog(rootPane, "Error, matricula ya creada");
        }
    }
    
    //metodo que lee los datos del fichero de bytes y va actualizando la tabla.
    private void crear_modificartabla() throws IOException{
        try {
            int pos = (id-1) * 34;
            raf = new RandomAccessFile("ejemplo.txt", "r");//instancia el objeto
            //crea variables para almacenrar los datos que vamos a leer
            String readNombre = "", readApellido="";
            int readId;
            double readNota;
            char readSexo = 'X';
            //crea un DefaultTableModel, le asigna la tabla y la borra
            DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
            modelo.setRowCount(0);
            
            //bucle que se recorre por cada registro que tengo guardado
            for(int i = 1;i<=raf.length()/34;i++){ 
                    readNombre= "";//pone de nuevo la variable en blanco para que no se concatenen los nombres   
                    raf.seek((i-1)*34) ;//se posiciona
                    readId = raf.readInt();//lee el entero
                    if(readId != 0){//si es cero, no existe, por lo que no entraria en este if
                        for(int j =0;j<10;j++){
                            readNombre += raf.readChar();//Lee el String caracter a caracter y lo mete en una variable de tipo String
                        }
                        readNota = raf.readDouble();//lee el doble
                        readSexo = raf.readChar();//lee el char
                        modelo.addRow(new Object[]{readId,readNombre, readNota, readSexo});//mete los datos leidos que han sido almacenados en variables en la tabla
                    }  
            }
            raf.close();//se cierra
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(rootPane, "Fichero no encontrado");
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Alta;
    private javax.swing.JButton Boton_Baja;
    private javax.swing.JButton Boton_Buscar;
    private javax.swing.JButton Boton_Modificar;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta10;
    private javax.swing.JLabel etiqueta11;
    private javax.swing.JLabel etiqueta12;
    private javax.swing.JLabel etiqueta13;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta4;
    private javax.swing.JLabel etiqueta5;
    private javax.swing.JLabel etiqueta6;
    private javax.swing.JLabel etiqueta7;
    private javax.swing.JLabel etiqueta8;
    private javax.swing.JLabel etiqueta9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel_alta;
    private javax.swing.JPanel panel_baja;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_modificar;
    private javax.swing.JPanel panel_tabla;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField texto_A_Matricula;
    private javax.swing.JTextField texto_A_Nombre;
    private javax.swing.JTextField texto_A_Nota;
    private javax.swing.JTextField texto_A_Sexo;
    private javax.swing.JTextField texto_B_Matricula;
    private javax.swing.JTextField texto_M_Matricula;
    private javax.swing.JTextField texto_M_Nombre;
    private javax.swing.JTextField texto_M_Nota;
    private javax.swing.JTextField texto_M_Sexo;
    private javax.swing.JTextField texto_S_Matricula;
    // End of variables declaration//GEN-END:variables
}
