package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DAO.CONN;

public class StudentDAO extends DAO<Student> {

    private static final String SELECT_WHERE = "";
    private static final String SELECT_ALL = "SELECT * FROM STUDENT";
    private static final String INSERT_INTO = "INSERT INTO STUDENT VALUES(?,?,?,?)";
    private static final String UPDATE_INTO = "UPDATE STUDENT SET FULL_NAME=?,EMAIL=?,PHONE_NUMBER=?,GENDER=?,ADDRESS=? WHERE STUDENT_CODE=?";

    @Override
    public void add(Student e) {
        // TODO add Student handle
    }

    @Override
    public void update(Student e) {
        // TODO update Student handle
    }

    @Override
    public void delete(String studentCode) {
        // TODO
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        try {
            Statement stm = CONN.createStatement();
            ResultSet rs = stm.executeQuery(SELECT_ALL);
            while (rs.next()) {
                String studentCode = rs.getString("STUDENT_CODE");
                String fullName = rs.getString("FULL_NAME");
                String email = rs.getString("EMAIL");
                String phoneNumber = rs.getString("PHONE_NUMBER");
                String gender = rs.getString("GENDER");
                String address = rs.getString("ADDRESS");
                String image = rs.getString("IMAGE");

                Student s = new Student(studentCode, fullName, email, phoneNumber, gender, address, image);
                students.add(s);
            }
            return students;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Student findBy(String code) {
        // TODO find Student by code
        return null;
    }

}
