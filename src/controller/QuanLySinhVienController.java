package controller;

import app.QuanLySinhVien;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Student;
import util.CopyFile;

/**
 *
 * @author RZ09
 */
public class QuanLySinhVienController {

    public void fillToTable(List<Student> list, JTable tb) {
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        for (Student s : list) {
            Object[] row = new Object[]{
                s.getStudentCode(),
                s.getFullName(),
                s.getEmail(),
                s.getPhoneNumber(),
                s.getGender(),
                s.getAddress(),
                s.getImage()
            };
            model.addRow(row);
        }
    }

    public String browserImage(String savePath) {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.showOpenDialog(null);
        
        File file = jFileChooser.getSelectedFile();
        String sourcePath = file.getAbsolutePath();
        String imageName = file.getName();
        
        CopyFile cf = new CopyFile();
        try {
            cf.copyFileUsingFileStreams(sourcePath, savePath, imageName);
        } catch (IOException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return imageName;
    }

}
