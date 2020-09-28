//all the imported class and packeges
import java.awt.Component;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marvel's
 */
public class MotorCycle extends javax.swing.JFrame {

    /**
     * Creates new form Java_Populate_JTable_Using_ArrayList
     */
    JLabel forTable = new JLabel();
    int rowCount ;
    int txtRow = 20;
    String FileName;
   //creating method to display error message
    public void alertMessage(String message) {
     JOptionPane.showMessageDialog(null, message);     
    }
    //creating method to clear all the text fields.
    public void clearFields(){
        jLabel8.setIcon(null);
        jtxtDisplayPath.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jtxtModel.setText("");
        jtxtPrice.setText("");
        buttonGroup2.clearSelection();
        jtxtSearch.setText("");
    }
    //creating method to check whether the given value is number or not.
    public void numberChecking(java.awt.event.KeyEvent evt,javax.swing.JTextField field){
        int c=evt.getKeyCode();
        if(!(c>47 && c<58 || c==8)){
            field.setEditable(false);
        }
        else{
            field.setEditable(true);
        }
    }
    //creating constructuors of class motorcycle
    public MotorCycle() {
        initComponents();
        addRowToJTable();
        //Implementing Table Cell Renderer in jTable1
        jTable1.getColumn("Image").setCellRenderer(new MotorCycle.LabelRenderer());
       
    }
    //creating class for the preloaded data of motorcycle and  initializing  the variables.
    public class Preload{
        public String type;
        public String brandname;
        public String model;
        public String displacement;
        public int price;
        public String getinfo;
        public JLabel label;
        //creating Preload class constructors
        Preload(String Type, String BrandName, String Model, String Displacement,int Price,String GetInfo, JLabel image){
            this.type = Type;
            this.brandname = BrandName;
            this.model = Model;
            this.displacement = Displacement;
            this.price=Price;
            this.getinfo=GetInfo;
            this.label=image;
        }
        //creating Preload class default constructors
        Preload(){
        }
    }
    
// create a list of Preload Data
    public LinkedList ListUsers()
    { //Setting ImageIcon into Lables through objects
        JLabel image1 = new JLabel();
        JLabel image2 = new JLabel();
        JLabel image3 = new JLabel();
        JLabel image4 = new JLabel();
        JLabel image5 = new JLabel();
        JLabel image6 = new JLabel();
        JLabel image7 = new JLabel();
        JLabel image8 = new JLabel();
        JLabel image9 = new JLabel();
        JLabel image10 = new JLabel();
        JLabel image11 = new JLabel();
        JLabel image12 = new JLabel();
        image1.setIcon(new ImageIcon("src/images\\image3.jpg"));
        image2.setIcon(new ImageIcon("src/images\\image4.jpg"));
        image3.setIcon(new ImageIcon("src/images\\image5.jpg"));
        image4.setIcon(new ImageIcon("src/images\\image6.jpg"));
        image5.setIcon(new ImageIcon("src/images\\image7.jpg"));
        image6.setIcon(new ImageIcon("src/images\\image8.jpg"));
        image7.setIcon(new ImageIcon("src/images\\image9.jpg"));
        image8.setIcon(new ImageIcon("src/images\\image10.jpg"));
        image9.setIcon(new ImageIcon("src/images\\image11.jpg"));
        image10.setIcon(new ImageIcon("src/images\\image12.jpg"));
        image11.setIcon(new ImageIcon("src/images\\image1.jpg"));
        image12.setIcon(new ImageIcon("src/images\\image2.jpg"));
        
        LinkedList<Preload> list = new LinkedList<Preload>();
        //creating object of Preload class
        Preload u1 = new Preload("Sports","Yamaha","FZS-10","1000CC" ,1000,"ABS+FWC" , image1);
        Preload u2 = new Preload("Street","Beneli","TnT-600","600CC" ,2000,"FWC",image2);
        Preload u3 = new Preload("Sports","Ducati","Diavel-500","500CC" ,3000,"ABS",image3);
        Preload u4 = new Preload("Street","MV Agusta","Revale-300","300CC" ,4000,"ABS",image4);
        Preload u5 = new Preload("Sports","Kawazaki","Ninja-650","600CC" ,5000,"ABS+FWC",image5);
        Preload u6 = new Preload("Street","KTM","RC-490","500CC" ,5000,"FWC",image6);
        Preload u7 = new Preload("Sports","Suzuki","GSXR-10","1000CC" ,1000,"ABS+FWC" , image7);
        Preload u8 = new Preload("Street","Yamaha","FZS-300","300CC" ,2000,"FWC",image8);
        Preload u9 = new Preload("Sports","KTM","DUKE-300","300CC" ,3000,"ABS",image9);
        Preload u10 = new Preload("Street","Ducati","CX-1000","1000CC" ,4000,"ABS",image10);
        Preload u11 = new Preload("Sports","Ducati","CBR-1000","1000CC" ,5000,"ABS+FWC",image11);
        Preload u12 = new Preload("Street","Suzuki","GXXR-600","600CC" ,5000,"FWC",image12);
        // adding Preload class object to list.
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        list.add(u7);
        list.add(u8);
        list.add(u9);
        list.add(u10);
        list.add(u11);
        list.add(u12);
        return list;
    }
    
// Added rows from LinkedList to jtable
    public void addRowToJTable(){
        LinkedList <Preload> list = ListUsers();
        Object rowData[] = new Object[7];
        jTable1.setRowHeight(200);
        for(int i = 0; i < list.size(); i++){
            rowData[2] = list.get(i).type;
            rowData[0] = list.get(i).brandname;
            rowData[1] = list.get(i).model;
            rowData[3] = list.get(i).displacement;
            rowData[5] = list.get(i).price;
            rowData[4] = list.get(i).getinfo; 
            rowData[6] = list.get(i).label; 
            for (int l = 0 ; l <7;l++){
            jTable1.setValueAt(rowData[l], i ,l );
            }   
            txtRow= txtRow - 1;
        }
    }
    
