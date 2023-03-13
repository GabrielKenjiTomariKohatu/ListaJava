/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terceira.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author Gabriel Kohatu
 */
public class ClasseSocial {
    public static void main(String[] args) {
        ClassificacaoSocial classificar = new ClassificacaoSocial();
        Renda calcRenda = new Renda();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a sua renda:");
        Double rendaTotal = leitor.nextDouble();
        
        Double total = calcRenda.calculoRenda(rendaTotal);
        System.out.println(String.format("Você pertence aproximadamente %.1f"
                + " salários-mínimos.",total));
        
        classificar.classe(total);
    }
}
