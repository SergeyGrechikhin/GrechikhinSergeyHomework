package homework12.task4;

import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу оценку от 1 до 12 ");
        int grade = scanner.nextInt();
        int maxtvtime = 45 ;

        switch (grade) {
            case 12:
            case 11:
            case 10:
                System.out.println(" Наш ребенок молодец.Дадим ему еще один дополнительный час смотреть телевизор ");
                maxtvtime += 60 ;
                break;
            case 9 :
            case 8 :
            case 7 :
                System.out.println(" Результат хороший . Но можно и лучше . Поэтому дадим только дополнительных 45 минут для телевизора ");
                maxtvtime += 45 ;
                break;
            case 6 :
            case 5 :
            case 4 :
                System.out.println("Результат удолетворительный . Поэтому дадим только дополнительных 15 минут для телевизора ");
                maxtvtime += 15 ;
                break;
            case 3 :
                System.out.println("Результат плохой . Поэтому отнимаем время просмотра телевизора на 30 минут ");
                maxtvtime -= 30 ;
                break ;
            case 2 :
            case 1 :
                System.out.println("Результат просто ужасный . Поэтому сегодня запрещено смотреть телевизор ");
                maxtvtime -= 45 ;
                break ;

            default:
                System.out.println("Введена не правильная оценка");
                return;


        }
        System.out.println(" Время просмотра теливизора : " + maxtvtime + " минут ");
    }
}
