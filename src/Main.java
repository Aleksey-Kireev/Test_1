
import java.util.Scanner; // импорт сканера

public class Main {

    public static void main(String[] args) {


//           ----    Задача 1   ----
//           dog значение 8.0;
//           cat значение 3.6;
//           paper значение 763789
/*
    System.out.println("Задание № 1 ");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

//           ----    Задача 2   ----
//  Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4

    System.out.println("Задание № 2 ");
        dog = 8.0 + 4;
        System.out.println(dog);
        cat = 3.6 + 4;
        System.out.println(cat);
        paper = 763789 + 4;
        System.out.println(paper);


*/
//           ----    Задача 9   ----

        System.out.println("Введите 2 любых целых числа от 1 до 10: ");
        Scanner scan = new Scanner(System.in);

//  Работа с целыми числами

        int number = scan.nextInt();
        int number_2 = scan.nextInt();
        System.out.println ("Вы ввели число " + number + " и " + number_2);

        System.out.println ("Сумма " + number + " и " + number_2 + " равна = " + (number + number_2) );

//  Работа с текстом

        scan = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = scan.nextLine();
        System.out.println("Вы ввели - " + phrase1);
        System.out.println("Введите любое слово или фразу еще раз: ");
        phrase1 = scan.nextLine();   //    ---- смотреть ниже
        System.out.println("Введите любое число: ");
        number_2 = scan.nextInt();  //   ------ почему то после цифрового ввода буквенный не работает

        System.out.println("Вы ввели - " + phrase1 + " и " + number_2);


//  Работа с If и switch

        System.out.print ("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt ();
        if ( i>3 & i<=6) {
            System.out.println ("Вы ввели число от 3 до 6");
        }
        else if (i==2) {
            System.out.println ("Вы ввели число 2");
        }
        else if (i==1) {
            System.out.println ("Вы ввели число 1");
        }
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







    }
}