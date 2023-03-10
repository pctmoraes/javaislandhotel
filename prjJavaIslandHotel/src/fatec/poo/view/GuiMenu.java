package fatec.poo.view;
import fatec.poo.model.Pessoa;
import fatec.poo.model.QuartoHotel;
import java.util.ArrayList;

//@author paula.moraes

public class GuiMenu extends javax.swing.JFrame {

    //Creates new form GuiMenu

    public GuiMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemQuarto = new javax.swing.JMenuItem();
        jMenuItemAtendente = new javax.swing.JMenuItem();
        jMenuItemHospede = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemReservarLiberar = new javax.swing.JMenuItem();
        jMenuItemAvaliacao2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel POO");

        jMenuCadastro.setText("Cadastro");

        jMenuItemQuarto.setText("Quarto");
        jMenuItemQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemQuarto);

        jMenuItemAtendente.setText("Atendente");
        jMenuItemAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtendenteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAtendente);

        jMenuItemHospede.setText("Hóspede");
        jMenuItemHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHospedeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemHospede);

        jMenuBar1.add(jMenuCadastro);

        jMenuRegistro.setText("Registro");

        jMenuItemReservarLiberar.setText("Reservar/Liberar");
        jMenuItemReservarLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservarLiberarActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemReservarLiberar);

        jMenuItemAvaliacao2.setText("Avaliação 2");
        jMenuItemAvaliacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAvaliacao2ActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemAvaliacao2);

        jMenuBar1.add(jMenuRegistro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtendenteActionPerformed
        new GuiCadastroAtendente(cadastro).setVisible(true);
    }//GEN-LAST:event_jMenuItemAtendenteActionPerformed

    private void jMenuItemQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuartoActionPerformed
        new GuiCadastroQuarto(quartoHotel).setVisible(true);
    }//GEN-LAST:event_jMenuItemQuartoActionPerformed

    private void jMenuItemHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHospedeActionPerformed
        new GuiCadastroHospede(cadastro).setVisible(true);
    }//GEN-LAST:event_jMenuItemHospedeActionPerformed

    private void jMenuItemReservarLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservarLiberarActionPerformed
        new GuiReservarLiberar(cadastro, quartoHotel).setVisible(true);
    }//GEN-LAST:event_jMenuItemReservarLiberarActionPerformed

    private void jMenuItemAvaliacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAvaliacao2ActionPerformed
        new GuiAvaliacao2(quartoHotel).setVisible(true);
    }//GEN-LAST:event_jMenuItemAvaliacao2ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemAtendente;
    private javax.swing.JMenuItem jMenuItemAvaliacao2;
    private javax.swing.JMenuItem jMenuItemHospede;
    private javax.swing.JMenuItem jMenuItemQuarto;
    private javax.swing.JMenuItem jMenuItemReservarLiberar;
    private javax.swing.JMenu jMenuRegistro;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Pessoa> cadastro = new ArrayList<Pessoa>();
    private ArrayList<QuartoHotel> quartoHotel = new ArrayList<QuartoHotel>();
}
