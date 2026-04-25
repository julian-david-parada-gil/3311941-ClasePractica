package co.edu.sena.Clases.tema16;

public abstract class Animal {

    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public abstract void nacer();

}
