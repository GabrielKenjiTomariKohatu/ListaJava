/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

/**
 *
 * @author Gabriel Kohatu
 */
public class Idade {
    void classificaIdade(Integer idade) {
        
        String classif;
        
        if(idade >= 0 && idade <= 2) {
            classif = "Bebê";
        } else 
        if(idade >= 3 && idade <= 11) {
            classif = "Criança";
        } else
        if(idade >= 12 && idade <= 19) {
            classif = "Adolescente";
        } else 
        if(idade >= 20 && idade <= 30) {
            classif = "Jovem";
        } else 
        if (idade >= 31 && idade <=60) {
            classif = "Adulto";
        } else {
            classif = "idoso";
        }
        
        System.out.println("Classificação: " + classif);

    }
}
