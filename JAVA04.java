package com.mycompany.java04;

import javax.swing.JOptionPane;
/**
 *
 * @author Monariih
 */
public class JAVA04 {

    public static void main(String[] args) {
        
        double precoBtc = 110.34775;
        
        
        JOptionPane.showMessageDialog(null, "Bem vindo a estação de compras de BITCOIN");
        
        String nomeCliente = JOptionPane.showInputDialog("Para começar preciso que me informe o seu nome: ");
        
        String emailCliente = JOptionPane.showInputDialog("Agora o e-mail: ");
        
        JOptionPane.showMessageDialog(null, "O preço do BITCOIN atualmente está " +precoBtc+ " BRL$");
        
        int opcaoCompra = JOptionPane.showConfirmDialog(null, "Deseja prosseguir com a compra?");
        
        
        // Opção 0 == Sim
        if (opcaoCompra == 0){
            
            float qtdBtc = Float.parseFloat(JOptionPane.showInputDialog("Inoforme abaixo a quantidade de BITCOINS que deseja: "));
            
            float prcTotal = (float) (qtdBtc * precoBtc);
            
            JOptionPane.showMessageDialog(null, "Valor total "+prcTotal);
            
            int confCompra = JOptionPane.showConfirmDialog(null, "Para prosseguir com a compra aceite os termos e condições. ");
            
            if (confCompra == 0){
                
                String nomeCardClient = JOptionPane.showInputDialog("Insira o nome como está escrito no seu cartão de crédito: ");
                
                String numCardClient = JOptionPane.showInputDialog(null, "Agora adicione apenas 16 dígitos do cartão ");
                
                int finalCompra = JOptionPane.showConfirmDialog(null, "Deseja finalizar a compra? ");
                
                if (finalCompra == 0){
                    
                    JOptionPane.showMessageDialog(null, "Parabens " +nomeCliente+ " a sua compra de " +qtdBtc+ " BITCOINS foi realizada com sucesso");
                    
                    JOptionPane.showMessageDialog(null, nomeCliente+ " um e-mail com os dados foi enviado para " +emailCliente+ " Obrigado por comprar conosco :)");
                    
                     
                }
                
                 
            }
            
        } 
        // Ultilizado para finalizar a aplicação
        else{
            
            JOptionPane.showMessageDialog(null, "Obrigado " + nomeCliente + " por ultilizar a nossa aplicação, até breve!");
            
        }
            
        
                        
    }
}
