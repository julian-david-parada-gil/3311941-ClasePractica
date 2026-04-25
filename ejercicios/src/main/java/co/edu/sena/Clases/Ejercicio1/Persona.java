package co.edu.sena.Clases.Ejercicio1;

public class Persona {
    private String colorOjos;
    private String colorPiel;
    private int dedos;
    private String colorCabello;
    private int lunares;

    public Persona(String colorOjos, String colorPiel, int dedos, String colorCabello, int lunares) {
        this.colorOjos = colorOjos;
        this.colorPiel = colorPiel;
        this.dedos = dedos;
        this.colorCabello = colorCabello;
        this.lunares = lunares;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public int getDedos() {
        return dedos;
    }

    public void setDedos(int dedos) {
        this.dedos = dedos;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public int getLunares() {
        return lunares;
    }

    public void setLunares(int lunares) {
        this.lunares = lunares;
    }

}

