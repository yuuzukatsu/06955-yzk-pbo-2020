/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class GUI {

    JFrame LogReg = new JFrame();
    JLabel login,daftar,top;
    JRadioButton radioaslab,radiopraktikan;
    JTextField textnpmlogin,textnama,textnotelp,textttl,textnpmdaftar,textkelas;
    JLabel labelnpmlogin,labelnama,labelpasswordlogin,labelnotelp,labelttl,labelnpmdaftar,labelpassworddaftar,labelkelas;
    JButton check,reg;
    JPasswordField passwordlogin,passworddaftar;
    private boolean ceklogin = false;
    
    public GUI() {
        LogReg.setSize(700,630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.PINK);
        top = new JLabel("Lab Rekayasa Perangkat Lunak");
        top.setBounds(50,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        LogReg.add(top);
        
        login = new JLabel("login");
        login.setBounds(100,50,100,100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        LogReg.add(login);
        
        radioaslab = new JRadioButton("asisten Lab");
        radioaslab.setBounds(30,150,100,30);
        radioaslab.setBackground(Color.CYAN);
        LogReg.add(radioaslab);

        radiopraktikan = new JRadioButton("Praktikan");
        radiopraktikan.setBounds(140,150,100,30);
        radiopraktikan.setBackground(Color.CYAN);
        LogReg.add(radiopraktikan);
        
        labelnpmlogin = new JLabel("NPM");
        labelnpmlogin.setBounds(30,180,30,30);
        LogReg.add(labelnpmlogin);
        
        textnpmlogin = new JTextField();
        textnpmlogin.setBounds(30,210,200,30);
        LogReg.add(textnpmlogin);
        
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30,240,100,30);
        LogReg.add(labelpasswordlogin);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30,270,200,30);
        LogReg.add(passwordlogin);
        
        check = new JButton("check");
        check.setBounds(90,320,100,40);
        check.setBackground(Color.GREEN);
        LogReg.add(check);
        
        daftar = new JLabel("Buat Akun");
        daftar.setBounds(440,50,150,100);
        LogReg.add(daftar);
        
        labelnpmdaftar = new JLabel("NPM");
        labelnpmdaftar.setBounds(400,150,30,30);
        LogReg.add(labelnpmdaftar);
        
        textnpmdaftar = new JTextField();
        textnpmdaftar.setBounds(400,180,200,30);
        LogReg.add(textnpmdaftar);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(400,210,100,30);
        LogReg.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(400,240,200,30);
        LogReg.add(textnama);
        
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400,270,200,30);
        LogReg.add(labelpassworddaftar);
        
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400,300,200,30);
        LogReg.add(passworddaftar);
        
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(400,330,100,30);
        LogReg.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(400,360,200,30);
        LogReg.add(textnotelp);
        
        labelttl = new JLabel("Tanggal Lahir");
        labelttl.setBounds(400,390,200,30);
        LogReg.add(labelttl);
        
        textttl = new JTextField();
        textttl.setBounds(400,420,200,30);
        LogReg.add(textttl);
        
        labelkelas = new JLabel("Kelas");
        labelkelas.setBounds(400,450,200,30);
        LogReg.add(labelkelas);
        
        textkelas = new JTextField();
        textkelas.setBounds(400,480,200,30);
        LogReg.add(textkelas);
        
        reg = new JButton("Daftar");
        reg.setBounds(460,520,100,40);
        reg.setBackground(Color.GREEN);
        LogReg.add(reg);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        radioaslab.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(radioaslab.isSelected()){
                    radiopraktikan.setSelected(false);
                    ceklogin=true;
                }
            }
        });
        
        radiopraktikan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(radiopraktikan.isSelected()){
                    radioaslab.setSelected(false);
                    ceklogin=false;
                }
            }
        });
        
        check.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ceklogin==true){
                    try{
                        allobjctrl06955.admin.dataAslab();
                        allobjctrl06955.admin.login(textnpmlogin.getText(), passwordlogin.getText());
                        String nama = allobjctrl06955.admin.AslabEntity().getNama();
                        AslabGUI asisten = new AslabGUI();
                        LogReg.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "NPM atau Password Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }else{
                    try{
                        allobjctrl06955.praktikan.login(textnpmlogin.getText(), passwordlogin.getText());
                        PraktikanGUI prak = new PraktikanGUI();
                        LogReg.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "NPM atau Password Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }   
            }
        });
        reg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String npm = textnpmdaftar.getText();
                    String pass = passworddaftar.getText();
                    String nama = textnama.getText();
                    String notelp = textnotelp.getText();
                    Date ttl = new Date(textttl.getText());
                    String kelas = textkelas.getText();
                    
                    allobjctrl06955.praktikan.insert(npm, pass, nama, notelp, ttl, kelas);
                    JOptionPane.showMessageDialog(null, "Registrasi Sukses","information",JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "Format input salah","Registrasi Gagal",JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        });
    }
    
    void kosong(){
        textnpmdaftar.setText(null);
        passworddaftar.setText(null);
        textnama.setText(null);
        textnotelp.setText(null);
        textttl.setText(null);
        textnpmlogin.setText(null);
        passwordlogin.setText(null);
        textkelas.setText(null);
    }
}

/*    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
/*    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
/*        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
//}

