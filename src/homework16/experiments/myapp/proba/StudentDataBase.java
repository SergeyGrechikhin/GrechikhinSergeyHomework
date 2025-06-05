package homework16.experiments.myapp.proba;

import java.sql.*;

public class StudentDataBase {
    private static final  String DB_URL = "jdbc:sqlite:C:\\Users\\GBT H510M_NVDA\\IdeaProjects\\GrechikhinSergeyHomework\\src\\homework16\\experiments\\myapp\\proba\\students.db" ;

    public static void saveStudent(Student student,String groupName) {
        String sql = "insert into students (id ,name, surname ,group_name) values (?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(DB_URL) ;
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getSurname());
            pstmt.setString(4, groupName);

            pstmt.executeUpdate() ;
            System.out.println("Студент добавлен в базу : " + student.getName());

        }catch (SQLException e) {
            System.out.println("Ошибка при сохранение" + e.getMessage());
        }

    }
}
