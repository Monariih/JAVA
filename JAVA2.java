package com.mycompany.java2;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Monariih
 */

public class JAVA2 {

    public static void main(String[] args) {
        
        System.out.println("Olá Mundo!");
        
        int numeros; //int é usado para numeros exatos.
        
        double pi; //double ultizidado para numeros decimais.
        
        float semestre; // float tambem é usado para decimais, mas com menos casas.
        
        String nome; // String é ultilizado apenas para caracteres alfabéticos
        
        boolean trabalhando; // boolean ultilizado apenas para true/false.
                
        numeros = 21;
                
        pi = 3.141521;
        
        semestre = (float) 2.1;
        
        nome = "Lucas Monari";
        
        trabalhando = false;
        
        System.out.println("Eu sou " +nome+ " Meu primeiro programa em JAVA ");   
        
        System.out.println("Atualmente tenho "+numeros+" anos de idade e estou cursando o "+semestre+" semestre da faculdade.");
        
    String seunome;
    
        seunome = JOptionPane.showInputDialog("Qual o seu nome? ");
        
        System.out.println("Olá "+seunome+" seja muito bem vindo ao meu segundo programa em JAVA :)");
        
        Scanner entrada = new Scanner(System.in);
        int idade;
        
        System.out.println("Quantos anos você tem?");
        idade = entrada.nextInt();
        
        if (idade < 18) {
        
        System.out.println("Menor de idade não use drogas.");
        
        }
        
        else {
            
            System.out.println("Já ta de maior cuidado com a SPIN.");
            
        }

                     
    }
}