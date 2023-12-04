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

public class Gimnasio {
    // Atributos
    private Empleado[] vectorEmpleados;

    // Constructor
    public Gimnasio(Empleado[] vectorEmpleados) {
        this.vectorEmpleados = vectorEmpleados;
    }

    public Empleado[] getVectorEmpleados() {
        return vectorEmpleados;
    }

    public void setVectorEmpleados(Empleado[] vectorEmpleados) {
        this.vectorEmpleados = vectorEmpleados;
    }
}
