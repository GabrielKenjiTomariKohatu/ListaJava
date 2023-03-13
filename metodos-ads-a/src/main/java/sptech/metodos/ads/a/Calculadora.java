package sptech.metodos.ads.a;

/**
 *
 * @author miniguiti
 */
public class Calculadora {

    Double somar(Double numero01, Double numero02) {
        Double soma = numero01 + numero02;
        return soma;
    }

    //Sobrecarga = a mesma ação com diferentes argumentos:
    Double somar(Double numero01, Double numero02, Double numero03) {
        Double soma = numero01 + numero02 + numero03;
        return soma;
    }

    void exibirSoma(Double numero01, Double numero02) {
        System.out.println(numero01 + numero02);
    }
    

    // Faça os métodos para:
    // divisão, subtração e multiplicação
    // Com retorno e 2 argumentos Double
    Double subtrair(Double numero01, Double numero02) {
        return numero01 - numero02;
    }

}
