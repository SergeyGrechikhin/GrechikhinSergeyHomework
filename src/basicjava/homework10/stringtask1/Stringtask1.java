package basicjava.homework10.stringtask1;

public class Stringtask1 {
    public static void stringcreate(String proverkastring)  {
        System.out.println(" Распечатаем последний символ : " + proverkastring.charAt(17));

        System.out.println("Проверим содержит ли строка подстроку Java? :" + proverkastring.contains("Java"));

        String replaced = proverkastring.replace('a','o');
        System.out.println("Заменили а на о : " + replaced);

        System.out.println("Преобразовать в верхний регистр : " + proverkastring.toUpperCase());

        System.out.println("Преобразовать в нижний регистр : " + proverkastring.toLowerCase());

        String cutstring = proverkastring.substring(13,18) ;
        System.out.println("Мы вырезали слово : " + cutstring);


    }
}
