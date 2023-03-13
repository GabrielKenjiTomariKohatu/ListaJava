/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author Gabriel Kohatu
 */
public class TesteCalculoNutricao {
    public static void main(String[] args) {
        CalculoNutricao calcIMC = new CalculoNutricao();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Escreva sua altura:");
        Double altura = leitor.nextDouble();
        System.out.println("Escreva seu peso:");
        Double peso = leitor.nextDouble();
        
        calcIMC.calculaIMC(peso, altura);
    }
}
