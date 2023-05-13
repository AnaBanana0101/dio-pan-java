import java.util.Scanner;

//Fica perguntando sempre uma nota nova. 
// public class Notas {

//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         int notas;

//         while(true){
//             System.out.println("Nota: ");
//             notas = scan.nextInt(); 
//             if ((notas < 0) || (notas > 10)) {
//                 System.out.println("Valor inválido...");
//                 continue;
//             }
//         }

//     }

// }


public class Notas {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int nota; 

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida. Tente novamente: ");
            nota = scan.nextInt(); 
            continue;
        
        } 
    }
}





