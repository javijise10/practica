package kioskointerfaces;

public abstract class Publicacion   implements Vendible{

    private String titulo;
    
    public Publicacion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public abstract void vender();
}
