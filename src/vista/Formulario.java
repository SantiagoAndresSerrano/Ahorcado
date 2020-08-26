/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.SistemaPalabras;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author santi
 */
public class Formulario extends javax.swing.JFrame {

    private SistemaPalabras sistema;
    private String palabraElegida;
    private JTextField[] palabra;
    private JLabel[] guiones;
    private int intentos;

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        this.jButton1.setEnabled(false);

        palabra = new JTextField[0];
        guiones = new JLabel[0];
        this.setSize(700, 700);
        sistema = new SistemaPalabras();

        this.CampoEjemplo.setVisible(false);
        this.GuionEjemplo.setVisible(false);

        sistema.insertarPalabra("gato");
        sistema.insertarPalabra("perro");
        sistema.insertarPalabra("cilindro");
        sistema.insertarPalabra("Silla");
        sistema.insertarPalabra("la casa");
        sistema.insertarPalabra("taladro");
    }

    public void cargarPalabra(String palabra) {

        int numero = CampoEjemplo.getX();
        int numero2 = this.GuionEjemplo.getX();

        this.palabra = new JTextField[palabra.length()];
        this.guiones = new JLabel[palabra.length()];
        
        
        for (int i = 0; i < palabra.length(); i++) {
            if (!String.valueOf(palabra.charAt(i)).equals(" ")) {
                numero += 60;
                numero2 += 60;
                JTextField txt = new JTextField();
                JLabel guion = new JLabel();

                txt.setSize(this.CampoEjemplo.getSize());
                txt.setLocation(numero, CampoEjemplo.getY());

                guion.setSize(this.GuionEjemplo.getSize());
                guion.setLocation(numero2, this.GuionEjemplo.getY());
                txt.setEditable(false);
                guion.setText("_______");
                txt.setText("");
                this.palabra[i] = txt;
                this.guiones[i] = guion;
                
                txt.setFont(new java.awt.Font("Dialog", 1, 30));

                this.add(txt);
                this.add(guion);
            } else {
                numero += 60;
                numero2 += 60;
            }

        }
        this.repaint();
        sistema.insertarPalabra(palabra);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        registrarBtn = new javax.swing.JButton();
        empezarBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        letras = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ahorcado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoEjemplo = new javax.swing.JTextField();
        GuionEjemplo = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ahorcado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 10, 167, 47);

        registrarBtn.setBackground(new java.awt.Color(204, 204, 0));
        registrarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        registrarBtn.setText("Registrar una palabra");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registrarBtn);
        registrarBtn.setBounds(191, 494, 220, 38);

        empezarBtn.setBackground(new java.awt.Color(0, 204, 51));
        empezarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        empezarBtn.setText("Empezar");
        empezarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(empezarBtn);
        empezarBtn.setBounds(191, 451, 220, 38);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        letras.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("intentar!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(letras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(letras, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(222, 273, 167, 160);

        ahorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fase1.png"))); // NOI18N
        getContentPane().add(ahorcado);
        ahorcado.setBounds(440, 220, 210, 260);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Intentos:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 280, 130, 100);
        getContentPane().add(CampoEjemplo);
        CampoEjemplo.setBounds(80, 120, 50, 50);

        GuionEjemplo.setText("________");
        getContentPane().add(GuionEjemplo);
        GuionEjemplo.setBounds(80, 170, 50, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empezarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarBtnActionPerformed

        String palabra = sistema.palabraAzar();
        System.out.println(palabra);
        this.palabraElegida = palabra;
        this.cargarPalabra(palabra);
        this.empezarBtn.setEnabled(false);
        this.jButton1.setEnabled(true);

    }//GEN-LAST:event_empezarBtnActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed

        try {
            String palabra = JOptionPane.showInputDialog(this, "Digite la palabra para que sea almacenada en el sistema");

            if (palabra.length() > 8) {

                JOptionPane.showMessageDialog(this, "No puede ingresar una palabra de mas de 8 digitos");

            } else {

                sistema.insertarPalabra(palabra);

            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_registrarBtnActionPerformed
    public Boolean haGanado() {
        try{
        for (int i = 0; i < this.palabra.length; i++) {
            
            
            if (palabra[i].getText().equals("")) {
                return false;
            }

        }
        }catch(Exception e){
        
        }
        
        return true;
    }

    public void removerLetras() {

        for (int i = 0; i < this.palabra.length; i++) {
            this.remove(palabra[i]);
            this.remove(guiones[i]);
        }

    }
    private int fase = 1;

    public void reiniciarSistema() {

        this.intentos = 0;
        fase = 1;
        this.removerLetras();
        this.empezarBtn.setEnabled(true);
        repaint();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (fase == 5) {
            
            String direccion = "/imagenes/fase" + 6 + ".png";
            ahorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion)));
            JOptionPane.showMessageDialog(this, "Perdiste!");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            }

            reiniciarSistema();
        }

        String letra = this.letras.getText();
        this.intentos++;
        this.jLabel2.setText(intentos + "");

        //
        Boolean encontroPalabra = false;
        if (letra.equals("")) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una letra!");
            return;
        }

        for (int i = 0; i < this.palabra.length; i++) {

            char ltra = palabraElegida.charAt(i);

            if (String.valueOf(ltra).equalsIgnoreCase(letra)) {

                this.palabra[i].setText(ltra + "");
                this.palabra[i].setBackground(Color.GREEN);
                encontroPalabra = true;
            }

        }

        if (haGanado()) {
            JOptionPane.showMessageDialog(this,"HAS GANADO!");
            reiniciarSistema();
        }

        if (encontroPalabra == false) {
            fase++;
            String direccion = "/imagenes/fase" + fase + ".png";
            ahorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion)));
        }

        this.letras.setText("");
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoEjemplo;
    private javax.swing.JLabel GuionEjemplo;
    private javax.swing.JLabel ahorcado;
    private javax.swing.JButton empezarBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField letras;
    private javax.swing.JButton registrarBtn;
    // End of variables declaration//GEN-END:variables
}