public class AvgCalc {
    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double average1 = calculateAverage(2, 3, 4, 5, 9);
        double average2 = calculateAverage(3, 7, 9, 10);
        double average3 = calculateAverage(2, 9, 3, 7, 4, 4, 7);

        System.out.println("Average 1: " + average1);
        System.out.println("Average 2: " + average2);
        System.out.println("Average 3: " + average3);
    }

}
