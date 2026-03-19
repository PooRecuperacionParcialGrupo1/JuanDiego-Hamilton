/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author Juan Diego Isaza - Juan Manuel Galeano
 */
public class Camion extends Vehiculo {
    int CapacidadCargaToneladas;
    String atrdestino;
    float atrdistancia;

    public Camion(int CapacidadCargaToneladas, String atrdestino, float atrdistancia, String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.CapacidadCargaToneladas = CapacidadCargaToneladas;
        this.atrdestino = atrdestino;
        this.atrdistancia = atrdistancia;
    }
    
    

    

    @Override
    float calcularAutonomia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void asignarRuta(){
    }
    
    public void asignarRuta(String atrdestino){
        this.atrdestino = atrdestino;
    }
    
    
}
