package ContaBancaria;

   public class ContaPoupança extends Conta {

       public  ContaPoupança (int numero, String titular, double saldo) {
           super(numero, titular, saldo);
       }

       @Override
       public void sacar(double valor) {
           if (getSaldo()>= valor){
               double novoSaldo = getSaldo() - valor;
               setSaldo(novoSaldo);
               System.out.println("Saque realizado com sucesso!");
               System.out.println("Novo saldo R$ " + getSaldo());

           } else {

               System.out.println("Saldo insuficiente!");
           }
       }
   }
