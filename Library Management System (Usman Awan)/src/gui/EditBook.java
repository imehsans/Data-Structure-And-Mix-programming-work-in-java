package gui;

import com.sun.glass.events.KeyEvent;
import dataStructure.Node;
import static gui.MainMenu.icon;
import static gui.MainMenu.dll;
import javax.swing.JOptionPane;
import validation.NegativeValueException;

public class EditBook extends javax.swing.JFrame {

    private Node nodeToModify;
    private boolean isDataFound = false;

    public EditBook() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bookIDTxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bookTitleTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        catagoryTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        bookShelfTxt = new javax.swing.JTextField();
        authorTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        modifyBtnPanel = new javax.swing.JPanel();
        modifyBtnLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Book");

        jPanel1.setBackground(new java.awt.Color(102, 51, 153));

        Header.setBackground(new java.awt.Color(140, 20, 252));

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Book");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 51, 153));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Shelf No");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Catarory");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Price");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        bookIDTxt.setBackground(new java.awt.Color(102, 51, 153));
        bookIDTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bookIDTxt.setForeground(new java.awt.Color(255, 255, 255));
        bookIDTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookIDTxt.setBorder(null);
        bookIDTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        bookIDTxt.setSelectionColor(new java.awt.Color(140, 20, 252));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Date");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Author Name");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        bookTitleTxt.setBackground(new java.awt.Color(102, 51, 153));
        bookTitleTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bookTitleTxt.setForeground(new java.awt.Color(255, 255, 255));
        bookTitleTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookTitleTxt.setBorder(null);
        bookTitleTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        bookTitleTxt.setSelectionColor(new java.awt.Color(140, 20, 252));
        bookTitleTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bookTitleTxtKeyTyped(evt);
            }
        });

        catagoryTxt.setBackground(new java.awt.Color(102, 51, 153));
        catagoryTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        catagoryTxt.setForeground(new java.awt.Color(255, 255, 255));
        catagoryTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        catagoryTxt.setBorder(null);
        catagoryTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        catagoryTxt.setSelectionColor(new java.awt.Color(140, 20, 252));
        catagoryTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                catagoryTxtKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Book Title");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book ID");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        bookShelfTxt.setBackground(new java.awt.Color(102, 51, 153));
        bookShelfTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bookShelfTxt.setForeground(new java.awt.Color(255, 255, 255));
        bookShelfTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookShelfTxt.setBorder(null);
        bookShelfTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        bookShelfTxt.setSelectionColor(new java.awt.Color(140, 20, 252));

        authorTxt.setBackground(new java.awt.Color(102, 51, 153));
        authorTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        authorTxt.setForeground(new java.awt.Color(255, 255, 255));
        authorTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        authorTxt.setBorder(null);
        authorTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        authorTxt.setFocusTraversalPolicyProvider(true);
        authorTxt.setSelectionColor(new java.awt.Color(140, 20, 252));
        authorTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                authorTxtKeyTyped(evt);
            }
        });

        dateTxt.setBackground(new java.awt.Color(102, 51, 153));
        dateTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dateTxt.setForeground(new java.awt.Color(255, 255, 255));
        dateTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateTxt.setBorder(null);
        dateTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        dateTxt.setSelectionColor(new java.awt.Color(140, 20, 252));

        priceTxt.setBackground(new java.awt.Color(102, 51, 153));
        priceTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        priceTxt.setForeground(new java.awt.Color(255, 255, 255));
        priceTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceTxt.setBorder(null);
        priceTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        priceTxt.setSelectionColor(new java.awt.Color(140, 20, 252));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Quantity");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        quantityTxt.setBackground(new java.awt.Color(102, 51, 153));
        quantityTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        quantityTxt.setForeground(new java.awt.Color(255, 255, 255));
        quantityTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantityTxt.setBorder(null);
        quantityTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        quantityTxt.setSelectionColor(new java.awt.Color(140, 20, 252));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(dateTxt)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addComponent(catagoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(authorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(bookTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(bookShelfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(priceTxt)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(bookIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator9)
                            .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bookIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bookShelfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bookTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(authorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(catagoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter Book ID");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        searchTxt.setBackground(new java.awt.Color(102, 51, 153));
        searchTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        searchTxt.setForeground(new java.awt.Color(255, 255, 255));
        searchTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTxt.setToolTipText("Enter Book ID");
        searchTxt.setBorder(null);
        searchTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        searchTxt.setSelectionColor(new java.awt.Color(140, 20, 252));
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        modifyBtnPanel.setBackground(new java.awt.Color(102, 51, 153));
        modifyBtnPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        modifyBtnPanel.setToolTipText("click to Modify");
        modifyBtnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyBtnPanelMouseClicked(evt);
            }
        });

        modifyBtnLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        modifyBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        modifyBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifyBtnLabel.setText("Modify");

        javax.swing.GroupLayout modifyBtnPanelLayout = new javax.swing.GroupLayout(modifyBtnPanel);
        modifyBtnPanel.setLayout(modifyBtnPanelLayout);
        modifyBtnPanelLayout.setHorizontalGroup(
            modifyBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modifyBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        modifyBtnPanelLayout.setVerticalGroup(
            modifyBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modifyBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator8)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(modifyBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modifyBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyBtnPanelMouseClicked
        if (isDataFound) {
            int choice = JOptionPane.showConfirmDialog(rootPane, "Do you want to Modify Record");
            if (choice == 0) {
                boolean isInserted = false;
                try {
                    if (bookIDTxt.getText().trim().equals("") || bookShelfTxt.getText().trim().equals("") || bookTitleTxt.getText().trim().equals("")
                            || authorTxt.getText().trim().equals("") || catagoryTxt.getText().trim().equals("") || dateTxt.getText().trim().equals("") || quantityTxt.getText().trim().equals("")
                            || priceTxt.getText().trim().equals("")) {
                        JOptionPane.showMessageDialog(rootPane, "Please Fill All Text Boxes", "Error", 0);
                        return;
                    }

                    int bookid = Integer.parseInt(bookIDTxt.getText().trim());
                    int bookshelf = Integer.parseInt(bookShelfTxt.getText().trim());
                    String booktitle = bookTitleTxt.getText().trim();
                    String authorname = authorTxt.getText().trim();
                    String catagory = catagoryTxt.getText().trim();
                    String date = dateTxt.getText().trim();
                    int quantity = Integer.parseInt(quantityTxt.getText().trim());
                    double price = Double.parseDouble(priceTxt.getText().trim());

                    if (NegativeValueException.checkNumbers(bookid, bookshelf, quantity, price)) {
                        throw new NegativeValueException();
                    }

                    nodeToModify.setBookid(bookid);
                    nodeToModify.setShelf(bookshelf);
                    nodeToModify.setBookTitle(booktitle);
                    nodeToModify.setAuthorname(authorname);
                    nodeToModify.setCatagory(catagory);
                    nodeToModify.setDate(date);
                    nodeToModify.setQuantity(quantity);
                    nodeToModify.setPrice(price);

                    searchTxt.setText("");
                    isInserted = true;
                    clearAllTxt();
                } catch (NumberFormatException e) {
                   
                    JOptionPane.showMessageDialog(rootPane, "Please Enter Correct Data in each Text Box", "Error", 0);
                } catch (NegativeValueException e) {
                   
                    JOptionPane.showMessageDialog(rootPane, "Negative Values Found", "Error", 0);
                }
                if (isInserted) {
                    JOptionPane.showMessageDialog(rootPane, "Data Modify Successfully", null, -1);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No Record found to Modify", "Warning", 2);
        }
    }//GEN-LAST:event_modifyBtnPanelMouseClicked

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        String searchBox = searchTxt.getText().trim();
        if (searchBox.isEmpty()) {
            return;
        }
        try {
            int bookid = Integer.parseInt(searchBox);

            nodeToModify = dll.searchByValue(bookid);

            if (nodeToModify != null) {
                isDataFound = true;
                bookIDTxt.setText(String.valueOf(nodeToModify.getBookid()));
                bookShelfTxt.setText(String.valueOf(nodeToModify.getShelf()));
                bookTitleTxt.setText(nodeToModify.getBookTitle());
                authorTxt.setText(nodeToModify.getAuthorname());
                catagoryTxt.setText(nodeToModify.getCatagory());
                dateTxt.setText(nodeToModify.getDate());
                quantityTxt.setText(String.valueOf(nodeToModify.getQuantity()));
                priceTxt.setText(String.valueOf(nodeToModify.getPrice()));
            } else {
                clearAllTxt();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Numeric Data in Search Text Box", null, -1);
        }
    }//GEN-LAST:event_searchTxtKeyReleased

    private void bookTitleTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookTitleTxtKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || c == KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_bookTitleTxtKeyTyped

    private void authorTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authorTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || c == KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_authorTxtKeyTyped

    private void catagoryTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_catagoryTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || c == KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_catagoryTxtKeyTyped

    private void clearAllTxt() {
        isDataFound = false;
        bookIDTxt.setText("");
        bookShelfTxt.setText("");
        bookTitleTxt.setText("");
        authorTxt.setText("");
        catagoryTxt.setText("");
        dateTxt.setText("");
        quantityTxt.setText("");
        priceTxt.setText("");
    }

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
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JTextField authorTxt;
    private javax.swing.JTextField bookIDTxt;
    private javax.swing.JTextField bookShelfTxt;
    private javax.swing.JTextField bookTitleTxt;
    private javax.swing.JTextField catagoryTxt;
    private javax.swing.JTextField dateTxt;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel modifyBtnLabel;
    private javax.swing.JPanel modifyBtnPanel;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
