/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao.continuada1.gabriel.kohatu;

import java.util.Scanner;

/**
 *
 * @author Gabriel Kohatu
 */
public class GabrielKohatu {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Boolean escolheuSair = false;

        Double conta = 0.0;
        Double rendimento = 0.0;
        do {
            System.out.println("-----------------------------\n|  SPTech    Investimentos  |\n"
                    + "-----------------------------\n| Olá, o que deseja fazer:  |\n "
                    + "-----------------------------\n| 1 - Depositar             |\n"
                    + "| 2 - Sacar                 |\n| 3 - Simular rendimentos   |\n"
                    + "| 0 - Sair                  |\n-----------------------------");

            Integer numeroDigitado = leitor.nextInt();
            switch (numeroDigitado) {
                case 1:
                    System.out.println("Digite o valor do depósito:");
                    Double numeroDeposito = leitor.nextDouble();
                    if (numeroDeposito < 0) {
                        System.out.println("Valor Inválido");
                    } else {
                        conta += numeroDeposito;
                        System.out.println(String.format("Depósito realizado "
                                + "- Saldo atual: R$ %.2f", conta));
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    Double valorSaque = leitor.nextDouble();
                    if (valorSaque < 0) {
                        System.out.println("Valor Inválido");
                    } else {
                        if (valorSaque <= conta) {
                            conta -= valorSaque;
                            System.out.println(String.format("Saque realizado "
                                    + "- Saldo atual: R$ %.2f", conta));
                        } else {
                            System.out.println("Valor Inválido");
                        }
                    }
                    break;
                case 3:
                        System.out.println(String.format("| Saldo Atual: R$%.2f  |", conta));
                        rendimento = conta;
                    for(int i = 1;i <=12;i++) {                     
                        rendimento += (rendimento * 0.1);
                        System.out.println(String.format("Mês %d | Saldo: R$%.2f |",i ,rendimento));
                        System.out.println("-----------------------------");
                    }
                        
                    break;
                case 0:
                    escolheuSair = true;
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (escolheuSair != true);
    }
}
