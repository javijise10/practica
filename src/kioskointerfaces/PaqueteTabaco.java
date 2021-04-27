package kioskointerfaces;

public class PaqueteTabaco implements Vendible{
    
    private String marca;
    
    public PaqueteTabaco(String marca){
    
           this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void vender () {
        System.out.println("Se ha vendido 1 paquete de tabaco de la marca " + getMarca());
    }

}
