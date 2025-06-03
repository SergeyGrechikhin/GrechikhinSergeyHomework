package homework16.experiments.proba2;

import java.util.Scanner;

public class GroupService {
    public Group[] createArrayGroup()  {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Введите сколько групп вы хотите добавить в базу");
        int mygroupcounter = scanner.nextInt();
        scanner.nextLine();
        Group[] groups = new Group[mygroupcounter] ;

        for (int i = 0; i < groups.length; i++) {
            System.out.println("Введите имя группы");

            String group = scanner.nextLine() ;
            boolean isnamevalid = false ;
            for (int j = 0; j < i; j++) {
                if (groups[j].getGroupname().equalsIgnoreCase(group)) {
                    isnamevalid = true ;
                    break;
                }

            }
            if (isnamevalid)  {
                System.out.println("Такая группа существует!");
                i = i-1; //Loop
            }else {
                Group group1 = new Group(group);
                groups[i] = group1 ;
            }


        }

        for (int i = 0; i < groups.length; i++) {

            System.out.println(" Имя группы " + (i + 1) + " : " + groups[i].getGroupname());
            ;

        }
        return groups;

    }
}
