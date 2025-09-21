package modelo;

public class Violao extends Instrumento {

    private int numeroCordas;

    public Violao(String nome, String tipo, int numeroCordas) {
        super(nome, tipo);
        this.numeroCordas = numeroCordas;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    @Override
    public String tocar() {
        return "O violao esta tocando: dedilhado suave";
    }

    @Override
    public String toString() {
        return "Violao [nome=" + getNome() + ", tipo=" + getTipo() + ", cordas=" + numeroCordas + "]";
    }
}