package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PointDAO extends DAO<Point> {

    private static final String SELECT_ALL = "SELECT * FROM POINT";
    private static final String SELECT_WHERER = "SELECT * FROM POINT WHERE STUDENT_CODE=?";
    private static final String INSERT_INTO = "";
    private static final String UPDATE_INTO = "";

    @Override
    public void add(Point e) {
        // TODO add Point handle
    }

    @Override
    public void update(Point e) {
        // TODO update Point handle
    }

    /**
     * Hàm này lấy tất cả bản ghi trong bảng grade
     *
     * @return
     *
     * List<Point>
     */
    @Override
    public List<Point> getAll() {
        List<Point> points = new ArrayList<>();
        try {
            Statement stm = CONN.createStatement();
            ResultSet rs = stm.executeQuery(SELECT_ALL);
            while (rs.next()) {
                String studentCode = rs.getString("STUDENT_CODE");
                String fullName = rs.getString("FULL_NAME");
                double english = rs.getDouble("ENGLISH");
                double math = rs.getDouble("MATH");
                double informatics = rs.getDouble("INFORMATICS");
                double physicalEducation = rs.getDouble("PHYSICAL_EDUCATION");

                Point p = new Point(studentCode, fullName, english, math, informatics, physicalEducation);
                points.add(p);
            }
            return points;
        } catch (SQLException ex) {
            Logger.getLogger(PointDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Point findBy(String id) {
        Point point = new Point();

        try {
            PreparedStatement p = CONN.prepareStatement(SELECT_WHERER);
            p.setString(1, id);

            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                // TODO get data here
            }
            return point;
        } catch (SQLException ex) {
            Logger.getLogger(PointDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
