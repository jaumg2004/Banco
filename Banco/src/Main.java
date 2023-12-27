public class Main {
    public static void main(String[] args) {
        // Criando uma conta padrão
        Conta contaPadrao = new Conta(1000.0, "Titular Conta Padrão");

        // Operações na conta padrão
        contaPadrao.depositar(500.0);
        contaPadrao.sacar(200.0);
        System.out.println("Saldo da Conta Padrão: R$ " + contaPadrao.getSaldo());

        // Criando uma conta corrente
        ContaCorrente contaCorrente = new ContaCorrente(2000.0, "Titular Conta Corrente", 0.02);

        // Operações na conta corrente
        contaCorrente.depositar(1000.0);
        contaCorrente.sacar(500.0);
        System.out.println("Saldo da Conta Corrente: R$ " + contaCorrente.getSaldo());

        // Criando uma conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca(3000.0, "Titular Conta Poupança", 0.03);

        // Operações na conta poupança
        contaPoupanca.depositar(1500.0);
        contaPoupanca.sacar(300.0);
        System.out.println("Saldo da Conta Poupança: R$ " + contaPoupanca.getSaldo());
        System.out.println("Rendimento da Conta Poupança: " + contaPoupanca.getRendimento());
    }
}
