/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao.continuada;

import java.util.Scanner;

/**
 *
 * @author Gabriel Kohatu
 */
public class Calculadora {

    public static void main(String[] args) {
        
    Boolean escolheuSair;
    Integer numeroInteiro = 0;
    
    Scanner leitor = new Scanner(System.in);

        do {

            System.out.println("Digite o número correspondente a operação desejada:\n"
                + "0 - Sair\n1 - Soma\n2 - Multiplicação\n3 - Divisão\n4 - Subtração"
                + "\n5 - Potência\n6 - Resto");

        Integer numeroDigitado = leitor.nextInt();

        escolheuSair = false;
        
        if (numeroDigitado > 0 && numeroDigitado <= 6) {
                    System.out.println("Digite um número inteiro: ");
                    numeroInteiro = leitor.nextInt();
                }
        
        switch (numeroDigitado) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    Integer soma = numeroInteiro + i;
                    System.out.println(String.format("%d + %d = %d", 
                            numeroInteiro, i, soma));
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    Integer multiplicacao = numeroInteiro * i;
                    System.out.println(String.format("%d x %d = %d", 
                            numeroInteiro, i, multiplicacao));
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    Integer divisao = numeroInteiro % i;
                    System.out.println(String.format("%d / %d = %d", 
                            numeroInteiro, i, divisao));
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    Integer subtracao = numeroInteiro - i;
                    System.out.println(String.format("%d - %d = %d", 
                            numeroInteiro, i, subtracao));
                }
                break;
            case 5:
                Integer potencia = 1;
                for (int i = 1; i <= 10; i++) {
                    potencia *= numeroInteiro;
                    System.out.println(String.format("%d elevado à %d = %d", 
                            numeroInteiro, i, potencia));
                }
                break;
            case 6:
                for (int i = 1; i <= 10; i++) {
                    Integer resto = numeroInteiro % i;
                    System.out.println(String.format("Resto de %d por %d é de: %d", 
                            numeroInteiro, i, resto));
                }
                break;
            case 0:
                escolheuSair = true;
                System.out.println("Até logo!");
                break;
            default:
                if (numeroDigitado < 0 || numeroDigitado > 6) {
                    System.out.println("Opção inválida, tente novamente");
                }
        }
    }
    while (escolheuSair 
!= true);
    }
}
