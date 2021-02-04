package org.jh.mavenshadeplugintest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Julian
 */
public class MainGUI extends javax.swing.JFrame {
    
    public MainGUI() {
        initComponents();
        BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemClassLoader().getResourceAsStream("test.txt")));
        br.lines().forEach(s -> textArea.append(s + "\n"));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shade");

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        getContentPane().add(textArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
