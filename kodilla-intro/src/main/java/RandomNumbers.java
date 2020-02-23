import java.util.Random;        //zaimportowanie możliwości zawartych w klasie Random

public class RandomNumbers extends Object{

    int min;
    int max;

    public int getMin() {

        return min;
    }

    public int getMax() {

        return max;
    }

    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.calculate();
        System.out.println("Min = " + randomNumbers.getMin());
        System.out.println("Max = " + randomNumbers.getMax());

    }

    public void calculate() {

        Random random = new Random();

        min = 30;
        max = 0;

        for (int sum = 0; sum <= 5000; ) {

            int temp = random.nextInt(31);
            sum = sum + temp;

            if (min>temp) {
                min = temp;
            }

            if (max<temp) {
                max = temp;
            }
        }
    }
}
