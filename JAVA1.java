package com.mycompany.java1;

import javax.swing.JOptionPane;

/**
 *
 * @author Monariih
 */

public class JAVA1 {

    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        
        int idade; //int é usado para numeros exatos.
        
        double pi; //double ultizidado para numeros decimais.
        
        float semestre; // float tambem é usado para decimais, mas com menos casas.
        
        String nome; // String é ultilizado apenas para caracteres alfabéticos
        
        boolean trabalhando; // boolean ultilizado apenas para true/false.
                
        idade = 21;
                
        pi = 3.141521;
        
        semestre = (float) 2.1;
        
        nome = "Lucas Monari";
        
        trabalhando = false;
        
        System.out.println("Eu sou " +nome+ " Meu primeiro programa em JAVA ");   
        
        System.out.println("Atualmente tenho "+idade+" anos de idade e estou cursando o "+semestre+" semestre da faculdade.");
        
    String seunome;
    
        seunome = JOptionPane.showInputDialog("Qual o seu nome? ");
        
        System.out.println("Olá "+seunome+" seja muito bem vindo ao meu primeiro programa em JAVA :)");
        
    }
}
