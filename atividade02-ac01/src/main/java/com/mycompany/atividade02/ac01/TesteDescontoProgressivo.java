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
public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        DescontoProgressivo descontoProduto = new DescontoProgressivo();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema de desconto progressivo!");
        System.out.println("Digite o valor unitário do produto:");
        Double valor = leitor.nextDouble();
        System.out.println("Digite a quantidade:");
        Integer qtd = leitor.nextInt();
        
        Double totalCompra = descontoProduto.calcularDesconto(valor, qtd);
        
        descontoProduto.exibirNotaFiscal(valor,qtd, totalCompra);
    }
}
