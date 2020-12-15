package aplicacion;

import dominio.*;

public class Principal{
    public static void main(String[] args){
        VehiculoTurismo yaris = new VehiculoTurismo("Toyota", "Yaris", 18000, 5);
        VehiculoTurismo naveNodriza = new VehiculoTurismo("La Pava", "Revolucionario", 25000, 7);
        Concesionario concesionario = new Concesionario();
        concesionario.annadirVehiculo(yaris);
        concesionario.annadirVehiculo(naveNodriza);
        System.out.println(concesionario); 
    }
     
}
