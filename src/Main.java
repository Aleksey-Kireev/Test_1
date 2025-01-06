
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

        int number = scan.nextInt();
        int number_2 = scan.nextInt();
        System.out.println ("Вы ввели число " + number + " и " + number_2);
        var summ = number + number_2;
        System.out.println ("Сумма " + number + " и " + number_2 + " равна = " + summ);




    }
}