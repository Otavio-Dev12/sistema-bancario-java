package ContaBancaria;
import java.util.ArrayList;

      public class Principal {

   public static void main(String[] args) {


       ContaCorrente cc = new ContaCorrente(500, "douglas", 2500.0);
       ContaPoupança cp = new ContaPoupança(458, "tata", 3000.0);


       ArrayList<Conta> contas = new ArrayList<>();
       contas.add(cc);
       contas.add(cp);
       contas.add(cc);

      for ( Conta conta : contas){
          conta.exibirDados();
      }

   }
}
