
import java.util.Scanner; // импорт сканера

public class Main {

    public static void main(String[] args) {

//  Работа с If  switch   while for


        int i = 1;
        System.out.println (" ");
        System.out.print ("Введите количество итераций : ");
        Scanner inIter = new Scanner (System.in);
        int n = inIter.nextInt ();

        while (i<=100) {
            System.out.println ("Итерация - " + i);
            if (i==n)
                break;
            i++;
        }

//  ----- Найти простое число   -------

        i=1;
        while (i<=10) {
            System.out.println (" ");
            System.out.print ("Введите число от 0 до 100 : ");
            Scanner inNum = new Scanner (System.in);
            n = inNum.nextInt ();

            System.out.println (" ");
            for (int k = 2; k <= Math.sqrt(n); k++) {
                System.out.print(" " + k);
                if (n % k == 0) {
                    System.out.println(" if " + k);
                    System.out.println(n + " - не является простым числом.");
                    break;
                } else {
                    System.out.println(" else ");
                    System.out.println(n + " - является простым числомю");
                }
            }

        i++;

        }







        /*
        else if (i==3) {
            System.out.println ("Вы ввели число 3");
        }
        else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
            System.out.println("Введите 1, 2, 3 или 4");
            scan = new Scanner(System.in);
            number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            case 4:
                System.out.println("Вы ввели число 4");
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }
*/





    }
}