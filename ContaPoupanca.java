package sistema.banco.java;

public class ContaPoupanca extends Conta implements FechamentoMensal {

    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double taxaJuros) {
        super(numero, titular);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        double calculoJuros = getSaldo() * taxaJuros;
        depositar(calculoJuros);

        System.out.printf("Juros de R$ %.2f aplicados na conta %d\n", calculoJuros, getNumero());
    }

    @Override
    public void fecharMes() {
        aplicarJuros();
    }

}
