package ex2;

public  class Conta  {
    private String nome;
    private int numeroConta;
    private double saldo;

    public Conta(String nome, int numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void  deposito(int qtd){
        saldo+=qtd;
    }

    public void  saque(int qtd){
        if (saldo<0){
            System.out.println("Saldo insuficiente não foi possivel realizar essa operação! ");
            return;
        }
        saldo-=qtd;
    }

    public void  infoConta(){
        System.out.println("Dados da sua conta: ");
        System.out.println("Nome do titular -> " + getNome());
        System.out.println("Número da conta -> " + getNumeroConta());
        System.out.println("Saldo atual -> " + getSaldo());
    }


}