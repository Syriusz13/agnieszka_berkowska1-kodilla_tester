import java.util.Random;

public class RandomNumbers extends Object{

    public static void main(String[] args) {
    }

    int max = 5000;
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum <= max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;
    }

}
