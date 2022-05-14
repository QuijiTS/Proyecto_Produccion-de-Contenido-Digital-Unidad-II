/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armado_de_vehiculos;

/**
 *
 * @author quiji
 */
public class Moto {
    int agnoModelMoto;
    String marcaBike;
    String typeMoto;
    
    public Moto(int agnoModel, String marcaBike, String typeMoto){
        this.agnoModelMoto = agnoModel;
        this.marcaBike = marcaBike;
        this.typeMoto = typeMoto;
    }
    
    public void informacionMoto(){
        System.out.println("Moto: ");
        System.out.println("Año de Modelo: " + agnoModelMoto);
        System.out.println("Marca de la Motocicleta: " + marcaBike);
        System.out.println("Tipo de la Motocicleta: " + typeMoto);
    }
}
