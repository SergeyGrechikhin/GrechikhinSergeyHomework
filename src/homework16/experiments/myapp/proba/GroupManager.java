package homework16.experiments.myapp.proba;

import java.util.Scanner;

public class GroupManager {
    private Group[] groups = new Group[100] ;
    private int myGroupCounter = 0 ;
    private Student[] students = new Student[1000];
    private int myStudentCounter = 0 ;
   /* private int groupCounter ;
    private int studentCounter; */

    Scanner scanner = new Scanner(System.in) ;
    public void createGroups() {
        System.out.println("Сколько групп вы хотите добавить в базу данных");
        int groupcounter = scanner.nextInt();
        scanner.nextLine() ;
        for (int i = 0; i < groupcounter; i++) {
            if (myGroupCounter >= groups.length) {
                System.out.println("Достигнут максимум групп");
                return;
            }
            System.out.println("Введите название группы");
            String namegroup = scanner.nextLine().trim();

            boolean isGroupNameValid = false;
            for (int j = 0; j < myGroupCounter; j++) {
                if (groups[j] !=null && groups[j].getGroupname().equalsIgnoreCase(namegroup)) {
                    isGroupNameValid = true ;
                    break;
                }
            }
            if (isGroupNameValid) {
                System.out.println("Такая группа уже существует");
                continue;
            }
            groups[myGroupCounter] = new Group(namegroup) ;
            myGroupCounter++ ;
            i++;
        }
    }

    public void createAndAddStudent() {
        if (myGroupCounter == 0) {
            System.out.println("Перед созданием студента должна быть создана хотя бы одна группа!");
            return;
        }
        System.out.println("Сколько студентов вы хотите добавить в базу данных");
        int studentcounter = scanner.nextInt();
        scanner.nextLine() ;

        for (int a = 0; a < studentcounter; a++) {
            System.out.println("Введите id студента");
            String id = scanner.nextLine().trim() ;
            boolean isIdValid = false ;
            for (int j = 0; j < myStudentCounter; j++) {
                if (students[j] != null && students[j].getId().equalsIgnoreCase(id)) {
                    isIdValid = true ;
                    break;
                }

            }
            if (isIdValid)  {
                System.out.println("Такой id существует!");
                continue;
            }

                System.out.println("Введите имя студента");
                String name = scanner.nextLine() ;
                System.out.println("Введите фамилию студента");
                String surname = scanner.nextLine() ;


             Student student = new Student(name,surname,id) ;
             students[myStudentCounter] = student ;
             myStudentCounter++;
             a++;


                System.out.println("Введите название группы, куда хотите отправить этого студента / В группе может быть только 100 человек");
            System.out.println("Доступные группы");
            for (int i = 0; i < myStudentCounter; i++) {
                if (groups[i] !=null){
                    System.out.println(" - " + groups[i].getGroupname());
                }

            }
                String invitegroup = scanner.nextLine() ;

                boolean foundname = false ;
                for (int j = 0; j < groups.length ; j++) {
                    if (groups[j] !=null && groups[j].getGroupname().equalsIgnoreCase(invitegroup)) {
                        groups[j].addStudent(student);
                        System.out.println("Студент добавлен в группу " + invitegroup);
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
    public void printInfo() {
        if ( groups == null) {
            System.out.println("Группы еще не созданы!");
            return;
        }
        System.out.println("Информация") ;
        for (int i = 0; i < groups.length ; i++) {
            if (groups[i] == null) {
                continue;
            }
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



