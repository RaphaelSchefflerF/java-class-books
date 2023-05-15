/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.correcaoap2;
import java.util.ArrayList;
/**
 *
 * @author pcrap
 */
public class Relatorio extends javax.swing.JFrame {
        ArrayList<Autor> autores = new ArrayList();
        ArrayList<Livro> livros = new ArrayList();
        ArrayList<Categoria> categoria = new ArrayList();
        ArrayList<Formato> formato = new ArrayList();

    public Relatorio() {
        initComponents();
        noCodigo();
    }
    
    public void noCodigo(){
        
        categoria.add(new Categoria("Romance",12));
        categoria.add(new Categoria("Suspense",13));
        categoria.add(new Categoria("Ficção",14));
 
        formato.add(new Formato("PDF", 00));
        formato.add(new Formato("HTML", 01));
        formato.add(new Formato("TXT", 02));
        
        autores.add(new Autor("000.000.000-01","Maria","000 : 001"));
        autores.add(new Autor("000.000.000-02", "João", "000 : 002"));
        autores.add(new Autor("000.000.000-03", "Pedro","000 : 003"));
        autores.add(new Autor("000.000.000-04","Raphael","000 : 004"));
        autores.add(new Autor("000.000.000-05", "Madia", "000 : 005"));
        
        livros.add(new Livrofisico(categoria.get(1),true,"isbn0","Pé de Carne",110,10,autores.get(2))); 
        livros.add(new Livrofisico(categoria.get(2),true,"isbn0","Pé de Frango",120,20,autores.get(1)));
        livros.add(new Livrofisico(categoria.get(0),false,"isbn0","Pé de Porco",130,30,autores.get(0)));
        
        livros.add(new Ebook(formato.get(0),110,"isbn0","Pé de AAA",10,40,autores.get(0)));
        livros.add(new Ebook(formato.get(1),120,"isbn2","Pé de BBB",30,50,autores.get(2)));
        livros.add(new Ebook(formato.get(2),130,"isbn3","Pé de CCC",20,60,autores.get(1)));
    }
    
    
    
    
    
    
    
    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        jButton1.setText("Relatorio 1 Quantidade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Relatorio 2 Por Autor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Autor:");

        jButton3.setText("Relatorio 3 Por Tipo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        taSaida.setText(null);
        String F = "Livro Fisico: \n";
        String E = "Livro Ebook: \n";
        int contF = 0;
        int contE = 0;
        
        for (Livro livro: livros){
            if (livro instanceof Livrofisico){
                F += livro.getAutor().getNome()+" - " + livro.getTitulo()+" - " + livro.calvalor()+"\n";
                contF ++;
            }
            else{
                E += livro.getAutor().getNome()+" - " + livro.getTitulo()+" - " + livro.calvalor()+"\n";
                contE ++;
            }    
        }
        
        F+="Quantidade Livros Fisicos:" + contF+"\n";
        E+="Quantidade Ebooks:"+ contE+"\n";
        
        taSaida.setText(F+E+"\n"+ "Total de Livros: "+(contE+contF));
            


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        taSaida.setText(null);
        int contAutor = 0;
        String strLivros ="Nome Autor: "+tfNome.getText()+"\n";
        
        for (Livro i : livros){
           if (tfNome.getText().equalsIgnoreCase(i.getAutor().getNome())){
               if (i instanceof Livrofisico){
                   strLivros += i.getTitulo()+ " - " + "Fisico - "+ i.calvalor()+"\n";
               }
               else{
                   strLivros += i.getTitulo()+ " - " + "Ebook - " + i.calvalor()+"\n";
               }  
               contAutor ++;
           }
//           else{
//               strLivros+= "Não existe esse Livros para esse Autor";
//           }  
       }
       
       taSaida.setText(strLivros + "Quantiade de Livros:" + contAutor);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        taSaida.setText(null);
        
        for (Livro i : livros){
            if (i instanceof Livrofisico){
                taSaida.append("Fisico -" +i.calvalor()+ "-"+ i.getTitulo()+ "\n");
            }
            else{
                taSaida.append("Ebook -" +i.calvalor()+ "-"+ i.getTitulo()+ "\n");
            }

               
        }
           
        
    
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
