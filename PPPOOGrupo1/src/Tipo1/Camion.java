package Tipo1;

/**
 *
 * @author Juan Diego Isaza 
 */
public class Camion extends Vehiculo {
    double capacidadCargaToneladas;

    public Camion(double capacidadCargaToneladas, String placa, String marca, String modelo, String atrDestino, double atrDistanciaKm) {
        super(placa, marca, modelo, atrDestino, atrDistanciaKm);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }
    
    @Override
    public double calcularAutonomia() {
        double autonomiaBase = 500;
        double factorConsumo = 20;
        double autonomia = autonomiaBase - (this.capacidadCargaToneladas * factorConsumo) ;
        return autonomia;
    }
    
    public void asignarRuta(){
        System.out.println("Ruta estandar asignada. Sin destino especifico aun.");
    }
    
    public void asignarRuta(String atrDestino){
        System.out.println("Ruta asignada con destino a:" + atrDestino);
    }
    
    public void asignarRuta(String atrDestino, double atrDistanciaKm){
        System.out.println("Ruta asignada al destino: "+ atrDestino + ". Distancia total: "+ atrDistanciaKm +". Preparando logistica pesada.");
        
    }
}
