/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.util.*;
import config.Koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import main.App;
import model.LihatTransaksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class LaporanTransaksi extends javax.swing.JInternalFrame {
    private final LihatTransaksi lihatTransaksi;
    private List<LihatTransaksi> listLiatTransaksi;
    /**
     * Creates new form LaporanTransaksi
     */
    public LaporanTransaksi() {
        initComponents();
        lihatTransaksi = new LihatTransaksi();
        refreshTable();
    }
    
    private void refreshTable() {
        listLiatTransaksi = App.transaksiService.getAll(); 
        tabelTransaksi.setModel(new LihatTransaksiView.TransaksiTableModel(listLiatTransaksi));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        tombolCetak = new javax.swing.JButton();

        setClosable(true);
        setTitle("Laporan Transaksi");
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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA TRANSAKSI");

        tabelTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        tabelTransaksi.setForeground(new java.awt.Color(0, 0, 0));
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelTransaksi);

        tombolCetak.setBackground(new java.awt.Color(52, 73, 94));
        tombolCetak.setForeground(new java.awt.Color(255, 255, 255));
        tombolCetak.setText("Cetak");
        tombolCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(tombolCetak)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolCetak)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        App.menuView.laporanTransaksi = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void tombolCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCetakActionPerformed
        // TODO add your handling code here:
        try{
            Koneksi koneksi = new Koneksi();
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("/laporan/Transaksi.jasper"), null, koneksi.getConnection());
            JasperViewer.viewReport(jp, false);
        }
        catch (JRException ex ) {
            Logger.getLogger(LaporanTransaksi.class.getName()).log(Level.SEVERE,null, ex);          
        }
    }//GEN-LAST:event_tombolCetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JButton tombolCetak;
    // End of variables declaration//GEN-END:variables
    public static class TransaksiTableModel extends AbstractTableModel {

        private List<LihatTransaksi> listLihatTransaksi = new ArrayList<>();
        private final String HEADER[] = {"No Transaksi", "Tanggal", "Pelanggan", "Servis", "Harga "};

        public TransaksiTableModel(List<LihatTransaksi> listLihatTransaksi) {
            this.listLihatTransaksi = listLihatTransaksi;
        }

        @Override
        public int getRowCount() {
            return listLihatTransaksi.size();
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
            LihatTransaksi lt = listLihatTransaksi.get(i);
            switch (i1) {
                case 0:
                    return lt.getNoTransaksi();
                case 1:
                    return lt.getTanggal();
                case 2:
                    return lt.getNama();
                case 3:
                    return lt.getDeskripsi();
                case 4:
                    return lt.getHarga();
                default:
                    return null;
            }
        }

    }
}
