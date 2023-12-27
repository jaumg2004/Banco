public class ContaCorrente extends Conta {

    private double taxaJuros;

    public ContaCorrente(double saldo, String titular, double taxaJuros) {
        super(saldo, titular);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
