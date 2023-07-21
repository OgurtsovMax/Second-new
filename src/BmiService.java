public class BmiService {
    public int calculate(int m, double h) {
        double index;

        index = m / (h * h);

        return (int) index;


    }
}