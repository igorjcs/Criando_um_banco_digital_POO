package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente igor = new Cliente("igor", "08391426505");
        igor.setNome("Igor");

        Conta cc = new ContaCorrente(igor);
        Conta cp = new ContaPoupanca(igor);

        cc.depositar(1300);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(200, cp);

        cp.imprimirExtrato();
    }
}
