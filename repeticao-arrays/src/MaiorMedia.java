import java.util.Scanner;

public class MaiorMedia {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero; 
        int contador = 0;
        int maior = 0; 
        int soma = 0;  

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

                soma += numero; 
                if (numero > maior) maior = numero;

            contador += 1;
        } while (contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    scan.close();
    }
}
