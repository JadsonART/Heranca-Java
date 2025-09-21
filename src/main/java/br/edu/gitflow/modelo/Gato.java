package modelo;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cor = " + cor;
    }

    public void miar() {
        System.out.println(getNome() + " mia, miau miau miau!");
    }
}