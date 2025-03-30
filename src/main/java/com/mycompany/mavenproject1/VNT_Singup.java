/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Vicente193373
 */
public class VNT_Singup extends javax.swing.JFrame {

    //Se necesita definir una variable File para contener la foto de perfil
    File im;
    
    public VNT_Singup() {
        initComponents();
        if (FLD_ClaveA.getText() == FLD_ClaveB.getText())
        {
            BTN_Crear.setText("Crear cuenta");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FLD_Correo = new javax.swing.JTextField();
        BTN_Crear = new javax.swing.JButton();
        TXT_Correo = new javax.swing.JLabel();
        TXT_Nombre = new javax.swing.JLabel();
        FLD_ClaveA = new javax.swing.JPasswordField();
        TXT_ClaveA = new javax.swing.JLabel();
        FLD_ClaveB = new javax.swing.JPasswordField();
        TXT_ClaveB = new javax.swing.JLabel();
        FLD_Tel = new javax.swing.JTextField();
        TXT_Tel = new javax.swing.JLabel();
        TXT_FechaN = new javax.swing.JLabel();
        SPN_Dia = new javax.swing.JSpinner();
        SPN_Mes = new javax.swing.JSpinner();
        SPN_Anio = new javax.swing.JSpinner();
        BTN_Foto = new javax.swing.JButton();
        TXT_Apellido = new javax.swing.JLabel();
        TXT_Id = new javax.swing.JLabel();
        TXT_Genero = new javax.swing.JLabel();
        TXT_Localidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FLD_Nombre = new javax.swing.JTextField();
        FLD_Apellido = new javax.swing.JTextField();
        FLD_Id = new javax.swing.JTextField();
        FLD_Genero = new javax.swing.JTextField();
        FLD_Localidad = new javax.swing.JTextField();
        LBL_Warning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1015, 615));

