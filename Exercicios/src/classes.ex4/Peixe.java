package classes.ex4;

public class Peixe extends Animal{


    public Peixe(String nome, String cor, String ambiente, int nPatas, double velocidade, double comprimento, String caracteristicas) {
        super(nome, cor, ambiente, nPatas, velocidade, comprimento);
        this.caracteristicas = caracteristicas;
    }

    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }


    @Override
    public void infoAnimal() {
        System.out.println("Nome -> " + getNome());
        System.out.println("Cor -> " + getCor());
        System.out.println("Ambiente -> " + getAmbiente());
        System.out.println("Velocidade -> " + getVelocidade() + " Km/h ");
        System.out.println("Comprimento -> " + getComprimento() + " cm de comprimento ");
        System.out.println("Caracteristicas -> " + getCaracteristicas());
    }
}
