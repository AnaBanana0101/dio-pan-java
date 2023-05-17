public class OperacaoSplit {

    public static void main(String[] args) {
        
        String s = "potato apple lemon"; 
        String[] vect = s.split(" ");//recorta as palavras de acordo com o separador, a cada espaço uma palavra será cortada 
        String word1 = vect[0];//variável da 1ª palavra
        String word2 = vect[1];//variável da 2ª palavra
        String word3 = vect[2];//variável da 3ª palavra

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

    }
    
}
