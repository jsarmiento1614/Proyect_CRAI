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
import java.util.Scanner;
public class MenuPricipalCRAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sede;
        String seekLibro;
        Scanner teclado =new Scanner(System.in);
        //int salirDo=1;
        do{
        System.out.println();
        System.out.println("Libros> \033[35mPolitica, Economia, SO, Historia, Programacion, Algebra, Ingles, Antropologia, Redes.");
        System.out.println("********************************************");
        System.out.println("        1) Unitec Tegucigalpa");
        System.out.println("        2) Unitec San Pedro Sula");  
        System.out.println("        3) Ceutec San Pedro Sula"); 
        System.out.println("********************************************");
        System.out.println("Seleccione la Sede para consultar el libro: ");
        sede=teclado.nextInt();
        teclado.nextLine();//Limpiamos buffer de entrada
        System.out.println("_____________________________________________");
        if (sede==1){
            System.out.println("Ingrese el libro a llevar: ");
            seekLibro=teclado.nextLine();
            System.out.println("_____________________________________________");
            UnitecTegucigalpa callLibro =new UnitecTegucigalpa();
            callLibro.BuscarLibros(seekLibro);
        }else if (sede==2){
            System.out.println("Ingrese el libro a llevar: ");
            seekLibro=teclado.nextLine();
            System.out.println("_____________________________________________");
            UnitecSanPedroSula callLibro =new UnitecSanPedroSula();
            callLibro.BuscarLibros(seekLibro);
        }else if (sede==3){
            System.out.println("Ingrese el libro a llevar: ");
            seekLibro=teclado.nextLine();
            System.out.println("_____________________________________________");
            CeutecSanPedroSula callLibro =new CeutecSanPedroSula();
            callLibro.BuscarLibros(seekLibro);     
        }else if (sede==4){
           System.out.println("\033[31mSaliendo del sistmema.");
           break;
        }else{
            System.out.println("\033[31mHa Ocurrido un error en la busqueda."); 
        }  
    }while(sede!=4);
  }
    
}
