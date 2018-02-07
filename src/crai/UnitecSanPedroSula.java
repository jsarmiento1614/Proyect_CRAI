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
public class UnitecSanPedroSula extends UnitecTegucigalpa{
    String libro;
    String[] unitecSPSLibros={"Biologia", "Economia", "Redes", "Ingles", "Antropologia", "algebra"};
    
    @Override
    public String BuscarLibros(String seekLibro){
       this.libro=seekLibro;
       if(seekLibro.equalsIgnoreCase(this.unitecSPSLibros[0])|| 
          seekLibro.equalsIgnoreCase(this.unitecSPSLibros[1])||
          seekLibro.equalsIgnoreCase(this.unitecSPSLibros[2])||
          seekLibro.equalsIgnoreCase(this.unitecSPSLibros[3])||
          seekLibro.equalsIgnoreCase(this.unitecSPSLibros[4])||
          seekLibro.equalsIgnoreCase(this.unitecSPSLibros[5])){
          System.out.println("El libro ha sido encontrado con exito...");
       }else{
          System.out.println("\033[31mEste libro no esta disponible en este campus"+ librosOtherU());
       }
       return seekLibro;    
    } 
    @Override
     public String librosOtherU(){
            CeutecSanPedroSula callceutec=new CeutecSanPedroSula();
            if (unitecTegusLibros[0].equalsIgnoreCase(libro) && callceutec.ceutecSPSLibros[0].equalsIgnoreCase(libro)||
                      unitecTegusLibros[1].equalsIgnoreCase(libro) && callceutec.ceutecSPSLibros[1].equalsIgnoreCase(libro)||
                      unitecTegusLibros[2].equalsIgnoreCase(libro) && callceutec.ceutecSPSLibros[2].equalsIgnoreCase(libro)||
                      unitecTegusLibros[3].equalsIgnoreCase(libro) && callceutec.ceutecSPSLibros[3].equalsIgnoreCase(libro)||
                      unitecTegusLibros[4].equalsIgnoreCase(libro) && callceutec.ceutecSPSLibros[4].equalsIgnoreCase(libro)||
                      unitecTegusLibros[5].equalsIgnoreCase(libro) && callceutec.ceutecSPSLibros[5].equalsIgnoreCase(libro)){
                      return "\033[34m, pero se lo vamos a conseguir en Unitec Tegucigalpa o Ceutec San Pedro Sula";
            }else if (unitecTegusLibros[0].equalsIgnoreCase(libro)||
                    unitecTegusLibros[1].equalsIgnoreCase(libro)||
                    unitecTegusLibros[2].equalsIgnoreCase(libro)||
                    unitecTegusLibros[3].equalsIgnoreCase(libro)||
                    unitecTegusLibros[4].equalsIgnoreCase(libro)||
                    unitecTegusLibros[5].equalsIgnoreCase(libro)){
                    return "\033[34m, pero se lo vamos a conseguir en Unitec Tegucigalpa."; 
            }else if (callceutec.ceutecSPSLibros[0].equalsIgnoreCase(libro)||
                      callceutec.ceutecSPSLibros[1].equalsIgnoreCase(libro)||
                      callceutec.ceutecSPSLibros[2].equalsIgnoreCase(libro)||
                      callceutec.ceutecSPSLibros[3].equalsIgnoreCase(libro)||
                      callceutec.ceutecSPSLibros[4].equalsIgnoreCase(libro)||
                      callceutec.ceutecSPSLibros[5].equalsIgnoreCase(libro)){
                      return "\033[34m, pero se lo vamos a conseguir en Ceutec San Pedro Sula."; 
            }else{   
             return "\033[31m, ni en ningún otro campus, verifique si su información es correcta.";   
            }
              
    }      
}
