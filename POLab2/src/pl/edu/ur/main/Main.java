package pl.edu.ur.main;

import java.util.Scanner;

/**
 * @author marcin
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


    }
    // TODO zad 3, 4, 6, 7



    public static void zadanieLaborki1() {
        int wybor = input.nextInt();
        do {

            switch (wybor) {
                case 1:
                    System.out.println("Styczen");
                    break;
                case 2:
                    System.out.println("Luty");
                    break;
                case 3:
                    System.out.println("Marzec");
                    break;
                case 4:
                    System.out.println("Kwiecien");
                    break;
                case 5:
                    System.out.println("Maj");
                    break;
                case 6:
                    System.out.println("Czerwiec");
                    break;
                case 7:
                    System.out.println("Lipiec");
                    break;
                case 8:
                    System.out.println("Sierpien");
                    break;
                case 9:
                    System.out.println("Wrzesien");
                    break;
                case 10:
                    System.out.println("Pazdziernik");
                    break;
                case 11:
                    System.out.println("Listopad");
                    break;
                case 12:
                    System.out.println("Grudzien");
                    break;
                default:
                    System.out.println("Bledny numer");
                    break;
            }
        } while (wybor != 0);
    }

    public static void zadanieLaborki2() {
        int liczba1 = 10, liczba3 = 0, i = 0;

        while (liczba3 < 1000) {
            liczba3 += liczba1;
            i++;
        }
        System.out.println(i);
        liczba3 = 0;
        i = 0;
        do {
            liczba3 += liczba1;
            i++;
        } while (liczba3 < 1000);
        System.out.println(i);
    }

    public static void zadanie1() {
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        double delta;
        delta = b * b - 4 * a * c;
        double x1 = ((-b - Math.pow(delta, 1 / 2)) / 2 * a);
        double x2 = ((-b + Math.pow(delta, 1 / 2)) / 2 * a);
        System.out.println(x1);
        System.out.println(x2);
    }

    public static void zadanie4() {
        for (int j = 0; j <= 20; j++) {
            if (j == 2 || j == 6 || j == 9 || j == 15 || j == 19) continue;
            System.out.println(j);
        }
    }
}
