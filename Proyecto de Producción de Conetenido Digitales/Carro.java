/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armado_de_vehiculos;

/**
 *
 * @author quiji
 */
public class Carro {
    int agnoModel;
    String marcaCar;
    String typeAro;
    String colorCar;
    int capacity;
    String tipoCar;
    
    public Carro(int agnoModelo, String marcaCarro, String tipoAro, String colorCarro, int capacidad, String tipoCarro){
        this.agnoModel = agnoModelo;
        this.marcaCar = marcaCarro;
        this.typeAro = tipoAro;
        this.colorCar = colorCarro;
        this.capacity = capacidad;
        this.tipoCar = tipoCarro;
    }
    
    public void informacionCarro(){
        System.out.println("Carro:");
        System.out.println("Año del Modelo: " + agnoModel);
        System.out.println("Marca del Carro: " + marcaCar);
        System.out.println("Tipo de Aros: " + typeAro);
        System.out.println("Color de Carro: " + colorCar);
        System.out.println("Capacidad de pasajeros: " + capacity);
        System.out.println("Tipo de Carro: " + tipoCar);
    }
}