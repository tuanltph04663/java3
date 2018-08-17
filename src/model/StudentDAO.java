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
    private static final String SELECT_ALL = "SELECT * FROM sinhvien";
    private static final String INSERT_INTO = "INSERT INTO sinhvien VALUES(?,?,?,?)";
    private static final String UPDATE_INTO = "UPDATE sinhvien SET HoTen=?,Email=?,SDT=?,GioTinh=?,DiaChi=? WHERE MaSV=?";

    @Override
    public void add(Student e) {
        // TODO add Student handle
    }

    @Override
    public void update(Student e) {
        // TODO update Student handle
    }

    @Override
    public List<Student> getAll() {
        // TODO get all student handle
        List<Student> students = new ArrayList<>();
        try {
            Statement stm = CONN.createStatement();
            ResultSet rs = stm.executeQuery(SELECT_ALL);
            while (rs.next()) {
                // TODO get data here
            }
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