package homework16.experiments.myapp.proba;

import java.util.Scanner;

public class GroupManager {
    private Group[] groups = new Group[100] ;
    private int myGroupCounter = 0 ;
    private Student[] students = new Student[1000];
    private int myStudentCounter = 0 ;


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
                break;
            }
            groups[myGroupCounter] = new Group(namegroup) ;
            myGroupCounter++ ;
            i++;
        }
    }

    public void createStudent() {
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
                if (students[j] != null && students[j].getId().equalsIgnoreCase(id) && students[j].getId() != null ) {
                    isIdValid = true ;
                    break;
                }

            }
            if (isIdValid)  {
                System.out.println("Такой id существует!");
                break;
            }

                System.out.println("Введите имя студента");
                String name = scanner.nextLine() ;
                System.out.println("Введите фамилию студента");
                String surname = scanner.nextLine() ;


             Student student = new Student(name,surname,id) ;
             students[myStudentCounter] = student ;
             myStudentCounter++;
             a++;




            }
        }
    public void printInfo() {
        if ( myGroupCounter == 0) {
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
    public void addStudenttoGroup() {
        if (myStudentCounter == 0){
            System.out.println("Студенты еще не созданы");
            return;
        }

            System.out.println("Cписок Студентов");
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    System.out.println(" ID " + students[i].getId() + " |Имя : " + students[i].getName() + " " + students[i].getSurname());
                }
            }
            System.out.println("Введите ID Студента , которого хотите добавить в группу :");
            String studentID = scanner.nextLine();
            Student inviteStudent = null;
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null && students[i].getId().equalsIgnoreCase(studentID)) {
                    inviteStudent = students[i];
                    break;
                }
            }
            if (inviteStudent == null) {
                System.out.println("Студент с таким ID не найден");
                return;
            }
            System.out.println("Список групп");
            for (int i = 0; i < groups.length; i++) {
                if (groups[i] != null) {
                    System.out.println(" - " + groups[i].getGroupname());
                }
            }
            System.out.println("Введите название группы , куда хотите добавить студента :");
            String groupname = scanner.nextLine();
            boolean foundgroup = false;

            for (int i = 0; i < groups.length; i++) {
                boolean addStudent  = groups[i].addStudent(inviteStudent);
                if (groups[i] != null && groups[i].getGroupname().equalsIgnoreCase(groupname)) {

                    if (addStudent) {
                        System.out.println("Студент добавлен в группу " + groupname);
                    }else  {
                        System.out.println("Группа заполнена");
                    }

                    foundgroup = true;
                    break;
                }
            }
            if (!foundgroup) {
                System.out.println("Группа не найдена");
            }
        }

        public void MovetoGroup() {
           printInfo();
            System.out.println("Введите ID студента которого хотите переместить");
            String idformove = scanner.nextLine();
            Student moveStudent = null;
            for (int i = 0; i < myStudentCounter; i++) {
                if (students[i] != null && students[i].getId().equalsIgnoreCase(idformove)) {
                    moveStudent = students[i];
                    break;
                }
            }
            if (moveStudent == null) {
                System.out.println("Id не найден ");
                return;
            }
            for (int i = 0; i < myGroupCounter; i++) {
                groups[i].removeStudent(moveStudent);
            }
            System.out.println(" Список групп : ");
            for (int i = 0; i < groups.length; i++) {
                if (groups[i] != null) {
                    System.out.println(" - " + groups[i].getGroupname());
                }
            }
            System.out.println("Введите название группы куда хотите переместить студента");
            String movegroupname = scanner.nextLine().trim();
            for (int i = 0; i < myGroupCounter; i++) {
                if (groups[i].getGroupname().equalsIgnoreCase(movegroupname)) {
                    groups[i].addStudent(moveStudent);
                    System.out.println("Студент c ID " + moveStudent.getId() + " перемещен в группу " + groups[i].getGroupname() );
                    return;
                }
            }
            System.out.println("Группа не найдена");
        }

        }










