package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PointDAO extends DAO<Point> {

    private static final String SELECT_ALL = "SELECT * FROM grade";
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
//                double english = rs.getString("english");
//                double math = rs.getString("math");
//                double informatics = rs.getString("informatics");
//                double physicalEducation = rs.getString("physicalEducation");
//
//                Point p = new Point(english, math, informatics, physicalEducation);
//                points.add(p);
            }
            return points;
        } catch (SQLException ex) {
            Logger.getLogger(PointDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Point findBy(String id) {
        // TODO find handle
        return null;
    }

}
