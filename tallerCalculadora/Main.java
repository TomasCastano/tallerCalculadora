package tallerCalculadora;

import javax.swing.JOptionPane;

public class Main {
        public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        String operacion = JOptionPane.showInputDialog("Ingrese la operación (suma, resta, multiplicacion o division):");

        Calculadora calculadora = new Calculadora(numero1, numero2);

        double resultado;

        switch (operacion.toLowerCase()) {
            case "suma":
                resultado = calculadora.sumar();
                break;
            case "resta":
                resultado = calculadora.restar();
                break;
            case "multiplicacion":
                resultado = calculadora.multiplicar();
                break;
            case "division":
                resultado = calculadora.dividir();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
                return;
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}
