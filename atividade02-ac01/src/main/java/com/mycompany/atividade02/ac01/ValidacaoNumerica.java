/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

/**
 *
 * @author Gabriel Kohatu
 */
public class ValidacaoNumerica {
    void verificarPrimo(Integer numeroInteiro) {
        
        
        int numDivisores = 0;
        
        for (int i = 1; i <= numeroInteiro; i++) {
            
           if(numeroInteiro % i ==0 ) {
               numDivisores++;
           }
         
        }
        
        String frase;
        if (numDivisores == 2) {
           frase = "É primo";
        } else {
            frase= "Não é primo";
        }
                
        System.out.println(frase);
    }
}

