/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

/**
 *
 * @author Gabriel Kohatu
 */
public class DescontoProgressivo {
    Double calcularDesconto(Double valorProduto, Integer qtdProduto) {
        Double desconto = 0.0;
        
        if(qtdProduto == 1) {
            desconto = 0.9;
        } else
        if(qtdProduto == 2) {
            desconto = 0.8;
        } else 
        if(qtdProduto >= 3) {
            desconto = 0.7;
        }
        
        Double total = (valorProduto * qtdProduto) * desconto;
        return total;
    }
    
    void exibirNotaFiscal(Double valorP, Integer qtdP, Double totalP){
         System.out.println(String.format(
                 "-------------------------------------------------------\n"
               + "Valor do produto: R$ %.2f\n"
               + "Quantidade: %d\n"
               + "-------------------------------------------------------\n"
               + "Valor com desconto: R$ %.2f", valorP,qtdP,totalP));
    }   
}
