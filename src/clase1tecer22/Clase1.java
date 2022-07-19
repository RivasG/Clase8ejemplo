/*
esta opcion permite crear comentarios
multiples
 */
package clase1tecer22;//este es el nombre del paqute del proyecto, guarda las clase

public class Clase1 { // esta es el nombre de la clase

    public static void main(String[] args) {
        //tipos dato primitivos
        byte bytentero = 40;
        short shortentero = 9888;
        int entero=8389292;
        long lentero=93939939;
        // datos tipo flotantes (que tiene decimales
        float real=78.6f;// al final simpre el flotante escribir f 
        double decimal=10.23;
        // caracteres y cadenas
        char caracter='q';
        String cadena="Éxito a todos ";
        // datos no primitvios
        Integer numero=90;
        Integer num=null;
        //datos tipos constante
        final int datos=80;
        System.out.println("---------------------------------");
        System.out.println("El valor de byte es :" + bytentero);
        System.out.println("El valor del short es :" + shortentero);
        System.out.println("El valor del entero es :"+entero);
        System.out.println("El valor del long es :"+lentero);
        System.out.println("---------------------------------------");
        System.out.println("El valor del flotante es :"+real);
        System.out.println("El valor del decimal es :"+decimal);
        System.out.println("---------------------------------------");
        System.out.println("El valor del char es :"+caracter);
        System.out.println("El valor string :"+cadena);
        System.out.println("---------------------------------");
        System.out.println("El valor del integer es :"+numero+" y ---"+num);
        System.out.println("------------------------------------");
        System.out.println("El valor de dato constante es :"+datos);
        
    }

} // cierra el de la clase
