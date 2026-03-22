/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

import java.util.Objects;

/**
 *
 * @author Juan Diego Isaza 
 */
public abstract class Vehiculo {
    String placa;
    String marca;
    String modelo;
    String atrDestino;
    double atrDistanciaKm;

    public Vehiculo(String placa, String marca, String modelo, String atrDestino, double atrDistanciaKm) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.atrDestino = atrDestino;
        this.atrDistanciaKm = atrDistanciaKm;
    }

    public void mostrarInfoGeneral(){
        System.out.println("Placa:" + placa + "| Marca:" + marca + "| Modelo:" + modelo + "| Destino:" + atrDestino + "| Distancia: " + atrDistanciaKm + "Km");
        
    }
    
    public abstract double calcularAutonomia();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.placa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.placa, other.placa);
    }
    
}