     class LabelRenderer implements TableCellRenderer{
        public Component getTableCellRendererComponent(JTable jTable1 ,Object value, boolean isSelected,
        boolean hasFocus  , int row, int column){
            TableColumn tc = jTable1.getColumn("Image");
            tc.setMinWidth(270);
            tc.setMaxWidth(270);
            return(Component)value;
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

        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jtxtSearch = new javax.swing.JTextField();
        jSearchValue = new javax.swing.JComboBox<>();
        panel1 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxtDisplayPath = new javax.swing.JTextField();
        panel2 = new java.awt.Panel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jbtnImage = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel5 = new java.awt.Panel();
        jbtnUpload = new javax.swing.JButton();
        panel6 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panel7 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panel8 = new java.awt.Panel();
        jlblLogo = new javax.swing.JLabel();
        panel9 = new java.awt.Panel();
        jComboBrand = new javax.swing.JComboBox<>();
        jtxtModel = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        panel10 = new java.awt.Panel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboDisplacement = new javax.swing.JComboBox<>();
        jtxtPrice = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jTextField8.setText("jTextField8");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yatri ");
        setBackground(new java.awt.Color(0, 0, 0));

        jtxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSearchActionPerformed(evt);
            }
        });

        jSearchValue.setBackground(new java.awt.Color(0, 0, 0));
        jSearchValue.setForeground(new java.awt.Color(255, 255, 255));
        jSearchValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Price", "Brand" }));
        jSearchValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchValueActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setMaximumSize(new java.awt.Dimension(270, 212));
        jLabel8.setMinimumSize(new java.awt.Dimension(270, 212));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 261, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Brand", "Model", "Type ", "Displacement", "Features", "Price", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jtxtDisplayPath.setEditable(false);

        jLabel5.setText("FILE :");

        jLabel2.setText("BRAND :");

        jLabel3.setText("MODEL :");

        jLabel1.setText("Type :");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("FEATURES :");

        jLabel4.setText("DISPLACEMENT :");

        jLabel7.setText("PRICE :");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(24, 24, 24))
                .addComponent(jLabel4))
            .addComponent(jLabel7)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jbtnImage.setBackground(new java.awt.Color(0, 0, 0));
        jbtnImage.setForeground(new java.awt.Color(255, 255, 255));
        jbtnImage.setText("Upload Image");
        jbtnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImageActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jbtnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtnImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jbtnUpload.setBackground(new java.awt.Color(0, 0, 0));
        jbtnUpload.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUpload.setText("Add");
        jbtnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setText("SEARCH PARAMETER :");

        jLabel9.setText("FIND :");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jComboBrand.setBackground(new java.awt.Color(0, 0, 0));
        jComboBrand.setForeground(new java.awt.Color(255, 255, 255));
        jComboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yamaha", "Beneli", "Ducati", "MV Agusta","Kawazaki","KTM","Suzuki" }));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("sport");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("street");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2))
                    .addComponent(jtxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jtxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap())
        );

        jCheckBox2.setText("CBS");

        jCheckBox1.setText("ABS");

        jComboDisplacement.setBackground(new java.awt.Color(0, 0, 0));
        jComboDisplacement.setForeground(new java.awt.Color(255, 255, 255));
        jComboDisplacement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1000CC", "600CC", "500CC", "300CC"}));
        jComboDisplacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDisplacementActionPerformed(evt);
            }
        });

        jtxtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtPriceKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel10Layout.createSequentialGroup()
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboDisplacement, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addComponent(jComboDisplacement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jtxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu2.setText("File");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSearchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtxtDisplayPath, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(panel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSearchValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtDisplayPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addComponent(panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//method to get value from CSV file and added it to jtable
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv"); //Setting the Extension Filter for the document
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
            try {
                File f = chooser.getSelectedFile();
                Scanner input = new Scanner(f);
                boolean continue1 = true;
                int count01=5;
                int count02 =0;
                int count03=0;
                LinkedList<Object> Document = new LinkedList<Object>();                     //Creating a linkedlist object 
                while(input.hasNext()) {
                        JLabel formXms = new JLabel();                                      //Creating JLable object to Store the ImageIcon
                        String lineList = input.nextLine();
                        String[] ListElement = lineList.split(",");
                        formXms.setIcon( new ImageIcon(ListElement[6]));
                        Document.add(ListElement[0]);                                       //Inseting the data from document to linkedList
                        Document.add(ListElement[1]);                                       //Inseting the data from document to linkedList       
                        Document.add(ListElement[2]);                                       //Inseting the data from document to linkedList
                        Document.add(ListElement[3]);                                       //Inseting the data from document to linkedList
                        Document.add(ListElement[4]);                                       //Inseting the data from document to linkedList
                        Document.add(ListElement[5]);                                       //Inseting the data from document to linkedList
                        Document.add(formXms);                                              //Inseting the JLable object to linkedList
                }
                if(txtRow >= 5) {
                    int nextRow = 0;
                    String Data2;
                    while(true) {
                        Data2 = (String)jTable1.getValueAt(nextRow,1);
                            if (Data2 != null && Data2.length() != 0){
                                nextRow++;   
                            }
                        else{
                            while (continue1 == true){
                                    while(count03<42){
                                        jTable1.setValueAt(Document.get(count03),nextRow, count02); //Inserting the values of Document to the Jtable
                                        count03++;
                                        count02++;
                                        if (count02>6){ 
                                            count02=0;                                        
                                        nextRow++;                                        
                                        txtRow = txtRow - 1;
                                        }
                                    }   
                                    count01++;
                                if (count01>5){
                                continue1=false;
                                }
                            alertMessage("Load Successful");}
                            break;
                        }
                    }
                } else {
                   alertMessage("Not enough space in table.");
                }
            } catch (NullPointerException ex) {
               alertMessage("Document not Selected");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MotorCycle.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       
    }//GEN-LAST:event_jMenu2ActionPerformed
//sorting using Selection Sort algorithm
    public LinkedList sort(){
        LinkedList<LinkedList<String>> twoDimensionArray = new LinkedList<>();
        LinkedList<String> oneDimentionArray = new LinkedList<>();
        for(int i=0; i<jTable1.getRowCount(); i++) {                            //Stroing the values of JTable in a one dimentional linkedlist
            for(int j=0; j<jTable1.getColumnCount(); j++) {
                if(jTable1.getValueAt(i,j)!=null){
                    oneDimentionArray.add(jTable1.getValueAt(i, j).toString());
                }
            }
            if(oneDimentionArray.size()>0){
                twoDimensionArray.add(oneDimentionArray);                       //Stroing the values of one dimentional likedlist to a twoDimentional linkedlist
            }
            oneDimentionArray = new LinkedList<>();                             //Creating new objects of one dimentional linkedlist to store new data
        }

        for(int i=0; i<twoDimensionArray.size()-1; i++) {
            int temp = i;
            for(int j=i+1; j<twoDimensionArray.size(); j++) {
                int firstValue=Integer.parseInt(twoDimensionArray.get(j).get(5));
                int secondValue=Integer.parseInt(twoDimensionArray.get(temp).get(5));
                if(firstValue < secondValue) {
                    temp = j;                                                   //Finding the row with the smallest value of Price
                }
            }
            LinkedList<String> smallerNumber = twoDimensionArray.get(temp);     //Stroing the Smallest value row in a linkedList
            twoDimensionArray.set(temp, twoDimensionArray.get(i));              //Exchanging the values of rows
            twoDimensionArray.set(i, smallerNumber);                            //Exchanging the values of rows
        }
        return twoDimensionArray;
}
    //searching using binary search algorithm for price and and Linear Search for brand    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String search=jtxtSearch.getText();
        String combo=jSearchValue.getSelectedItem().toString().toLowerCase();
        boolean result=true;
        Search searchFrame = new Search();
        LinkedList<LinkedList<String>> twoDimensionArray = sort();              //Calling Selection Sort and Storing in a LinkedList
        if("".equals(search)) {
            alertMessage("Please enter search term.");
        } else {
            if("price".equals(combo)) {                                         //Implementing Binary Search Algorithm
                try {
                    int key=Integer.parseInt(search);
                    int getFirst=0;
                    int getLast=twoDimensionArray.size()-1;
                    int mid=(getFirst+getLast)/2;
                    while(getLast>=getFirst) {
                        if(Integer.parseInt(twoDimensionArray.get(mid).get(5))<key) {
                            getFirst = mid + 1;
                        } else if(Integer.parseInt(twoDimensionArray.get(mid).get(5))==key) {
                            DefaultTableModel model = (DefaultTableModel) searchFrame.jResultTable.getModel();
                            model.addRow(new Object[] {twoDimensionArray.get(mid).get(0), twoDimensionArray.get(mid).get(1), 
                                twoDimensionArray.get(mid).get(2), twoDimensionArray.get(mid).get(3), twoDimensionArray.get(mid).get(4), 
                                twoDimensionArray.get(mid).get(5)});
                            searchFrame.setVisible(true);
                            searchFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            result = false;
                            break;
                        } else {
                            getLast = mid - 1;
                        }
                        mid = (getLast+getFirst)/2;
                    }
                    if(result != false) {
                        alertMessage("No Result Found.");
                    }
                } catch(Exception e) {
                    alertMessage("Please enter number to search price.");
                }
            } else if("brand".equals(combo)){                                   //Implementing Linear Search Algorithm
                for(int i=0; i<twoDimensionArray.size(); i++) {
                    if(twoDimensionArray.get(i).get(0).toLowerCase().equals(search.toLowerCase())) {
                        DefaultTableModel model = (DefaultTableModel) searchFrame.jResultTable.getModel();
                        model.addRow(new Object[] {twoDimensionArray.get(i).get(0), twoDimensionArray.get(i).get(1),
                            twoDimensionArray.get(i).get(2), twoDimensionArray.get(i).get(3), twoDimensionArray.get(i).get(4),
                            twoDimensionArray.get(i).get(5)});
                        searchFrame.setVisible(true);
                        searchFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        result = false;
                    }
                }
                if(result ) {
                    alertMessage("No Search Result.");
                }
            }
    
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSearchActionPerformed

    }//GEN-LAST:event_jtxtSearchActionPerformed

    private void jSearchValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchValueActionPerformed

//Adding value to jtable
    private void jbtnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUploadActionPerformed
      String ModelCheck="";
      boolean exist=false;
      for(int b=0;b<jTable1.getRowCount();b++){
      ModelCheck=(String)jTable1.getValueAt(b,1);
      if(ModelCheck !=null){
            if (jtxtModel.getText().equals(ModelCheck)){
            exist=true;
            break;
            }  
      }
      }
      if(!exist){  
        
      String type="";
      if(jRadioButton1.isSelected())
       {
           type=jRadioButton1.getText();
       }
      if(jRadioButton2.isSelected())
       {
           type=jRadioButton2.getText();
       }
        String Features = "";
        String ImageLocation=jtxtDisplayPath.getText();
        String Brand=jComboBrand.getSelectedItem().toString();
        String Model=jtxtModel.getText();
        String Price=(jtxtPrice.getText());
        String Displacement=jComboDisplacement.getSelectedItem().toString();
        
        Features = Features(jCheckBox1.getText(), jCheckBox2.getText()); 

        if(Brand.isEmpty()|| Model.isEmpty()||type.isEmpty()|| Displacement.isEmpty()||Price.isEmpty() || Features.isEmpty() || ImageLocation.isEmpty()){
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Please fill all the text field completely.", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Object Data[]={Brand,Model,type,Displacement,Features,Price,forTable};
            int ColCount =jTable1.getColumnCount();

            int nextRow = 0;

            boolean empty =false;
            String Data1;
            int rowTime=0;

            if(txtRow>0){
                while(empty == false){

                    Data1 = (String)jTable1.getValueAt(nextRow,1);

                    if (Data1 != null && Data1.length() != 0){
                        nextRow++;
                    }
                    else{
                        for(int i =0 ; i<ColCount; i++){
                            jTable1.setValueAt(Data[i], nextRow, i);

                        }
                        break;
                    }
                }
            } else {
                alertMessage("No rows available");
            }
            txtRow = txtRow - 1;
            alertMessage("Row Added");
        }
      } else{
      alertMessage("Item Exist");}
    }//GEN-LAST:event_jbtnUploadActionPerformed
//calling method number checking
    private void jtxtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPriceKeyPressed
     numberChecking(evt,jtxtPrice);
    }//GEN-LAST:event_jtxtPriceKeyPressed
public String Features(String Feature1, String Feature2){                       //Getting the Checkbox values
    String Features = "";
    if(jCheckBox1.isSelected() && jCheckBox2.isSelected()){                     
            Features = (Feature1+"+"+Feature2);
        }
        else if(jCheckBox2.isSelected()){
            Features=Feature1;
        }
        else if (jCheckBox1.isSelected()){
            Features= Feature2;
        }
    return (Features);

}
    private void jComboDisplacementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDisplacementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDisplacementActionPerformed
//method to validate whether the image file is empty or not
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    try {
        Desktop.getDesktop().open(new File("src/document\\Help.pdf"));
        }catch(Exception e){
            alertMessage("Documentation not found.");
                           }       
    }//GEN-LAST:event_jMenuItem3ActionPerformed
