// OPCIONES CON BOTONES

package tallerCalculadora;

import javax.swing.JOptionPane;

public class MainOpciones {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        Calculadora calculadora = new Calculadora(numero1, numero2);

        String[] opciones = {"Suma", "Resta", "Multiplicación", "División"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la operación a realizar:", "Operación",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        double resultado;

        switch (seleccion) {
            case 0:
                resultado = calculadora.sumar();
                break;
            case 1:
                resultado = calculadora.restar();
                break;
            case 2:
                resultado = calculadora.multiplicar();
                break;
            case 3:
                resultado = calculadora.dividir();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                return;
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}
