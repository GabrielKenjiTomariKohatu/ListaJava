/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.projeto.nivelamento;

/**
 *
 * @author Gabriel Kohatu
 */
public class OperadorTernario {
    public static void main(String[] args) {
        Boolean bloqueado = false;
        
        String frase;
        /*
        if(bloqueado) {
            frase = "Usuário Bloqueado";
        }else{
            frase = "Usuário Desbloqueado";
        }
        */
        
        frase = bloqueado ? "Usuário Bloqueado" : "Usuário Desbloqueado";
        
        System.out.println(frase);
        // Se o funcionário ganha mais de mil
        // o bonus é de 0.15, se ganha menos de mil
        // o bonus e de 0.10
        
        Double bonus;
        Double salario = 1078.74;
        
        bonus = salario > 1000.0 ? 0.15 : 0.10;
        
        System.out.println("Bonus: " + bonus);
    }
}
