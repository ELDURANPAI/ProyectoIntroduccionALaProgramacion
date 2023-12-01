/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author DURAN
 */
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
