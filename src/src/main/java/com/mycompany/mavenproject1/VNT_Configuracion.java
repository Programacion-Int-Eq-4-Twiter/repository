/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Vicente193373
 */
public class VNT_Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form VNT_Inicio
     */
    public VNT_Configuracion() {
        initComponents();
        
        
        //String url = "src/img/Halo.png";
        //ImageIcon image = new ImageIcon(url);
        //Image img = image.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        //ImageIcon icono = new ImageIcon(img);
        //BTN_Icono.setIcon(icono);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BTN_Inicio = new javax.swing.JButton();
        BTN_Explorar = new javax.swing.JButton();
        BTN_Notif = new javax.swing.JButton();
        BTN_Perfil = new javax.swing.JButton();
        BTN_Config = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FLD_Publicar = new javax.swing.JTextArea();
        BTN_Publicar = new javax.swing.JButton();
        BTN_Comun = new javax.swing.JButton();
        BTN_Listas = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));
        jButton1 = new javax.swing.JButton();
        BTN_Buscar1 = new javax.swing.JButton();
        BTN_Publicar2 = new javax.swing.JButton();
        BTN_Publicar3 = new javax.swing.JButton();
        BTN_Publicar4 = new javax.swing.JButton();
        BTN_Publicar5 = new javax.swing.JButton();
        BTN_Publicar6 = new javax.swing.JButton();
        BTN_Publicar7 = new javax.swing.JButton();
        BTN_Publicar8 = new javax.swing.JButton();
        BTN_Publicar9 = new javax.swing.JButton();
        BTN_Publicar10 = new javax.swing.JButton();
        LBL_Titulo = new javax.swing.JLabel();
        LBL_Titulo1 = new javax.swing.JLabel();
        BTN_Publicar1 = new javax.swing.JButton();
        BTN_Publicar11 = new javax.swing.JButton();
        BTN_Publicar12 = new javax.swing.JButton();
        BTN_Publicar13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BTN_Inicio.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Inicio.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        BTN_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Inicio.setText("Inicio");
        BTN_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_InicioActionPerformed(evt);
            }
        });

        BTN_Explorar.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Explorar.setFont(new java.awt.Font("Monospaced", 2, 24)); // NOI18N
        BTN_Explorar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Explorar.setText("Explorar");
        BTN_Explorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ExplorarActionPerformed(evt);
            }
        });

        BTN_Notif.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Notif.setFont(new java.awt.Font("Monospaced", 2, 24)); // NOI18N
        BTN_Notif.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Notif.setText("Notificaciones");
        BTN_Notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NotifActionPerformed(evt);
            }
        });

        BTN_Perfil.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Perfil.setFont(new java.awt.Font("Monospaced", 2, 24)); // NOI18N
        BTN_Perfil.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Perfil.setText("Perfil");
        BTN_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PerfilActionPerformed(evt);
            }
        });

        BTN_Config.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Config.setFont(new java.awt.Font("Monospaced", 2, 24)); // NOI18N
        BTN_Config.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Config.setText("Configuración");
        BTN_Config.setToolTipText("");
        BTN_Config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ConfigActionPerformed(evt);
            }
        });

        FLD_Publicar.setColumns(20);
        FLD_Publicar.setRows(5);
        FLD_Publicar.setText("Configuración de búsqueda");
        FLD_Publicar.setToolTipText("");
        jScrollPane1.setViewportView(FLD_Publicar);
        FLD_Publicar.getAccessibleContext().setAccessibleName("ID_FLD_Publicar");

        BTN_Publicar.setText("Tu cuenta");
        BTN_Publicar.setActionCommand("");
        BTN_Publicar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PublicarActionPerformed(evt);
            }
        });

        BTN_Comun.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Comun.setFont(new java.awt.Font("Monospaced", 2, 24)); // NOI18N
        BTN_Comun.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Comun.setText("Comunidades");
        BTN_Comun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ComunActionPerformed(evt);
            }
        });

        BTN_Listas.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Listas.setFont(new java.awt.Font("Monospaced", 2, 24)); // NOI18N
        BTN_Listas.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Listas.setText("Listas");
        BTN_Listas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ListasActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HaloIcon.png"))); // NOI18N

        BTN_Buscar1.setText("Buscar");

        BTN_Publicar2.setText("Premium");
        BTN_Publicar2.setActionCommand("");
        BTN_Publicar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar2ActionPerformed(evt);
            }
        });

        BTN_Publicar3.setText("Monetización");
        BTN_Publicar3.setActionCommand("");
        BTN_Publicar3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar3ActionPerformed(evt);
            }
        });

        BTN_Publicar4.setText("Suscripciones para creadores");
        BTN_Publicar4.setActionCommand("");
        BTN_Publicar4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar4ActionPerformed(evt);
            }
        });

        BTN_Publicar5.setText("Seguridad y acceso a la cuenta");
        BTN_Publicar5.setActionCommand("");
        BTN_Publicar5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar5ActionPerformed(evt);
            }
        });

        BTN_Publicar6.setText("Privacidad y seguridad");
        BTN_Publicar6.setActionCommand("");
        BTN_Publicar6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar6ActionPerformed(evt);
            }
        });

        BTN_Publicar7.setText("Notificaciones");
        BTN_Publicar7.setActionCommand("");
        BTN_Publicar7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar7ActionPerformed(evt);
            }
        });

        BTN_Publicar8.setActionCommand("");
        BTN_Publicar8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar8.setLabel("Accesibilidad, pantalla e idiomas");
        BTN_Publicar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar8ActionPerformed(evt);
            }
        });

        BTN_Publicar9.setText("Recursos adicionales");
        BTN_Publicar9.setActionCommand("");
        BTN_Publicar9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar9ActionPerformed(evt);
            }
        });

        BTN_Publicar10.setText("Centro de ayuda");
        BTN_Publicar10.setActionCommand("");
        BTN_Publicar10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar10ActionPerformed(evt);
            }
        });

        LBL_Titulo.setFont(new java.awt.Font("Monospaced", 2, 24)); // NOI18N
        LBL_Titulo.setText("Configuración");

        LBL_Titulo1.setFont(new java.awt.Font("Monospaced", 2, 24)); // NOI18N
        LBL_Titulo1.setText("Tu cuenta");

        BTN_Publicar1.setText("Información de la cuenta");
        BTN_Publicar1.setActionCommand("");
        BTN_Publicar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar1ActionPerformed(evt);
            }
        });

        BTN_Publicar11.setText("Cambia tu contraseña");
        BTN_Publicar11.setActionCommand("");
        BTN_Publicar11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar11ActionPerformed(evt);
            }
        });

        BTN_Publicar12.setText("Descargar un archivo con tus datos");
        BTN_Publicar12.setActionCommand("");
        BTN_Publicar12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar12ActionPerformed(evt);
            }
        });

        BTN_Publicar13.setText("Desactivar tu cuenta");
        BTN_Publicar13.setActionCommand("");
        BTN_Publicar13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Publicar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Publicar13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BTN_Notif)
                        .addComponent(BTN_Perfil, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BTN_Config, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BTN_Inicio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Explorar, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(BTN_Listas)
                    .addComponent(BTN_Comun))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BTN_Publicar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Publicar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Publicar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Publicar4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Publicar5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Publicar6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Publicar7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Publicar8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Publicar9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Publicar10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addComponent(LBL_Titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BTN_Buscar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTN_Publicar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTN_Publicar11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTN_Publicar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTN_Publicar13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(LBL_Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(BTN_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Explorar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Notif, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Comun, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Listas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Config, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBL_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(BTN_Buscar1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Publicar10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBL_Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Publicar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Publicar11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Publicar12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Publicar13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        BTN_Inicio.getAccessibleContext().setAccessibleName("ID_BTN_Inicio");
        BTN_Explorar.getAccessibleContext().setAccessibleName("ID_BTN_Buscar");
        BTN_Notif.getAccessibleContext().setAccessibleName("ID_BTN_Notif");
        BTN_Perfil.getAccessibleContext().setAccessibleName("ID_BTN_Perfil");
        BTN_Config.getAccessibleContext().setAccessibleName("ID_BTN_Config");
        BTN_Publicar.getAccessibleContext().setAccessibleName("ID_BTN_Publicar");
        BTN_Comun.getAccessibleContext().setAccessibleName("ID_BTN_Comun");
        BTN_Listas.getAccessibleContext().setAccessibleName("ID_BTN_Listas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_InicioActionPerformed

    private void BTN_ExplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ExplorarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ExplorarActionPerformed

    private void BTN_NotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NotifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_NotifActionPerformed

    private void BTN_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_PerfilActionPerformed

    private void BTN_ConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ConfigActionPerformed

    private void BTN_ComunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ComunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ComunActionPerformed

    private void BTN_ListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ListasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ListasActionPerformed

    private void BTN_PublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PublicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_PublicarActionPerformed

    private void BTN_Publicar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar2ActionPerformed

    private void BTN_Publicar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar3ActionPerformed

    private void BTN_Publicar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar4ActionPerformed

    private void BTN_Publicar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar5ActionPerformed

    private void BTN_Publicar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar6ActionPerformed

    private void BTN_Publicar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar7ActionPerformed

    private void BTN_Publicar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar8ActionPerformed

    private void BTN_Publicar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar9ActionPerformed

    private void BTN_Publicar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar10ActionPerformed

    private void BTN_Publicar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar1ActionPerformed

    private void BTN_Publicar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar11ActionPerformed

    private void BTN_Publicar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar12ActionPerformed

    private void BTN_Publicar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Publicar13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Publicar13ActionPerformed

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
            java.util.logging.Logger.getLogger(VNT_Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VNT_Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VNT_Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VNT_Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new VNT_Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Buscar1;
    private javax.swing.JButton BTN_Comun;
    private javax.swing.JButton BTN_Config;
    private javax.swing.JButton BTN_Explorar;
    private javax.swing.JButton BTN_Inicio;
    private javax.swing.JButton BTN_Listas;
    private javax.swing.JButton BTN_Notif;
    private javax.swing.JButton BTN_Perfil;
    private javax.swing.JButton BTN_Publicar;
    private javax.swing.JButton BTN_Publicar1;
    private javax.swing.JButton BTN_Publicar10;
    private javax.swing.JButton BTN_Publicar11;
    private javax.swing.JButton BTN_Publicar12;
    private javax.swing.JButton BTN_Publicar13;
    private javax.swing.JButton BTN_Publicar2;
    private javax.swing.JButton BTN_Publicar3;
    private javax.swing.JButton BTN_Publicar4;
    private javax.swing.JButton BTN_Publicar5;
    private javax.swing.JButton BTN_Publicar6;
    private javax.swing.JButton BTN_Publicar7;
    private javax.swing.JButton BTN_Publicar8;
    private javax.swing.JButton BTN_Publicar9;
    private javax.swing.JTextArea FLD_Publicar;
    private javax.swing.JLabel LBL_Titulo;
    private javax.swing.JLabel LBL_Titulo1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
