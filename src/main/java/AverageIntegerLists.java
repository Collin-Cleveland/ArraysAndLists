import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        int count = 0;

        for (int i = 0; i < aa.size(); i++){
            count++;
        }
        return count;
    }

    public int sum(ArrayList<Integer> aa) {
        int sum = 0;

        for(int i = 0; i < aa.size(); i++){
            sum += aa.get(i);
        }
        return sum;
    }

    public int average(ArrayList<Integer> aa) {
        int sum = 0;
    if (aa.size() != 0) {
        for (int i = 0; i < aa.size(); i++){
            sum += aa.get(i);
        }
        return Math.round(sum / aa.size());
    }
    return 0;
    }
}
