/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author Juan Diego Isaza 
 */
public class Camion extends Vehiculo {
    double capacidadCargaToneladas;
    

    public Camion(double capacidadCargaToneladas, String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }
    
    

 
    @Override
    float calcularAutonomia() {
        return(float) (1000.0 - (capacidadCargaToneladas * 10.0));
    }
    
    //TERMINAR DE IMPLEMENTAR EL FUNCIONAMIENTO DE LOS METODOS SOBRECARGADOS
    public void asignarRuta(){
    }
    
    public void asignarRuta(String atrdestino){

    }
    
    public void asignarRuta(String atrdestino, double artrDistanciaKm){
     
    }
}
