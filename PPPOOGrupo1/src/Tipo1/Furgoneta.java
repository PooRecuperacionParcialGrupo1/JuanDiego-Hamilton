/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author hamilton castro
 */


public class Furgoneta extends Vehiculo{
    double volumenLitros;

    public Furgoneta(double volumenLitros, String placa, String marca, String modelo, String atrDestino, double atrDistanciaKm) {
        super(placa, marca, modelo, atrDestino, atrDistanciaKm);
        this.volumenLitros = volumenLitros;
    }
    


    @Override
    public double calcularAutonomia() {
        double kilometrosXlitro = 15.0;
        double autonomia = this.volumenLitros / kilometrosXlitro;
        return autonomia;
    }
    
}