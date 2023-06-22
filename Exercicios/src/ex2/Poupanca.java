package ex2;

import classes.ex1.Conta;

public class Poupanca extends Conta {
    public Poupanca(String nome, int numeroConta, double saldo) {
        super(nome, numeroConta, saldo);
    }

    private double diaRendimento=0.05;
    public double  saldoAtual(){
        return getSaldo()+(getSaldo()*diaRendimento);
    }


    public void  infoConta(){
        System.out.println("Dados da sua conta poupança : ");
        System.out.println("Nome do titular -> " + getNome());
        System.out.println("Número da conta -> " + getNumeroConta());
        System.out.println("Rendimento na poupança de " + (diaRendimento*100) + " % ");
        System.out.println("Saldo  -> " + saldoAtual());
    }


}
