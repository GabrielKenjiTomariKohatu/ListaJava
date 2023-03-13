/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

/**
 *
 * @author Gabriel Kohatu
 */
public class CalculoNutricao {
    void calculaIMC(Double pesoPessoa, Double alturaPessoa) {
        Double IMC = pesoPessoa / (alturaPessoa * alturaPessoa);
        System.out.println(String.format("IMC = %.2f",IMC));
    }
}
