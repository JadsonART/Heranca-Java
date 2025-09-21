import java.util.ArrayList;
import java.util.List;
import modelo.Instrumento;
import modelo.Piano;
import modelo.Violao;

public class Main {
    public static void main(String[] args) {
        Instrumento violao = new Violao("Violao Classico", "Cordas", 6);
        Instrumento piano = new Piano("Piano de Cauda", "Teclas", 88);

        List<Instrumento> instrumentos = new ArrayList<>();
        instrumentos.add(violao);
        instrumentos.add(piano);

        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento.toString());
            System.out.println(instrumento.tocar());
        }
    }
}