        BTN_Crear.setText("Crear Cuenta");
        BTN_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CrearActionPerformed(evt);
            }
        });

        TXT_Correo.setText("Correo Electrónico");

        TXT_Nombre.setText("Nombre");

        TXT_ClaveA.setText("Contraseña");

        TXT_ClaveB.setText("Repetir Contraseña");

        TXT_Tel.setText("Teléfono");

        TXT_FechaN.setText("Fecha de Nacimiento");

        SPN_Dia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        SPN_Mes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        SPN_Anio.setModel(new javax.swing.SpinnerNumberModel(2025, 1500, 3000, 1));

        BTN_Foto.setText("Foto");
        BTN_Foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_FotoActionPerformed(evt);
            }
        });

        TXT_Apellido.setText("Apellido");

        TXT_Id.setText("Identificador");

        TXT_Genero.setText("Género");

        TXT_Localidad.setText("Localidad");

        jLabel1.setText("@");

        LBL_Warning.setForeground(new java.awt.Color(255, 0, 51));
        LBL_Warning.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXT_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXT_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXT_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FLD_Correo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXT_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(FLD_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXT_ClaveA, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(FLD_ClaveA, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(FLD_Id)
                    .addComponent(FLD_Genero))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_ClaveB, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FLD_ClaveB, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(SPN_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(SPN_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(SPN_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(TXT_FechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TXT_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FLD_Tel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXT_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(TXT_Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FLD_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FLD_Localidad, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addGap(310, 310, 310))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(469, 469, 469))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LBL_Warning, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(423, 423, 423))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BTN_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_Correo)
                        .addGap(1, 1, 1)
                        .addComponent(FLD_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_Tel)
                        .addGap(1, 1, 1)
                        .addComponent(FLD_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_Nombre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_Apellido)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FLD_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FLD_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_FechaN)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SPN_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPN_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPN_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_Id)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FLD_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_Genero)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_Localidad)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FLD_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FLD_Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_ClaveB)
                        .addGap(1, 1, 1)
                        .addComponent(FLD_ClaveB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_ClaveA)
                        .addGap(1, 1, 1)
                        .addComponent(FLD_ClaveA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(LBL_Warning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_Crear)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        FLD_Correo.getAccessibleContext().setAccessibleName("ID_FLD_Identif");
        FLD_Correo.getAccessibleContext().setAccessibleDescription("");
        BTN_Crear.getAccessibleContext().setAccessibleName("ID_BTN_Crear");
        TXT_Correo.getAccessibleContext().setAccessibleName("ID_TXT_Identif");
        TXT_Correo.getAccessibleContext().setAccessibleDescription("");
        TXT_Nombre.getAccessibleContext().setAccessibleName("ID_TXT_Password");
        TXT_FechaN.getAccessibleContext().setAccessibleName("ID_TXT_FechaN");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_FotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_FotoActionPerformed
        // TODO add your handling code here:
        
        //Se debe definir para usar la ventanilla que busca un archivo
        JFileChooser archivo = new JFileChooser();
        archivo.showOpenDialog(this);
        this.im = archivo.getSelectedFile();
        
        //Se guarda en 'path' la ubicacion del archivo elegido que sera la foto de perfil
        String path_img = this.im.getAbsolutePath();
        
        //Se toma la imagen y se define como un icono asignable
        ImageIcon img = new ImageIcon(new ImageIcon(path_img).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        this.BTN_Foto.setText("");
        this.BTN_Foto.setIcon(img);
    }//GEN-LAST:event_BTN_FotoActionPerformed

    private void BTN_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CrearActionPerformed
        // TODO add your handling code here:
        
        if(FLD_ClaveA.getText() == FLD_ClaveB.getText())
        {
            //Se define la conexion usando el archivo predefinido DB_con.java
            DB_con db_c = new DB_con();
        
            //Se guarda en 'name' lo que estaba escrito en el campo nombre
            String id = FLD_Id.getText();
            
            //Se guarda en 'name' lo que estaba escrito en el campo nombre
            String name = FLD_Nombre.getText();
        
            //Se guarda en 'name' lo que estaba escrito en el campo nombre
            String last = FLD_Apellido.getText();
        
            //Se guarda en 'name' lo que estaba escrito en el campo nombre
            String email = FLD_Correo.getText();
        
            //Se guarda en 'name' lo que estaba escrito en el campo nombre
            String phone = FLD_Tel.getText();
        
            //Se guarda cada valor del dia de nacimiento para cambiar su formato
            int D = (Integer) SPN_Dia.getValue();
            int M = (Integer) SPN_Mes.getValue();
            int Y = (Integer) SPN_Anio.getValue();
            
            //Se procesan los valores en el formato adecuado para una fecha en SQL
            LocalDate bdate = LocalDate.of(Y, M, D);
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            
            //Se guarda en 'birth' lo que se intordujo como fecha de nacimiento
            String birth = bdate.format(formato);
        
            //Se guarda en 'psw' lo que estaba escrito en el campo genero
            String gender  = FLD_Genero.getText();
        
            //Se guarda en 'psw' lo que estaba escrito en el campo genero
            String home  = FLD_Localidad.getText();
        
            //Se guarda en 'psw' lo que estaba escrito en el campo contraseña
            String pass  = FLD_ClaveB.getText();
        
            //Se define la conexion en a para referenciarla
            Connection a = db_c.Get_conexion();
            
            Boolean singup;
                    
            if (db_c.Check_Unique(id, email) == "")
            {
                //Se define login para guardar si se confirman que el usuario y la contraseña fueron correctos
                singup = db_c.Registrar(id, name, last, email, phone, birth, gender, home, pass);
                
                if(singup) //se comprueba que los datos para entrar si existen y son correctos
                {
                    //Se crea una ventana de inicio
                    VNT_Login NewVL = new VNT_Login();
        
                    //Se hace visible a la ventana de inicio
                    NewVL.setVisible(true);
        
                    //Se hace invisible y se desaparece la ventana de login actual
                    this.setVisible(false);
                    this.dispose();
                }
            }
            else if (db_c.Check_Unique(id, email) != null)
            {
                LBL_Warning.setText(db_c.Check_Unique(id, email));
                singup = false;
            }
        
        }
        else
        {
            LBL_Warning.setText("Contraseñas diferentes");
        }
        
    }//GEN-LAST:event_BTN_CrearActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VNT_Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VNT_Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VNT_Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VNT_Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VNT_Singup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Crear;
    private javax.swing.JButton BTN_Foto;
    private javax.swing.JTextField FLD_Apellido;
    private javax.swing.JPasswordField FLD_ClaveA;
    private javax.swing.JPasswordField FLD_ClaveB;
    private javax.swing.JTextField FLD_Correo;
    private javax.swing.JTextField FLD_Genero;
    private javax.swing.JTextField FLD_Id;
    private javax.swing.JTextField FLD_Localidad;
    private javax.swing.JTextField FLD_Nombre;
    private javax.swing.JTextField FLD_Tel;
    private javax.swing.JLabel LBL_Warning;
    private javax.swing.JSpinner SPN_Anio;
    private javax.swing.JSpinner SPN_Dia;
    private javax.swing.JSpinner SPN_Mes;
    private javax.swing.JLabel TXT_Apellido;
    private javax.swing.JLabel TXT_ClaveA;
    private javax.swing.JLabel TXT_ClaveB;
    private javax.swing.JLabel TXT_Correo;
    private javax.swing.JLabel TXT_FechaN;
    private javax.swing.JLabel TXT_Genero;
    private javax.swing.JLabel TXT_Id;
    private javax.swing.JLabel TXT_Localidad;
    private javax.swing.JLabel TXT_Nombre;
    private javax.swing.JLabel TXT_Tel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
