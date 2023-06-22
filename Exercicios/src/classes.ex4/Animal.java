package classes.ex4;

public abstract class Animal {

    private String nome,cor,ambiente;
    private int nPatas;
    private double velocidade, comprimento;

    public Animal(){

    }

    public Animal(String nome, String cor, String ambiente, int nPatas,
                  double velocidade, double comprimento) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.nPatas = nPatas;
        this.velocidade = velocidade;
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public int getnPatas() {
        return nPatas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getComprimento() {
        return comprimento;
    }

    public abstract void infoAnimal();

}
