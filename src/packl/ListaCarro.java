
package packl;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.util.List;
import javax.swing.JScrollPane;

public class ListaCarro extends javax.swing.JFrame {

    private JTextArea textArea;
    
    public ListaCarro(List<Carro> carros) {
        initComponents(carros);
    }
     private void initComponents(List<Carro> carros) {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        textArea = new JTextArea(20, 40);
        textArea.setEditable(false);
        textArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        JScrollPane scrollPane = new JScrollPane(textArea);

        for (Carro carro : carros) {
            textArea.append("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno() + ", Possui som: " + (carro.isSom() ? "Sim" : "Não") + "\n");
        }

        add(scrollPane);

        pack();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Suponha que você tenha uma lista de carros chamada "carros"
                List<Carro> carros = new ArrayList<>();
                new ListaCarro(carros).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}