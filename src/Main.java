
import java.util.Scanner; // импорт сканера

public class Main {

    public static void main(String[] args) {



//           ----    Циклы   ----

        System.out.println("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int sc = scan.nextInt();
        System.out.print ("Все числа - ");
        for (int i=1; i <= sc; i++) {
            System.out.print (i + " ");
        }
        System.out.println (" ");

        int summ = 0;
        for ( int i=0; i<=sc; i++) {
            summ = summ + i;


        }
        System.out.println("Сумма всех чисел от 1 до " + sc + " = " + summ);


//  Работа с If и switch









    }
}