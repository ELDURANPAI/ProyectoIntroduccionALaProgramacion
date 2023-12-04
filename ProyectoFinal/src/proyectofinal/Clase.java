/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 * Autores:
  
 * Anferny Sanabria
 * Byron Zumbado
 * Esteban Picado
 * Jorge Durán
 
 **/

public class Clase {
    // Atributos
    private String nombre;
    private String hora;
    private Empleado[][] matrizEmpleados;

    // Constructor
    public Clase(String nombre, String hora, Empleado[][] matrizEmpleados) {
        this.nombre = nombre;
        this.hora = hora;
        this.matrizEmpleados = matrizEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Empleado[][] getMatrizEmpleados() {
        return matrizEmpleados;
    }

    public void setMatrizEmpleados(Empleado[][] matrizEmpleados) {
        this.matrizEmpleados = matrizEmpleados;
    }
}
