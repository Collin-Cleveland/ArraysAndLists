public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {
        int elements = 0;

        for (int i = 0; i < aa.length; i++){
            elements++;
        }
        return elements;
    }

    public int sum(double[] aa) {
        int sum = 0;

        for (int i = 0; i < aa.length; i++){
            sum += aa[i];
        }
        return sum;
    }

    public int average(double[] aa) {
    int sum = 0;

    for (int i = 0; i < aa.length; i++){
        sum += aa[i];
    }
        return Math.round(sum/aa.length);
    }

}
