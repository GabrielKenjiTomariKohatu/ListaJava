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
public class TesteIdade {
    public static void main(String[] args) {
        Idade year = new Idade();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        Integer anos = leitor.nextInt();
        
        year.classificaIdade(anos);
        
    }
}
