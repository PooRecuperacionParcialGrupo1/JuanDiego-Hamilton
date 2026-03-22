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
    
    
    

 
    //TERMINAR DE IMPLEMENTAR EL FUNCIONAMIENTO DE LOS METODOS SOBRECARGADOS
    public void asignarRuta(){
    }
    
    public void asignarRuta(String atrdestino){

    }
    
    public void asignarRuta(String atrdestino, double artrDistanciaKm){
     
    }
}
