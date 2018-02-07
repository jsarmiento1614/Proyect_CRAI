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
public class UnitecTegucigalpa{
    String seekLibro;
    String[] unitecTegusLibros={"Politica", "Economia", "Historia", "SO", "Programacion", "algebra"};
    
    public String BuscarLibros(String seekLibro){
       this.seekLibro=seekLibro;
       if(seekLibro.equalsIgnoreCase(this.unitecTegusLibros[0])|| 
          seekLibro.equalsIgnoreCase(this.unitecTegusLibros[1])||
          seekLibro.equalsIgnoreCase(this.unitecTegusLibros[2])||
          seekLibro.equalsIgnoreCase(this.unitecTegusLibros[3])||
          seekLibro.equalsIgnoreCase(this.unitecTegusLibros[4])||
          seekLibro.equalsIgnoreCase(this.unitecTegusLibros[5])){
          System.out.println("El libro ha sido encontrado con exito...");
       }else{
       System.out.println(" \033[31mEste libro no esta disponible en este campus"+ librosOtherU());
       }
       return seekLibro;    
    }
    public String librosOtherU(){
            UnitecSanPedroSula call =new UnitecSanPedroSula();
            CeutecSanPedroSula callceutec=new CeutecSanPedroSula();
            if (call.unitecSPSLibros[0].equalsIgnoreCase(seekLibro) && callceutec.ceutecSPSLibros[0].equalsIgnoreCase(seekLibro)||
                call.unitecSPSLibros[1].equalsIgnoreCase(seekLibro) && callceutec.ceutecSPSLibros[1].equalsIgnoreCase(seekLibro)||
                call.unitecSPSLibros[2].equalsIgnoreCase(seekLibro) && callceutec.ceutecSPSLibros[2].equalsIgnoreCase(seekLibro)||
                call.unitecSPSLibros[3].equalsIgnoreCase(seekLibro) && callceutec.ceutecSPSLibros[3].equalsIgnoreCase(seekLibro)||
                call.unitecSPSLibros[4].equalsIgnoreCase(seekLibro) && callceutec.ceutecSPSLibros[4].equalsIgnoreCase(seekLibro)||
                call.unitecSPSLibros[5].equalsIgnoreCase(seekLibro) && callceutec.ceutecSPSLibros[5].equalsIgnoreCase(seekLibro)){
                      return "\033[34m, pero se lo vamos a conseguir en Unitec San Pedro Sula o Ceutec San Pedro Sula";
            }else if (call.unitecSPSLibros[0].equalsIgnoreCase(seekLibro)||
                    call.unitecSPSLibros[1].equalsIgnoreCase(seekLibro)||
                    call.unitecSPSLibros[2].equalsIgnoreCase(seekLibro)||
                    call.unitecSPSLibros[3].equalsIgnoreCase(seekLibro)||
                    call.unitecSPSLibros[4].equalsIgnoreCase(seekLibro)||
                    call.unitecSPSLibros[5].equalsIgnoreCase(seekLibro)){
                    return "\033[34m, pero se  lo vamos a conseguir en Unitec San Pedro Sula.";
            }else if (callceutec.ceutecSPSLibros[0].equalsIgnoreCase(seekLibro)||
                      callceutec.ceutecSPSLibros[1].equalsIgnoreCase(seekLibro)||
                      callceutec.ceutecSPSLibros[2].equalsIgnoreCase(seekLibro)||
                      callceutec.ceutecSPSLibros[3].equalsIgnoreCase(seekLibro)||
                      callceutec.ceutecSPSLibros[4].equalsIgnoreCase(seekLibro)||
                      callceutec.ceutecSPSLibros[5].equalsIgnoreCase(seekLibro)){
                      return "\033[34m, pero se lo vamos a conseguir en Ceutec San Pedro Sula."; 
            }else{
             return "\033[31m, ni en ningún otro campus, verifique si su información es correcta.";   
            } 
    }

    
}