//method to exit the GUI program
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
//method to delete a row
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            int rowIndex = jTable1.getSelectedRow();
            model.removeRow(rowIndex);                                          //Removing the Selected Row
            alertMessage("Row deleted.");
            txtRow=txtRow+1;                                                    //Increasing the Available rows.
        } catch(Exception e) {
            alertMessage("Select a row to delete.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
//calling method to clear the text fields
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImageActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Files", "jpg"); //Creating A Extension Filer
        JFileChooser chooser = new JFileChooser();                                        //Creating a File Chooser Object
        chooser.setFileFilter(filter);                                                    //Setting the FileFilter to the Chooser
        try{
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();                                           //Importing File From local Storage
            jLabel8.setIcon(new ImageIcon(f.toString()));
            forTable.setIcon(new ImageIcon(f.toString()));
            FileName = f.getAbsolutePath();
            jtxtDisplayPath.setText(FileName);}
        catch(Exception e){
            alertMessage("Image not Selected");
        }
    }//GEN-LAST:event_jbtnImageActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed
/**/
    /**
     * @param args the command line arguments
     */
    //main method
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorCycle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBrand;
    private javax.swing.JComboBox<String> jComboDisplacement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jSearchValue;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton jbtnImage;
    private javax.swing.JButton jbtnUpload;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JTextField jtxtDisplayPath;
    private javax.swing.JTextField jtxtModel;
    private javax.swing.JTextField jtxtPrice;
    private javax.swing.JTextField jtxtSearch;
    private java.awt.Panel panel1;
    private java.awt.Panel panel10;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private java.awt.Panel panel9;
    // End of variables declaration//GEN-END:variables
}
