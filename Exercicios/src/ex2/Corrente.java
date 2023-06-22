package ex2;

public class Corrente extends Conta  {

    public Corrente(String nome, int numeroConta, double saldo) {
        super(nome, numeroConta, saldo);
    }

    double tributavel=0.1;


    public double calculo(){
        double tributos= getSaldo()*tributavel;
        System.out.println("Total a Pagar:" + (tributos+42));
        return    getSaldo()-(tributos)-42;
    }


    public void infoContaCorrente(){
        System.out.println("Informações conta corrente: ");
        System.out.println("Nome do titular -> " + getNome());
        System.out.println("Número da Conta -> " + getNumeroConta());
        System.out.println("Saldo da Conta Corrente ->" + calculo());
    }

}
