package homework16.experiments;

import java.util.Scanner;

public class StudentService {
    public Student[] createArrayStudent() {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Введите сколько cтудентов вы хотите добавить в базу");
        int mystudentcounter = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[mystudentcounter] ;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите id студента");

            String id = scanner.nextLine() ;
            boolean isnamevalid = false ;
            for (int j = 0; j < i; j++) {
                if (students[j].getStudentid().equalsIgnoreCase(id)) {
                    isnamevalid = true ;
                    break;
                }

            }
            if (isnamevalid)  {
                System.out.println("Такой id существует!");
                i = i-1; //Loop
            }else {
                System.out.println("Введите имя студента");
                String name = scanner.nextLine() ;
                System.out.println("Введите фамилию студента");
                String surname = scanner.nextLine() ;
                Student student = new Student(name,id,surname);
                students[i] = student ;
            }


        }

        for (int i = 0; i < students.length; i++) {

            System.out.println(" Имя студента " + (i + 1) + " : " + students[i].getName());
            System.out.println(" Фамилия студента " + (i + 1) + " : " + students[i].getSurname());
            System.out.println(" Id студента " + (i + 1) + " : " + students[i].getStudentid());

        }
        return students;
    }
}
