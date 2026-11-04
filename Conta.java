package sistema.banco.java;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public boolean sacar(double valor) {

        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                return true;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Valor inválido");
        } 
        
        
        return false;
    }
    
    public void exibirSaldo() {
        System.out.printf("Conta %d: %s | Saldo R$ %.2f\n", numero, titular, saldo);
       
    }
}
