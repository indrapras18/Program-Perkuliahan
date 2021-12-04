package program_perkuliahan;

import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.connect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class DataMahasiswa extends javax.swing.JInternalFrame {

    /**
     * Creates new form DataMahasiswa
     */
    public DataMahasiswa() {
        initComponents();
        datatable();
    }

    public void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("NPM");
        tbl.addColumn("NAMA");
        tbl.addColumn("JURUSAN");
        tbl.addColumn("JENIS KELAMIN");
        tbl.addColumn("ALAMAT");
        table.setModel(tbl);
        try {
            Statement statement = (Statement) connect.GetConnection().createStatement();
            ResultSet ress = statement.executeQuery("select * from tambahmahasiswa");
            while (ress.next()) {
                tbl.addRow(new Object[]{
                    ress.getString("npm"),
                    ress.getString("nama"),
                    ress.getString("jurusan"),
                    ress.getString("jenis_kelamin"),
                    ress.getString("alamat")
                });
                table.setModel(tbl);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnpm = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cmbjur = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtalamat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_cari = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("DATA MAHASISWA");

        jLabel2.setText("NPM");

        jLabel3.setText("NAMA MAHASISWA");

        jLabel4.setText("JURUSAN");

        jLabel5.setText("JENIS KELAMIN");

        jLabel6.setText("ALAMAT");

        cmbjur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SISTEM INFORMASI", "KOM.AKUNTANSI", "AKUNTANSI", "KESEHATAN" }));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("LAKI LAKI");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("PEREMPUAN");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table);

        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_cari.setText("CARI");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1)
                                    .addComponent(txtalamat)
                                    .addComponent(txtnpm)
                                    .addComponent(txtnama)
                                    .addComponent(cmbjur, 0, 227, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btn_tambah)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_simpan)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cari)
                                .addGap(18, 18, 18)
                                .addComponent(btn_hapus)
                                .addGap(18, 18, 18)
                                .addComponent(btn_keluar)))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbjur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_simpan)
                    .addComponent(btn_cari)
                    .addComponent(btn_hapus)
                    .addComponent(btn_keluar))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        txtnpm.setText("");
        txtnama.setText("");
        cmbjur.setSelectedItem("");
        if (jRadioButton1.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "laki laki");
        } else if (jRadioButton2.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "perempuan");
            txtalamat.setText("");
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String npm = txtnpm.getText();
        String nama = txtnama.getText();
        String jurusan = (String) cmbjur.getSelectedItem();
        String alamat = txtalamat.getText();
        String jenis_kelamin = null;

        if (jRadioButton1.isSelected()) {
            jenis_kelamin = "laki laki";
        } else if (jRadioButton2.isSelected()) {
            jenis_kelamin = "perempuan";
        }
        try {
            Statement statement = (Statement) connect.GetConnection().createStatement();
            statement.executeUpdate("insert into tambahmahasiswa VALUES ('" + npm + "','" + nama + "','" + jurusan + "','" + jenis_kelamin + "','" + alamat + "')");
            System.out.println(statement);
            statement.close();
            JOptionPane.showMessageDialog(null, "data berhasil di simpan!");
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "data gagal di simpan!");
        }
        datatable();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        String npm = txtnpm.getText();
        try {
            Statement statement = (Statement) connect.GetConnection().createStatement();
            statement.executeUpdate("DELETE from tambahmahasiswa where npm=('" + npm + "')");
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            txtnpm.setText("");
            txtnama.setText("");
            cmbjur.setSelectedItem("");
            String jenis_kelamin = null;
            txtalamat.setText("");
            txtnpm.requestFocus();
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus!");
        }
        datatable();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        try {
            Statement statement = (Statement) connect.GetConnection().createStatement();
            ResultSet ress = statement.executeQuery("select * from tambahmahasiswa where "
                    + "npm ='" + txtnpm.getText() + "'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("npm");
            tbl.addColumn("nama");
            tbl.addColumn("Jurusan");
            table.setModel(tbl);

            while (ress.next()) {
                tbl.addRow(new Object[]{
                    ress.getString("npm"),
                    ress.getString("nama"),
                    ress.getString("jurusan")
                });
                table.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
    }//GEN-LAST:event_btn_cariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbjur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnpm;
    // End of variables declaration//GEN-END:variables
}
