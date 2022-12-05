
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BookShop extends javax.swing.JFrame {

    /**
     * Creates new form BookShop
     */
    public BookShop() {
        initComponents();
        setLocationRelativeTo(null);
        display();
    }
    
    public void display(){
        int cnt;
        
        try {
            statement=connect.prepareStatement("select *from bookshop");
            result=statement.executeQuery();
            ResultSetMetaData resMeta = result.getMetaData();
            
            cnt = resMeta.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)contentTable.getModel();
            dt.setRowCount(0);
            while(result.next()){
                
                Vector store= new Vector();
                
                for(int i=1; i<=cnt; i++){
                    
                    store.add(result.getString("bookname"));
                    store.add(result.getString("author"));
                    store.add(result.getString("available"));
                    store.add(result.getString("price"));
                    
                }
                dt.addRow(store);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BookShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setDecision(String value){
        decision = value;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        bookNameLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        bookNameTextField = new javax.swing.JTextPane();
        selectButton = new javax.swing.JButton();
        quantityLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        quantityTextField = new javax.swing.JTextPane();

        jTextPane1.setMinimumSize(new java.awt.Dimension(6, 18));
        jTextPane1.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane3.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(255, 204, 204));
        titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(175, 5, 73));
        titleLabel.setText("Book Shop");

        backButton.setBackground(new java.awt.Color(255, 153, 153));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        contentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book Name", "Author Name", "Available", "Price"
            }
        ));
        contentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(contentTable);

        bookNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bookNameLabel.setText("Book Name:");

        bookNameTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        bookNameTextField.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane4.setViewportView(bookNameTextField);

        selectButton.setBackground(new java.awt.Color(153, 255, 153));
        selectButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        selectButton.setForeground(new java.awt.Color(204, 0, 0));
        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quantityLabel.setText("Quantity:");

        quantityTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        quantityTextField.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane5.setViewportView(quantityTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(backButton)
                        .addGap(174, 174, 174)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        String quantity = quantityTextField.getText();
        
        JOptionPane.showMessageDialog(this, "Item Selected!");
        
        JOptionPane.showMessageDialog(this, "Sorry, we cannot implement payment gateway right now!\nThats why next tab not working!\nHope we add it soon!");
    }//GEN-LAST:event_selectButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if(decision.equals("Student")){
            dispose();
            new StudentDashboard().setVisible(true);
        }
        else if(decision.equals("Teacher")){
            dispose();
            new TeacherDashboard().setVisible(true);
        }
        else if(decision.equals("Guardian")){
            dispose();
            new GuardianDashboard().setVisible(true);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void contentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTableMouseClicked
        int row = contentTable.getSelectedRow();
        DefaultTableModel model= (DefaultTableModel)contentTable.getModel();
        
        bookNameTextField.setText(model.getValueAt(row, 0).toString());
        quantityTextField.setText(model.getValueAt(row, 2).toString());
    }//GEN-LAST:event_contentTableMouseClicked

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
            java.util.logging.Logger.getLogger(BookShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookShop().setVisible(true);
            }
        });
    }
    
    //custom variables.
    
    SQL objBook = new SQL();
    
    Connection connect = objBook.connection();
    
    PreparedStatement statement;
    ResultSet result;
    
    private String decision,avail;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JTextPane bookNameTextField;
    private javax.swing.JTable contentTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextPane quantityTextField;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
