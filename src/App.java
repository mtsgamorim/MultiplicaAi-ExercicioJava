public class App {
    public static void main(String[] args) {
        int numeroFornecido = 4;
        String cabecalho = "Tabela de multiplicação de " + numeroFornecido;

        System.out.println(cabecalho);

        for(int i = 1; i < 10; i++){
            System.out.println(numeroFornecido + " x " + i + " = " + (numeroFornecido * i) );
        }
    }
}
