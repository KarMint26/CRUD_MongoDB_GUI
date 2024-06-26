/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.product.gui;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.product.db.Connection;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import org.bson.Document;

/**
 *
 * @author karel
 */
public class TambahData extends javax.swing.JDialog {

    ArrayList<JTextField> namaKoloms = new ArrayList<>();
    ArrayList<JTextField> datas = new ArrayList<>();

    /**
     * Creates new form TambahData
     */
    public TambahData(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setTitle("Tambah Data");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        JDTambahData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtJumlahKolom = new javax.swing.JTextField();
        btnJumlahKolom = new javax.swing.JButton();
        pnJumlahKolom = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JDTambahData.setBackground(new java.awt.Color(255, 255, 255));
        JDTambahData.setToolTipText("");
        JDTambahData.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel2.setText("JUMLAH KOLOM : ");

        btnJumlahKolom.setBackground(new java.awt.Color(204, 0, 0));
        btnJumlahKolom.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnJumlahKolom.setForeground(new java.awt.Color(255, 255, 255));
        btnJumlahKolom.setText("GO");
        btnJumlahKolom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJumlahKolomActionPerformed(evt);
            }
        });

        pnJumlahKolom.setBackground(new java.awt.Color(235, 235, 235));
        pnJumlahKolom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnJumlahKolom.setLayout(new java.awt.GridBagLayout());

        btnSimpan.setBackground(new java.awt.Color(255, 102, 0));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("SIMPAN DATA");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(345, 254, 7, 228);
        pnJumlahKolom.add(btnSimpan, gridBagConstraints);

        javax.swing.GroupLayout JDTambahDataLayout = new javax.swing.GroupLayout(JDTambahData);
        JDTambahData.setLayout(JDTambahDataLayout);
        JDTambahDataLayout.setHorizontalGroup(
            JDTambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDTambahDataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJumlahKolom, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnJumlahKolom, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnJumlahKolom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JDTambahDataLayout.setVerticalGroup(
            JDTambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDTambahDataLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(JDTambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJumlahKolom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJumlahKolom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnJumlahKolom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDTambahData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDTambahData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJumlahKolomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJumlahKolomActionPerformed
        if (txtJumlahKolom.getText() == null || "".equals(txtJumlahKolom.getText())) {
            JOptionPane.showMessageDialog(this, "Harus menginputkan jumlah kolom", "Jumlah Kolom", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer jumlahKolom = Integer.valueOf(txtJumlahKolom.getText());

        // Create an array of JTextField instances
        int x = 2;
        int y = 2;
        int yno = 52;
        int ynamakolom = 52;
        int ydata = 52;
        JTextField[] textFields = new JTextField[]{
            new JTextField("No"),
            new JTextField("Nama Kolom"),
            new JTextField("Data")
        };

        // Set common properties for all text fields
        for (JTextField textField : textFields) {
            textField.setEditable(false);
            textField.setDisabledTextColor(new Color(0, 0, 0));
            textField.setBackground(new Color(51, 204, 0));
            textField.setBounds(x, y, 196, 50);
            x += 196;
        }

        // Add text fields to the panel
        for (JTextField textField : textFields) {
            pnJumlahKolom.add(textField);
        }

        for (int i = 1; i <= jumlahKolom; i++) {
            JTextField nomor = new JTextField(String.valueOf(i));
            nomor.setEditable(false);
            nomor.setDisabledTextColor(new Color(0, 0, 0));
            nomor.setBackground(new Color(0, 204, 204));
            nomor.setBounds(2, yno, 196, 50);
            yno += 50;

            pnJumlahKolom.add(nomor);
        }

        for (int i = 1; i <= jumlahKolom; i++) {
            JTextField namakolom = new JTextField("namaKolom" + i);
            namakolom.setDisabledTextColor(new Color(0, 0, 0));
            namakolom.setBackground(new Color(255, 255, 255));
            namakolom.setBounds(198, ynamakolom, 196, 50);
            namakolom.setName(namakolom.getText());
            ynamakolom += 50;

            pnJumlahKolom.add(namakolom);
            namaKoloms.add(namakolom);
        }

        for (int i = 1; i <= jumlahKolom; i++) {
            JTextField data = new JTextField("data" + i);
            data.setDisabledTextColor(new Color(0, 0, 0));
            data.setBackground(new Color(255, 255, 255));
            data.setBounds(394, ydata, 196, 50);
            data.setName(data.getText());
            ydata += 50;

            pnJumlahKolom.add(data);
            datas.add(data);
        }
    }//GEN-LAST:event_btnJumlahKolomActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (txtJumlahKolom.getText() == null || "".equals(txtJumlahKolom.getText())) {
            JOptionPane.showMessageDialog(this,
                    "Harus menginputkan jumlah kolom", "Jumlah Kolom", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer jumlahKolom = Integer.valueOf(txtJumlahKolom.getText());
        // koneksi ke database MongoDB
        MongoDatabase database = Connection.konekMongoDB();
        MongoCollection<Document> col = database.getCollection("practices");
        Document doc = new Document();

        for (int i = 0; i < jumlahKolom; i++) {
            // Menambah data
            doc.put(namaKoloms.get(i).getText(), datas.get(i).getText());
        }

        col.insertOne(doc);
        System.out.println("Data telah disimpan dalam koleksi");
        JOptionPane.showMessageDialog(this,
                "Berhasil menambahkan data", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        main m = new main();
        m.successAddData();
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(TambahData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahData dialog = new TambahData(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JDTambahData;
    private javax.swing.JButton btnJumlahKolom;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnJumlahKolom;
    private javax.swing.JTextField txtJumlahKolom;
    // End of variables declaration//GEN-END:variables
}
