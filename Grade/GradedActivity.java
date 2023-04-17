package Grade;

/**
 *
 * Nama = Farrel Ardian
 * Nim = A11.2021.13437
 */

public class GradedActivity {
    private double score;
    private String name;
    private char grade;
    
    public GradedActivity(String n) {
        this.name = n;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        return grade;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
}
