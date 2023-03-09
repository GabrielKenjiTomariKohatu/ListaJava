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
public class Votacao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int i = 1;
        
            Integer mussarela = 0;
            Integer calabresa = 0;
            Integer quatroQueijos = 0;
            
        do {
            System.out.println("Qual pizza é o seu favorito?\n5 - Mussarela\n25 - Calabresa"
                    + "\n50 - Quatro Queijos\nDigite um número: ");
            Integer voto = leitor.nextInt();
            
            switch(voto) {
                case 5:
                    mussarela += 1;
                    break;
                case 25:
                    calabresa += 1;
                    break;
                case 50:
                    quatroQueijos += 1;
                    break;
                
            }
            
              i++;
        } while(i <= 10);
        
        System.out.println("Mussarela: " + mussarela);
        System.out.println("Calabresa: " + calabresa);
        System.out.println("Quatro Queijos:" + quatroQueijos);
        
        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("Sabor favorito é Mussarela com: " + mussarela);
        } else if ( calabresa > quatroQueijos) {
            System.out.println("Sabor favorito é Calabresa com: " + calabresa);
        } else {
            System.out.println("Sabor favorito é Quatro queijos com: " + quatroQueijos);
        }
    }
}
