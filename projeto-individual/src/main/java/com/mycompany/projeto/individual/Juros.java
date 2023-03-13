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
public class Juros {

    void jurosSimples(Double porcentagem, Double saldo) {
        Double rendimento = saldo;
        for (int i = 1; i <= 12; i++) {
            rendimento += saldo * (porcentagem / 100);
            System.out.println(String.format("Mês %d: R$%.2f"
                    + "-------------------------------\n", i, rendimento));
        }
    }

    void jurosCompostos(Double porcentagem, Double saldo) {
        Double rendimento = saldo;
        for (int i = 1; i <= 12; i++) {
            rendimento += saldo * (Math.pow((1 + porcentagem / 100), i));
            System.out.println(String.format("Ano %d: R$%.2f\n"
                    + "-------------------------------\n", i, rendimento));
        }
    }

    void escolhaUsuario() {
        Banco saldo = new Banco();
        Boolean escolheuSair = false;
        Double contaBanco = 0.0;
        Double porc = 0.0;
        contaBanco = saldo.saldoConta();
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Qual tipo de juros:\n"
                    + "1 - Simples\n"
                    + "2 - Compostos\n"
                    + "3 - Voltar para o menu");
            Integer numEscolhido = leitor.nextInt();

            if (numEscolhido >= 1 && numEscolhido <= 2) {
                System.out.println("Digite a porcentagem ao mês:");
                porc = leitor.nextDouble();
            }
            switch (numEscolhido) {
                case 1:
                    jurosSimples(porc, contaBanco);
                    break;
                case 2:
                    jurosCompostos(porc, contaBanco);
                    break;
                case 3:
                    escolheuSair = true;
                    break;
                default:
                    System.out.println("Número Inválido!!!");
            }
        } while (escolheuSair == false);
    }
}
