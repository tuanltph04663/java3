package model;

public class Point {

    private String english;
    private String math;
    private String informatics;
    private String physicalEducation;

    public Point() {
    }

    public Point(String english, String math, String informatics, String physicalEducation) {
        this.english = english;
        this.math = math;
        this.informatics = informatics;
        this.physicalEducation = physicalEducation;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getInformatics() {
        return informatics;
    }

    public void setInformatics(String informatics) {
        this.informatics = informatics;
    }

    public String getPhysicalEducation() {
        return physicalEducation;
    }

    public void setPhysicalEducation(String physicalEducation) {
        this.physicalEducation = physicalEducation;
    }

    @Override
    public String toString() {
        return "Point{" + "english=" + english + ", math=" + math + ", informatics=" + informatics + ", physicalEducation=" + physicalEducation + '}';
    }
    
    public double getAverage(){
        int e = 0;
        int m = 0;
        int i = 0;
        int p = 0;
        try {
            e = Integer.parseInt(this.english);
            m = Integer.parseInt(this.math);
            i = Integer.parseInt(this.informatics);
            p = Integer.parseInt(this.physicalEducation);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        
        double average = (e + m + i + p) / 4;
        
        return average;
    }
    
    public static void main(String[] args) {
        Point p = new Point("6", "7", "4", "8");
        System.out.println(p.getAverage());
    }
    
}
