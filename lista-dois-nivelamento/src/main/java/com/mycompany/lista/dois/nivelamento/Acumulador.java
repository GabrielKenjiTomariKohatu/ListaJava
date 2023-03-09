/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.dois.nivelamento;

import java.util.Scanner;

/**
 *
 * @author Gabriel Kohatu
 */
public class Acumulador {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer soma = 0;
        
        Integer numeroDigitado;
        do {
            System.out.println("Escreva um número: ");
            numeroDigitado = leitor.nextInt();
            soma += numeroDigitado;
            
        } while(numeroDigitado != 0);
        
        System.out.println(String.format("A soma dos números é %d", soma));
    }
}
