/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Juárez Arevalo
 */
public class Cliente extends Persona {
    private String nit;

    public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);// atrivutos de la super clase
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar (){
    System.out.println("Nit: " + getNit());
    System.out.println("Nombres: " + getNombres());
    System.out.println("Apellidos: " + getApellidos());
    System.out.println("Direccion: " + getDireccion());
    System.out.println("Telefono: " + this.getTelefono());
    System.out.println("Fecha Nacimiento: " + this.getFecha_nacimiento());
    System.out.println("_____________________________________________________");
    }
    
    @Override
    public void modificar (){
    System.out.println("Metodo Modificar");
    }
    
    @Override
    public void eliminar (){
    System.out.println("Metodo Eliminar");
    }
    
}
