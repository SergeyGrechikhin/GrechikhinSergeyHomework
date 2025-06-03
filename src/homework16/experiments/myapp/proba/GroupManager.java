package homework16.experiments.myapp.proba;

import java.util.Scanner;

public class GroupManager {
    private Group[] groups ;
    private Student[] students;
   /* private int groupCounter ;
    private int studentCounter; */

    Scanner scanner = new Scanner(System.in) ;
    public void createGroups() {
        System.out.println("Введите сколько групп нужно создать");
        int groupcounter = scanner.nextInt();
        scanner.nextLine();

         groups = new Group[groupcounter] ;

        for (int i = 0; i < groupcounter; i++) {
            System.out.println("Введите название группы");
            String namegroup = scanner.nextLine();
            boolean isnamegroupvalid = false ;
            for (int j = 0; j < i; j++) {
                if (groups[j] != null && groups[j].getGroupname().equalsIgnoreCase(namegroup)) {
                    isnamegroupvalid = true ;
                    break;
                }
            }
            if (isnamegroupvalid) {
                System.out.println("Такая группа уже существует");
                i = i - 1 ;
            }else {
                groups[i] = new Group(namegroup);
                i++;
            }

        }
    }

    public void createAndAddStudent() {
        if (groups == null) {
            System.out.println("Перед созданием студента должна быть создана хотя бы одна группа!");
            return;
        }
        System.out.println("Сколько студентов вы хотите добавить в базу данных");
        int studentcounter = scanner.nextInt();
        scanner.nextLine() ;

         students = new Student[studentcounter] ;
        for (int a = 0; a < studentcounter; a++) {
            System.out.println("Введите id студента");
            String id = scanner.nextLine() ;
            boolean isIdValid = false ;
            for (int j = 0; j < a; j++) {
                if (students[j].getId().equalsIgnoreCase(id)) {
                    isIdValid = true ;
                    break;
                }

            }
            if (isIdValid)  {
                System.out.println("Такой id существует!");
                a = a-1;
            }else {
                System.out.println("Введите имя студента");
                String name = scanner.nextLine() ;
                System.out.println("Введите фамилию студента");
                String surname = scanner.nextLine() ;


                students[a] = new Student(name,surname,id) ;


                System.out.println("Введите название группы, куда хотите отправить этого студента / В группе может быть только 100 человек");
                String invitegroup = scanner.nextLine() ;

                boolean foundname = false ;
                for (int j = 0; j < groups.length ; j++) {
                    if (groups[j].getGroupname().equalsIgnoreCase(invitegroup)) {
                        groups[j].addStudent(students[a]);
                        foundname = true ;
                        break;
                    }


                }
                if (!foundname) {
                    System.out.println("Группа не найдена !");
                    a--;
                }

            }
        }
    }
     public void printInfo() {
        if (groups == null) {
            System.out.println("Группы еще не созданы!");
            return;
        }
         System.out.println("Информация") ;
         for (int i = 0; i < groups.length ; i++) {
             System.out.println("Группа : " + groups[i].getGroupname());
             Student[] s = groups[i].getStudents() ;
             boolean isHasStudents = false ;
             for (int j = 0; j < s.length; j++) {
                 if (s[j] !=null) {
                     isHasStudents = true ;
                     System.out.println(" - " + s[j].getName() + "  " + s[j].getSurname() + " ID " + s[j].getId());
                 }
             }
             if (!isHasStudents) {
                 System.out.println("В Группе нет студентов");
             }
         }
     }
}
