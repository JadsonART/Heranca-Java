package modelo;

public class Instrumento {
    private String nome;
    private String tipo;

    public Instrumento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String tocar() {
        return "O instrumento esta sendo tocado.";
    }

    @Override
    public String toString() {
        return "Instrumento [nome=" + nome + ", tipo=" + tipo + "]";
    }
}