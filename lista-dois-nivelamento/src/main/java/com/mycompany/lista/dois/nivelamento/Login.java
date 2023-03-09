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
public class Login {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String loginUsuario ="admin";
        String senhaUsuario ="#SPtech2022";
        
        String login;
        String senha;
        
        do {
            System.out.println("Login: ");
            login = leitor.next();
            
            System.out.println("Senha: ");
            senha = leitor.next();
            
            if (!login.equals(loginUsuario) || !senha.equals(senhaUsuario)) {
                System.out.println("Login e/ou senha inválidos ");
            login = "";
            senha = "";
            }
        } while (!login.equals(loginUsuario) && !senha.equals(senhaUsuario));
        
        System.out.println("Login realizado com sucesso!!!");
    }
}
