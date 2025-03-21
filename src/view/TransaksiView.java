/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import com.toedter.calendar.JDateChooser;
import controller.TransaksiController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import main.App;
import model.Transaksi;
import model.Servis;


/**
 *
 * @author ASUS
 */
public class TransaksiView extends javax.swing.JInternalFrame {
    
    private final Transaksi transaksi;
    private Servis servis;
    private final TransaksiController transaksiController;

    /**
     * Creates new form OrderView
     */
    public TransaksiView() {
        initComponents();
        transaksi = new Transaksi();
        servis = new Servis();
        transaksiController = new TransaksiController(this);
    }
    
    public JDateChooser getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public JTextField getTextNoTransaksi() {
        return textNoTransaksi;
    }
    
    public JTextField getTextNamaPelanggan() {
        return textPelanggan;
    }
    
    public JTextField getTextNamaServis() {
        return textNoServis;
    }
    
    public JButton getTombolSimpan() {
        return tombolRiset;
    }

    public JTextField getTextNoServis() {
        return textNoServis;
    }
    
    public JTextField getTextServisan() {
        return textServisan;
    }

    public JButton getTombolCari() {
        return tombolCari;
    }

    public JTextField getTextHarga() {
        return textHarga;
    }
//    private void refreshTable() {
//        listTransaksi = App.masterService.getAllTransaksi();
////        tabelPeminjaman.setModel(new PeminjamanTableModel(listPeminjaman));
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNoTransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tanggalTransaksi = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textPelanggan = new javax.swing.JTextField();
        tombolCari = new javax.swing.JButton();
        textHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textNoServis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textServisan = new javax.swing.JTextField();
        tombolRiset = new javax.swing.JButton();
        tombolSimpan = new javax.swing.JButton();

        setBackground(new java.awt.Color(127, 140, 141));
        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(127, 140, 141));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No Transaksi");

        textNoTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        textNoTransaksi.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tanggal Transaksi");

        tanggalTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        tanggalTransaksi.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(127, 140, 141));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No Servis");

        textPelanggan.setEditable(false);
        textPelanggan.setBackground(new java.awt.Color(255, 255, 255));
        textPelanggan.setForeground(new java.awt.Color(0, 0, 0));

        tombolCari.setBackground(new java.awt.Color(52, 73, 94));
        tombolCari.setForeground(new java.awt.Color(255, 255, 255));
        tombolCari.setText("Cari");
        tombolCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCariActionPerformed(evt);
            }
        });

        textHarga.setEditable(false);
        textHarga.setBackground(new java.awt.Color(255, 255, 255));
        textHarga.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pelanggan");

        textNoServis.setEditable(false);
        textNoServis.setBackground(new java.awt.Color(255, 255, 255));
        textNoServis.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Servisan");

        textServisan.setEditable(false);
        textServisan.setBackground(new java.awt.Color(255, 255, 255));
        textServisan.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textNoServis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tombolCari)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textServisan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNoServis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tombolCari)
                    .addComponent(jLabel8)
                    .addComponent(textServisan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        tombolRiset.setBackground(new java.awt.Color(52, 73, 94));
        tombolRiset.setForeground(new java.awt.Color(255, 255, 255));
        tombolRiset.setText("Reset");
        tombolRiset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolRisetActionPerformed(evt);
            }
        });

        tombolSimpan.setBackground(new java.awt.Color(52, 73, 94));
        tombolSimpan.setForeground(new java.awt.Color(255, 255, 255));
        tombolSimpan.setText("Simpan");
        tombolSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tanggalTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tombolSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolRiset)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(textNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(tanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolSimpan)
                    .addComponent(tombolRiset))
                .addGap(14, 14, 14))
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

    private void tombolCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCariActionPerformed
        // TODO add your handling code here:
        transaksiController.cariServis(textNoServis.getText());
        
    }//GEN-LAST:event_tombolCariActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        App.menuView.transaksiView = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void tombolRisetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolRisetActionPerformed
        // TODO add your handling code here:
        transaksiController.clearForm();
    }//GEN-LAST:event_tombolRisetActionPerformed

    private void tombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanActionPerformed
        // TODO add your handling code here:
        servis = App.masterService.getByIdServis(textNoServis.getText());
        if (!transaksiController.validasiKodeTransaksi(textNoTransaksi.getText())) {
            return;
        }
        if (!transaksiController.validasiKodeServis(textNoServis.getText())) {
            return;
        }
        if (transaksiController.validasiInput()) {
            transaksi.setNoTransaksi(textNoTransaksi.getText());
            
            transaksi.setServis(servis);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (tanggalTransaksi.getDate() != null) {
                transaksi.setTanggal(sdf.format(tanggalTransaksi.getDate()));
            } else {
                transaksi.setTanggal(null);
            }
            

            App.transaksiService.simpanTransaksi(transaksi);
            JOptionPane.showMessageDialog(this, "Data Transaksi berhasil disimpan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            transaksiController.clearForm();
        }
    }//GEN-LAST:event_tombolSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser tanggalTransaksi;
    private javax.swing.JTextField textHarga;
    private javax.swing.JTextField textNoServis;
    private javax.swing.JTextField textNoTransaksi;
    private javax.swing.JTextField textPelanggan;
    private javax.swing.JTextField textServisan;
    private javax.swing.JButton tombolCari;
    private javax.swing.JButton tombolRiset;
    private javax.swing.JButton tombolSimpan;
    // End of variables declaration//GEN-END:variables
    
    public static class TransaksiTableModel extends AbstractTableModel {

        private List<Transaksi> listTransaksi = new ArrayList<>();
        private final String HEADER[] = {"No Transaksi", "Tanggal", "Pelanggan", "Servis", "Total Bayar"};

        public TransaksiTableModel(List<Transaksi> listTransaksi) {
            this.listTransaksi = listTransaksi;
        }

        @Override
        public int getRowCount() {
            return listTransaksi.size();
        }

        @Override
        public int getColumnCount() {
            return HEADER.length;
        }

        @Override
        public String getColumnName(int i) {
            return HEADER[i];
        }

        @Override
        public Object getValueAt(int i, int i1) {
            Transaksi t = listTransaksi.get(i);
            switch (i1) {
                case 0:
                    return t.getNoTransaksi();
                case 1:
                    return t.getTanggal();
                case 2:
                    return t.getPelanggan().getNama();
                case 3:
                    return t.getServis().getDeskripsi();
                case 4:
                    return t.getTotal();
                default:
                    return null;
            }
        }

    }
}
