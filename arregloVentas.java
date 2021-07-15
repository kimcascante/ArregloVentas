package Semana12;

/**
 * Nombre del programa: 
 * Descripcion: Modifique el programa del punto 1, para que ahora también averigüe si hay una alguna
    venta de la semana que fuese mayor o igual a $500, e imprima el día correspondiente de
    esa venta.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.*;

public class ej4 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException{ 
        int[] arregloSemana = new int[6];
        int suma = 0;
        int diaMayor=0;
        int diaSemana=0; 
        String dia="";
        String dia500="";

        //String [] arregloDiaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};

        for (int count = 0; count < arregloSemana.length; count++) {
            out.println("Digite las ventas del dia " + (count + 1));
            arregloSemana[count] = Integer.parseInt(in.readLine());

            suma = suma + arregloSemana[count];

            
            if (count == 0) {
                diaMayor = arregloSemana[count];
            } else if (arregloSemana[count] >= diaMayor) {
                diaMayor = arregloSemana[count];
                diaSemana = (count);
                
                if(diaSemana == 0){
                    dia = "Lunes";
                }else if(diaSemana == 1){
                    dia = "Martes";
                } else if(diaSemana == 2){
                    dia = "Miercoles";
                }else if(diaSemana == 3){
                    dia = "Jueves";
                }else if(diaSemana == 4){
                    dia = "Viernes";
                }else if(diaSemana == 5){
                    dia = "Sabado";
                }
            } 
            if (arregloSemana[count]>500){

                    if(count == 0){
                        dia500  = "Lunes";
                    }else if(diaSemana == 1){
                        dia500 = "Martes";
                    } else if(diaSemana == 2){
                        dia500 = "Miercoles";
                    }else if(diaSemana == 3){
                        dia500 = "Jueves";
                    }else if(diaSemana == 4){
                        dia500 = "Viernes";
                    }else if(diaSemana == 5){
                        dia500= "Sabado";
                }
            }

            
        }

        out.println("Las ventas de la semana fueron: " + suma);
        out.println("El dia con mayores ventas fue: " + dia + " con " + diaMayor + " ventas");
        out.println("El dia que vendio 500 o mas fue: "+ dia500);

    }
}