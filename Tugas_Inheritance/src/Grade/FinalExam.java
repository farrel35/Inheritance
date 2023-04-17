package Grade;

/**
 *
 * Nama = Farrel Ardian
 * Nim = A11.2021.13437
 */

public class FinalExam extends GradedActivity{
    private int numberOfQuestions;
    private int numberMissed;
    private double pointsPerQuestions;

    public FinalExam(int questions, int missed, String n) {
        super(n);
        this.numberOfQuestions = questions;
        this.numberMissed = missed;
    }

    public int getNumberMissed() {
        return numberMissed;
    }

    public double getPointsPerQuestions() {
        return pointsPerQuestions;
    }
}
