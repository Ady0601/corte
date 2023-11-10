/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;


import Logica_Negocio.Empleado;
import static Logica_Negocio.Empleado.ConcatenarCorreos;
import static Logica_Negocio.Empleado.calcularAñosServicioIndividual;
import Logica_Negocio.Helper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ady
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Declarar variables
        
        String Nombre = "";
        String Apellido ="";
        String Correo="";
        String Codigo = "";
        String Id = "";
        int Año_Ingreso = 0;
        int Año_Actual = 2023;
        int resultado =0;
        int Num_Empleados=0;
        int opcion=0;
        int bandera=0;
        int retorno=0;
        int retornoce=0;
        int retorno_c=0;
        int año_actual=2023;
        int años_empresa=0;
        int retornocecorreo=0;
      
        //Crear objetos 
        
        ArrayList<Empleado>listaempleados=new ArrayList<>();
       
        Scanner scan = new Scanner(System.in);
        
        do{
            //Opciones
            System.out.println("**********Menu de opciones**********");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Editar empleado");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Listar empleado");
            System.out.println("5. Eliminar empleado");
            System.out.println("6. Promedio del timepo de los empleado en la empresa");
            System.out.println("7. Concatenar correos");
            System.out.println("8. Años del empleado en la empresa");
          System.out.println("9. salir");
            
            try {
            System.out.println("Digite su opcion");
            opcion=scan.nextInt();
            }
            catch (InputMismatchException  e){
                System.out.println("Opcion no valida");
             break;
             
            }
            
            switch(opcion){
                //Registrar
                case 1:
                    try{
                    System.out.println("Digite el numero de empleados a registrar");
                    Num_Empleados= scan.nextInt();
                    }
                    catch (InputMismatchException  e){
                    System.out.println("Opcion no valida");
                    break;   
                    }
                   
                    if(Num_Empleados<0){System.out.println("El numero debe ser mayor a 0");}
                    if(Num_Empleados>0){
                        for (int i = 0; i < Num_Empleados; i++) {
                        
                            scan.nextLine();
                            System.out.println("Digite el nombre del empleado");
                            Nombre= scan.nextLine() ;
                          
                            while(Nombre.equals("")){
                            System.out.println("Digite el nombre del empleado");
                            Nombre= scan.nextLine();
                            retorno=Helper.RetornarValor(Nombre);
                            retornoce=Helper.RetornarCE(Nombre);
                            }
                            retorno=Helper.RetornarValor(Nombre);
                            retornoce=Helper.RetornarCE(Nombre);
                            
                           while (retorno !=0 || Nombre.equals("") || retornoce !=0) {
                            System.out.println("Digite el nombre del empleado");
                            Nombre=scan.nextLine();
                            retorno=Helper.RetornarValor(Nombre);
                            retornoce=Helper.RetornarCE(Nombre);
                            }
                        
                           //Apellido
                            System.out.println("Digite el apellido del empleado");
                            Apellido=scan.nextLine();
                            
                            while(Apellido.equals("")){
                            System.out.println("Digite el apellido del empleado");
                            Apellido= scan.nextLine();
                            retorno=Helper.RetornarValor1(Apellido);
                            retornoce=Helper.RetornarCE1(Apellido);
                            }
                            retorno=Helper.RetornarValor1(Apellido);
                            retornoce=Helper.RetornarCE1(Apellido);
                            
                            while (retorno !=0 || Apellido.equals("") || retornoce !=0) {
                            System.out.println("Digite el apellido del empleado");
                            Apellido=scan.nextLine();
                            retorno=Helper.RetornarValor1(Apellido);
                            retornoce=Helper.RetornarCE1(Apellido);
                            }
                           
                       //Codigo
            
                            System.out.println("Digite el codigo del empleado");
                            Codigo= scan.nextLine() ;
                           
                            while(Codigo.equals("")){
                            System.out.println("Digite el codigo del empleado");
                            Codigo= scan.nextLine();
                            }
                            retorno_c = Empleado.VerificarCodigo(listaempleados, Codigo);
                            while (retorno_c == 1) {
                            System.out.println("El código ya existe. Ingrese un código diferente");
                            Codigo = scan.nextLine();
                            retorno_c = Empleado.VerificarCodigo(listaempleados, Codigo);
                            }
                            //Correo
                            System.out.println("Digite el correo del empleado");
                            Correo=scan.nextLine();
                            Correo=JOptionPane.showInputDialog(null, "Digite el correo del empleado", "Correo", 1);
                            retornocecorreo=Helper.RetornarCECorreo(Correo);
                            
                            while(Correo.equals("")|| retornocecorreo!=0){
                                System.out.println("Digite el correo del empleado");
                            Correo=scan.nextLine();
                            Correo=JOptionPane.showInputDialog(null, "Digite el correo del empleado", "Correo", 1);
                            retornocecorreo=Helper.RetornarCECorreo(Correo);
                            }
                            }
                         
                         //Año ingreso   
                            System.out.println("Digite el año de ingreso del empleado");
                            Año_Ingreso= scan.nextInt();
                            while(Año_Ingreso>1850 ^ Año_Ingreso<2023|| Nombre.equals("")){
                            System.out.println("Digite el año de ingreso del empleado");
                            Año_Ingreso = scan.nextInt();
                            }
                         
                            
                        Empleado objempleado = new Empleado (Nombre, Codigo, Apellido, Correo, Año_Ingreso);
                            listaempleados.add(objempleado);
                          
                            System.out.println("Empleado creado:");
                            }
                            
                    
        
                    break;
                //Editar    
                case 2:
                    
                    System.out.println("Digite el id del empleado a modificar");
                    scan.nextLine();
                    Id=scan.nextLine();
                        for (int i = 0; i < listaempleados.size(); i++) {
                            if(listaempleados.get(i).getCodigo().equals(Id)){
                                
                                System.out.println("Digite el nombre del empleado");
                                Nombre= scan.nextLine();
                                
                                System.out.println("Digite el apellido del empleado");
                                Apellido= scan.nextLine();
                                
                                System.out.println("Digite el codigo del empleado");
                                Codigo= scan.nextLine();
                                
                                 System.out.println("Digite el correo del empleado");
                                Correo= scan.nextLine();
                                
                                System.out.println("Digite el año de ingreso del empleado");
                                Año_Ingreso= scan.nextInt();
                           
                                listaempleados.get(i).setNombre(Nombre);
                                
                                listaempleados.get(i).setApellido(Apellido);
                                
                                listaempleados.get(i).setCodigo(Codigo);
                                
                                listaempleados.get(i).setCorreo(Correo);
                                
                                listaempleados.get(i).setAño_Ingreso(Año_Ingreso);
                                System.out.println("Empleado editado ");
                            }else{
                               while(Codigo.equals("")){
                            System.out.println("Codigo no encontrado. Por favor pruebe otro codigo");}
                            Codigo= scan.nextLine();       
                        }
                        }
                break;
                //Buscar
                case 3:
                    
                    System.out.println("Digite el codigo del empleado a buscar");
                    scan.nextLine();
                    Id=scan.nextLine();
                    
                        for (int i = 0; i < listaempleados.size(); i++) {
                            if(listaempleados.get(i).getCodigo().equals(Id)) {
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                                
                                System.out.println("El apellido del empleado es:"+"\t"+listaempleados.get(i).getApellido());
                                
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                                
                                System.out.println("El correo del empleado es:"+"\t"+listaempleados.get(i).getCorreo());
                                
                                System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_Ingreso());

                            }
                        }
                        if (bandera==0){
                            System.out.println("El id del empreado es incorrecto o no esta registrado");
                        }
                        break;
                
                //Listar
                case 4:
                    if(listaempleados.size()>0){  
                        for (int i = 0; i < listaempleados.size(); i++) {
                            System.out.println("\n");
                            System.out.println("Empleado"+"\t"+(i+1));
                            System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                            
                            System.out.println("El apellido del empleado es:"+"\t"+listaempleados.get(i).getApellido());
                            
                            System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                            
                            System.out.println("El correo del empleado es:"+"\t"+listaempleados.get(i).getCorreo());
                            
                            System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_Ingreso());
                    }
                    }else
                    {
                        System.out.println("no hay empleados registrados");
                    }
                    break;
                    
         
                 // Eliminar
                case 5:
                    
                    System.out.println("Digite el codigo del empleado a buscar");
                    scan.nextLine();
                    Id=scan.nextLine();
                        for (int i = 0; i < listaempleados.size(); i++) {
                            if(listaempleados.get(i).getCodigo().equals(Id)){
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                listaempleados.remove(i);

                            }  
                        }
                     break;
                     
                
                  
                case 6:
                     // Obtener la lista de empleados
                     ArrayList<Empleado> empleados = listaempleados;

                    // Obtener el año actual
                    int añoActual = Calendar.getInstance().get(Calendar.YEAR);

                    // Calcular el promedio de edad
                    double promedioEdad = PromedioEdad(empleados, añoActual);

                    // Imprimir el promedio de edad
                    System.out.println("El promedio de años en la empresa de los empleados es de " + promedioEdad);

                    break;
                    case 7:
                  //Mostrar la lista de correos electrónicos
                  System.out.println("***Correos***");
                String retorno4 = ConcatenarCorreos(listaempleados);
                JOptionPane.showMessageDialog(null, retorno4,"Informacion de"
                        + " correos",1) ;
                  break;

                  case 8:
                       System.out.println("Digite el codigo del empleado para calcular sus años de servicio:");
                    scan.nextLine(); 
                    String codigoEmpleado = scan.nextLine();
                    int añosServicio = calcularAñosServicioIndividual(listaempleados, codigoEmpleado, año_actual);
                    if (añosServicio != -1) {
                        System.out.println("El empleado con código " + codigoEmpleado + " tiene " + añosServicio + " años de servicio.");
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;
               
                case 9:
                    //Salir
                    System.out.println("Operacion terminada con exito");
                    break;
                default:
                    System.out.println("Opcion no valida");
                }
            }while(opcion!=9);
        }

public static double PromedioEdad(ArrayList<Empleado> listaempleados, int añoActual) {

    // Declarar variables
    int totalEmpleados = listaempleados.size();
    int sumaEdad = 0;

    // Calcular la suma de los años de ingreso
    for (Empleado empleado : listaempleados) {
        sumaEdad += añoActual - empleado.getAño_Ingreso();
    }

    // Calcular el promedio
    double promedioEdad = (double) sumaEdad / totalEmpleados;

    return promedioEdad;
}

        }
        
   
