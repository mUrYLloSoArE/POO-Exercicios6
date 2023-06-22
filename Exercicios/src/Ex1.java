import classes.ex1.Conta;
import classes.ex1.ContaEspecial;
import classes.ex1.ContaPoupanca;

public class Ex1 {
    public static void main(String[] args) {

        Conta corrente= new Conta("Muryllo Soares ", 1231455536, 3000);

        System.out.println("====================================================");
        corrente.infoConta();
        corrente.deposito(1000);
        System.out.println("");
        corrente.infoConta();
        corrente.saque(500);
        corrente.infoConta();
        System.out.println("====================================================");

        Conta poupanca= new ContaPoupanca("Muryllo Soares ", 1231455536, 2000);
        System.out.println("====================================================");
        poupanca.deposito(1000);
        poupanca.infoConta();
        System.out.println("====================================================");





        Conta especial= new ContaEspecial("Muryllo Soares ", 1231455536,corrente.getSaldo());
        System.out.println("====================================================");
        especial.saque(1000);
        especial.infoConta();
        especial.saque(1200);
        System.out.println("====================================================");

    }
    }
