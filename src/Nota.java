import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
    
    try (Scanner entrada = new Scanner (System.in)) {
        int nota;

        while (true) {
            System.out.println ("Escolha uma nota de zero a dez: ");
            nota = entrada.nextInt();

            if (nota == 10) break;
        }

        //neste caso o programa só aceita notas maiores que zero 
        //e menores que 10
        if (nota > 10) {
            System.out.println("Número inválido. Coloque uma nota de zero a 10:");
            nota = entrada.nextInt();

        }
    }
    System.out.println("Fim.");

    }
   

    
}
