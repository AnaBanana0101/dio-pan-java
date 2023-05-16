import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Número a ser fatorado: ");
        int numero = scan.nextInt(); 


        int fator = 1; 
        for (int i = 1; i <= numero; i++) {
            fator *= i; 
        }

        System.out.println("A fatoração é: " + fator);
    scan.close();
    }

}
