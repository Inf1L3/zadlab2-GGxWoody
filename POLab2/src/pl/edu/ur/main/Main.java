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
        mainManu();
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
        System.out.println("Podaj parametry funkcji: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        double delta;
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Brak rozwiazan w zbioze liczb rzeczywistych");
        } else {
            double x1 = ((-b - Math.pow(delta, 1 / 2)) / 2 * a);
            double x2 = ((-b + Math.pow(delta, 1 / 2)) / 2 * a);
            System.out.println("Miejsce zerowe 1: " + x1);
            System.out.println("Miejsce zerowe 2: " + x2);
        }
    }

    public static void zadanie2() {
        System.out.println("Podaj numery do dzialania");
        int numberA = input.nextInt(), numberB = input.nextInt();
        int userChoice;
        do {
            System.out.println("Podaj numer dzialania: ");
            System.out.println("0.Koniec programu");
            System.out.println("1.Dodawanie");
            System.out.println("2.Odejmowanie");
            System.out.println("3.Mnozenie");
            System.out.println("4.Dzielenie");
            System.out.println("5.Potegowanie");
            System.out.println("6.Pierwiastkowanie");
            System.out.println("7.Funkcje trygonometryczne");
            userChoice = input.nextInt();
            switch (userChoice) {
                case 0:
                    System.out.println("Konczenie pracy programu");
                    break;
                case 1:
                    System.out.print(numberA + numberB);
                    System.out.println(" :Suma");
                    break;
                case 2:
                    System.out.print(numberA - numberB);
                    System.out.println(" :Roznica");
                    break;
                case 3:
                    System.out.print(numberA * numberB);
                    System.out.println(" :Iloczyn");
                    break;
                case 4:
                    System.out.print((float) numberA / numberB);
                    System.out.println(" :Iloraz");
                    break;
                case 5:
                    System.out.print(Math.pow(numberA, numberB));
                    System.out.println(" :Potega");
                    break;
                case 6:
                    System.out.print(Math.sqrt(numberA));
                    System.out.println(" :Pierwiastek pierwszej");
                    System.out.print(Math.sqrt(numberB));
                    System.out.println(" :Pierwiastek drugiej");
                    break;
                case 7:
                    System.out.print(Math.sin(Math.toDegrees(numberA)));
                    System.out.println(" :Sin");
                    System.out.print(Math.cos(Math.toDegrees(numberA)));
                    System.out.println(" :Cos");
                    System.out.print(Math.tan(Math.toDegrees(numberA)));
                    System.out.println(" :Tan");
                    System.out.print(Math.sin(Math.toDegrees(numberB)));
                    System.out.println(" :Sin");
                    System.out.print(Math.cos(Math.toDegrees(numberB)));
                    System.out.println(" :Cos");
                    System.out.print(Math.tan(Math.toDegrees(numberB)));
                    System.out.println(" :Tan");
                    break;
                default:
                    System.err.println("Zly numer dzialania");
                    break;
            }
        } while (userChoice != 0);
    }

    //Zadanie 3
    //Domowe
    public static void zadanie3() {
        int userChoice;
        double[] tabToFill = new double[10];
        for (int i = 0; i < tabToFill.length; i++) {
            System.out.println("Podaj liczbe " + (i + 1) + ": ");
            tabToFill[i] = input.nextDouble();
        }
        do {
            System.out.println("Podaj numer sposobu wypisania: ");
            System.out.println("0.Koniec programu");
            System.out.println("1.Od 1 do 10");
            System.out.println("2.Od 10 do 1");
            System.out.println("3.Nieparzyste");
            System.out.println("4.Parzyste");
            userChoice = input.nextInt();
            if (userChoice == 0) {
                System.out.println("Konczenie pracy programu");
            } else if (userChoice == 1) {
                for (int i = 0; i < tabToFill.length; i++) {
                    System.out.println((i + 1) + ":" + tabToFill[i]);
                }
            } else if (userChoice == 2) {
                for (int i = (tabToFill.length - 1); i > 0; i--) {
                    System.out.println((i + 1) + ":" + tabToFill[i]);
                }
            } else if (userChoice == 3) {
                for (int i = 0; i < tabToFill.length; i += 2) {
                    System.out.println((i + 1) + ":" + tabToFill[i]);
                }
            } else if (userChoice == 4) {
                for (int i = 1; i < tabToFill.length; i += 2) {
                    System.out.println((i + 1) + ":" + tabToFill[i]);
                }
            } else {
                System.err.println("Niepoprawny numer wypisu");
            }
        } while (userChoice != 0);

    }

    //Zadanie 4
    //Domowe
    public static void zadanie4() {
        double[] tabToFill = new double[10];
        int userChoice, result;
        for (int i = 0; i < tabToFill.length; i++) {
            System.out.println("Podaj liczbe " + (i + 1) + ": ");
            tabToFill[i] = input.nextDouble();
        }
        do {
            System.out.println("Podaj numer dzialania do wykonania: ");
            System.out.println("0.Koniec programu");
            System.out.println("1.Suma elementow");
            System.out.println("2.Iloczyn elementow");
            System.out.println("3.Srednia tablicy");
            System.out.println("4.Min tablicy");
            System.out.println("5.Max tablicy");
            userChoice = input.nextInt();
            result = 0;
            switch (userChoice) {
                case 0:
                    System.out.println("Konczenie pracy programu");
                    break;
                case 1:
                    for (int i = 0; i < tabToFill.length; i++) {
                        result += tabToFill[i];
                    }
                    System.out.println("Suma tablicy to: " + result);
                    break;
                case 2:
                    for (int i = 0; i < tabToFill.length; i++) {
                        result *= tabToFill[i];
                    }
                    System.out.println("Iloczyn tablicy to: " + result);
                    break;
                case 3:
                    for (int i = 0; i < tabToFill.length; i++) {
                        result += tabToFill[i];
                    }
                    System.out.println("Srednia tablicy to: " + ((float) result / tabToFill.length));
                    break;
                case 4:
                    for (int i = 0; i < tabToFill.length; i++) {
                        if (i == 0) {
                            result = (int) tabToFill[i];
                        }
                        if (result > tabToFill[i]) {
                            result = (int) tabToFill[i];
                        }
                    }
                    System.out.println("Min tablicy to: " + result);
                    break;
                case 5:
                    for (int i = 0; i < tabToFill.length; i++) {
                        if (i == 0) {
                            result = (int) tabToFill[i];
                        }
                        if (result < tabToFill[i]) {
                            result = (int) tabToFill[i];
                        }
                    }
                    System.out.println("Max tablicy to: " + result);
                    break;
                default:
                    System.err.println("Bledny numer");
                    break;
            }
        } while (userChoice != 0);

    }

    public static void zadanie5() {
        System.out.println("Wypisuje liczby od 0 do 20 z pominieciem 2, 6, 9, 15, 19");
        for (int j = 0; j <= 20; j++) {
            if (j == 2 || j == 6 || j == 9 || j == 15 || j == 19) {
                continue;
            }
            System.out.println(j);
        }
    }

    //Zadanie 6
    //Domowe
    public static void zadanie6() {
        while (true) {
            System.out.println("Podaj liczbe calkowita: ");
            int userNumber = input.nextInt();
            if (userNumber < 0) {
                System.out.println("Konczenie pracy programu");
                break;
            }
        }
    }

    //Zadanie 7
    //Domowe
    public static void zadanie7() {
        int temp;
        System.out.println("Podaj ilosc liczb: ");
        int tabSize = input.nextInt();
        int[] tabToSort = new int[tabSize];
        for (int i = 0; i < tabSize; i++) {
            System.out.println("Podaj liczbe " + (i + 1) + ":");
            tabToSort[i] = input.nextInt();
        }
        System.out.println("Przed sortowaniem: ");
        for (int i = 0; i < tabSize; i++) {
            System.out.println("Liczba " + (i + 1) + ":" + tabToSort[i]);
        }
        for (int i = 0; i < tabSize - 1; i++) {
            for (int j = tabSize - 1; j > i; j--) {
                if (tabToSort[j] < tabToSort[j - 1]) {
                    temp = tabToSort[j - 1];
                    tabToSort[j - 1] = tabToSort[j];
                    tabToSort[j] = temp;
                }
            }
        }
        System.out.println("Po sortowaniu: ");
        for (int i = 0; i < tabSize; i++) {
            System.out.println("Liczba " + (i + 1) + ":" + tabToSort[i]);
        }
    }

    public static void mainManu() {
        System.out.println("Wybor zadan:");
        System.out.println("1.Zadanie 1");
        System.out.println("2.Zadanie 2");
        System.out.println("3.Zadanie 3");
        System.out.println("4.Zadanie 4");
        System.out.println("5.Zadanie 5");
        System.out.println("6.Zadanie 6");
        System.out.println("7.Zadanie 7");
        System.out.println("8.Zadanie labki 1");
        System.out.println("9.Zadanie labki 2");
        int userChoice;
        do {
            userChoice = input.nextInt();
            switch (userChoice) {
                case 0:
                    System.out.println("Zamykanie programu");
                    break;
                case 1:
                    zadanie1();
                    break;
                case 2:
                    zadanie2();
                    break;
                case 3:
                    zadanie3();
                    break;
                case 4:
                    zadanie4();
                    break;
                case 5:
                    zadanie5();
                    break;
                case 6:
                    zadanie6();
                    break;
                case 7:
                    zadanie7();
                    break;
                case 8:
                    zadanieLaborki1();
                    break;
                case 9:
                    zadanieLaborki2();
                    break;
                default:
                    System.err.println("Bledny numer zadania");
            }
        } while (userChoice != 0);

    }
}
