import classes.ex4.Mamifero;
import classes.ex4.Peixe;
import classes.ex4.Reptil;

public class Ex4 {
    public static void main(String[] args) {


        Mamifero camelo = new Mamifero("Camelo","Bege","Deserto",
                4,60,3.45,"vegetais");
        Mamifero micoLeaoDourado = new Mamifero("Mico-leão-dourado","Dourado","Floresta",
                4,75,1.45,"vegetais,frutas");
        Mamifero leao = new Mamifero("Leão","Branco","Savanas",
                4,120,2.00,"carne");
        Mamifero ursoDoCanada = new Mamifero("Urso-do-Canadá","Marron","Floresta",
                4,60,2.00,"vegetais,carne");
        Peixe tubarao = new Peixe("Tubarão","Cinza","Fundo do mar",
                0,100.0,3.0,"Pode comer até 30 kg de carne por dia "
                );
        Reptil iguana = new Reptil("Iguana","Verde","Pantano",
                4,45.0,0.5,"insetos","Sexuada"
                );


        System.out.println("Bem vindo ao Zoológico de São Paulo! ");
        System.out.println("Veja os animais que temos aqui ");


        System.out.println("------------------------------------------------------------");
        System.out.println();
        camelo.infoAnimal();
        System.out.println("------------------------------------------------------------");
        System.out.println();

        System.out.println("------------------------------------------------------------");
        System.out.println();
        micoLeaoDourado.infoAnimal();
        System.out.println("------------------------------------------------------------");
        System.out.println();

        System.out.println("------------------------------------------------------------");
        System.out.println();
        leao.infoAnimal();
        System.out.println("------------------------------------------------------------");
        System.out.println();

        System.out.println("------------------------------------------------------------");
        System.out.println();
        ursoDoCanada.infoAnimal();
        System.out.println("------------------------------------------------------------");
        System.out.println();

        System.out.println("------------------------------------------------------------");
        System.out.println();
        tubarao.infoAnimal();
        System.out.println("------------------------------------------------------------");
        System.out.println();

        System.out.println("------------------------------------------------------------");
        System.out.println();
        iguana.infoAnimal();
        System.out.println("------------------------------------------------------------");




    }
    }
