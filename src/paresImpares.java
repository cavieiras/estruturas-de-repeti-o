import java.util.Scanner;

public class paresImpares {
  
    public static void main(String[] args) {
        
        try(Scanner entrada = new Scanner(System.in)) {
       
        // definição das variáveis
        int quantidadeNumeros;
        int numeros;
        int pares;
        int impares;
        int resto;
        int contagem;
        
        //define quantos números o usuário quer adicionar
        System.out.println("Quantos números você deseja colocar?");
        quantidadeNumeros = entrada.nextInt();

        //mostra a quantidade de numeros
        //pares e ímpares adicionados pelo usuário
        //precisa estar salvo fora do laço do-while (dentro do laço a contagem é zerada sempre)
        //para que as quantidades sejam armazenadas
        pares = 0;
        impares = 0;
        contagem = 0;

        do {

            contagem = contagem +1; //sem esse contador, o laço se torna infinito
            // comando para que o usuário
            // coloque quantos números quiser.

            System.out.println("Número: ");
            numeros = entrada.nextInt();

            // definindo se um número é par
            // quando o resto da divisão é igual a zero
            resto = (numeros % 2);

                if (resto == 0) {

                    ++pares; //soma uma unidade a variável pares
                } else {

                    ++impares; //soma uma unidade a variável ímpares
                    
                }
        

        } while (contagem < quantidadeNumeros); //quando a contagem
                                                //for maior que quantidade de numeros
                                                //então o programa para.
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

    }
}
}