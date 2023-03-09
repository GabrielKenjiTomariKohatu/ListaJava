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
public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 100: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer numeroInteiroAleatorio =
                ThreadLocalRandom.current().nextInt(1,101);
        
        String numeroPosicao = "";
        Integer numeroP = 1;
        Integer Par = 0;
        Integer Impar = 0;
        for(int i = 1; i <= 200;i++) {
            
            if (numeroInteiroAleatorio == numeroDigitado && numeroP == 1) {
                numeroPosicao = "Posicao: " + i;
                numeroP += 1;
            }
            
            if (numeroInteiroAleatorio % 2 == 0) {
                Par++;
            } else {
                Impar++;
            } 
            
            numeroInteiroAleatorio = ThreadLocalRandom.current().nextInt(1,101);
        }
        
        System.out.println(numeroPosicao);
        System.out.println(String.format("Quantidades de números pares: %d", Par));
        System.out.println(String.format("Quantidades de números impares: %d", Impar));
    }
}
