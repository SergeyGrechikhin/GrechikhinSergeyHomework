package homework16.experiments.proba;

import java.util.Scanner;

public class StudentDemoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите сколько групп нужно создать");
        int groupcounter = scanner.nextInt();
        scanner.nextLine();

        Group[] groups = new Group[groupcounter] ;

        for (int i = 0; i < groupcounter; i++) {
            System.out.println("Введите название группы");
            String namegroup = scanner.nextLine();
            boolean isnamegroupvalid = false ;
            for (int j = 0; j < i; j++) {
                if (groups[j].getGroupname().equalsIgnoreCase(namegroup)) {
                    isnamegroupvalid = true ;
                    break;
                }
            }
            if (isnamegroupvalid) {
                System.out.println("Такая группа уже существует");
                i = i - 1 ;
            }else {
                groups[i] = new Group(namegroup);
            }

        }


        System.out.println("Сколько студентов вы хотите добавить в базу данных");
        int studentcounter = scanner.nextInt();
        scanner.nextLine() ;

        Student[] students = new Student[studentcounter] ;
        for (int a = 0; a < studentcounter; a++) {
            System.out.println("Введите id студента");
            String id = scanner.nextLine() ;
            boolean isnamevalid = false ;
            for (int j = 0; j < a; j++) {
                if (students[j].getId().equalsIgnoreCase(id)) {
                    isnamevalid = true ;
                    break;
                }

            }
            if (isnamevalid)  {
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
        System.out.println("Информация") ;
        for (int i = 0; i < groups.length ; i++) {
            System.out.println("Группа : " + groups[i].getGroupname());
            Student[] s = groups[i].getStudents() ;
            for (int j = 0; j < s.length; j++) {
                if (s[j] !=null) {
                    System.out.println(" - " + s[j].getName() + "  " + s[j].getSurname() + " ID " + s[j].getId());
                }
            }



        }


    }

}

