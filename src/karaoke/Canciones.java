
package karaoke;

import java.util.ArrayList;
import java.util.Scanner;




public class Canciones {
    
    ArrayList popIngles = new ArrayList();
    ArrayList listaDeComparacion = new ArrayList();
    ArrayList generos = new ArrayList();
    public void Canciones(){}

    public ArrayList getPopIngles() {
        return popIngles;
    }

    public void setPopIngles(ArrayList popIngles) {
        this.popIngles = popIngles;
    }
    
    
    public void llenarPopEnIngles(){
        
        popIngles.add(0,"BackStreetBoys/EveryBody");
        popIngles.add(1,"BackStreetBoys/I Want It That Way");
        popIngles.add(2,"BackStreetBoys/Larger Than Life");
        popIngles.add(3, "Britney Spears/Oops I Did Againd");
        popIngles.add(4, "Britney Spears/Baby One more Time");
        popIngles.add(5, "Britney Spears/Toxic");
        popIngles.add(6, "Bee Gees/Stayin Alive");
        popIngles.add(7, "Jennifer Lopez/Una Noche Mas");
        popIngles.add(8, "Marron 5/Maps");
        popIngles.add(9, "Marron 5/She Will Be Love");
        popIngles.add(10, "Marron 5/Sugar");
        popIngles.add(11, "Jason Mraz/I'm Yours");  
    }
    
    
    
    
    public void verCanciones(){
        
        for (int i = 0; i < popIngles.size(); i++) {
            System.out.println(popIngles.get(i));
        }
        
    }
    
    public void generoPopEleccion(){   
            
        int tamaño= popIngles.size();
        int valorDado = (int)Math.floor(Math.random()*tamaño+1);
        System.out.println(popIngles.get(valorDado));                    
        popIngles.remove(valorDado);
        
        
    }
    
    public void elegirGenero(){
        
        //Lista
        System.out.println("Elige un genero");
        System.out.println("Presiona un numero para elegir");
        System.out.println("1 - Pop en ingles");
        System.out.println("2 - Pop en español");
        System.out.println("3 - Rock en ingles");
        System.out.println("4 - Rock en español");
        System.out.println("5 - Metal");      
    }
    
    
}
