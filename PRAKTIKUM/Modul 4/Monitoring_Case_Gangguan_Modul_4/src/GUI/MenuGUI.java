/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dimdi
 */
public class MenuGUI {
    JFrame Menu = new JFrame("Monitoring Case Gangguan");
    JButton btnCaseGGN,btnPLG,btnHD;
    JLabel Title;
    
    public MenuGUI(){
        Menu.setSize(600,500);
        Menu.setLayout(null);
        
        Title = new JLabel("Monitoring Case Gangguan");
        Title.setBounds(0,10,600,100);
        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.add(Title);
        
        btnCaseGGN = new JButton("Case Gangguan");
        btnCaseGGN.setBounds(20,200,150,30);
        Menu.add(btnCaseGGN);
        btnCaseGGN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuCaseGGN ggn = new MenuCaseGGN();
                Menu.dispose();
            }
        });
        
        btnPLG = new JButton("Pelanggan");
        btnPLG.setBounds(250,200,100,30);
        Menu.add(btnPLG);
        btnPLG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuPLG plg = new MenuPLG();
                Menu.dispose();
            }
        });
        
        btnHD = new JButton("Helpdesk");
        btnHD.setBounds(440,200,100,30);
        Menu.add(btnHD);
        btnHD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuHD hd = new MenuHD();
                Menu.dispose();
            }
        });
        
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setVisible(true);
        Menu.setLocationRelativeTo(null);
        
    }
}
        