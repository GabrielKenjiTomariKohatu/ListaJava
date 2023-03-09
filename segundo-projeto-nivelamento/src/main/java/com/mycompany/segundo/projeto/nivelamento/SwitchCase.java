/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.projeto.nivelamento;
import java.util.Scanner;


/**
 *
 * @author Gabriel Kohatu
 */
public class SwitchCase {
    public static void main(String[] args) {
       // Digite um numeor
       // e faça um print de qual dia da semana representa
       
       Scanner  leitor = new Scanner(System.in);
      // Scanner leitor = new Scanner(System.in);
       
       System.out.println("Digite um número: ");
       Integer numDigitado = leitor.nextInt();
       
       switch(numDigitado) {
           case 1:
               System.out.println("Segundou!");
               break;
           case 2:
               System.out.println("Terçou");
               break;
           case 3:
               System.out.println("Quartou");
               break;
           case 4:
               System.out.println("Quintou");
               break;
           case 5:
               System.out.println("Sextou");
               break;
           default:
               System.out.println("Número inválido");
               break;
       }
       
       String planoEscolhido = "Prata";
       
       switch(planoEscolhido){
           case "Bronze":
           System.out.println("Bronze");
           break;
           case "Prata":
           System.out.println("Prata");
           break;
           case "Ouro":
           System.out.println("Ouro");
           break;
           default:
               System.out.println("Inválido");
               break;
               
       }
       
    }
}
