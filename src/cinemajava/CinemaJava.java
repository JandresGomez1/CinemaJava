package cinemajava;
import java.util.Scanner;

public class CinemaJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        int opcCompra;
        int i; 
        
        
        //creacion de la pelicula
        Peliculas pelicula1 = new Peliculas("El saltamontes", 90, 15, "James");
        Cine cine1 = new Cine(pelicula1, 5500);
        Espectador[] espectador = new Espectador[5];
        espectador[0] = new Espectador("James", 15, 5500.0);
        espectador[1] = new Espectador("Luis", 16, 6000.0);
        espectador[2] = new Espectador("Sara", 16, 6000.0);
        espectador[3] = new Espectador("Tatiana", 23, 6000.0);
        espectador[4] = new Espectador("Zury", 17, 8000.0);
        
        cine1.mensajeCine();
        
        
        // menu 
        System.out.println("""
                           Que deseas hacer?
                           1. Mostrar nombre de la pelicula.
                           2. Mostrar lo requisitos para ver la pelicula.
                           3. Comprar asientos.
                           4. Salir del programa.
                           Que opcion deseas?
                           """);
        // 
        opc=sc.nextInt();
        //creacion siclo while
        while( opc!= 4){
            switch(opc){
                case 1:
                    System.out.println("Nombre de la pelicula: " + pelicula1.getTitulo());
                    System.out.println("Que opcion deseas ahora?");
                    opc = sc.nextInt();
                    break;
            
                 case 2:
                    System.out.println("Requisitos:");
                    System.out.println("Valor de la entrada: " + cine1.getvEntrada());
                    System.out.println("Edad minima: " + pelicula1.getEdadMin());
                    System.out.println("");
                    System.out.println("Que opcion deseas ahora?");
                    opc = sc.nextInt();
                     System.out.println("");
                    break;
                case 3:
                for (Espectador espectador1 : espectador) {
                    cine1.mostrarAsientos();
                    System.out.println("");
                    cine1.asignarAsiento(espectador1);
                    System.out.println("Desea asginar otro asiento?");
                    System.out.println("1. si");
                    System.out.println("2. no");
                    opcCompra=sc.nextInt();
                    System.out.println("");
                    if(opcCompra==1){
                        
                    }else{System.exit(0);}
                }
                default: System.out.println("opcion no valida");
            }
        }
        System.out.println("Vuelva Pronto ");
    }
        
}  
   
