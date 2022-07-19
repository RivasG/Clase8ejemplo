package clase1tecer22;

import javax.swing.JOptionPane;

public class entradaventana {

    public static void main(String[] args) {
        double valor1, valor2, suma, resta,multiplicacion,division;
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer valor"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo valor"));
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        multiplicacion=valor1*valor2;
        division=valor1/valor2;
        JOptionPane.showMessageDialog(null, "La suma es :" + suma);
        JOptionPane.showMessageDialog(null, "La resta es :" + resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion es :" + multiplicacion);
        JOptionPane.showMessageDialog(null, "La division es :" + division);
        
        JOptionPane.showMessageDialog(null, "La suma es :" + suma
        +"\n La resta "+resta
        +"\n La multiplicacion es :"+multiplicacion
        +"\n La division es :"+division);
        
    }

}
