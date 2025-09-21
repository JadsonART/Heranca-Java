import modelo.Cachorro;
import modelo.Gato;

public class Main{
  public static void main(String[] args){

    Cachorro cachorro = new Cachorro("Barto", 5, "Lulu da Pomerânia");

    System.out.println(cachorro);
    System.out.println();

    cachorro.latir();

    System.out.println();

    Gato gato = new Gato("Bart", 3, "Laranja");

    System.out.println(gato);
    System.out.println();

    gato.miar();
    


    
    
  }
}