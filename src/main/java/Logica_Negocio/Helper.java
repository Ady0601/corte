/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1003311202
 */
public class Helper {
  
 public static int RetornarValor(String Nombre){
int Letra=0;
int Numero=0;
                    
for (int i=0; i<Nombre.length();i++){
    boolean bandera=Character.isDigit(Nombre.charAt(i));
         if(bandera){    
            System.out.println("Es un numero"+Nombre.charAt(i));
             Numero++;}
         else{System.out.println("Es una letra "+Nombre.charAt(i));
              Letra++;}
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
                {ce++;}
                 if(Nombre.charAt(j)=='~')
                {ce++;}
                 if(Nombre.charAt(j)=='/')
                { ce++;}
                 if(Nombre.charAt(j)==';')
                {ce++;}
                 if(Nombre.charAt(j)==':')
                { ce++;}
                 if(Nombre.charAt(j)=='"')
                {ce++;}
                 if(Nombre.charAt(j)=='!')
                {ce++;}
                  if(Nombre.charAt(j)==' ')
                {ce++;}
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
  
  
public static int RetornarCE1(String Apellido){
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
        } return ce;
                           }
          

public static int RetornarCECorreo(String nombre){
                    int ce=0;

                        for (int j = 0; j < nombre.length(); j++) {
                            boolean flag = Character.isLetter(nombre.charAt(j));
                            if(!flag) {
                            //System.out.println("'"+ nombre.charAt(j)+"' is a caracter special");
                            
                            if(nombre.charAt(j)=='~')
                            {
                                ce++;
                            }
                            if(nombre.charAt(j)=='/')
                            {
                                ce++;
                            }
                            if(nombre.charAt(j)==';')
                            {
                                ce++;
                            }
                            if(nombre.charAt(j)==':')
                            {
                                ce++;
                            }
                            if(nombre.charAt(j)=='"')
                            {
                                ce++;
                            }
                            if(nombre.charAt(j)=='!')
                            {
                                ce++;
                            }
                            if(nombre.charAt(j)==' ')
                            {
                                ce++;
                            }
                            
                            }
                            }
                            return ce;
}
}

                        
    





             
   
  