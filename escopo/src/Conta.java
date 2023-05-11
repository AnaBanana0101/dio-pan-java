public class Conta {
    //Escopo e o ambiente onde uma variáel pode ser acessada, suas limitações, limitações
    
    //Variável de grande escopo, abrange toda a "Conta", chamada variável de classe. 
    double saldo=10.0;

    public void sacar(Double valor) {
        double novoSaldo = saldo - valor; 
        }
    
        //Está ocorrendo o erro pois a variavel novoSaldo esta contida apenas no método sacar, não sendo acessivel ao método imprimirSaldo
        //teria se que criar nova variavel, assim como saldo, para que ela pudesse ser acessada por todos os métodos
        public void imprimirSaldo() {
            System.out.println(saldo);
            System.out.println(novoSaldo);
        }

        public void calcularDividaExponencial() {
            //Variavel de bloco, seram apenas utilizadas neste método.
            double valorParcela = 50.0;
            double valorMontante = 0.0;
            for(int x=1; x<=5; x++){
                double valorCalculado = valorParcela * x; 
                valorMontante = valorMontante + valorCalculado;}
                //Variável fixa
        }
}
