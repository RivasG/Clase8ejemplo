// salario por mes=salariosemana+4,33;
package clase1tecer22;
// psvm permite escribir el main

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        double participacion;
        System.out.println("Digite le nombre del estudiante ");
        nombre=entrada.next();
        System.out.println("Ingrese la nota de partcicipacion en base 100");
        participacion=entrada.nextDouble();
        
        participacion*=0.20;
        
        System.out.println("El alumno "+nombre+" Tiene una nota de :"+participacion);
    }
}
