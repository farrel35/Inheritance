package Grade;

/**
 *
 * Nama = Farrel Ardian
 * Nim = A11.2021.13437
 */

public class PassFailActivity extends GradedActivity{
    private double minimumPassingScore;

    public PassFailActivity(double min, String n) {
        super(n);
        this.minimumPassingScore = min;
    }

    @Override
    public char getGrade() {
        return super.getGrade();
    }
}
