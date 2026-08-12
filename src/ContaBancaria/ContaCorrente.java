package ContaBancaria;

public class ContaCorrente extends Conta implements Tributavel{

   private double taxa= 2;


    @Override
    public void sacar(double valor) {
      double total = valor + taxa;

      if (getSaldo()>= total  ){

          double novoSaldo = getSaldo() - total;
          setSaldo(novoSaldo);

          System.out.println("Saque realizado com sucesso!");
          System.out.println("Novo saldo R$ " + getSaldo());
        }

        else {
            System.out.println("saldo insuficiente!");
        }
    }

    public ContaCorrente(int  numero, String titularDaconta, double saldoDaconta) {
        super(numero, titularDaconta, saldoDaconta);
    }

    @Override
    public double calcularTributo() {
        return getSaldo() * 0.01;
    }
}
