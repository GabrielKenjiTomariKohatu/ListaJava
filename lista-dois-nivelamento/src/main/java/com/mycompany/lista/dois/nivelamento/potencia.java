/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.dois.nivelamento;

import java.util.Scanner;

/**
 *
 * @author Gabriel Kohatu
 */
public class potencia {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o expoente: ");
        Integer expoente = leitor.nextInt();
        System.out.println("Digite a base: ");
        Integer base = leitor.nextInt();
                
        Integer total = 1;
        for (int i = 1;i <= base; i++) {
            
            total *= expoente;
            
        }
        System.out.println(String.format("A potencia de %d é: %d", expoente,total));
    }
}
