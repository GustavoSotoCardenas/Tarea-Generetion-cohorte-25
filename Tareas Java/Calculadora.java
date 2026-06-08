import java.util.Scanner;

public class Calculadora {
    //Sumar
    static int sumar(int a, int b) {
        return a + b;
    }

    //Restar
    static int restar(int a, int b) {
        return a - b;
    }

    //Multiplicar
    static int multiplicar(int a, int b) {
        return a * b;
    }

    //Dividir
    static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("===Calculadora===");
            System.out.println("Ingrese operacion que necesita realizar");
            System.out.println("1.-Sumar\n2.-Restar\n3.-Multiplicar\n4.-Division\n5.-Salir");
            String operacion = sc.nextLine();

            switch (operacion) {
                case "1":
                    //Ingresar primer numero
                    System.out.println("Ingrese primer numero: ");
                    int num1 = sc.nextInt();

                    //Ingresar segundo numero
                    System.out.println("Ingrese segundo numero: ");
                    int num2 = sc.nextInt();
                    System.out.println(num1 + " + " + num2 + " = " + sumar(num1, num2));
                    break;
                case "2":
                    //Ingresar primer numero
                    System.out.println("Ingrese primer numero: ");
                    num1 = sc.nextInt();

                    //Ingresar segundo numero
                    System.out.println("Ingrese segundo numero: ");
                    num2 = sc.nextInt();
                    System.out.println(num1 + " - " + num2 + " = " + restar(num1, num2));
                    break;
                case "3":
                    //Ingresar primer numero
                    System.out.println("Ingrese primer numero: ");
                    num1 = sc.nextInt();

                    //Ingresar segundo numero
                    System.out.println("Ingrese segundo numero: ");
                    num2 = sc.nextInt();
                    System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
                    break;
                case "4":
                    //Ingresar primer numero
                    System.out.println("Ingrese primer numero: ");
                    num1 = sc.nextInt();

                    //Ingresar segundo numero
                    System.out.println("Ingrese segundo numero: ");
                    num2 = sc.nextInt();
                    System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
                    break;
                case "5":
                    break;

            }
        }

    }
}

