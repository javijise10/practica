package kioskointerfaces;

public class Kiosko {

    public static void main(String[] args) {
        
        Coleccionable coches = new Coleccionable("Coches clásicos", 2);
        Revista pcworld = new Revista("PC World", "Febrero/2021");
        PaqueteTabaco malboro  = new PaqueteTabaco("Winston");
        
        RegistroVentas registro = new RegistroVentas();
        
        registro.anadirItemsEnVenta(coches);
        registro.anadirItemsEnVenta(pcworld);
        registro.anadirItemsEnVenta(malboro);
        
        registro.vender();
        
    }

}
