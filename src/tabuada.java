import java.util.Scanner;


public class tabuada {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner (System.in)){
        
            int tabuada;
            int numero;
            int multiplicacao;

            System.out.println("Qual tabuada você deseja ver?");
            tabuada = entrada.nextInt();

            System.out.println("A tabuada escolhida foi a do " + tabuada);

            for (numero = 1; numero <= 10; ++numero) {
                multiplicacao = tabuada * numero;

                System.out.println(multiplicacao);
            }
        };
    }
}
