/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.Controlador;
import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Cuenta;
import ec.edu.ups.modelo.Accion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NANCY
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    static public ImageIcon cajeroImg = new ImageIcon("src/Imagenes/cajero.jpg");
    static public ImageIcon clienteImg = new ImageIcon("src/Imagenes/cliente.png");
    static public ImageIcon puertaImg = new ImageIcon("src/Imagenes/Captura.PNG");
    private ControladorCliente controlador;
    private Accion imagen;
    private Accion imagen2;
    int ubicacionx;
    int ubicaciony;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.controlador= new ControladorCliente();
        this.imagen= new Accion();
        this.imagen2= new Accion();
        jLabel1.setIcon(cajeroImg);
        jLabel2.setIcon(cajeroImg);
        jLabel3.setIcon(cajeroImg);
        jLabel4.setIcon(puertaImg);
        jLabel14.setIcon(clienteImg);
        jLabel5.setIcon(clienteImg);
        jLabel6.setIcon(clienteImg);
        jLabel7.setIcon(clienteImg);
        jLabel8.setIcon(clienteImg);
        jLabel9.setIcon(clienteImg);
        jLabel10.setIcon(clienteImg);
        jLabel11.setIcon(clienteImg);
        jLabel12.setIcon(clienteImg);
        jLabel13.setIcon(clienteImg);  
        ubicacionx= jLabel14.getX();
        ubicaciony= jLabel14.getY();  
    }
    
    public void cargarDatos() {
       DefaultTableModel modeloTabla = (DefaultTableModel) tblDatos.getModel();

        modeloTabla.setRowCount(0);
        for (Cliente vehiculo : controlador.getListaGenerica()) {
            Object[] rowData = {vehiculo.getId(),vehiculo.getCuenta().getSaldo()};
            modeloTabla.addRow(rowData);
        }
        tblDatos.setModel(modeloTabla);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero Cliente", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(399, 399, 399)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);
        boolean[] cajeros = new boolean[3];
        imagen= new Accion(14, jLabel14, cajeros);
        imagen2= new Accion(5, jLabel5, cajeros);
        Accion imagen3 = new Accion(6, jLabel6, cajeros);
        Thread hilo2= new Thread(imagen);
        Thread hilo3= new Thread(imagen2);
        Thread hilo4= new Thread(imagen3);
        //hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        for (int i = 0; i < 100; i++) {
            Cuenta cuenta = new Cuenta (100);
            Cliente cliente = new Cliente(i, cuenta,0);
            controlador.create(cliente);  
            //ventanaPrincipal.modelo.setValueAt(cliente, i, cliente.getCuenta().getSaldo());
            //System.out.println(cliente);
            cargarDatos();
        }
        controlador.getListaGenerica().stream().map(c -> {
            if(c.getId()<40){
                Cliente ingresa = new Cliente(c.getId(),c.getCuenta(), 100);
                Thread hilosIngresan100= new Thread(ingresa);
                hilosIngresan100.start();
                controlador.update(ingresa);
                //ventanaPrincipal.modelo.setValueAt(c, c.getId(), c.getCuenta().getSaldo());
                cargarDatos();

            }
            return c;
        }).map(c -> {
            if(c.getId()>39 && c.getId()<60){
                Cliente ingresa = new Cliente(c.getId(),c.getCuenta(), 50);
                Thread hilosIngresan50= new Thread(ingresa);
                hilosIngresan50.start();
                controlador.update(ingresa);
                //ventanaPrincipal.modelo.setValueAt(c, c.getId(), c.getCuenta().getSaldo());
                cargarDatos();

            }
            return c;
        }).map(c -> {
            if(c.getId()>59){
                Cliente ingresa = new Cliente(c.getId(),c.getCuenta(), 20);
                Thread hilosIngresan20= new Thread(ingresa);
                hilosIngresan20.start();
                controlador.update(ingresa);
                //ventanaPrincipal.modelo.setValueAt(c, c.getId(), c.getCuenta().getSaldo());
                cargarDatos();

            }
            return c;
        }).filter(c -> (c.getId()>39 && c.getId()<60)).map(c -> new Cliente(c.getId(),c.getCuenta(), 20)).map(ingresa -> new Thread(ingresa)).map(hilosIngresan20 -> {
            hilosIngresan20.start();
            return hilosIngresan20;
        }).forEachOrdered(_item -> {
            //ventanaPrincipal.modelo.setValueAt(c, c.getId(), c.getCuenta().getSaldo());
            cargarDatos();
        });
        controlador.getListaGenerica().forEach(cliente -> {
            System.out.println(cliente);
        });
        controlador.getListaGenerica().stream().map(c -> {
            if(c.getId()<40){
                Cliente retirar = new Cliente(c.getId(),c.getCuenta(), -100);
                Thread hilosIngresan100= new Thread(retirar);
                hilosIngresan100.start();
                controlador.update(retirar);
                //ventanaPrincipal.modelo.setValueAt(c, c.getId(), c.getCuenta().getSaldo());
                cargarDatos();

            }
            return c;
        }).map(c -> {
            if(c.getId()>39 && c.getId()<60){
                Cliente retirar = new Cliente(c.getId(),c.getCuenta(), -50);
                Thread hilosIngresan50= new Thread(retirar);
                hilosIngresan50.start();
                controlador.update(retirar);
                //ventanaPrincipal.modelo.setValueAt(c, c.getId(), c.getCuenta().getSaldo());
                cargarDatos();

            }
            return c;
        }).map(c -> {
            if(c.getId()>59){
                Cliente retirar = new Cliente(c.getId(),c.getCuenta(), -20);
                Thread hilosIngresan20= new Thread(retirar);
                hilosIngresan20.start();
                controlador.update(retirar);
                //ventanaPrincipal.modelo.setValueAt(c, c.getId(), c.getCuenta().getSaldo());
                cargarDatos();

            }
            return c;
        }).filter(c -> (c.getId()>39 && c.getId()<60)).map(c -> new Cliente(c.getId(),c.getCuenta(), -20)).forEachOrdered(retirar -> {
            Thread hilosIngresan20= new Thread(retirar);
            hilosIngresan20.start();
            controlador.update(retirar);
            //ventanaPrincipal.modelo.setValueAt(c, c.getId(), c.getCuenta().getSaldo());
            cargarDatos();
        });
        controlador.getListaGenerica().forEach(cliente -> {
            System.out.println(cliente);
        });
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
