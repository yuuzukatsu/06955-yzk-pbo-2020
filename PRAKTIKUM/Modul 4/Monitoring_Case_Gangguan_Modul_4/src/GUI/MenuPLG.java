/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controller.AllObjectModel;
import Controller.PelangganController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class MenuPLG {
    private PelangganController ctrPLG = new PelangganController();
    public int index;
    JFrame MenuPLG = new JFrame("Pelanggan");
    JButton btnAdd,btnEdit,btnDel,btnBack;
    JTable tabPLG;
    JScrollPane scrPLG;
    JLabel Title,lblIdPelanggan,lblNamaPelanggan,lblKontak,lblAlamat;
    JTextField textIdPelanggan,textNamaPelanggan,textKontak,textAlamat;
    
    public MenuPLG(){
        MenuPLG.setSize(600,500);
        MenuPLG.setLayout(null);
        
        Title = new JLabel("Pelanggan");
        Title.setBounds(0,10,600,100);
        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuPLG.add(Title);
        
        tabPLG = new JTable(ctrPLG.dtm());
        scrPLG = new JScrollPane(tabPLG);
        scrPLG.setBounds(40, 100, 500, 200);
        MenuPLG.add(scrPLG);
        tabPLG.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                index = tabPLG.getSelectedRow();
                btnEdit.setEnabled(true);
                btnDel.setEnabled(true);
            }         
        });
        
        
        //tabCaseGGN.setModel(ctrGGN.dtm());
        
        btnAdd = new JButton("Tambah");
        btnAdd.setBounds(20,380,100,30);
        MenuPLG.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                final JFrame MenuAdd = new JFrame(); 
                MenuAdd.setSize(600,500);
                MenuAdd.setLayout(null);
        
                Title = new JLabel("Tambah Pelanggan");
                Title.setBounds(0,5,600,50);
                Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MenuAdd.add(Title);
                
                lblIdPelanggan = new JLabel("ID Pelanggan");
                lblIdPelanggan.setBounds(20,100,100,20);
                MenuAdd.add(lblIdPelanggan);
                
                textIdPelanggan = new JTextField();
                textIdPelanggan.setBounds(120,100,300,20);
                MenuAdd.add(textIdPelanggan);
                
                lblNamaPelanggan = new JLabel("Nama Pelanggan");
                lblNamaPelanggan.setBounds(20,150,100,20);
                MenuAdd.add(lblNamaPelanggan);
                
                textNamaPelanggan = new JTextField();
                textNamaPelanggan.setBounds(120,150,300,20);
                MenuAdd.add(textNamaPelanggan);
                
                lblKontak = new JLabel("Kontak");
                lblKontak.setBounds(20,200,100,20);
                MenuAdd.add(lblKontak);
                
                textKontak = new JTextField();
                textKontak.setBounds(120,200,300,20);
                MenuAdd.add(textKontak);
                
                lblAlamat = new JLabel("Alamat");
                lblAlamat.setBounds(20,250,100,20);
                MenuAdd.add(lblAlamat);
                
                textAlamat = new JTextField();
                textAlamat.setBounds(120,250,300,20);
                MenuAdd.add(textAlamat);
        
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
                            int idPLG = Integer.parseInt(textIdPelanggan.getText());
                            String namaPLG = textNamaPelanggan.getText();
                            int kontak = Integer.parseInt(textKontak.getText());
                            String Alamat = textAlamat.getText();
                            ctrPLG.Insert(idPLG, namaPLG, kontak, Alamat);
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
        MenuPLG.add(btnEdit);
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                final JFrame MenuEdit = new JFrame(); 
                MenuEdit.setSize(600,500);
                MenuEdit.setLayout(null);
        
                Title = new JLabel("Edit Case Gangguan");
                Title.setBounds(0,5,600,50);
                Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MenuEdit.add(Title);
                
                lblIdPelanggan = new JLabel("ID Pelanggan");
                lblIdPelanggan.setBounds(20,100,100,20);
                MenuEdit.add(lblIdPelanggan);
                
                textIdPelanggan = new JTextField();
                textIdPelanggan.setBounds(120,100,300,20);
                textIdPelanggan.setText(Integer.toString(AllObjectModel.PLG.GetArray().get(index).GetIdPelanggan()));
                MenuEdit.add(textIdPelanggan);
                
                lblNamaPelanggan = new JLabel("Nama Pelanggan");
                lblNamaPelanggan.setBounds(20,150,100,20);
                MenuEdit.add(lblNamaPelanggan);
                
                textNamaPelanggan = new JTextField();
                textNamaPelanggan.setBounds(120,150,300,20);
                textNamaPelanggan.setText(AllObjectModel.PLG.GetArray().get(index).GetNamaPelanggan());
                MenuEdit.add(textNamaPelanggan);
                
                lblKontak = new JLabel("Kontak");
                lblKontak.setBounds(20,200,100,20);
                MenuEdit.add(lblKontak);
                
                textKontak = new JTextField();
                textKontak.setBounds(120,200,300,20);
                textKontak.setText(Integer.toString(AllObjectModel.PLG.GetArray().get(index).GetKontak()));
                MenuEdit.add(textKontak);
                
                lblAlamat = new JLabel("Alamat");
                lblAlamat.setBounds(20,250,100,20);
                MenuEdit.add(lblAlamat);
                
                textAlamat = new JTextField();
                textAlamat.setBounds(120,250,300,20);
                textAlamat.setText(AllObjectModel.PLG.GetArray().get(index).GetAlamat());
                MenuEdit.add(textAlamat);
        
                JButton btnMenuBack = new JButton("Kembali");
                lblAlamat = new JLabel("Alamat");
                lblAlamat.setBounds(20,250,100,20);
                MenuEdit.add(lblAlamat);
                
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
                            int idPLG = Integer.parseInt(textIdPelanggan.getText());
                            String namaPLG = textNamaPelanggan.getText();
                            int kontak = Integer.parseInt(textKontak.getText());
                            String Alamat = textAlamat.getText();
                            ctrPLG.Edit(index, idPLG, namaPLG, kontak, Alamat);
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
        MenuPLG.add(btnDel);
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ctrPLG.Delete(index);
                JOptionPane.showMessageDialog(null, "Berhasil Hapus","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        btnBack = new JButton("Kembali");
        btnBack.setBounds(470,380,100,30);
        MenuPLG.add(btnBack);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuGUI Menu = new MenuGUI();
                MenuPLG.dispose();
            }
        });
        
        MenuPLG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuPLG.setVisible(true);
        //Menu.getContentPane().setLayout(new FlowLayout());  
        MenuPLG.setLocationRelativeTo(null);
        
    }
}
        