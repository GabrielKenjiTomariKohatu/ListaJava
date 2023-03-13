/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terceira.lista.nivelamento;

/**
 *
 * @author Gabriel Kohatu
 */
public class ClassificacaoSocial {
    void classe(Double qtdSalarios){
        String classeS;
        if (qtdSalarios >= 0 && qtdSalarios < 2) {
            classeS = "E";
        } else
        if (qtdSalarios >= 2 && qtdSalarios < 4) {
            classeS = "D";
        } else
        if (qtdSalarios >= 4 && qtdSalarios < 10) {
            classeS = "C";
        } else
        if (qtdSalarios >= 10 && qtdSalarios < 20) {
            classeS = "B";
        } else {
            classeS = "A";
        }
        
        System.out.println(String.format("Você pertence a classe social: %s", classeS));
    }
}
