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
public class Persegi extends javax.swing.JPanel {

    /**
     * Creates new form Persegi
     */
    public Persegi() {
        initComponents();
    }
     DecimalFormat df = new DecimalFormat("0.00");
    
    public class datar extends abstrak{
    @Override
    public void luas()
    {
        double jumlah;
        setSisi(Double.parseDouble(sisi.getText()));
           jumlah =Math.pow(getSisi(), 2);
        luas.setText(df.format(jumlah));
        
    }
    public void keliling()
    {
         double jumlah;
        setSisi(Double.parseDouble(sisi.getText()));
        jumlah = getSisi()*4;
       keliling.setText(df.format(jumlah));
    }
    void tampil()
    {
        super.setJelas("Persegi adalah bangun datar dua dimensi yang dibentuk oleh empat buah rusuk yang sama panjang dan memiliki empat buah sudut siku-siku."+"\n Sifat Persegi:\n" +
"\n" +
"Mempunyai 4 titik sudut.\n" +
"Mempunyai 4 sudut siku-siku 90⁰.\n" +
"Mempunyai 2 diagonal yang sama panjang.\n" +
"Mempunyai 4 simetri lipat.\n" +
"Mempunyai 4 simetri puta"+ "\n Bangun persegi memiliki 4 buah simetri putar dan 4 buah simetri lipat.\n" +
"\n\n" +
"Rumus :\n" +
"\n" +
"Keliling : 4 x s\n" +
"Luas : s x s (s2)\n" +
"Keterangan: S = sisi.");
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sisi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        keliling = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        luas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Persegi");

        jLabel2.setText("Masukkan Sisi");

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

        jButton1.setText("Hasil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        keliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelilingActionPerformed(evt);
            }
        });

        jLabel4.setText("Keliling");

        jLabel5.setText("Luas");

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jLabel6.setText("Penjelasan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sisi, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(keliling)
                                        .addComponent(luas, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                    .addComponent(jLabel6))))
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(keliling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(luas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sisiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       if(sisi.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(null, "Maaf ada form yang belum terisi");  
        }
        datar b = new datar();
         b.tampil();
        abstrak a = new datar();
        a.keliling();
        a.luas();
      
        sisi.setText("");
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelilingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelilingActionPerformed

    private void sisiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sisiKeyTyped
        if(Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka"); 
      }
    }//GEN-LAST:event_sisiKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keliling;
    private javax.swing.JTextField luas;
    private javax.swing.JTextField sisi;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
