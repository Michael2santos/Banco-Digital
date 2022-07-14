package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente Michael = new Cliente();
        Michael.setNome("Michael");

        Conta cc = new ContaCorrente(Michael);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(Michael);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
