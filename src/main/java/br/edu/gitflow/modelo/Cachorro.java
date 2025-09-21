package modelo;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Raça = " + raca;
    }

    public void latir() {
        System.out.println(getNome() + " late, au au!");
    }    
}