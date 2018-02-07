/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crai;

/**
 *
 * @author JSarmiento
 */
public class CeutecSanPedroSula extends UnitecSanPedroSula{
    String mylibro;
    String[] ceutecSPSLibros={"Quimica", "Filosofia", "Redes", "SO", "Programacion", "algebra"};
    @Override
    public String BuscarLibros(String seekLibro){
       this.mylibro=seekLibro;
       if(seekLibro.equalsIgnoreCase(this.ceutecSPSLibros[0])|| 
          seekLibro.equalsIgnoreCase(this.ceutecSPSLibros[1])||
          seekLibro.equalsIgnoreCase(this.ceutecSPSLibros[2])||
          seekLibro.equalsIgnoreCase(this.ceutecSPSLibros[3])||
          seekLibro.equalsIgnoreCase(this.ceutecSPSLibros[4])||
          seekLibro.equalsIgnoreCase(this.ceutecSPSLibros[5])){
          System.out.println("El libro ha sido encontrado con exito...");
       }else{
          System.out.println("\033[31mEste libro no esta disponible en este campus"+ librosOtherU());
       }
       return seekLibro;    
    } 
    @Override
     public String librosOtherU(){
            if (unitecTegusLibros[0].equalsIgnoreCase(mylibro) && unitecSPSLibros[0].equalsIgnoreCase(mylibro)||
                      unitecTegusLibros[1].equalsIgnoreCase(mylibro) && unitecSPSLibros[1].equalsIgnoreCase(mylibro)||
                      unitecTegusLibros[2].equalsIgnoreCase(mylibro) && unitecSPSLibros[2].equalsIgnoreCase(mylibro)||
                      unitecTegusLibros[3].equalsIgnoreCase(mylibro) && unitecSPSLibros[3].equalsIgnoreCase(mylibro)||
                      unitecTegusLibros[4].equalsIgnoreCase(mylibro) && unitecSPSLibros[4].equalsIgnoreCase(mylibro)||
                      unitecTegusLibros[5].equalsIgnoreCase(mylibro) && unitecSPSLibros[5].equalsIgnoreCase(mylibro)){
                      return "\033[34m, pero se lo vamos a conseguir en Unitec Tegucigalpa o Unitec San Pedro Sula";
            }else if (unitecTegusLibros[0].equalsIgnoreCase(mylibro)||
                    unitecTegusLibros[1].equalsIgnoreCase(mylibro)||
                    unitecTegusLibros[2].equalsIgnoreCase(mylibro)||
                    unitecTegusLibros[3].equalsIgnoreCase(mylibro)||
                    unitecTegusLibros[4].equalsIgnoreCase(mylibro)||
                    unitecTegusLibros[5].equalsIgnoreCase(mylibro)){
                    return "\033[34m, pero se lo vamos a conseguir en Unitec Tegucigalpa.";   
            }else if (unitecSPSLibros[0].equalsIgnoreCase(mylibro)||
                unitecSPSLibros[1].equalsIgnoreCase(mylibro)||
                unitecSPSLibros[2].equalsIgnoreCase(mylibro)||
                unitecSPSLibros[3].equalsIgnoreCase(mylibro)||
                unitecSPSLibros[4].equalsIgnoreCase(mylibro)||
                unitecSPSLibros[5].equalsIgnoreCase(mylibro)){
                return "\033[34m, pero se  lo vamos a conseguir en Unitec San Pedro Sula.";
            }else{
             return "\033[31m, ni en ningún otro campus, verifique si su información es correcta.";   
            }
           
    } 
     
}
