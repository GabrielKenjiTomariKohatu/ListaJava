/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author Gabriel Kohatu
 */
public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("for - de 0 a 10");
        
        /*
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("for - de 10 a 0");
        for(int i= 10; i >=0; i--) {
            System.out.println(i);
        }
        
        System.out.println("while - de 0 a 10");
        
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        */
        System.out.println("while - adivinhe o número");
        
        System.out.println("Digite um número: ");
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != 42) {
            System.out.println("!Adivinhe o número: ");
            numeroDigitado = leitor.nextInt();
        }
        
        
        System.out.println("Do while - adivihne o némero");
        
        Integer numeroDigitado2;
        do {
            System.out.println("Adivinhe o número: ");
            numeroDigitado2 = leitor.nextInt();
        }while(numeroDigitado2 != 42);
        
    }
}
