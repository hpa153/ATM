
import java.text.DecimalFormat;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong Anh Hoang
 */
public class frmSaoKe extends javax.swing.JFrame {

    private double soTien = 0;
    private String hoTen = "";
    private String soTK = "";
    private String noiDung = "";
    private double soDu = 0;

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    
    /**
     * Creates new form frmSaoKe
     */
    public frmSaoKe() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSaoKe = new javax.swing.JTextArea();
        btnKhong = new javax.swing.JButton();
        btnCo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102), 3));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("Do you want to print the invoice?");

        txtSaoKe.setBackground(new java.awt.Color(255, 250, 250));
        txtSaoKe.setColumns(20);
        txtSaoKe.setForeground(new java.awt.Color(51, 0, 102));
        txtSaoKe.setRows(5);
        jScrollPane1.setViewportView(txtSaoKe);

        btnKhong.setBackground(new java.awt.Color(255, 200, 210));
        btnKhong.setForeground(new java.awt.Color(51, 0, 102));
        btnKhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancel icon.png"))); // NOI18N
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        btnCo.setBackground(new java.awt.Color(255, 200, 210));
        btnCo.setForeground(new java.awt.Color(51, 0, 102));
        btnCo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OK.png"))); // NOI18N
        btnCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCo)
                    .addComponent(btnKhong))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                switch(noiDung){
            case "Rut tien":{
                txtSaoKe.setText(
                "\n\n\n       ***************************************************\n"
                + "            Quý khách đã rút tiền thành công"
                + "\n       ***************************************************\n"
                + "\n              Chi tiết:"
                + "\n              Số tiền: $" + soTien
                + "\n              Nội dung: Rut tien\n"
                + "\n       ***************************************************\n"
                + "\n              Số dư trong tài khoản là: $" + soDu + "\n"
                + "\n       ***************************************************\n"
                + "\n   Cảm ơn quý khách đã sử dụng dich vụ của PA Bank");
                txtSaoKe.setEditable(false);
                break;
            }
            case "Nap tien":{
                txtSaoKe.setText(
                "\n\n\n       ***************************************************\n"
                + "            Quý khách đã nạp tiền thành công"
                + "\n       ***************************************************\n"
                + "\n              Chi tiết:"
                + "\n              Số tiền: $" + soTien
                + "\n              Nội dung: Nap tien\n"
                + "\n       ***************************************************\n"
                + "\n              Số dư trong tài khoản là: $" + soDu + "\n"
                + "\n       ***************************************************\n"
                + "\n   Cảm ơn quý khách đã sử dụng dich vụ của PA Bank");
                txtSaoKe.setEditable(false);
                break;
            }
            default:{
                txtSaoKe.setText(
                "\n       ***************************************************\n"
                + "         Quý khách đã chuyển khoản thành công"
                + "\n       ***************************************************\n"
                + "\n              Chi tiết:"
                + "\n              Số tiền: $" + soTien
                + "\n              Đến: " + hoTen
                + "\n              Số tài khoản: " + soTK 
                + "\n              Nội dung: " + noiDung + "\n"
                + "\n       ***************************************************\n"
                + "\n              Số dư trong tài khoản là: $" + soDu + "\n"
                + "\n       ***************************************************\n"
                + "\n   Cảm ơn quý khách đã sử dụng dich vụ của PA Bank");
                txtSaoKe.setEditable(false);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoActionPerformed
        JFileChooser chooser = new JFileChooser();
        if(chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            String noiDung = txtSaoKe.getText();
            String duongDan = chooser.getSelectedFile().getAbsolutePath();
            GiaoDich.xuatSaoKe(duongDan, noiDung);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnCoActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnKhongActionPerformed

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
            java.util.logging.Logger.getLogger(frmSaoKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSaoKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSaoKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSaoKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSaoKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCo;
    private javax.swing.JButton btnKhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtSaoKe;
    // End of variables declaration//GEN-END:variables
}
