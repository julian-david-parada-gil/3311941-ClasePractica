package co.edu.sena.Clases.tema16;

public class Mamifero extends Animal {

    @Override
    public void nacer() {
        System.out.println("El mamífero naciendo...");
    }

    public final void amamantar() {
        System.out.println("El mamífero amamantando...");
    }

}
