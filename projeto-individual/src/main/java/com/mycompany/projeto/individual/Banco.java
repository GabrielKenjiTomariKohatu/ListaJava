/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.individual;

import java.util.Scanner;

/**
 *
 * @author Gabriel Kohatu
 */
public class Banco {

    public static Double contaBanco = 0.0;
    Scanner leitor = new Scanner(System.in);

    Double saldoConta() {
        
        return contaBanco;
        
    }

    Double adicionar(Double numeroAdd) {
        
        contaBanco += numeroAdd;
        return contaBanco;
        
    }

    Double retirar(Double numeroRem) {
        
        contaBanco -= numeroRem;
        return contaBanco;
        
    }

    void verSaldo(Double saldo) {

        if (saldo < 0) {
            
            System.out.println("Sua conta está com saldo negativo");
            
        } else {
            
            System.out.println(String.format("Seu saldo é de: %.2f", saldo));
            
        }
        
        System.out.println("-------------------------------");
        
    }

    void opcaoBanco(Double numeroSaldo) {
        Boolean voltarMenu = false;
        
        do {
            
            System.out.println("Qual das opções deseja prosseguir?\n"
                    + "1 - Adicionar\n"
                    + "2 - Retirar\n"
                    + "3 - Ver saldo\n"
                    + "4 - Voltar ao menu principal");
            
            Integer numeroDigitado = leitor.nextInt();
            System.out.println("-------------------------------");

            switch (numeroDigitado) {
                case 1:

                    System.out.println("Digite a quantidade que deseja colocar no saldo:");
                    Double numeroAdicionado = leitor.nextDouble();
                    System.out.println("Seu saldo: R$" + contaBanco);
                    System.out.println("-------------------------------");
                    adicionar(numeroAdicionado);

                    break;
                case 2:

                    System.out.println("Digite a quantidade que deseja retirar:");
                    Double numeroRetirado = leitor.nextDouble();
                    System.out.println("Seu saldo: R$" + contaBanco);
                    System.out.println("-------------------------------");
                    retirar(numeroRetirado);
                    System.out.println(contaBanco);

                    break;
                case 3:

                    verSaldo(contaBanco);

                    break;
                case 4:

                    System.out.println("-------------------------------");
                    saldoConta();
                    voltarMenu = true;

                    break;
                default:
                    
                    System.out.println("Número Inválido!!!");
                    
            }
        } while (voltarMenu == false);
    }
}
