import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
      try (Scanner entrada = new Scanner (System.in)) {
        String nome;  //definição do tipo de variável
          int idade;    // definição do tipo de váriável (neste caso, um número)

          // aqui é a criação da repetição
          while (true) {        // a condição é definida por um boolean, então enqto verdade, o programa vai ficar pedindo as coisas pra sempre 
            System.out.println("Nome: ");
            nome = entrada.next(); // aqui permite a entrada de um nome pelo usuário
            if (nome.equals ("0")) break; //aqui é a condição pedida que se a entrada para nome = 0, o programa se encerra.

            System.out.println("Idade: ");
            idade = entrada.nextInt();

            // neste caso as entradas para nome e idade estão nestled dentro do loop while.
          }
    }

      // esse pedaço de código está fora do loop while
      //essa linha será imprimida quando o usuário pedir para parar o programa digitando zero
      System.out.println("Continua aqui...");   
    }
}
