package Grade;

/**
 *
 * Nama = Farrel Ardian
 * Nim = A11.2021.13437
 */

public class PassFailExam {
    private int numberOfQuestions;
    private double pointsPerQuestions;
    private int numberMissed;

    public PassFailExam(int questions, double minPassing, int missed) {
        this.numberOfQuestions = questions;
        this.pointsPerQuestions = minPassing;
        this.numberMissed = missed;
    }

    public double getPointsEach() {
        return pointsPerQuestions;
    }

    public int getNumMissed() {
        return numberMissed;
    }
}
