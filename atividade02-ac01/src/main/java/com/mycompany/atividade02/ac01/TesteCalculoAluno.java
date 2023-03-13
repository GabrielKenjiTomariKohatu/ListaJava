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
public class TesteCalculoAluno {
    public static void main(String[] args) {
        CalculoAluno calculo = new CalculoAluno();
        Scanner leitor = new Scanner(System.in);
        
        Double n1 = leitor.nextDouble();
        Double n2 = leitor.nextDouble();
        
        Double total = calculo.calcularMedia(n1,n2);
        System.out.println(String.format("Media do aluno é: %.2f", total));
    }
}
