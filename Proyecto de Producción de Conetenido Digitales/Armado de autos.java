/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armado_de_vehiculos;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author quiji
 */
public class Armado_de_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int salir, op;
        ArrayList<Carro> listaCarros = new ArrayList<>();
        ArrayList<Moto> listaMotos = new ArrayList<>();
        do{  
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Armar Carro");
            System.out.println("2. Armar Motocicleta");
            System.out.println("3. Ver Carro");
            System.out.println("4. Ver Moto");
            System.out.println("5. Salir");
            op = scan.nextInt();
            
            switch(op){
                case 1:
                    int agnoModelo;
                    String marcaCarro;
                    String tipoAro;
                    String colorCarro;
                    int capacidad;
                    String tipoCarro;
                    
                    System.out.println("");
                    System.out.println("Ingrese lo que se le solicita:");
                    System.out.println("Año de Modelo: ");
                    agnoModelo = scan.nextInt();
                    System.out.println("Marca de Carro: ");
                    marcaCarro = scan.next();
                    System.out.println("Tipo de Aros (Magnesio, Acero y Aluminio): ");
                    tipoAro = scan.next();
                    System.out.println("Color de Carro: ");
                    colorCarro = scan.next();                   
                    System.out.println("Tipo de Carro (Sedan, Hatchback, Pick up y Camioneta): ");;
                    tipoCarro = scan.next();
                    scan.nextLine();
                    System.out.println("Capacidad de pasajeros: ");
                    capacidad = scan.nextInt();
                    
                    Carro c1 = new Carro(agnoModelo, marcaCarro, tipoAro, colorCarro, capacidad, tipoCarro);
                    listaCarros.add(c1);
                    
                    System.out.println("");
                    System.out.println("Ha armado el carro con exito.");
                    System.out.println("");
                    System.out.println("");
                    
                    break;
                case 2:
                    int agnoModelMoto;
                    String marcaBike;
                    String typeMoto;
                    
                    System.out.println("");
                    System.out.println("Ingrese lo que se le solicita:");
                    System.out.println("Año de Modelo:");
                    agnoModelMoto = scan.nextInt();
                    System.out.println("Marca de la Motocicleta:");
                    marcaBike = scan.next();
                    System.out.println("Tipo de la Motocicleta (Bobber, Chopper y Cruiser)");
                    typeMoto = scan.next();
                    
                    Moto m1 = new Moto(agnoModelMoto, marcaBike, typeMoto);
                    listaMotos.add(m1);
                    
                    System.out.println(" ");
                    System.out.println("Ha armado la motocicleta con exito.");
                    System.out.println("");
                    System.out.println("");
                    
                    break;
                case 3:
                    int op2;
                    System.out.println("Ingrese un numero para ver la informacion del carro");
                    op2 = scan.nextInt();
                    listaCarros.get(op2).informacionCarro();
                    System.out.println("");
                    System.out.println("");
                    break;
                case 4:
                    int opc1;
                    System.out.println("Ingrese un numero para ver la informacion de la motocicleta");
                    opc1 = scan.nextInt();
                    listaMotos.get(opc1).informacionMoto();
                    System.out.println("");
                    System.out.println("");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ha ingresado una opcion invalida");
                    break;
            }
            
            System.out.println("Desea salir del programa? 1:Si 2:No");
            salir = scan.nextInt();   
        }while(salir == 2);
    }
    
}