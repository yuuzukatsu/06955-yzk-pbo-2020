/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controller.AllObjectModel;
import Controller.HelpdeskController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author dimdi
 */
public class MenuHD {
    private HelpdeskController ctrHD = new HelpdeskController();
    public int index;
    JFrame MenuHD = new JFrame("Helpdesk");
    JButton btnAdd,btnEdit,btnDel,btnBack;
    JTable tabHD;
    JScrollPane scrHD;
    JLabel Title,lblIDHelpdesk,lblNama,lblKontak;
    JTextField textIDHelpdesk,textNama,textKontak;
    
    public MenuHD(){
        MenuHD.setSize(600,500);
        MenuHD.setLayout(null);
        
        Title = new JLabel("Helpdesk");
        Title.setBounds(0,10,600,100);
        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuHD.add(Title);
        
        tabHD = new JTable(ctrHD.dtm());
        scrHD = new JScrollPane(tabHD);
        scrHD.setBounds(40, 100, 500, 200);
        MenuHD.add(scrHD);
        tabHD.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                index = tabHD.getSelectedRow();
                btnEdit.setEnabled(true);
                btnDel.setEnabled(true);
            }         
        });
        
        
        //tabCaseGGN.setModel(ctrGGN.dtm());
        
        btnAdd = new JButton("Tambah");
        btnAdd.setBounds(20,380,100,30);
        MenuHD.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                final JFrame MenuAdd = new JFrame(); 
                MenuAdd.setSize(600,500);
                MenuAdd.setLayout(null);
        
                Title = new JLabel("Tambah Helpdesk");
                Title.setBounds(0,5,600,50);
                Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MenuAdd.add(Title);
                
                lblIDHelpdesk = new JLabel("ID Helpdesk");
                lblIDHelpdesk.setBounds(20,100,100,20);
                MenuAdd.add(lblIDHelpdesk);
                
                textIDHelpdesk = new JTextField();
                textIDHelpdesk.setBounds(120,100,300,20);
                MenuAdd.add(textIDHelpdesk);
                
                lblNama = new JLabel("Nama");
                lblNama.setBounds(20,150,100,20);
                MenuAdd.add(lblNama);
                
                textNama = new JTextField();
                textNama.setBounds(120,150,300,20);
                MenuAdd.add(textNama);
                
                lblKontak = new JLabel("Kontak");
                lblKontak.setBounds(20,200,100,20);
                MenuAdd.add(lblKontak);
                
                textKontak = new JTextField();
                textKontak.setBounds(120,200,300,20);
                MenuAdd.add(textKontak);
        
                JButton btnMenuBack = new JButton("Kembali");
                btnMenuBack.setBounds(120,350,100,20);
                MenuAdd.add(btnMenuBack);
                btnMenuBack.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        MenuAdd.dispose();
                    }
                });
        
                JButton btnMenuAdd = new JButton("Tambah");
                btnMenuAdd.setBounds(320,350,100,20);
                MenuAdd.add(btnMenuAdd);
                btnMenuAdd.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try{
                            int idHD = Integer.parseInt(textIDHelpdesk.getText());
                            String nama = textNama.getText();
                            int kontak = Integer.parseInt(textKontak.getText());
                            ctrHD.Insert(idHD, nama, kontak);
                            JOptionPane.showMessageDialog(null, "Berhasil Ditambahkan","Information",JOptionPane.INFORMATION_MESSAGE);
                            MenuAdd.dispose();
                        }catch(Exception exception){
                            JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                });
                
        
                MenuAdd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                MenuAdd.setVisible(true);
                //Menu.getContentPane().setLayout(new FlowLayout());  
                MenuAdd.setLocationRelativeTo(null);
            }
        });
        
        btnEdit = new JButton("Edit");
        btnEdit.setBounds(170,380,100,30);
        btnEdit.setEnabled(false);
        MenuHD.add(btnEdit);
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                final JFrame MenuEdit = new JFrame(); 
                MenuEdit.setSize(600,500);
                MenuEdit.setLayout(null);
        
                Title = new JLabel("Edit Helpdesk");
                Title.setBounds(0,5,600,50);
                Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MenuEdit.add(Title);
                
                lblIDHelpdesk = new JLabel("ID Helpdesk");
                lblIDHelpdesk.setBounds(20,100,100,20);
                MenuEdit.add(lblIDHelpdesk);
                
                textIDHelpdesk = new JTextField();
                textIDHelpdesk.setBounds(120,100,300,20);
                textIDHelpdesk.setText(Integer.toString(AllObjectModel.HD.GetArray().get(index).GetIdHelpdesk()));
                MenuEdit.add(textIDHelpdesk);
                
                lblNama = new JLabel("Nama");
                lblNama.setBounds(20,150,100,20);
                MenuEdit.add(lblNama);
                
                textNama = new JTextField();
                textNama.setBounds(120,150,300,20);
                textNama.setText(AllObjectModel.HD.GetArray().get(index).GetNamaHelpdesk());
                MenuEdit.add(textNama);
                
                lblKontak = new JLabel("Kontak");
                lblKontak.setBounds(20,200,100,20);
                MenuEdit.add(lblKontak);
                
                textKontak = new JTextField();
                textKontak.setBounds(120,200,300,20);
                textKontak.setText(Integer.toString(AllObjectModel.HD.GetArray().get(index).GetKontak()));
                MenuEdit.add(textKontak);
        
                JButton btnMenuBack = new JButton("Kembali");
                btnMenuBack.setBounds(120,350,100,20);
                MenuEdit.add(btnMenuBack);
                btnMenuBack.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        MenuEdit.dispose();
                    }
                });
        
                JButton btnMenuEdit = new JButton("Edit");
                btnMenuEdit.setBounds(320,350,100,20);
                MenuEdit.add(btnMenuEdit);
                btnMenuEdit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try{
                            int idHD = Integer.parseInt(textIDHelpdesk.getText());
                            String nama = textNama.getText();
                            int kontak = Integer.parseInt(textKontak.getText());
                            ctrHD.Edit(index, idHD, nama, kontak);
                            JOptionPane.showMessageDialog(null, "Berhasil Ditambahkan","Information",JOptionPane.INFORMATION_MESSAGE);
                            MenuEdit.dispose();
                        }catch(Exception exception){
                            JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                });
                
        
                MenuEdit.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                MenuEdit.setVisible(true);
                //Menu.getContentPane().setLayout(new FlowLayout());  
                MenuEdit.setLocationRelativeTo(null);
            }
        });
        
        btnDel = new JButton("Hapus");
        btnDel.setBounds(320,380,100,30);
        btnDel.setEnabled(false);
        MenuHD.add(btnDel);
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ctrHD.Delete(index);
                JOptionPane.showMessageDialog(null, "Berhasil Hapus","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        btnBack = new JButton("Kembali");
        btnBack.setBounds(470,380,100,30);
        MenuHD.add(btnBack);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuGUI Menu = new MenuGUI();
                MenuHD.dispose();
            }
        });
        
        MenuHD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuHD.setVisible(true);
        //Menu.getContentPane().setLayout(new FlowLayout());  
        MenuHD.setLocationRelativeTo(null);
        
    }
}
        