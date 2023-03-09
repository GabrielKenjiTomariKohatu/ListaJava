/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.dois.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Gabriel Kohatu
 */
public class Loteria {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva um número de 0 a 10: ");
        Integer numeroDigitado = leitor.nextInt();
        
        Integer numeroRandom = ThreadLocalRandom.current().nextInt(0,10);
        int i = 0;
        
        System.out.println(numeroRandom);
        while( numeroDigitado != numeroRandom) {
            
            System.out.println("Número errado!!! Tente denovo:");
            System.out.println(String.format("Número Random: %d", numeroRandom));
            numeroRandom = ThreadLocalRandom.current().nextInt(0,10);
            
            numeroDigitado = leitor.nextInt();
            i++;
            
        }
        
        if (i <= 3) {
            System.out.println("Você é muito sortudo");
        } else 
            if (i <= 10) {
                System.out.println("Você é sortudo");
            } else {
                System.out.println("É melhor voce parar de apostar e ir trabalhar");
            }
        
    }
}
