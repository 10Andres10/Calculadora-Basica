package calculadora;

import javax.swing.JOptionPane;

public class calculadora {

    public static void main(String[] args) {
        
        // Declaración de variables
        double X, Y;
        int opcion;
        
        // Entrada
        JOptionPane.showMessageDialog(null, "CALCULADORA BÁSICA\n\n1. Ingrese los valores para X y Y.\n2. Seleccione la operación a realizar");
        X = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de X: "));
        Y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "OPERACIONES:\n\n1. Suma.\n2. Resta\n3. Multiplicacion\n4. División\n5. Potencia\n6. Logaritmo"));

        // Procesamiento
        switch(opcion)
        {
            case 1:
                // Suma
                JOptionPane.showMessageDialog(null, "La suma es: "+  (X+Y));
                break;
            case 2:
                // Resta
                JOptionPane.showMessageDialog(null, "La resta es: "+  (X-Y));
                
            case 3:
                // Multiplicación
                JOptionPane.showMessageDialog(null, "La multiplicación es: "+  (X*Y));
            case 4:
                // División
                JOptionPane.showMessageDialog(null, "La división es: "+  (X/Y));

            case 5:
                // Potencia
                JOptionPane.showMessageDialog(null, "La potencia es: "+  (Math.pow(X,Y)));
            case 6:
                // Logaritmo
                JOptionPane.showMessageDialog(null, "El logaritmo es: " + Math.log(X));
                        
        }       
        // Fin
        System.exit(0);
    }    
}
