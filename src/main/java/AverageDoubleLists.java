import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {
        double count = 0.0;

        for (int i = 0; i < aa.size(); i++){
            count++;
        }
        return count;
    }
    public Double sum(ArrayList<Double> aa) {
        double sum = 0;

        for (int i = 0; i < aa.size(); i++){
            sum += aa.get(i);
        }
        return sum;
    }
    public Double average(ArrayList<Double> aa) {
        double sum = 0;

        for (int i = 0; i < aa.size(); i++){
            sum += aa.get(i);
        }
        return Double.valueOf(Math.round(sum/aa.size()));
    }

}
