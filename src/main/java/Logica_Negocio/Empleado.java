/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ady
 */
public class Empleado {
    //Atributos
    
    public  String Nombre;
    public String Codigo;
    public String Apellido;
    public String Correo;
    public int Año_Ingreso;
    
  //CP

    public Empleado() {
    }
  
  //Constructor no parametrizado

    public Empleado(String Nombre, String Codigo, int Año_Ingreso) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Año_Ingreso = Año_Ingreso;
    }

    public Empleado(String Nombre, String Codigo, String Apellido, String Correo, int Año_Ingreso) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Año_Ingreso = Año_Ingreso;
    }

    

    
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    //Setter
    public void setAño_Ingreso(int Año_Ingreso) {
        this.Año_Ingreso = Año_Ingreso;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    
    //Getter

    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public int getAño_Ingreso() {
        return Año_Ingreso;
    }

  

    public String getApellido() {
        return Apellido;
    }

    public String getCorreo() {
        return Correo;
    }
    

  
   
    }
  
   
