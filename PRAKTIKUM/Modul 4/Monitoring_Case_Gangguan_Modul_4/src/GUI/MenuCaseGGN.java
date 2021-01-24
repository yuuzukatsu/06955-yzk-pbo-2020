package GUI;
import Controller.AllObjectModel;
import Controller.CaseGangguanController;
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

public class MenuCaseGGN {
    private CaseGangguanController ctrGGN = new CaseGangguanController();
    public int index;
    JFrame MenuGGN = new JFrame("Case Gangguan");
    JButton btnAdd,btnEdit,btnDel,btnBack;
    JTable tabCaseGGN;
    JScrollPane scrCaseGGN;
    JLabel Title,lblNoCase,lblTanggal,lblIDHelpdesk,lblIDPelanggan,lblKomplain;
    JTextField textNoCase,textTanggal,textHD,textPLG,textKomplain;
    
    public MenuCaseGGN(){
        MenuGGN.setSize(600,500);
        MenuGGN.setLayout(null);
        
        Title = new JLabel("Case Gangguan");
        Title.setBounds(0,10,600,100);
        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuGGN.add(Title);
        
        tabCaseGGN = new JTable(ctrGGN.dtm());
        scrCaseGGN = new JScrollPane(tabCaseGGN);
        scrCaseGGN.setBounds(40, 100, 500, 200);
        MenuGGN.add(scrCaseGGN);
        tabCaseGGN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                index = tabCaseGGN.getSelectedRow();
                btnEdit.setEnabled(true);
                btnDel.setEnabled(true);
            }         
        });
        
        
        //tabCaseGGN.setModel(ctrGGN.dtm());
        
        btnAdd = new JButton("Tambah");
        btnAdd.setBounds(20,380,100,30);
        MenuGGN.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                final JFrame MenuAdd = new JFrame(); 
                MenuAdd.setSize(600,500);
                MenuAdd.setLayout(null);
        
                Title = new JLabel("Tambah Case Gangguan");
                Title.setBounds(0,5,600,50);
                Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MenuAdd.add(Title);
                
                lblNoCase = new JLabel("Nomor Case");
                lblNoCase.setBounds(20,100,100,20);
                MenuAdd.add(lblNoCase);
                
                textNoCase = new JTextField();
                textNoCase.setBounds(120,100,300,20);
                MenuAdd.add(textNoCase);
                
                lblTanggal = new JLabel("Tanggal");
                lblTanggal.setBounds(20,150,100,20);
                MenuAdd.add(lblTanggal);
                
                textTanggal = new JTextField();
                textTanggal.setBounds(120,150,300,20);
                MenuAdd.add(textTanggal);
                
                lblIDHelpdesk = new JLabel("ID Helpdesk");
                lblIDHelpdesk.setBounds(20,200,100,20);
                MenuAdd.add(lblIDHelpdesk);
                
                textHD = new JTextField();
                textHD.setBounds(120,200,300,20);
                MenuAdd.add(textHD);
                
                lblIDPelanggan = new JLabel("ID Pelanggan");
                lblIDPelanggan.setBounds(20,250,100,20);
                MenuAdd.add(lblIDPelanggan);
                
                textPLG = new JTextField();
                textPLG.setBounds(120,250,300,20);
                MenuAdd.add(textPLG);
                
                lblKomplain = new JLabel("Komplain");
                lblKomplain.setBounds(20,300,100,20);
                MenuAdd.add(lblKomplain);
                
                textKomplain = new JTextField();
                textKomplain.setBounds(120,300,300,20);
                MenuAdd.add(textKomplain);
        
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
                            int NoCase = Integer.parseInt(textNoCase.getText());
                            String Komplain = textKomplain.getText();
                            Date Tanggal = new Date(textTanggal.getText());
                            int idHD = Integer.parseInt(textHD.getText());
                            int idPLG = Integer.parseInt(textPLG.getText());
                            ctrGGN.Insert(NoCase, Tanggal, idHD, idPLG, Komplain);
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
        MenuGGN.add(btnEdit);
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                final JFrame MenuEdit = new JFrame("Edit Case Gangguan"); 
                MenuEdit.setSize(600,500);
                MenuEdit.setLayout(null);
        
                Title = new JLabel("Edit Case Gangguan");
                Title.setBounds(0,5,600,50);
                Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MenuEdit.add(Title);
                
                lblNoCase = new JLabel("Nomor Case");
                lblNoCase.setBounds(20,100,100,20);
                MenuEdit.add(lblNoCase);
                
                textNoCase = new JTextField();
                textNoCase.setBounds(120,100,300,20);
                textNoCase.setText(Integer.toString(AllObjectModel.ctrGGN.GetArray().get(index).GetNoCase()));
                MenuEdit.add(textNoCase);
                
                lblTanggal = new JLabel("Tanggal");
                lblTanggal.setBounds(20,150,100,20);
                MenuEdit.add(lblTanggal);
                
                textTanggal = new JTextField();
                textTanggal.setBounds(120,150,300,20);
                
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
                textTanggal.setText(dateFormat.format(AllObjectModel.ctrGGN.GetArray().get(index).GetTanggal()));
                MenuEdit.add(textTanggal);
                
                lblIDHelpdesk = new JLabel("ID Helpdesk");
                lblIDHelpdesk.setBounds(20,200,100,20);
                MenuEdit.add(lblIDHelpdesk);
                
                textHD = new JTextField();
                textHD.setBounds(120,200,300,20);
                textHD.setText(Integer.toString(AllObjectModel.ctrGGN.GetArray().get(index).GetIdHelpdesk()));
                MenuEdit.add(textHD);
                
                lblIDPelanggan = new JLabel("ID Pelanggan");
                lblIDPelanggan.setBounds(20,250,100,20);
                MenuEdit.add(lblIDPelanggan);
                
                textPLG = new JTextField();
                textPLG.setBounds(120,250,300,20);
                textPLG.setText(Integer.toString(AllObjectModel.ctrGGN.GetArray().get(index).GetIdPelanggan()));
                MenuEdit.add(textPLG);
                
                lblKomplain = new JLabel("Komplain");
                lblKomplain.setBounds(20,300,100,20);
                MenuEdit.add(lblKomplain);
                
                textKomplain = new JTextField();
                textKomplain.setBounds(120,300,300,20);
                textKomplain.setText(AllObjectModel.ctrGGN.GetArray().get(index).GetKomplain());
                MenuEdit.add(textKomplain);
        
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
                            int NoCase = Integer.parseInt(textNoCase.getText());
                            String Komplain = textKomplain.getText();
                            Date Tanggal = new Date(textTanggal.getText());
                            int idHD = Integer.parseInt(textHD.getText());
                            int idPLG = Integer.parseInt(textPLG.getText());
                            ctrGGN.Edit(index, NoCase, Tanggal, idPLG, idHD, Komplain);
                            JOptionPane.showMessageDialog(null, "Berhasil Edit","Information",JOptionPane.INFORMATION_MESSAGE);
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
        MenuGGN.add(btnDel);
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ctrGGN.Delete(index);
                JOptionPane.showMessageDialog(null, "Berhasil Hapus","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        btnBack = new JButton("Kembali");
        btnBack.setBounds(470,380,100,30);
        MenuGGN.add(btnBack);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuGUI Menu = new MenuGUI();
                MenuGGN.dispose();
            }
        });
        
        MenuGGN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuGGN.setVisible(true);
        //Menu.getContentPane().setLayout(new FlowLayout());  
        MenuGGN.setLocationRelativeTo(null);
        
    }
}
        