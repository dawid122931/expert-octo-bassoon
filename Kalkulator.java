import java.util.Scanner;

public class Kalkulator {





    public double add(double num1, double num2){
        System.out.println(num1+num2);
        return  num1 + num2;
    }

    public double subtract(double num1, double num2){
        System.out.println(num1-num2);
        return num1 - num2;
    }
    public double multiply(double num1, double num2){
        System.out.println(num1*num2);
        return num1 * num2;
    }
    public double divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("Blad - dzielenie przez zero");
            return 0;
        }
        else {
            System.out.println(num1 / num2);
            return num1 / num2;
        }
    }
    public double power(double num1, double num2){
        System.out.println(Math.pow(num1,num2));
        return Math.pow(num1,num2);
    }
    public double sqrt(double num1){
        if(num1 < 0){
            System.out.println("Blad - Nie mozna pierwiastkowac liczb mniejszych od zera");
            return 0;
        }
        else {
            System.out.println(Math.sqrt(num1));
            return Math.sqrt(num1);
        }
    }
    public static void main(String[] args) {
        double num1;
        double num2;
        int dzalanie;
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        do {


            System.out.println("podaj pierwszą liczbe: ");
            num1 = scanner.nextInt();
            System.out.println("wybierz działanie:\n 1.dodawanie    2.odejmowanie    3.mnożenie    4.dzielenie    5.potęgowanie    6.pierwiastkowanie kwadratowe ");
            dzalanie = scanner.nextInt();
            if (dzalanie == 1) {
                System.out.println("podaj drugą liczbe");
                num2 = scanner.nextInt();
                kalkulator.add(num1,num2);
            } else if (dzalanie == 2) {
                System.out.println("podaj drugą liczbe");
                num2 = scanner.nextInt();
                kalkulator.subtract(num1, num2);
            } else if (dzalanie == 3) {
                System.out.println("podaj drugą liczbe");
                num2 = scanner.nextInt();
                kalkulator.multiply(num1, num2);
            } else if (dzalanie == 4) {
                System.out.println("podaj drugą liczbe");
                num2 = scanner.nextInt();
                kalkulator.divide(num1, num2);
            } else if (dzalanie == 5) {
                System.out.println("podaj drugą liczbe");
                num2 = scanner.nextInt();
                kalkulator.power(num1, num2);
            } else if (dzalanie == 6) {
                kalkulator.sqrt(num1);
            } else {
                System.out.println("Błąd");
            }
            System.out.println("jeszcze raz?\n 0.Tak");
            dzalanie = scanner.nextInt();
        } while (dzalanie == 0);
    }



}

