package clase1tecer22;

import java.text.DecimalFormat;
import java.util.Scanner;

public class entradadatos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// nos permite el ingreso por teclado
        DecimalFormat df=new DecimalFormat("#.00");
        double valor1, valor2, suma, resta, multiplicacion, division;
        String nombre;
        System.out.println("Ingrese le nombre que desea ");
        nombre = entrada.next();
        System.out.println("Ingrese el primer valor");
        valor1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo valor");
        valor2 = entrada.nextDouble();
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        multiplicacion = valor1 * valor2;
        division = valor1 / valor2;
        System.out.println("--------------------------");
        System.out.println("El nombre de la persona :"+nombre);
        System.out.println("La suma es :"+suma+" La resta es: "+resta);
        System.out.println("La multiplicacion es :"+multiplicacion+" La division es :"+df.format(division));
    }

}
