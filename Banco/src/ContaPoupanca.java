public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca(double saldo, String titular, double rendimento) {
        super(saldo, titular);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}