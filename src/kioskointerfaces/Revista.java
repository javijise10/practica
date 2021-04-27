package kioskointerfaces;

public class Revista extends Publicacion {

    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Revista(String titulo, String fecha) {
        super(titulo);
        this.fecha = fecha;
    }

    @Override
    public void vender() {
        System.out.println("Se ha vendido 1 unidad de la revista " + getTitulo());
    }
}
