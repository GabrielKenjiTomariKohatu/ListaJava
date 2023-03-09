/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Gabriel Kohatu
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        // No Java temos a classe Math.random
        // Mas precisamos criar objeto 
        
        Integer numeroInteiroAleatorio =
                ThreadLocalRandom.current().nextInt(1,101);
        System.out.println("Aleatório inteiro: " + numeroInteiroAleatorio);
        
        Double numeroDoubleAleatorio =
                ThreadLocalRandom.current().nextDouble(1,101);
        System.out.println(String.format("Aleatório inteiro: %.3f", numeroDoubleAleatorio));
    }
}
