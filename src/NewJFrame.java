/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabillabsyrl
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNilai = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfAbsen = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 40, 14);

        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 50, 14);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 160, 50, 14);

        jLabel5.setText("Nilai");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 200, 50, 14);

        tfNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNilaiActionPerformed(evt);
            }
        });
        getContentPane().add(tfNilai);
        tfNilai.setBounds(200, 190, 170, 30);

        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });
        getContentPane().add(tfNama);
        tfNama.setBounds(200, 70, 170, 30);
        getContentPane().add(tfAbsen);
        tfAbsen.setBounds(200, 110, 170, 30);

        tfAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(tfAlamat);
        tfAlamat.setBounds(200, 150, 170, 30);

        jLabel6.setText(":");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 80, 4, 14);

        jLabel7.setText(":");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 120, 30, 14);

        jLabel8.setText(":");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 200, 50, 14);

        jLabel9.setText(":");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 160, 50, 14);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        jButton1.setText("PROSES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 140, 110, 23);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 270, 300, 110);

        jLabel1.setText("Form Penilaian");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 20, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-20, 0, 550, 430);

        setBounds(0, 0, 539, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNilaiActionPerformed

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void tfAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAlamatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = tfNama.getText();

        String absen = tfAbsen.getText();

        String alamat = tfAlamat.getText();

        int nilai = Integer.parseInt(tfNilai.getText());

        ta.append("\n"+"Nama  : "+nama+"\n"+"Absen    : "+absen+"\n"+"Alamat  : "+alamat+"\n"+"Nilai  : "+nilai+"\n");

        if(nilai < 74){
            ta.append("Anda Tidak Lulus");
        }
        else if(nilai >=75&& nilai<=85 ){
            ta.append("Anda Lulus");
        }
        else if(nilai >=85 && nilai <=100){
            ta.append("Nilai Anda Sempurna");
        }
        else{
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tfAbsen;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNilai;
    // End of variables declaration//GEN-END:variables
}
