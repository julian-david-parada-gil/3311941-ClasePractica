package co.edu.sena.Clases.Ejercicio1;

public class App {

    public static void main(String[] args) {

        Avion avion = new Avion();
        avion.setColor("Blanco");
        avion.setPrecio(150000000);
        avion.setMarca("Boeing");
        avion.setTurbinas(4);
        avion.setCapacidad(300);

        Gafas gafas = new Gafas();
        gafas.setMarca("Ray-Ban");
        gafas.setPrecio(200);
        gafas.setColor("Negro");
        gafas.setGrosor(0.5f);
        gafas.setEstilo("Aviador");

        Pan pan = new Pan();
        pan.setTipo("Baguette");
        pan.setPrecio(2.5f);
        pan.setColor("Dorado");
        pan.setPeso(0.3f);
        pan.setSabor("Natural");

        Tamal tamal = new Tamal();
        tamal.setColor("Verde");
        tamal.setTamano("Mediano");
        tamal.setRegion("Paisa");
        tamal.setPrecio(3.0f);
        tamal.setPeso(0.5f);

    }

}
