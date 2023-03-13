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
public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        ValidacaoNumerica verificar = new ValidacaoNumerica();
        Scanner leitor = new Scanner(System.in);
        
        Boolean numeroNegativo = false;
        do {
            System.out.println("Digite um número inteiro:");
            Integer numero = leitor.nextInt();
            
            if(numero < 0) {
                numeroNegativo = true;
            } else {
            verificar.verificarPrimo(numero);
            }
            
        } while (numeroNegativo == false);
    }
}
