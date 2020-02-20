public class Loops {
    public static void main(String[] args) {
        //for (int i = 0; i <= 10; i++) {
        //    System.out.println(i);
        //}
    }

    int[] summationData = new int[]{1, 3, 7, 15};

    public static int sumTable(int[] summationData) {

        int sum = 0;

        for (int i = 0; i < summationData.length; i++) {
             sum = sum + summationData[i];
        }
        return sum;
    }

}
