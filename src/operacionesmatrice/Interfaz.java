/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package operacionesmatrice;

import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    int[][] matriz;
    int[][] matriz1;
    int traza, determinante, columnas, filas, contador;

    public Interfaz() {
        initComponents();
    }

    public void guardar() {
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columnas"));
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese filas"));
        if (columnas != filas) {
            JOptionPane.showMessageDialog(null, "Solo matrices n*n");
            System.exit(0);
        } else {
            int mat[][] = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la fila" + i + "De la columna " + j + ":"));
                    Ver.append(String.valueOf(" " + mat[i][j]));
                }
                Ver.append(String.valueOf("\n"));
            }
            Ver.append(String.valueOf("\n"));
            int mat1[][] = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    mat1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la fila" + i + "De la columna " + j + ":"));
                    Ver.append(String.valueOf(" " + mat1[i][j]));
                }
                Ver.append(String.valueOf("\n"));
            }
            int sumaM[][] = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    sumaM[i][j] = mat[i][j] + mat1[i][j];
                }
            }
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    Ver1.append(String.valueOf(" " + mat[i][j] + " + " + mat1[i][j] + " = " + sumaM[i][j] + "\n"));
                }

            }
            for (int i = 0; i < filas; i++) {
                Ver1.append(String.valueOf("\n"));
                for (int j = 0; j < columnas; j++) {
                    Ver1.append(String.valueOf(" " + sumaM[i][j]));

                }
            }
        }

    }

    public void guardar1() {
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columnas"));
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese filas"));
        if (columnas != filas) {
            JOptionPane.showMessageDialog(null, "Solo matrices n*n");
            System.exit(0);
        } else {
            int mat[][] = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la fila" + i + "De la columna " + j + ":"));
                    Ver.append(String.valueOf(" " + mat[i][j]));
                }
                Ver.append(String.valueOf("\n"));
            }
            Ver.append(String.valueOf("\n"));
            int mat1[][] = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    mat1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la fila" + i + "De la columna " + j + ":"));
                    Ver.append(String.valueOf(" " + mat1[i][j]));
                }
                Ver.append(String.valueOf("\n"));
            }
            int restaM[][] = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    restaM[i][j] = mat[i][j] - mat1[i][j];
                }
            }
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    Ver1.append(String.valueOf(" " + mat[i][j] + " - " + mat1[i][j] + " = " + restaM[i][j] + "\n"));
                }

            }
            for (int i = 0; i < filas; i++) {
                Ver1.append(String.valueOf("\n"));
                for (int j = 0; j < columnas; j++) {
                    Ver1.append(String.valueOf(" " + restaM[i][j]));

                }
            }
        }
    }

    public void traza() {
        int Traza = 0;
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columnas"));
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese filas"));
        if (columnas != filas) {
            JOptionPane.showMessageDialog(null, "Solo matrices n*n");
            System.exit(0);
        } else {
            int mat[][] = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la fila" + i + "De la columna " + j + ":"));
                    Ver.append(String.valueOf(" " + mat[i][j]));
                }
                Ver.append(String.valueOf("\n"));
            }
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (i == j) {
                        Ver1.append(String.valueOf(" " + mat[i][j]));
                        Traza += mat[i][j];
                    }

                }

            }
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Suma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ver = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Traza = new javax.swing.JButton();
        Determinante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ver1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MATRIZ");

        Suma.setText("Suma de matriz ");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        Ver.setColumns(20);
        Ver.setRows(5);
        jScrollPane1.setViewportView(Ver);

        jButton1.setText("BORRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Resta.setText("Resta de matriz");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Traza.setText("Traza de matriz");
        Traza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrazaActionPerformed(evt);
            }
        });

        Determinante.setText("Determinante de matriz");
        Determinante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeterminanteActionPerformed(evt);
            }
        });

        Ver1.setColumns(20);
        Ver1.setRows(5);
        jScrollPane2.setViewportView(Ver1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Traza)
                            .addComponent(Determinante)
                            .addComponent(Resta)
                            .addComponent(Suma))
                        .addContainerGap(155, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Suma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Resta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Traza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Determinante))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        guardar();
        Ver.append(String.valueOf("\n"));
    }//GEN-LAST:event_SumaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ver.setText(null);
        Ver1.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TrazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrazaActionPerformed
        traza();
    }//GEN-LAST:event_TrazaActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        guardar1();
        Ver.append(String.valueOf("\n"));
    }//GEN-LAST:event_RestaActionPerformed

    private void DeterminanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeterminanteActionPerformed
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension de la matri"));
        int matriz[][] = new int[n][n];
        System.out.println("Ingrese datos");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Matriz [" + i + "}[" + j + "]. ");
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matriz [" + i + "}[" + j + "]. " + matriz[i][j]));
            }
        }
        System.out.println("La determinante de la Matriz es:\t" + determinante(matriz, n));
        Ver1.append(String.valueOf("La determinante de la Matriz es:  \t" + determinante(matriz, n)));
    }

    static void Cofactor(int matriz[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (fila != p && columna != q) {
                    temp[i][j++] = matriz[fila][columna];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    static int determinante(int[][] matriz, int n) {
        int determinante = 0;
        if (n == 1) {
            return matriz[0][0];
        }
        int temp[][] = new int[n][n];
        int multiplicador = 1;
        for (int f = 0; f < n; f++) {
            Cofactor(matriz, temp, 0, f, n);
            determinante += multiplicador * matriz[0][f] * determinante(temp, n - 1);
            multiplicador = -multiplicador;
        }
        return determinante;
    }//GEN-LAST:event_DeterminanteActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Determinante;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Suma;
    private javax.swing.JButton Traza;
    private javax.swing.JTextArea Ver;
    private javax.swing.JTextArea Ver1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
