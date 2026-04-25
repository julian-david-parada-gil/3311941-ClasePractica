package co.edu.sena.Clases.Ejercicio1;

public class Pan {

    private String tipo;
    private float precio;
    private String color;
    private float peso;
    private String sabor;

    public Pan(String tipo, float precio, String color, float peso, String sabor) {
        this.tipo = tipo;
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}
