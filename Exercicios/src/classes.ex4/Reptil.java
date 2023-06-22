package classes.ex4;

public class Reptil extends Mamifero{
    private String reproducao;

    public Reptil(String nome, String cor, String ambiente, int nPatas, double velocidade, double comprimento, String comida, String reproducao) {
        super(nome, cor, ambiente, nPatas, velocidade, comprimento, comida);
        this.reproducao = reproducao;
    }

    public String getReproducao() {
        return reproducao;
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
        System.out.println("Tipo de Reprodução -> " + getReproducao());

    }

}
