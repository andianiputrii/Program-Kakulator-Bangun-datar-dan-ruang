package bangun;

import javax.swing.JOptionPane;

public class Balok extends javax.swing.JPanel {

    public Balok() {
        initComponents();
    }

    private class bangun extends Inisial {

        @Override
        void volume() {
            setSisi(Double.parseDouble(panjang.getText()));
            setSisi1(Double.parseDouble(lebar.getText()));
            setSisi2(Double.parseDouble(tinggi.getText()));
            double all = getSisi() * getSisi1() * getSisi2();
            volume.setText(Double.toString(all));
        }

        @Override
        void luas() {
            setSisi(Double.parseDouble(panjang.getText()));
            setSisi1(Double.parseDouble(lebar.getText()));
            setSisi2(Double.parseDouble(tinggi.getText()));
            double all = 2 * ((getSisi1() * getSisi2()) + (getSisi() * getSisi1()) + (getSisi() * getSisi2()));
            luas.setText(Double.toString(all));
        }

        void tampil() {
            super.setJelas("Merupakan bangun yang dibatasi oleh 6 sisi yang mempunyai ukuran panjang dan lebar\n"
                    + "\n"
                    + "Ciri-ciri BALOK,antara lain:\n"
                    + "Ø  Balok merupakan bangun ruang yang dibatasi 6 persegi panjang dimana 3 persegi panjang kongruen,\n"
                    + "Ø  Balok mempunyai 6 sisi berbentuk persegi panjang,\n"
                    + "Ø  Balok mempunyai 3 pasang bidang sisi berhadapan yang kongruen,\n"
                    + "Ø  Balok mempunyai 12 rusuk,\n"
                    + "Ø  4 buah rusuk yang sejajar sama panjang,\n"
                    + "Ø  Balok mempunyai 8 titik sudut,\n"
                    + "Ø  Jaring-jaring balok berupa 6 buah persegi panjang.\n"
                    + "\n"
                    + "Rumus Luas Permukaan Balok\n"
                    + "L  =  2 x [ (p x l) + (p x t) + (l x t) ]\n"
                    + "L   :  luas permukaan\n"
                    + "p   :  panjang balok\n"
                    + "l    :  lebar balok\n"
                    + "t    :  tinggi balok\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "Rumus Volume Balok\n"
                    + "V  =  p x l x t\n"
                    + "      V     :  volume balok\n"
                    + "      p     :  panjang balok\n"
                    + "      l      :  lebar balok\n"
                    + "      t      :  tinggi balok");
            ta.setText(super.getJelas());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lebar = new javax.swing.JTextField();
        panjang = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        luas = new javax.swing.JTextField();
        tinggi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        volume = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Balok");

        jLabel2.setText("Masukkan Panjang");

        jLabel3.setText("Masukkan Lebar");

        jLabel4.setText("Luas");

        jLabel5.setText("Volume");

        lebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lebarActionPerformed(evt);
            }
        });
        lebar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lebarKeyTyped(evt);
            }
        });

        panjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panjangActionPerformed(evt);
            }
        });
        panjang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                panjangKeyTyped(evt);
            }
        });

        jButton1.setText("Hasil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Penjelasan");

        luas.setEditable(false);
        luas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luasActionPerformed(evt);
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

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jLabel7.setText("Masukkan Tinggi");

        volume.setEditable(false);
        volume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(luas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lebar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panjang, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(panjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lebarActionPerformed

    private void panjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panjangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (panjang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Maaf ada form yang belum terisi");
        } else if (tinggi.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Maaf ada form yang belum terisi");
        } else if (lebar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Maaf ada form yang belum terisi");
        }
        bangun a = new bangun();
        a.tampil();
        Inisial i = new bangun();
        i.luas();
        i.volume();
        panjang.setText("");
        lebar.setText("");
        tinggi.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void luasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luasActionPerformed

    private void tinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinggiActionPerformed

    private void volumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volumeActionPerformed

    private void panjangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panjangKeyTyped
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka");
        }
    }//GEN-LAST:event_panjangKeyTyped

    private void lebarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lebarKeyTyped
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka");
        }
    }//GEN-LAST:event_lebarKeyTyped

    private void tinggiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tinggiKeyTyped
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka");
        }
    }//GEN-LAST:event_tinggiKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lebar;
    private javax.swing.JTextField luas;
    private javax.swing.JTextField panjang;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tinggi;
    private javax.swing.JTextField volume;
    // End of variables declaration//GEN-END:variables
}
