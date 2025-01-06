
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