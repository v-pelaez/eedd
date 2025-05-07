package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("--- Calculadora ---\n");
            System.out.println("1. Sumar\n");
            System.out.println("2. Restar\n");
            System.out.println("3. Multiplicar\n");
            System.out.println("4. Dividir\n");
            System.out.println("5. Modulo\n");
            System.out.println("6. Exponente\n");
            System.out.println("0. Salir\n");
            System.out.println("-----------------\n");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            
            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Introduce el primer número: ");
                num1 = scanner.nextDouble();

                System.out.print("Introduce el segundo número: ");
                num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = sumar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = restar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("No se puede dividir por cero");
                        } else {
                            resultado = dividir(num1, num2);
                            System.out.println("Resultado: " + resultado);
                        }
                        break;

                    case 5:
                        if (num2 == 0) {
                            System.out.println("No se puede dividir por cero");
                        } else {
                        resultado = modulo(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        }

                        break;

                    case 6:
                        resultado = multiplicar(num1, num2);
                        System.out.println("Resultado: " + resultado);

                    
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        System.out.println("Cerrando calculadora.");
        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
    
    public static double exponente(double a, double b) {
        return Math.pow(a,b);
    }
    
    /**
     * Documentacion muy detallada de la funcion modulo: hace el modulo.
     * @param a
     * @param b
     * @return 
     */
    public static double modulo(double a, double b) {

        return a % b;
    }
}

