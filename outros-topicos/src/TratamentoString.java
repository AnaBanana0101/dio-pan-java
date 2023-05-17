public class TratamentoString {

    public static void main(String[] args) {
        
        String original = "abcde FGHIJ ABC abc DeFg    ";

        String s01 = original.toLowerCase(); 
        String s02 = original.toUpperCase(); 
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xyz");
        int i = original.indexOf("bc"); 
        int j = original.lastIndexOf("bc");
        

        System.out.println("Original: " + original + "-");
        System.out.println("toLowerCase: " + s01 + "-"); //coloca tudo em caixa baixa
        System.out.println("toUpperCase: " + s02 + "-");//coloca tudo em caixa alta
        System.out.println("trim: " + s03 + "-");//retira os espaços no inicio e final, excedentes
        System.out.println("substring(2): " + s04 + "-"); //seleciona de onde começa e/ou quando termina
        System.out.println("substring(2, 9): " + s05 + "-"); //seleciona inicio e fim
        System.out.println("replace(a, x): " + s06 + "-"); //troca letra
        System.out.println("replace(abc, xyz): " + s07 + "-"); //troca de palavras
        System.out.println("Index of 'bc': " + i); //local da primeira ocorrência
        System.out.println("Last Index of 'bc': " + j); //local da ultima ocorrência




    }
    
}
