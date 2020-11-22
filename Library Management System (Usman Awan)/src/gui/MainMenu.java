package gui;

import dataStructure.DLL;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {

    public static DLL dll;
    public static ImageIcon icon;
    private final AddBook addBookFrame;
    private final SearchBook searchBookFrame;
    private final EditBook editBookFrame;
    private final DeleteBook deleteBookFrame;

    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        icon = new ImageIcon(getClass().getResource("/Images/books.png"));
        this.setIconImage(icon.getImage());
        dll = new DLL();
        addBookFrame = new AddBook();
        searchBookFrame = new SearchBook();
        editBookFrame = new EditBook();
        deleteBookFrame = new DeleteBook();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addBookPanel = new javax.swing.JPanel();
        addBookLabel = new javax.swing.JLabel();
        searchBookPanel = new javax.swing.JPanel();
        searchBookLabel = new javax.swing.JLabel();
        deleteBookPanel = new javax.swing.JPanel();
        deleteBookLabel = new javax.swing.JLabel();
        editBookPanel = new javax.swing.JPanel();
        editBookLabel = new javax.swing.JLabel();
        showAllBooksPanel = new javax.swing.JPanel();
        showAllBooksLabel = new javax.swing.JLabel();
        deleteAllBooksPanel = new javax.swing.JPanel();
        deleteAllBooksLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");

        jPanel1.setBackground(new java.awt.Color(102, 51, 153));
        jPanel1.setLayout(null);

        Header.setBackground(new java.awt.Color(140, 20, 252));

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Library Management System");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Header);
        Header.setBounds(0, 0, 1200, 100);

        addBookPanel.setBackground(new java.awt.Color(77, 19, 209));
        addBookPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addBookPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBookPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBookPanelMouseExited(evt);
            }
        });

        addBookLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        addBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        addBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBookLabel.setText("Add Book");
        addBookLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout addBookPanelLayout = new javax.swing.GroupLayout(addBookPanel);
        addBookPanel.setLayout(addBookPanelLayout);
        addBookPanelLayout.setHorizontalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addBookPanelLayout.setVerticalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(addBookPanel);
        addBookPanel.setBounds(150, 200, 200, 100);

        searchBookPanel.setBackground(new java.awt.Color(77, 19, 209));
        searchBookPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        searchBookPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBookPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBookPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBookPanelMouseExited(evt);
            }
        });

        searchBookLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        searchBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchBookLabel.setText("Search Book");

        javax.swing.GroupLayout searchBookPanelLayout = new javax.swing.GroupLayout(searchBookPanel);
        searchBookPanel.setLayout(searchBookPanelLayout);
        searchBookPanelLayout.setHorizontalGroup(
            searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        searchBookPanelLayout.setVerticalGroup(
            searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(searchBookPanel);
        searchBookPanel.setBounds(500, 200, 200, 100);

        deleteBookPanel.setBackground(new java.awt.Color(77, 19, 209));
        deleteBookPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        deleteBookPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBookPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBookPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBookPanelMouseExited(evt);
            }
        });

        deleteBookLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        deleteBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        deleteBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteBookLabel.setText("Delete Book");

        javax.swing.GroupLayout deleteBookPanelLayout = new javax.swing.GroupLayout(deleteBookPanel);
        deleteBookPanel.setLayout(deleteBookPanelLayout);
        deleteBookPanelLayout.setHorizontalGroup(
            deleteBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        deleteBookPanelLayout.setVerticalGroup(
            deleteBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(deleteBookPanel);
        deleteBookPanel.setBounds(150, 368, 200, 100);

        editBookPanel.setBackground(new java.awt.Color(77, 19, 209));
        editBookPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        editBookPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBookPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBookPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBookPanelMouseExited(evt);
            }
        });

        editBookLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        editBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        editBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBookLabel.setText("Edit Books");

        javax.swing.GroupLayout editBookPanelLayout = new javax.swing.GroupLayout(editBookPanel);
        editBookPanel.setLayout(editBookPanelLayout);
        editBookPanelLayout.setHorizontalGroup(
            editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        editBookPanelLayout.setVerticalGroup(
            editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(editBookPanel);
        editBookPanel.setBounds(850, 200, 200, 100);

        showAllBooksPanel.setBackground(new java.awt.Color(77, 19, 209));
        showAllBooksPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        showAllBooksPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showAllBooksPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showAllBooksPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showAllBooksPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showAllBooksPanelMouseExited(evt);
            }
        });

        showAllBooksLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        showAllBooksLabel.setForeground(new java.awt.Color(255, 255, 255));
        showAllBooksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showAllBooksLabel.setText("Show All");

        javax.swing.GroupLayout showAllBooksPanelLayout = new javax.swing.GroupLayout(showAllBooksPanel);
        showAllBooksPanel.setLayout(showAllBooksPanelLayout);
        showAllBooksPanelLayout.setHorizontalGroup(
            showAllBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showAllBooksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showAllBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        showAllBooksPanelLayout.setVerticalGroup(
            showAllBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showAllBooksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showAllBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(showAllBooksPanel);
        showAllBooksPanel.setBounds(850, 368, 200, 100);

        deleteAllBooksPanel.setBackground(new java.awt.Color(77, 19, 209));
        deleteAllBooksPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        deleteAllBooksPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAllBooksPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAllBooksPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteAllBooksPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteAllBooksPanelMouseExited(evt);
            }
        });

        deleteAllBooksLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        deleteAllBooksLabel.setForeground(new java.awt.Color(255, 255, 255));
        deleteAllBooksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteAllBooksLabel.setText("Delete All Books");

        javax.swing.GroupLayout deleteAllBooksPanelLayout = new javax.swing.GroupLayout(deleteAllBooksPanel);
        deleteAllBooksPanel.setLayout(deleteAllBooksPanelLayout);
        deleteAllBooksPanelLayout.setHorizontalGroup(
            deleteAllBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAllBooksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteAllBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        deleteAllBooksPanelLayout.setVerticalGroup(
            deleteAllBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAllBooksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteAllBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(deleteAllBooksPanel);
        deleteAllBooksPanel.setBounds(500, 368, 200, 100);

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

    private void addBookPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookPanelMouseClicked
        addBookFrame.setVisible(true);
    }//GEN-LAST:event_addBookPanelMouseClicked

    private void addBookPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookPanelMouseEntered
        addBookPanel.setBackground(Color.WHITE);
        addBookLabel.setForeground(new Color(77, 19, 209));
    }//GEN-LAST:event_addBookPanelMouseEntered

    private void addBookPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookPanelMouseExited
        addBookPanel.setBackground(new Color(77, 19, 209));
        addBookLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_addBookPanelMouseExited

    private void searchBookPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBookPanelMouseClicked
        searchBookFrame.setVisible(true);
    }//GEN-LAST:event_searchBookPanelMouseClicked

    private void searchBookPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBookPanelMouseEntered
        searchBookPanel.setBackground(Color.WHITE);
        searchBookLabel.setForeground(new Color(77, 19, 209));
    }//GEN-LAST:event_searchBookPanelMouseEntered

    private void searchBookPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBookPanelMouseExited
        searchBookPanel.setBackground(new Color(77, 19, 209));
        searchBookLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_searchBookPanelMouseExited

    private void deleteBookPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBookPanelMouseClicked
        deleteBookFrame.setVisible(true);
    }//GEN-LAST:event_deleteBookPanelMouseClicked

    private void deleteBookPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBookPanelMouseEntered
        deleteBookPanel.setBackground(Color.WHITE);
        deleteBookLabel.setForeground(new Color(77, 19, 209));
    }//GEN-LAST:event_deleteBookPanelMouseEntered

    private void deleteBookPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBookPanelMouseExited
        deleteBookPanel.setBackground(new Color(77, 19, 209));
        deleteBookLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_deleteBookPanelMouseExited

    private void editBookPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBookPanelMouseClicked
        editBookFrame.setVisible(true);
    }//GEN-LAST:event_editBookPanelMouseClicked

    private void editBookPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBookPanelMouseEntered
        editBookPanel.setBackground(Color.WHITE);
        editBookLabel.setForeground(new Color(77, 19, 209));
    }//GEN-LAST:event_editBookPanelMouseEntered

    private void editBookPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBookPanelMouseExited
        editBookPanel.setBackground(new Color(77, 19, 209));
        editBookLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_editBookPanelMouseExited

    private void showAllBooksPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showAllBooksPanelMouseClicked
        dll.printAll();
    }//GEN-LAST:event_showAllBooksPanelMouseClicked

    private void showAllBooksPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showAllBooksPanelMouseEntered
        showAllBooksPanel.setBackground(Color.WHITE);
        showAllBooksLabel.setForeground(new Color(77, 19, 209));
    }//GEN-LAST:event_showAllBooksPanelMouseEntered

    private void showAllBooksPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showAllBooksPanelMouseExited
        showAllBooksPanel.setBackground(new Color(77, 19, 209));
        showAllBooksLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_showAllBooksPanelMouseExited

    private void deleteAllBooksPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllBooksPanelMouseClicked
        int choice = JOptionPane.showConfirmDialog(rootPane, "Do you want to Delete all Records");
        if (choice == 0) {
            boolean isDeleted = dll.deleteAll();
            if (isDeleted) {
                JOptionPane.showMessageDialog(rootPane, "All Data Successfully Deleted", null, -1);
            } else {
                JOptionPane.showMessageDialog(rootPane, "No Record Found to Delete", null, 0);
            }
        }
    }//GEN-LAST:event_deleteAllBooksPanelMouseClicked

    private void deleteAllBooksPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllBooksPanelMouseEntered
        deleteAllBooksPanel.setBackground(Color.WHITE);
        deleteAllBooksLabel.setForeground(new Color(77, 19, 209));
    }//GEN-LAST:event_deleteAllBooksPanelMouseEntered

    private void deleteAllBooksPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllBooksPanelMouseExited
        deleteAllBooksPanel.setBackground(new Color(77, 19, 209));
        deleteAllBooksLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_deleteAllBooksPanelMouseExited

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel addBookLabel;
    private javax.swing.JPanel addBookPanel;
    private javax.swing.JLabel deleteAllBooksLabel;
    private javax.swing.JPanel deleteAllBooksPanel;
    private javax.swing.JLabel deleteBookLabel;
    private javax.swing.JPanel deleteBookPanel;
    private javax.swing.JLabel editBookLabel;
    private javax.swing.JPanel editBookPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel searchBookLabel;
    private javax.swing.JPanel searchBookPanel;
    private javax.swing.JLabel showAllBooksLabel;
    private javax.swing.JPanel showAllBooksPanel;
    // End of variables declaration//GEN-END:variables
}
