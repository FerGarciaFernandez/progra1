package dominio;

public class VehiculoTurismo extends Vehiculo{
    private int numeroPlazas;

    public double calcularPrecioFinal(){
        return (getNumeroPlazas() > 5)?getPrecioBase() * (1 + 0.1 * (getNumeroPlazas() - 5)):getPrecioBase();
    } 

    @Override
    public String toString(){
        return "Marca: " + getMarca() + "\nModelo: " + getModelo() +
            "\nNúmero de plazas: " + getNumeroPlazas() + 
            "\nPrecio base: " + getPrecioBase() +
            "\nPrecio final: " + calcularPrecioFinal();
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public VehiculoTurismo(String marca, String modelo, double precioBase, int plazas){
        super(marca, modelo, precioBase);
        this.numeroPlazas = plazas;
    }

    public VehiculoTurismo() {
        super();
    }

}
