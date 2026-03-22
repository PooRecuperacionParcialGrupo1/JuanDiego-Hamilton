/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;
import java.util.ArrayList;
        
/**
 *
 * @author hamilton castro
 */
public class PruebaFlota {
    public static void main(String[] args) {
        
        //PUNTO 4
        ArrayList <Camion> listaCamiones = new ArrayList();
        ArrayList <Furgoneta> listaFurgonetas = new ArrayList();

        //PUNTO 3
        Camion c1 = new Camion(10.5, "XYZ-121", "2020", "Volvo");
        Camion c2 = new Camion(15.0, "BBC-222", "2021", "Kenworth");
        Camion c3 = new Camion(20.0, "AJT-363", "2022", "Mack");
        Camion c4 = new Camion(12.0, "AJT-363", "2023", "Scania"); // REPETIMOS PLACA
        Furgoneta f1 = new Furgoneta(1500, "FFF-111", "2019", "Renault");
        Furgoneta f2 = new Furgoneta(2000, "KOW-232", "2020", "Chevrolet");
        Furgoneta f3 = new Furgoneta(2500, "FMX-124", "2021", "Ford");
        Furgoneta f4 = new Furgoneta(3000, "FMX-124", "2022", "Nissan"); // REPETIMOS PLACA
    
    

    }
}
