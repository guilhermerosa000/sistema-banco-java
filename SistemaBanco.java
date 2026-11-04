
package sistema.banco.java;


public class SistemaBanco {

   
    public static void main(String[] args) {
        
      ContaCorrente c1 = new ContaCorrente(1,"Ana",15);
      ContaPoupanca c2 = new ContaPoupanca(2,"Bruno",0.01);
      
      c1.depositar(100);
      c2.depositar(100);
      
      c1.exibirSaldo();
      c2.exibirSaldo();
      
      c1.sacar(500);
      c1.depositar(-10);
      
      c1.fecharMes();
      c2.fecharMes();
      
      c1.exibirSaldo();
      c2.exibirSaldo();
       
       
        
    }
    
}
