/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ro.ugal.cti.magazindispozitivemobile;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ai402
 */
public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
    public String[] coloane={"Pret","Brand","Puls","Tensiune","Somn","Spo2","Calorii","Pedometru","Rezistenta Apa"};
    public DefaultTableModel tbModelBF=new DefaultTableModel(coloane,0);
    public String[] coloane2={"Pret","Brand","Culoare","Material","Universal"};
    public DefaultTableModel tbModelABF=new DefaultTableModel(coloane2,0);
    
    private Smartwatch[] smartwatches;
    private AccesoriiSmartwatch[] accesoriisw;
    private javax.swing.table.DefaultTableModel smartwatchModel;
    private javax.swing.table.DefaultTableModel accesoriiModel;


    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        
        loadAllSmartwatch();
        loadAllAccesoriiSmartwatch(); 
        
    }
     public void loadAllBrataraFitness(double pretMax,boolean somn){
        tbModelBF.setRowCount(0);
        BrataraFitness b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
        b1=new BrataraFitness();
        b2=new BrataraFitness("Xiaomi",88.99,true,false,true,true,false,false,true);
        b3=new BrataraFitness(b2);
        b4=new BrataraFitness("HUAWEI",139.59,true,false,false,true,false,true,true);
        b5=new BrataraFitness("HUAWEI",99.99,true,false,false,false,false,false,true);
        b6=new BrataraFitness("Fitbit",169.99,true,true,true,true,false,true,true);
        b7=new BrataraFitness("Xiaomi",134.99,true,false,true,false,true,false,true);
        b8=new BrataraFitness("Samsung",199.99,true,true,true,true,false,false,true);
        b9=new BrataraFitness("Samsung",119.99,true,false,true,true,true,false,true);
        b10=new BrataraFitness(b7);
        BrataraFitness[] b={b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
        for(int i=0;i<b.length;i++)
            System.out.println(i+"."+b[i]);
        System.out.println();
        for( BrataraFitness bf:b){
            if(bf.getPret()<=pretMax && bf.getMonitorizareSomn()==somn)
            tbModelBF.addRow(new Object[]{bf.getPret(),bf.getBrand(),bf.getMonitorizarePuls(),bf.getMonitorizareTensiune(),bf.getMonitorizareSomn(),bf.getMonitorizareSpo2(),bf.getMonitorizareCalorii(),bf.getPedometru(),bf.getRezistentaApa()});
        }
        jTable1.setModel(tbModelBF);
    }
     public void loadAllAccesoriuBrataraFitness(double pretMax,String culoare){
        tbModelABF.setRowCount(0);
        AccesoriuBrataraFitness ab1,ab2,ab3,ab4,ab5,ab6,ab7,ab8,ab9,ab10;
        ab1=new AccesoriuBrataraFitness();
        ab2=new AccesoriuBrataraFitness("Xiaomi",20.34,"negru","inox",140,false);
        ab3=new AccesoriuBrataraFitness(ab2);
        ab4=new AccesoriuBrataraFitness("Samsung",40.25,"gri","silicon",150,true);
        ab5=new AccesoriuBrataraFitness("Xiaomi",24.24,"rosu","silicon",160,false);
        ab6=new AccesoriuBrataraFitness("HUAWEI",30.00,"albastru","plastic",170,true);
        ab7=new AccesoriuBrataraFitness("Fitbit",21.34,"negru","silicon",130,false);
        ab8=new AccesoriuBrataraFitness("Samsung",26.30,"roz","silicon",140,true);
        ab9=new AccesoriuBrataraFitness("Samsung",30.30,"roz","plastic",140,true);
        ab10=new AccesoriuBrataraFitness(ab7);
        ArrayList<AccesoriuBrataraFitness> ab=new ArrayList<AccesoriuBrataraFitness>();
        ab.add(ab1);
        ab.add(ab2);
        ab.add(ab3);
        ab.add(ab4);
        ab.add(ab5);
        ab.add(ab6);
        ab.add(ab7);
        ab.add(ab8);
        ab.add(ab9);
        ab.add(ab10);
        
        for( AccesoriuBrataraFitness abf:ab){
            if(abf.getPret()<=pretMax && abf.getCuloare().toLowerCase().equals(culoare.toLowerCase()))
                tbModelABF.addRow(new Object[]{abf.getPret(),abf.getBrand(),abf.getCuloare(),abf.getMaterial(),abf.getUniversal()});
        }
        jTable2.setModel(tbModelABF);
    }
     
     
     
     public void loadAllSmartwatch()//(String brand, double pret, String sistemOperare)
     {
        smartwatches = new Smartwatch[]
        {
            new Smartwatch("HUAWEI",499.00,"negru","Midnight","Android"),
            new Smartwatch("XIAOMI",199.00,"negru","Redmi Watch 5","Android/iOS"),
            new Smartwatch("APPLE",1353.99,"auriu","Apple Watch SE 3","iOS"),
            new Smartwatch("HAMA",299.99,"roz","HAMA 5000,","Android/iOS"),
            new Smartwatch("SAMSUNG",914.25,"gri inchis","Galaxy Watch7","Android"),
            new Smartwatch("AMAZFIT",499.00,"alb","Cheetah Square","Android/iOS"),
            new Smartwatch("CANYON",77.10,"rose-gold","Semifreddo SW-61","Android/iOS"),
            new Smartwatch("CANYON",77.10,"mov","Semifreddo SW-61","Android/iOS"),
            new Smartwatch("MYRIA",73.35,"roz","MY9525PK","Android/iOS"),
            new Smartwatch("PROMATE",499.90,"negru","XWatch-US13","Android/iOS")
        };
        
        
         
     }
     
     public void loadAllAccesoriiSmartwatch()//(double pret, String tip)
     {
        accesoriisw = new AccesoriiSmartwatch[]
        {
            new AccesoriiSmartwatch("BEST ACCESORIES",39.89,"silicon","curea"),
            new AccesoriiSmartwatch("AXROAD MALL",18.00,"plastic","incarcator magnetic USB"),
            new AccesoriiSmartwatch("OEM",14.83,"policarbonat/sticla securizata","carcasa"),
            new AccesoriiSmartwatch("CASEY STUDIOS",47.92,"metal","curea"),
            new AccesoriiSmartwatch("CASEY STUDIOS",31.91,"policarbonat","husa protectie"),
            new AccesoriiSmartwatch("JENUOS",12.00,"silicon","folie protectie"),
            new AccesoriiSmartwatch("APPLE",193.97,"plastic","AirTag "),
            new AccesoriiSmartwatch("SAMSUNG",299.50,"piele ecologica","bratara"),
            new AccesoriiSmartwatch("GARMIN",107.99,"plastic","cablu securizare"),
            new AccesoriiSmartwatch("APPLE",249.00,"textil, otel inoxidabil","breloc AirTag")
        };
        
     }
     
   
    public void filterSmartwatch() 
    {

        double pretMax;
        try 
        {
            String txt = pretmaxsw.getText().trim();
            if (txt.isEmpty()) pretMax = Double.MAX_VALUE;
            else pretMax = Double.parseDouble(txt);
        } 
        catch (NumberFormatException ex) 
        {
        javax.swing.JOptionPane.showMessageDialog(this, "Introdu un pret valid pentru Smartwatch.", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
        }

        String brandSel = (brand.getSelectedItem() == null) ? "Toate" : brand.getSelectedItem().toString();
        String osSel = (sistemoperare.getSelectedItem() == null) ? "Toate" : sistemoperare.getSelectedItem().toString();

   
        DefaultTableModel model = new DefaultTableModel(new String[]{"Pret","Brand","Culoare","Model","SistemOperare"}, 0);

        if (smartwatches == null) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Vectorul de smartwatch-uri nu este încă încărcat.", "Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (Smartwatch sw : smartwatches) 
        {
            boolean condBrand = brandSel.equalsIgnoreCase("Toate") || sw.getBrand().equalsIgnoreCase(brandSel);
            boolean condOS = osSel.equalsIgnoreCase("Toate") || sw.getSistemOperare().toLowerCase().contains(osSel.toLowerCase());
            boolean condPret = sw.getPret() <= pretMax;

            if (condBrand && condOS && condPret) 
            {
                model.addRow(new Object[]{sw.getPret(), sw.getBrand(), sw.getCuloare(), sw.getModel(), sw.getSistemOperare()});
            }
        }

        //jTable1.setModel(model);
        tabelSmartwatch.setModel(model);
    }


    public void filterAccesoriiSmartwatch() 
    {
        double pretMax;
        try 
        {
            String txt = pretmaxaccsw.getText().trim();
            if (txt.isEmpty()) pretMax = Double.MAX_VALUE;
            else pretMax = Double.parseDouble(txt);
        } 
        catch (NumberFormatException ex) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Introdu un pret valid pentru accesorii.", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tipSel = (tipaccesoriusmartwatch.getSelectedItem() == null) ? "Toate" : tipaccesoriusmartwatch.getSelectedItem().toString();

    
        DefaultTableModel model = new DefaultTableModel(new String[]{"Pret","Brand","Material","Tip"}, 0);

        if (accesoriisw == null) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Vectorul de accesorii nu este încă încărcat.", "Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (AccesoriiSmartwatch a : accesoriisw) 
        {
            boolean condTip = tipSel.equalsIgnoreCase("Toate") || a.getTip().equalsIgnoreCase(tipSel);
            boolean condPret = a.getPret() <= pretMax;

            if (condTip && condPret) 
            {
                model.addRow(new Object[]{a.getPret(), a.getBrand(), a.getMaterial(), a.getTip()});
            }
        }

        tabelAccesorii.setModel(model);
    }
    
    

     
     
     
     
     
     
     
     
     
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        brand = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        pretmaxaccsw = new javax.swing.JTextField();
        pretmaxsw = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sistemoperare = new javax.swing.JComboBox<>();
        tipaccesoriusmartwatch = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelSmartwatch = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelAccesorii = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rosu", "Roz", "Albastru", "Negru", "Gri" }));

        jLabel1.setText("Bratari Fitness");

        jLabel2.setText("pret maxim");

        jLabel3.setText("Monitorizare somn");

        jButton1.setText("Cautare bratari fitness");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Accesorii bratara fitness");

        jLabel5.setText("pret maxim");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Culoare");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pret", "Brand", "Puls", "Tensiune", "Somn", "Spo2", "Calorii", "Pedometru", "Rezistenta Apa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Cautare accesorii bratara fitness");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pret", "Brand", "Culoare", "Material", "Universal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setText("Smartwatch-uri");

        jLabel8.setText("Accesorii Smartwatch-uri");

        jLabel9.setText("pret maxim");

        jLabel10.setText("pret maxim");

        jLabel11.setText("sistem de operare");

        brand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAMSUNG", "HUAWEI", "APPLE", "XIAOMI" }));
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });

        jLabel12.setText("tip");

        pretmaxaccsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretmaxaccswActionPerformed(evt);
            }
        });

        pretmaxsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretmaxswActionPerformed(evt);
            }
        });

        jLabel13.setText("brand");

        sistemoperare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Android", "iOS" }));
        sistemoperare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemoperareActionPerformed(evt);
            }
        });

        tipaccesoriusmartwatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "curea", "incarcator magnetic USB", "carcasa", "husa protectie", "folie protectoare", "AirTag", "bratara", "cablu securizare", "breloc AirTag" }));
        tipaccesoriusmartwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipaccesoriusmartwatchActionPerformed(evt);
            }
        });

        tabelSmartwatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Brand", "Pret", "Model", "Sistem Operare"
            }
        ));
        tabelSmartwatch.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(tabelSmartwatch);

        tabelAccesorii.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Brand", "Pret", "Material", "Tip"
            }
        ));
        jScrollPane4.setViewportView(tabelAccesorii);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jCheckBox1)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel10)
                                    .addGap(39, 39, 39)
                                    .addComponent(pretmaxaccsw, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel8)
                                    .addGap(164, 164, 164)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel9))
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pretmaxsw, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sistemoperare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel12)
                                        .addGap(37, 37, 37)
                                        .addComponent(tipaccesoriusmartwatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(pretmaxsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(sistemoperare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pretmaxaccsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipaccesoriusmartwatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(321, 321, 321))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loadAllBrataraFitness(Double.parseDouble(jTextField1.getText()),jCheckBox1.isSelected());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        loadAllAccesoriuBrataraFitness(Double.parseDouble(jTextField2.getText()),jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void pretmaxaccswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretmaxaccswActionPerformed
        // TODO add your handling code here:
        filterAccesoriiSmartwatch();
    }//GEN-LAST:event_pretmaxaccswActionPerformed

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
        filterSmartwatch();
    }//GEN-LAST:event_brandActionPerformed

    private void pretmaxswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretmaxswActionPerformed
        // TODO add your handling code here:
        filterSmartwatch();
    }//GEN-LAST:event_pretmaxswActionPerformed

    private void tipaccesoriusmartwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipaccesoriusmartwatchActionPerformed
        // TODO add your handling code here:
        filterAccesoriiSmartwatch();
    }//GEN-LAST:event_tipaccesoriusmartwatchActionPerformed

    private void sistemoperareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemoperareActionPerformed
        // TODO add your handling code here:
        filterSmartwatch();
    }//GEN-LAST:event_sistemoperareActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> brand;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField pretmaxaccsw;
    private javax.swing.JTextField pretmaxsw;
    private javax.swing.JComboBox<String> sistemoperare;
    private javax.swing.JTable tabelAccesorii;
    private javax.swing.JTable tabelSmartwatch;
    private javax.swing.JComboBox<String> tipaccesoriusmartwatch;
    // End of variables declaration//GEN-END:variables
}
