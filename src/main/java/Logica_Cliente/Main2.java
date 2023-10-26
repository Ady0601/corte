/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.ArrayList;
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
        
      
        //Crear objetos 
        Empleado objempleado;
        ArrayList<Empleado>listaempleados=new ArrayList<>();
        ArrayList<Empleado>listacorreos=new ArrayList<>();
        
        JOptionPane.showMessageDialog(null, listacorreos, "Informacion de correos", 1);

                        //Scanner 
        Scanner scan = new Scanner(System.in);
        
        do{
            //Opciones
            System.out.println("**********Menu de opciones**********");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Editar empleado");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Listar empleado");
            System.out.println("5. Eliminar empleado");
            System.out.println("6. Tiempo de trabajo del empleado");
            System.out.println("7. Salir");
            System.out.println("Digite su opcion");
            opcion=scan.nextInt();
        
            
            switch(opcion){
                //Registrar
                case 1:
                    System.out.println("Digite el numero de empleados a registrar");
                    scan.nextLine();
                    Num_Empleados= scan.nextInt();
                   
                    if(Num_Empleados<0){System.out.println("El numero debe ser mayor a 0"); 
                    }
                    
                    if(Num_Empleados>0){
                        for (int i = 0; i < Num_Empleados; i++) {
                        
                        
                            scan.nextLine();
                            System.out.println("Digite el nombre del empleado");
                            Nombre= scan.nextLine() ;
                          
                            while(Nombre.equals("")){
                            System.out.println("Digite el nombre del empleado");
                            Nombre= scan.nextLine();
                            retorno=RetornarValor(Nombre);
                            retornoce=RetornarCE(Nombre);
                            }
                            
                            retorno=RetornarValor(Nombre);
                            retornoce=RetornarCE(Nombre);
                            
                           while (retorno !=0 || Nombre.equals("") || retornoce !=0) {
                            System.out.println("Digite el nombre del empleado");
                            Nombre=scan.nextLine();
                            retorno=RetornarValor(Nombre);
                            retornoce=RetornarCE(Nombre);
                            }
                        
                          System.out.println("Digite el apellido del empleado");
                            Apellido=scan.nextLine();
                            
                            while(Apellido.equals("")){
                            System.out.println("Digite el apellido del empleado");
                            Apellido= scan.nextLine();
                            retorno=RetornarValor1(Apellido);
                            retornoce=RetornarCE1(Apellido);
                            }
                            
                            retorno=RetornarValor1(Apellido);
                            retornoce=RetornarCE1(Apellido);
                            
                            while (retorno !=0 || Apellido.equals("") || retornoce !=0) {
                            System.out.println("Digite el apellido del empleado");
                            Apellido=scan.nextLine();
                            retorno=RetornarValor1(Apellido);
                            retornoce=RetornarCE1(Apellido);
                            }
                            
                            System.out.println("Digite el codigo del empleado");
                            Codigo= scan.nextLine() ;
                            
                            while(Codigo.equals("")){
                            System.out.println("Digite el codigo del empleado");
                            Codigo= scan.nextLine();
                            }
                            
                            System.out.println("Digite el correo del empleado");
                            Correo= scan.nextLine() ;
                            
                            while(Correo.equals("")){
                            System.out.println("Digite el correo del empleado");
                             Correo=JOptionPane.showInputDialog(null, "Digite el correo del empleado", "Correo", 1);
        
                          
                            }
                            
                            System.out.println("Digite el año de ingreso del empleado");
                            Año_Ingreso= scan.nextInt();
                            while(Año_Ingreso>1993 ^ Año_Ingreso<2023|| Nombre.equals("")){
                            System.out.println("Digite el año de ingreso del empleado");
                            Año_Ingreso = scan.nextInt();
                            }   
                        
                         objempleado = new Empleado (Nombre, Codigo, Apellido, Correo, Año_Ingreso);
                            listaempleados.add(objempleado);
                          
                        
                            
                            System.out.println("Empleado creado");
                            
                            
                        }
                        
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
                     
              case 6://Salir
                case 7:
                      
                    System.out.println("Operacion cancelada");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    
              
               {
                    
                         
                 
               }
             
                    
            }
            }while(opcion!=6);
                
        }
                public static int RetornarValor(String Nombre){
                    int Letra=0;
                    int Numero=0;
                    
                    for (int i=0; i<Nombre.length();i++){
                        boolean bandera=Character.isDigit(Nombre.charAt(i));
                        if(bandera)
                        {    
                            System.out.println("Es un numero"+Nombre.charAt(i));
                            Numero++;
                        }else
                        {
                            System.out.println("Es una letra "+Nombre.charAt(i));
                            Letra++;
                        }
                    
                            
                    }
                    return Numero;    
                }
                
                public static int RetornarCE(String Nombre)
    {
        int ce=0;

        for (int j = 0; j < Nombre.length(); j++) {
             boolean flag = Character.isLetter(Nombre.charAt(j));
             if(!flag) {
                System.out.println("'"+ Nombre.charAt(j)+"' is a caracter special");
                if(Nombre.charAt(j)=='@')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)=='~')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)=='/')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)==';')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)==':')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)=='"')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)=='!')
                {
                    ce++;
                }
                  if(Nombre.charAt(j)==' ')
                {
                    ce++;
                }
             }
           

        }
        return ce;
    }

  public static int RetornarValor1(String Apellido){
                    int Letra=0;
                    int Numero=0;
                    
                    for (int i=0; i<Apellido.length();i++){
                        boolean bandera=Character.isDigit(Apellido.charAt(i));
                        if(bandera)
                        {    
                            System.out.println("Es un numero"+Apellido.charAt(i));
                            Numero++;
                        }else
                        {
                            System.out.println("Es una letra "+Apellido.charAt(i));
                            Letra++;
                        }
                    
                            
                    }
                    return Numero;    
                }
    
    
    public static int RetornarCE1(String Apellido)
    {
        int ce=0;

        for (int j = 0; j < Apellido.length(); j++) {
             boolean flag = Character.isLetter(Apellido.charAt(j));
             if(!flag) {
                System.out.println("'"+ Apellido.charAt(j)+"' is a caracter special");
                if(Apellido.charAt(j)=='@')
                {
                    ce++;
                }
                 if(Apellido.charAt(j)=='~')
                {
                    ce++;
                }
                 if(Apellido.charAt(j)=='/')
                {
                    ce++;
                }
                 if(Apellido.charAt(j)==';')
                {
                    ce++;
                }
                 if(Apellido.charAt(j)==':')
                {
                    ce++;
                }
                 if(Apellido.charAt(j)=='"')
                {
                    ce++;
                }
                 if(Apellido.charAt(j)=='!')
                {
                    ce++;
                }
                  if(Apellido.charAt(j)==' ')
                {
                    ce++;
                }
             }
        }
        return ce;
    }
        
}
    
  
    
    

