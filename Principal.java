package Imagen1;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
       // initComponents();
        this.setLocationRelativeTo(null); // Centrar pantalla 
    }
                            
  private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {
        Imagen im = new Imagen(jPanel1);
        jPanel1.add(im).repaint();
    }                                              

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   

}
