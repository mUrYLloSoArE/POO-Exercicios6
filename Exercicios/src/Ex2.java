import ex2.Conta;
import ex2.Corrente;
import ex2.Poupanca;

public class Ex2 {
    public static void main(String[] args) {

        Corrente corrente= new Corrente("Muryllo Soares ", 1231455536, 3000);

        Poupanca poupanca= new Poupanca("Muryllo Soares ", 1231455536, 2000);


        System.out.println("====================================================");
        corrente.infoContaCorrente();
        corrente.deposito(1000);
        corrente.infoContaCorrente();
        System.out.println("====================================================");

        System.out.println("====================================================");
        poupanca.deposito(1000);
        poupanca.infoConta();
        System.out.println("====================================================");
        

        }
    }
