/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;
import java.util.ArrayList;
        
/**
 *
 * @author hamilton castro - Juan Diego Isaza
 */
public class PruebaFlota {
    //PUNTO 4
    static ArrayList <Camion> lc = new ArrayList();
    static ArrayList <Furgoneta> lf = new ArrayList();
    
     
    public static boolean insertarCamion(Object obj){
        Camion insertar = (Camion)obj;
        for (int i = 0; i < lc.size(); i++){
            if (lc.get(i).equals(insertar)){
                return false;
            }
        }
        lc.add(insertar);
        return true;
    }
    
    public static boolean insertarFurgoneta(Object obj){
        Furgoneta insertar = (Furgoneta) obj;
        for (int i = 0; i < lf.size(); i++){
            if (lf.get(i).equals(insertar)){
                return false;
            }     
        }
        lf.add(insertar);
        return true;
    }        
    
    public static void main(String[] args) {
        
        Camion c1 = new Camion(10.5, "XYZ-121","Volvo", "2022","Cartegena", 200.0 );
        Camion c2 = new Camion(20, "XFX-152","Mazda", "2017","Pereira", 250.0 );
        Camion c3 = new Camion(20.5, "BET-165","Mercedes-Benz", "2025","La Guajira", 600.0 );
        Camion c4 = new Camion(21.0, "VDF-251","Renault", "2010","Pasto", 500.0 );

        Furgoneta f1 = new Furgoneta(23.0, "FFF-111", "Renault", "2020", "Medellin", 200.0);
        Furgoneta f2 = new Furgoneta(15.2, "KOW-232", "Volvo", "2021", "Tulua", 260.0);
        Furgoneta f3 = new Furgoneta(11.8, "FMX-12", "Mazda", "2015", "Armenia", 120.0);
        Furgoneta f4 = new Furgoneta(8.5, "FMX-174", "Renault", "2013", "Barranquilla", 350.0);
        
        
        insertarCamion(c1);
        insertarCamion(c2);
        insertarCamion(c3);
        insertarCamion(c4);  
        
        insertarFurgoneta(f1);
        insertarFurgoneta(f2);
        insertarFurgoneta(f3);
        insertarFurgoneta(f4);
        
        
        
        System.out.println("___Camiones___");
        for (int i = 0 ; i < lc.size(); i++){
            lc.get(i).mostrarInfoGeneral();
            System.out.println("Autonomia: " + lc.get(i).calcularAutonomia()+"Km");
        }
        
        System.out.println("___Furgonetas___");
        for (int i = 0 ; i < lf.size(); i++){
            lf.get(i).mostrarInfoGeneral();
            System.out.println("Autonomia: "+ lf.get(i).calcularAutonomia()+"Km");
        }
        
        System.out.println("___Rutas Camiones___");
        for (int i = 0; i < lc.size(); i++) {
            if (i == 0) {
                lc.get(i).asignarRuta(); 
            } else if (i == 1) {
                lc.get(i).asignarRuta(lc.get(i).atrDestino);
            } else if (i == 2) {
                lc.get(i).asignarRuta(lc.get(i).atrDestino, lc.get(i).atrDistanciaKm); 
            } else {
                lc.get(i).asignarRuta();
            }
        }
        

    
    

    }
}
