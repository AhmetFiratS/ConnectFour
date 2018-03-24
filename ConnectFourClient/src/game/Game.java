/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

//import connectfourClient.Client;
import java.awt.Component;
import java.awt.Container;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author ahmet
 */
public class Game extends javax.swing.JFrame {

    //framedeki komponentlere erişim için satatik oyun değişkeni
    public static Game ThisGame;
    //ekrandaki resim değişimi için timer yerine thread
    public Thread tmr_slider;
    //karşı tarafın seçimi seçim -1 deyse seçilmemiş
    public int RivalSelection = -1;
    //benim seçimim seçim -1 deyse seçilmemiş
    public int Myselection = -1;
    
    ImageIcon icons_right[];
    ImageIcon icons_left[];
    ImageIcon icons[];
    Random rand;
    
    public Game() {
        initComponents();
        ThisGame=this;
        ThisGame.Table.setVisible(false);
        //ThisGame.Table.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Table = new javax.swing.JFrame();
        User_name = new javax.swing.JLabel();
        Columb0 = new javax.swing.JPanel();
        L10 = new javax.swing.JLabel();
        L20 = new javax.swing.JLabel();
        L30 = new javax.swing.JLabel();
        L40 = new javax.swing.JLabel();
        L50 = new javax.swing.JLabel();
        L00 = new javax.swing.JLabel();
        Columb1 = new javax.swing.JPanel();
        L11 = new javax.swing.JLabel();
        L21 = new javax.swing.JLabel();
        L39 = new javax.swing.JLabel();
        L31 = new javax.swing.JLabel();
        L41 = new javax.swing.JLabel();
        L01 = new javax.swing.JLabel();
        L51 = new javax.swing.JLabel();
        Columb2 = new javax.swing.JPanel();
        L02 = new javax.swing.JLabel();
        L12 = new javax.swing.JLabel();
        L22 = new javax.swing.JLabel();
        L32 = new javax.swing.JLabel();
        L52 = new javax.swing.JLabel();
        L42 = new javax.swing.JLabel();
        Columb3 = new javax.swing.JPanel();
        L03 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        L23 = new javax.swing.JLabel();
        L33 = new javax.swing.JLabel();
        L43 = new javax.swing.JLabel();
        L53 = new javax.swing.JLabel();
        Columb4 = new javax.swing.JPanel();
        L04 = new javax.swing.JLabel();
        L14 = new javax.swing.JLabel();
        L24 = new javax.swing.JLabel();
        L34 = new javax.swing.JLabel();
        L44 = new javax.swing.JLabel();
        L54 = new javax.swing.JLabel();
        Columb5 = new javax.swing.JPanel();
        L05 = new javax.swing.JLabel();
        L15 = new javax.swing.JLabel();
        L25 = new javax.swing.JLabel();
        L35 = new javax.swing.JLabel();
        L45 = new javax.swing.JLabel();
        L55 = new javax.swing.JLabel();
        Columb6 = new javax.swing.JPanel();
        L06 = new javax.swing.JLabel();
        L16 = new javax.swing.JLabel();
        L26 = new javax.swing.JLabel();
        L36 = new javax.swing.JLabel();
        L46 = new javax.swing.JLabel();
        L56 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        ButtonConnect = new javax.swing.JButton();

        Table.setMinimumSize(new java.awt.Dimension(700, 600));

        User_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        User_name.setText("User Name");

        L10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb0Layout = new javax.swing.GroupLayout(Columb0);
        Columb0.setLayout(Columb0Layout);
        Columb0Layout.setHorizontalGroup(
            Columb0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Columb0Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Columb0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L00)
                    .addComponent(L40)
                    .addComponent(L50)
                    .addComponent(L30)
                    .addComponent(L10)
                    .addComponent(L20)))
        );
        Columb0Layout.setVerticalGroup(
            Columb0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Columb0Layout.createSequentialGroup()
                .addComponent(L00)
                .addGap(0, 0, 0)
                .addGroup(Columb0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Columb0Layout.createSequentialGroup()
                        .addComponent(L10)
                        .addGap(58, 58, 58))
                    .addGroup(Columb0Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(L20)
                        .addGap(0, 0, 0)
                        .addComponent(L30)
                        .addComponent(L40)
                        .addGap(0, 0, 0)
                        .addComponent(L50))))
        );

        L11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb1Layout = new javax.swing.GroupLayout(Columb1);
        Columb1.setLayout(Columb1Layout);
        Columb1Layout.setHorizontalGroup(
            Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Columb1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L51)
                    .addComponent(L01)
                    .addComponent(L41)
                    .addComponent(L31)
                    .addComponent(L39)
                    .addComponent(L11)
                    .addComponent(L21)))
        );
        Columb1Layout.setVerticalGroup(
            Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb1Layout.createSequentialGroup()
                .addComponent(L01)
                .addGap(0, 0, 0)
                .addGroup(Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L11)
                    .addGroup(Columb1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L21)
                            .addGroup(Columb1Layout.createSequentialGroup()
                                .addComponent(L39)
                                .addGap(0, 0, 0)
                                .addComponent(L31)
                                .addGap(0, 0, 0)
                                .addComponent(L41)))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(L51)
                .addGap(0, 0, 0))
        );

        L02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb2Layout = new javax.swing.GroupLayout(Columb2);
        Columb2.setLayout(Columb2Layout);
        Columb2Layout.setHorizontalGroup(
            Columb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Columb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L02)
                    .addComponent(L12)
                    .addComponent(L22)
                    .addComponent(L32)
                    .addComponent(L52)
                    .addComponent(L42)))
        );
        Columb2Layout.setVerticalGroup(
            Columb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(L02)
                .addGap(0, 0, 0)
                .addComponent(L12)
                .addGap(0, 0, 0)
                .addComponent(L22)
                .addGap(0, 0, 0)
                .addComponent(L32)
                .addGap(0, 0, 0)
                .addComponent(L42)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(L52))
        );

        L03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb3Layout = new javax.swing.GroupLayout(Columb3);
        Columb3.setLayout(Columb3Layout);
        Columb3Layout.setHorizontalGroup(
            Columb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Columb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L03)
                    .addComponent(L13)
                    .addComponent(L23)
                    .addComponent(L33)
                    .addComponent(L43)
                    .addComponent(L53))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Columb3Layout.setVerticalGroup(
            Columb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb3Layout.createSequentialGroup()
                .addComponent(L03)
                .addGap(0, 0, 0)
                .addComponent(L13)
                .addGap(0, 0, 0)
                .addComponent(L23)
                .addGap(0, 0, 0)
                .addComponent(L33)
                .addGap(0, 0, 0)
                .addComponent(L43)
                .addGap(0, 0, 0)
                .addComponent(L53)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        L04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb4Layout = new javax.swing.GroupLayout(Columb4);
        Columb4.setLayout(Columb4Layout);
        Columb4Layout.setHorizontalGroup(
            Columb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Columb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L04)
                    .addComponent(L14)
                    .addComponent(L24)
                    .addComponent(L34)
                    .addComponent(L44)
                    .addComponent(L54))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Columb4Layout.setVerticalGroup(
            Columb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb4Layout.createSequentialGroup()
                .addComponent(L04)
                .addGap(0, 0, 0)
                .addComponent(L14)
                .addGap(0, 0, 0)
                .addComponent(L24)
                .addGap(0, 0, 0)
                .addComponent(L34)
                .addGap(0, 0, 0)
                .addComponent(L44)
                .addGap(0, 0, 0)
                .addComponent(L54)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        L05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb5Layout = new javax.swing.GroupLayout(Columb5);
        Columb5.setLayout(Columb5Layout);
        Columb5Layout.setHorizontalGroup(
            Columb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Columb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L05)
                    .addComponent(L15)
                    .addComponent(L25)
                    .addComponent(L35)
                    .addComponent(L45)
                    .addComponent(L55))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Columb5Layout.setVerticalGroup(
            Columb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb5Layout.createSequentialGroup()
                .addComponent(L05)
                .addGap(0, 0, 0)
                .addComponent(L15)
                .addGap(0, 0, 0)
                .addComponent(L25)
                .addGap(0, 0, 0)
                .addComponent(L35)
                .addGap(0, 0, 0)
                .addComponent(L45)
                .addGap(0, 0, 0)
                .addComponent(L55)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        L06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb6Layout = new javax.swing.GroupLayout(Columb6);
        Columb6.setLayout(Columb6Layout);
        Columb6Layout.setHorizontalGroup(
            Columb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Columb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L06)
                    .addComponent(L16)
                    .addComponent(L26)
                    .addComponent(L36)
                    .addComponent(L46)
                    .addComponent(L56))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Columb6Layout.setVerticalGroup(
            Columb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb6Layout.createSequentialGroup()
                .addComponent(L06)
                .addGap(0, 0, 0)
                .addComponent(L16)
                .addGap(0, 0, 0)
                .addComponent(L26)
                .addGap(0, 0, 0)
                .addComponent(L36)
                .addGap(0, 0, 0)
                .addComponent(L46)
                .addGap(0, 0, 0)
                .addComponent(L56)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TableLayout = new javax.swing.GroupLayout(Table.getContentPane());
        Table.getContentPane().setLayout(TableLayout);
        TableLayout.setHorizontalGroup(
            TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableLayout.createSequentialGroup()
                .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TableLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Columb0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Columb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Columb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TableLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(User_name)))
                .addGap(0, 0, 0)
                .addComponent(Columb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Columb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Columb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Columb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        TableLayout.setVerticalGroup(
            TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Columb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TableLayout.createSequentialGroup()
                        .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Columb0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Columb1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Columb2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(User_name))
                    .addComponent(Columb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Columb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Columb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kullanıcı Adı:");

        ButtonConnect.setText("Bağlan");
        ButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(ButtonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConnectActionPerformed
        
        //Client.Start("127.0.0.1", 2000);
       
        ThisGame.Table.setVisible(true);
        ThisGame.Table.repaint();
        User_name.setText(Username.getText());
        
        
    }//GEN-LAST:event_ButtonConnectActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConnect;
    private javax.swing.JPanel Columb0;
    private javax.swing.JPanel Columb1;
    private javax.swing.JPanel Columb2;
    private javax.swing.JPanel Columb3;
    private javax.swing.JPanel Columb4;
    private javax.swing.JPanel Columb5;
    private javax.swing.JPanel Columb6;
    private javax.swing.JLabel L00;
    private javax.swing.JLabel L01;
    private javax.swing.JLabel L02;
    private javax.swing.JLabel L03;
    private javax.swing.JLabel L04;
    private javax.swing.JLabel L05;
    private javax.swing.JLabel L06;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L14;
    private javax.swing.JLabel L15;
    private javax.swing.JLabel L16;
    private javax.swing.JLabel L20;
    private javax.swing.JLabel L21;
    private javax.swing.JLabel L22;
    private javax.swing.JLabel L23;
    private javax.swing.JLabel L24;
    private javax.swing.JLabel L25;
    private javax.swing.JLabel L26;
    private javax.swing.JLabel L30;
    private javax.swing.JLabel L31;
    private javax.swing.JLabel L32;
    private javax.swing.JLabel L33;
    private javax.swing.JLabel L34;
    private javax.swing.JLabel L35;
    private javax.swing.JLabel L36;
    private javax.swing.JLabel L39;
    private javax.swing.JLabel L40;
    private javax.swing.JLabel L41;
    private javax.swing.JLabel L42;
    private javax.swing.JLabel L43;
    private javax.swing.JLabel L44;
    private javax.swing.JLabel L45;
    private javax.swing.JLabel L46;
    private javax.swing.JLabel L50;
    private javax.swing.JLabel L51;
    private javax.swing.JLabel L52;
    private javax.swing.JLabel L53;
    private javax.swing.JLabel L54;
    private javax.swing.JLabel L55;
    private javax.swing.JLabel L56;
    public javax.swing.JFrame Table;
    private javax.swing.JLabel User_name;
    public javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
