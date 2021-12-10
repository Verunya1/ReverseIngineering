import java.util.ArrayList;

public class Accuracy {
    public static int percent;
    /*public static ArrayList arr;
    public static int length; разобраться с тем как можно получать информацию из другого класса*/

    public static double getPercent() {
        return percent;
    }

    public static void setPercent(double percent) {
        Accuracy.percent = (int) percent;
    }

    public static double countPercent() {
        return (Accuracy.percent*100)/(3.0);
    }

}
