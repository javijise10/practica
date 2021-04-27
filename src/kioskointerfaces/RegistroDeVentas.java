package kioskointerfaces;

public class RegistroDeVentas {

    private final int MAX_VENTAS;
    private Vendible[] ventas;
    private int numVentas; 
    
    public RegistroDeVentas() {
        
       MAX_VENTAS = 150; 
       ventas = new Vendible[MAX_VENTAS];
       numVentas=0;
    } 

    public void anadirItemsEnVenta(Vendible item) {
        if(numVentas+1<MAX_VENTAS){ 
            ventas[numVentas] = item;
        }
        numVentas++;
    }

    public void vender() {
        
        for(int i =0; i<numVentas; i++)
        {
            ventas[i].vender();
        }
    }
}

