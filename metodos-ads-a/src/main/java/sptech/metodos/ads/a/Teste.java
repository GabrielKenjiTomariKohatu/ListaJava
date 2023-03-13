package sptech.metodos.ads.a;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author miniguiti
 */
public class Teste {

    public static void main(String[] args) {
        String nome01 = "Giuliana";
        String nome02 = "Xampson";

        // Para ter acesso aos métodos,
        // precisamos criar um objeto da classe
        // onde esse método foi criado
        // Instânciar para tranformar em objeto
        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();
        Scanner leitor = new Scanner(System.in);

        // Chamar método = invocar
        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);

        //Usando a cálculadora:
        //Lembrar de guardar o retorno em uma 
        // variável para usar
        Double soma = calc.somar(10.0, 42.0);
        System.out.println("Soma retornada:" + (soma + 10.0));

        Double resultadoSubtracao = calc.subtrair(42.0, 10.0);

        System.out.println(
                String.format("%.2f", resultadoSubtracao));
        
        Double somaSobrecarga = calc.somar(15.0, 1.0, 5.0);
        
    }

}
