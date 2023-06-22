package classes.ex4;

public class Mamifero extends Animal{
    private String comida;
    public Mamifero(String nome, String cor, String ambiente, int nPatas, double velocidade, double comprimento, String comida) {
        super(nome, cor, ambiente, nPatas, velocidade, comprimento);
        this.comida = comida;
    }

    public String getComida() {
        return comida;
    }

    @Override
    public void infoAnimal() {

        System.out.println("Nome -> " + getNome());
        System.out.println("Cor -> " + getCor());
        System.out.println("Número de patas -> " + getnPatas());
        System.out.println("Ambiente -> " + getAmbiente());
        System.out.println("Velocidade -> " + getVelocidade() + " Km/h ");
        System.out.println("Comprimento -> " + getComprimento() + " cm de comprimento ");
        System.out.println("Alimento -> " + getComida());

    }
}
