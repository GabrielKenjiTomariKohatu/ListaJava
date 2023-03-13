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
public class ClasseSocial {

    Double calculoRenda(Double rendaMensal) {
        
        Double resultadoRenda = rendaMensal / 1045;
        return resultadoRenda;

    }

    void classe(Double qtdSalarios) {

        String classeS;

        if (qtdSalarios >= 0 && qtdSalarios < 2) {

            classeS = "E";

        } else if (qtdSalarios >= 2 && qtdSalarios < 4) {

            classeS = "D";

        } else if (qtdSalarios >= 4 && qtdSalarios < 10) {

            classeS = "C";

        } else if (qtdSalarios >= 10 && qtdSalarios < 20) {

            classeS = "B";

        } else {

            classeS = "A";

        }

        System.out.println(String.format("Você pertence a classe social: %s", classeS));
    }

    void rendaMensal() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua renda:");
        Double rendaTotal = leitor.nextDouble();

        Double total = calculoRenda(rendaTotal);
        System.out.println(String.format("Você recebe aproximadamente %.1f"
                + " salários-mínimos.", total));
        classe(total);

        System.out.println("-------------------------------");

    }
}
