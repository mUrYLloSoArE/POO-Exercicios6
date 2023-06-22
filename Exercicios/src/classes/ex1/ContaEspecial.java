package classes.ex1;

public class ContaEspecial extends Conta {

    private double limite=1000;
    private double saldoAtual=5000;
    private double transferencia=0;

    public ContaEspecial(String nome, int numeroConta, double saldo) {
        super(nome, numeroConta,saldo);
    }

    public void  saque(int qtd){
        if (getSaldo()<0){
            System.out.println("Saldo insuficiente não foi possivel realizar essa operação! ");
            return;
        }
        if (qtd>1000 || qtd<0){
            System.out.println("Limite não autorizado para saque! ");
            return;
        }
        saldoAtual-=qtd;
        transferencia =getSaldo()+qtd;
    }


    public void  infoConta(){
        System.out.println("Dados da sua conta especial : ");
        System.out.println("Nome do titular -> " + getNome());
        System.out.println("Número da conta -> " + getNumeroConta());
        System.out.println("Saldo da conta especial -> " + saldoAtual);
        System.out.println("Saldo atual da Conta corrente depois do saque -> " + transferencia);
    }

}
