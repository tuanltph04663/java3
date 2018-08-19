package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RZ09
 */
public class CopyFile {

    public void copyFileUsingFileStreams(String sourcePath, String savePath, String fileName) throws IOException {
        InputStream input;
        OutputStream output;

        try {
            input = new FileInputStream(sourcePath);
            output = new FileOutputStream(savePath + fileName);

            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            // finally
        }

    }

    public static void main(String[] args) {
        CopyFile cf = new CopyFile();
        String sourcePath = "C:\\Users\\lgduc\\Documents\\java3\\some.txt";
        try {
            cf.copyFileUsingFileStreams(sourcePath, "C:\\Users\\lgduc\\Documents\\java3\\", "some1.txt");
        } catch (IOException ex) {
            Logger.getLogger(CopyFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
