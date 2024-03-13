
package karaoke;

import java.util.ArrayList;
import java.util.Scanner;

public class Karaoke {

    
    public static void main(String[] args) {
       
        Scanner op=new Scanner(System.in);
        Scanner leer=new Scanner(System.in);
        Canciones elegir=new Canciones();
        Integrantes grupo=new Integrantes();
        int menuPrincipal;
        do {
            System.out.println("Bienvenidos a Karaoke");
            System.out.println("Elija una opcion");
            System.out.println("1 - Comenzar");
            System.out.println("2 - Salir de Karaoke");
            menuPrincipal=op.nextInt();
            
            switch(menuPrincipal){
            case 1:
      
               int subMenu;
                    do {
                          System.out.println("Presion 1 para cargar participantes");
                          System.out.println("Presione 2 para !!!!inciar partida¡¡¡¡");
                          System.out.println("Presione 3 para volver atras");
                          subMenu=op.nextInt();
                    
                          switch(subMenu){
                   
                                 case 1:
                                              grupo.cantParticipantes();
                                                      break;
                                 case 2:
                                            int otraRonda=0;
                                            elegir.llenarPopEnIngles();
                                
                                            do {
                         
                                                grupo.azarParticipantes();
                                                elegir.elegirGenero();
                                                int genero=leer.nextInt();
                               
                                               switch(genero){
                                                      case 1:
                                                                    elegir.generoPopEleccion();
                                                                             break;
                                    
                                                }
                                               System.out.println("Presione '0' para siguiente ronda o '1' si desea salir");
                                               otraRonda=op.nextInt();
                              
                                             } while (otraRonda!=1);
                            
                           }
                     
                  } while (subMenu!=3);
                            break;
            case 2:
                System.out.println("Saliendo....");
                break;
            }
            
        } while (menuPrincipal==1);
    }
             
    
}
