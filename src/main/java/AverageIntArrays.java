public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        int elements = 0;

        for (int i = 0; i < aa.length; i++){
            elements++;
        }
        return elements;
    }

    public int sum(int[] aa) {
        int sum = 0;

        for (int i = 0; i < aa.length; i++){
            sum += aa[i];
        }
        return sum;
    }

    public int average(int[] aa) {
        int sum = 0;
        if (aa.length != 0) {
            for (int i = 0; i < aa.length; i++) {
                sum += aa[i];
            }
            return Math.round(sum / aa.length);
        }
        return  0;
    }
}
