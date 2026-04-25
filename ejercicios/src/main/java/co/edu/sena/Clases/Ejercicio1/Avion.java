package co.edu.sena.Clases.Ejercicio1;

public class Avion {

    private String color;
    private float precio;
    private String marca;
    private int turbinas;
    private int capacidad;

    public Avion(String color, float precio, String marca, int turbinas, int capacidad) {
        this.color = color;
        this.precio = precio;
        this.marca = marca;
        this.turbinas = turbinas;
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}
