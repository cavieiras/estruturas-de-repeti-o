import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){

            int fatorar;
            int numero;
            int numeroFatorial;

            System.out.println("Qual número você deseja fatorar:");
            numeroFatorial = entrada.nextInt();
            
            fatorar = 1; //serve para guardar os valores 
                        //para fazer as multiplicações
                        //e precisar estar fora do loop
            
            for (numero = numeroFatorial; numero >= 1; --numero)
                
                fatorar = fatorar * numero;

            
        System.out.println(numeroFatorial + "! = " + fatorar); //precisa estar fora do laço for()
                                    //para poder mostrar o valor final da fatoração
            

        }
    }
}
