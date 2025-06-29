package javapro.translate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WorldTranslate {
    public static void main(String[] args) {
        HashMap<String, List<String>> dictionary = new HashMap<>();
        //Add to DataBase
        dictionary.put("run", Arrays.asList("бегать","управлять"));
        dictionary.put("light", Arrays.asList("свет","легкий"));
        dictionary.put("break", Arrays.asList("перерыв","ломать"));
        dictionary.put("right", Arrays.asList("право","правильный"));
        dictionary.put("book", Arrays.asList("заказывать","книга"));
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("*===Menu===*");
            System.out.println("1.Translate your word");
            System.out.println("2.Delete your word in database");
            System.out.println("3.Exit");
            String choice = scan.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Enter your word");
                    String word = scan.nextLine();
                    List<String> words = dictionary.get(word);
                    if(words!=null){
                        System.out.println("translation : ");
                        for (int i = 0; i < words.size(); i++) {
                            System.out.println(words.get(i));
                        }
                    }else {
                        System.out.println("Invalid word");
                    }
                    break;
                case "2" :
                    System.out.println("Enter your word for delete");
                    String wordForDelete = scan.nextLine();
                    if (dictionary.remove(wordForDelete) != null){
                        System.out.println("Word deleted successfully");
                    }else  {
                        System.out.println("Invalid word");
                    }
                    break;
                    case "3":
                        System.out.println("Bye");
                        return;

                        default:
                            System.out.println("Invalid choice");

            }

        }
    }
}
