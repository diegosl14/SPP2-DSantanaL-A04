/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.dsantanal.a04;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class SPP2DSantanaLA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar variables
        int opcion;
        Scanner sc=new Scanner(System.in);
        double sin, cos, tan, ang;
        
        
        //Menu
        System.out.println("Opciones de conversión");
        System.out.println("Encontrar seno del ángulo");
        System.out.println("Encontrar coseno del ángulo");
        System.out.println("Encontrar tangente del ángulo");
        System.out.println("Salir");
        opcion=sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Calcular seno");
                ang=ang();
                if (ang>=0 & ang<=360){
                    ang=Math.toRadians(ang);
                    sin=Math.sin(ang);
                    System.out.println("Seno del ángulo ingresado:"+sin);
                }else{
                    System.out.println("El ángulo ingresado no se encuentra en el rango de ángulos");
                }
                break;
            case 2:
                System.out.println("Calcular coseno");
                ang=ang();
                if(ang>=0 & ang<=360){
                    ang=Math.toRadians(ang);
                    cos=Math.cos(ang);
                    System.out.println("Coseno del ángulo ingresado"+cos);
                }else{
                    System.out.println("El ángulo ingresado no se encuentra en el rango de ángulos");
                }
                break;
            case 3:
                System.out.println("Calcular tangente");
                ang=ang();
                if(ang>=0 & ang<=360){
                    ang=Math.toRadians(ang);
                    tan=Math.tan(ang);
                    System.out.println("Tangente del ángulo ingresado"+tan);
                }else{
                    System.out.println("El ángulo ingresado no se encuentra en el rango de ángulos");
                }
                break;
                
        }
        
    }
    static double ang(){
        Scanner sc=new Scanner(System.in);
        double ang;
        
        System.out.println("Ingresar ángulo");
                ang=sc.nextDouble();
        return ang;
    }
}

