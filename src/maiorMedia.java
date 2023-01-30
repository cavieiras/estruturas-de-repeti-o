import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            int maior = 0; 
            int soma = 0;
            int contagem = 0;

            do {
                System.out.println("Número: ");
                numero = entrada.nextInt();
                
                soma = soma + numero;
                
                if (numero > maior) maior = numero;

                contagem = contagem +1;

            } while (contagem < 5);

            System.out.println("Maior: " + maior);
            System.out.println("Média: " + (soma/5));
        }
    }
}
