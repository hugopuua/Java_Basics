package week8;

public class CivilService implements NationalService {

    private int daysLeft = 362;

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }

    }


}
