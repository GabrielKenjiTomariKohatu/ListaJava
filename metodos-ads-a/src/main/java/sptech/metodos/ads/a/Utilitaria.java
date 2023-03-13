package sptech.metodos.ads.a;

/**
 *
 * @author miniguiti
 */
public class Utilitaria {
    
    // Método:
    // Retorno: esse não tem, é void!
    // Nome: exibirLinha (camelCase, igual variável)
    // Argumentos: dentro dos (), esse não tem
    // Corpo: dentro das { }
    void exibirLinha(){
        //Código do método
        System.out.println("*--------*-------*");
       
    }
    
    void exibirNome(String nome){
        System.out.println("Nome é: " + nome);
    }
    
    //Chamar método dentro de método
    void exibirNomeFormatado(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
}
