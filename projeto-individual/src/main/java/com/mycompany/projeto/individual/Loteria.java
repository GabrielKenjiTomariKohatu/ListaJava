/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.individual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Gabriel Kohatu
 */
public class Loteria {

    public static Double dinheiroGanho = 0.0;
    public static int vezesJogadas = 0;
    public static Double dinheiroParaSaldo = 0.0;

    Double DinheiroGanhado() {
        return dinheiroParaSaldo;
    }

    void numeroLoteria() {

        Scanner leitor = new Scanner(System.in);
        Integer ponto = 0;
        Integer numeroInteiroAleatorio = ThreadLocalRandom.current().nextInt(1, 51);
        System.out.println("Digite 15 números que serão sorteados de 1 a 50 números.");
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("Falta mais " + i + " números!!");

            Integer numeroDigitado = leitor.nextInt();

            if (numeroInteiroAleatorio == numeroDigitado) {
                ponto += 1;
            }
            numeroInteiroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);

        }

        if (ponto == 11) {
            
            System.out.println("Você ganhou R$50,00!!!");
            dinheiroGanho += 50;
            dinheiroParaSaldo += 50;
            
        } else if (ponto == 12) {
            
            System.out.println("Você ganhou R$100,00!!!");
            dinheiroGanho += 100;
            dinheiroParaSaldo += 100;
            
        } else if (ponto == 13) {
            
            System.out.println("Você ganhou R$250,00!!!");
            dinheiroGanho += 250;
            dinheiroParaSaldo += 250;
            
        } else if (ponto == 14) {
            
            System.out.println("Você ganhou R$1000,00!!!");
            dinheiroGanho += 1000;
            dinheiroParaSaldo += 1000;
            
        } else if (ponto == 15) {
            
            System.out.println("Você ganhou R$15000,00!!!");
            dinheiroGanho += 15000;
            dinheiroParaSaldo += 15000;
            
        } else {
            
            System.out.println("Você não ganhou!!Tente outra hora!!");
            
        }
    }

    void opcaoLoteria() {
        
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        Boolean escolheuSair = false;
        
        do {
            
            System.out.println("Quer jogar na loteria?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "3 - Estátisticas");
            Integer numEscolhido = leitor.nextInt();

            switch (numEscolhido) {
                case 1:

                    vezesJogadas++;
                    numeroLoteria();

                    break;
                case 2:

                    dinheiroParaSaldo = 0.0;
                    escolheuSair = true;

                    break;
                case 3:
                    
                    System.out.print(String.format("Total de dinheiro ganho: R$%.2f\n",
                            dinheiroGanho));
                    System.out.println("-------------------------------\n");
                    System.out.print(String.format("Total de vezes jogadas: %d\n",
                            vezesJogadas));
                    System.out.println("-------------------------------\n");
                    System.out.print(String.format("Dinheiro ganho: R$%.2f\n",
                            dinheiroParaSaldo));
                    System.out.println("-------------------------------\n");
                    
                    if (i >= 0 && i < 10) {
                        
                        System.out.println("Tente mais tarde!!");
                        
                    } else if (i >= 10 && i < 25) {
                        
                        System.out.println("Vá mais devagar!!");
                        
                    } else if (i >= 15) {
                        
                        System.out.println("Tá virando vício, por favor "
                                + "procure um médico!!");
                        
                        escolheuSair = true;
                    }
                    
                    System.out.println("-------------------------------");
                    break;
                default:

                    System.out.println("Número Inválido!!");

            }
        } while (escolheuSair == false);
    }
}
