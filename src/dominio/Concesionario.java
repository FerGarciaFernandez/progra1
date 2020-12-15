package dominio;

import java.util.ArrayList;

public class Concesionario{
    private ArrayList<Vehiculo> coleccionVehiculos = new ArrayList<>();

    public void annadirVehiculo(Vehiculo vehiculo){
        coleccionVehiculos.add(vehiculo);
    }

    public double calcularPrecioTotal(){
        double suma = 0;
        for(Vehiculo vh : coleccionVehiculos)
            suma += vh.calcularPrecioFinal();
        return suma;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Vehiculo vh : coleccionVehiculos)
           sb.append("\n"+vh+"\n");
        sb.append("\nEl precio TOTAL de todos los vehículos del concesionario es " + calcularPrecioTotal());
        return sb.toString(); 
    }
}
