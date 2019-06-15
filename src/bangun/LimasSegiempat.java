package bangun;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class LimasSegiempat extends javax.swing.JPanel {

    /**
     * Creates new form LimasSegiempat
     */
    public LimasSegiempat() {
        initComponents();
    }
  
    private class bangun extends Inisial
    {
DecimalFormat df = new DecimalFormat("0.00"); 
        @Override
        void volume() {
            setSisi(Double.parseDouble(sisi.getText()));
            setTinggi(Double.parseDouble(tinggi.getText()));
            double all =  0.3*Math.pow(getSisi(), 2)*getTinggi();
            volume.setText(df.format(all));
            
        }

        @Override
        void luas() {
           setSisi(Double.parseDouble(sisi.getText()));
            setTinggi(Double.parseDouble(tinggi.getText()));
            double all = (Math.pow(getSisi(), 2))+(4*(0.5*getSisi()*getTinggi()));
            luas.setText(df.format(all));
        }
        
        void tampil()
        {
            super.setJelas("Ciri-ciri LIMAS,antara lain:\n" +
"Ø  Limas adalah bangun ruang yang mempunyai bidang alas segi banyak dan dari bidang alas tersebut dibentuk suatu sisi berbentuk segitiga yang akan bertemu pada satu titik,\n" +
"Ø  Nama limas ditentukan oleh bentuk alasnya,\n" +
"Ø  Limas beraturan yaitu limas yang alasnya berupa segi beraturan,\n" +
"Ø  Tinggi limas adalah garis tegak lurus dari puncak limas ke alas limas,\n" +
"Ø  Macam-macam bentuk limas, antara lain:\n" +
"1.    Limas segitiga     ( alasnya berbentuk segitiga )\n" +
"2.    Lima segiempat  ( alasnya berbentuk segi empat )\n" +
"3.    Limas segilima    ( alasnya berbentuk segilima )\n" +
"4.    Limas segienam  ( alasnya berbentuk segienam ) " + "\nRumus Luas Permukaan Limas\n" +
"L =  luas alas + luas selubung limas\n" +
"\n" +
"Rumus Volume Limas\n" +
"V =   1/3 ( luas alas  x  t )\n" +
"V         :  volume limas\n" +
"t          :  tinggi limas");
            ta.setText(super.getJelas());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sisi = new javax.swing.JTextField();
        tinggi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        volume = new javax.swing.JTextField();
        luas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Limas Segiempat");

        jLabel2.setText("Masukkan Panjang Sisi");

        jLabel3.setText("Masukkan Tinggi");

        jLabel9.setText("Luas");

        jLabel10.setText("Volume");

        sisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisiActionPerformed(evt);
            }
        });
        sisi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sisiKeyTyped(evt);
            }
        });

        tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinggiActionPerformed(evt);
            }
        });
        tinggi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tinggiKeyTyped(evt);
            }
        });

        jButton1.setText("Hasil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        volume.setEditable(false);
        volume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeActionPerformed(evt);
            }
        });

        luas.setEditable(false);
        luas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luasActionPerformed(evt);
            }
        });

        jLabel11.setText("Penjelasan");

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104))
                        .addComponent(tinggi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(luas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(sisi, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(luas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sisiActionPerformed

    private void tinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinggiActionPerformed

    private void volumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volumeActionPerformed

    private void luasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luasActionPerformed

    private void sisiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sisiKeyTyped
           if(Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka"); 
      }
    }//GEN-LAST:event_sisiKeyTyped

    private void tinggiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tinggiKeyTyped
         if(Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka"); 
      }
    }//GEN-LAST:event_tinggiKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(sisi.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(null, "Maaf ada form yang belum terisi");  
        }
 else if(tinggi.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(null, "Maaf ada form yang belum terisi");  
        }
      
        bangun a = new bangun();
    a.tampil();
    Inisial i = new bangun();
    i.luas();
    i.volume();
    
    sisi.setText("");
    tinggi.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField luas;
    private javax.swing.JTextField sisi;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tinggi;
    private javax.swing.JTextField volume;
    // End of variables declaration//GEN-END:variables
}
