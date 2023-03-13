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
public class Finanças {

    public static void main(String[] args) {

        ClasseSocial classeS = new ClasseSocial();
        Juros calculo = new Juros();
        Banco saldo = new Banco();
        Loteria sorte = new Loteria();

        Scanner leitor = new Scanner(System.in);

        Double contaBanco = 0.0;
        Boolean escolheuSair = false;

        do {
            System.out.println("-------------------------------");
            System.out.println("Seu saldo: R$" + contaBanco);
            System.out.println("-------------------------------");
            System.out.println("Escolha uma das opções abaixo:\n"
                    + "1 - Simulação de juros Simples/Compostos\n"
                    + "2 - Dinheiro no banco\n"
                    + "3 - Cáclulo de Renda\n"
                    + "4 - Loteria\n"
                    + "5 - Sair");

            Integer numDigitado = leitor.nextInt();
            System.out.println("-------------------------------");

            switch (numDigitado) {
                case 1:

                    calculo.escolhaUsuario();

                    break;
                case 2:

                    saldo.opcaoBanco(contaBanco);
                    contaBanco = saldo.saldoConta();

                    break;
                case 3:

                    classeS.rendaMensal();

                    break;
                case 4:

                    sorte.opcaoLoteria();
                    contaBanco += sorte.DinheiroGanhado();

                    break;
                case 5:

                    escolheuSair = true;

                    break;
                default:

                    System.out.println("Número inválido!!");
                    System.out.println("Tente novamente");

            }
        } while (escolheuSair == false);
    }

}
