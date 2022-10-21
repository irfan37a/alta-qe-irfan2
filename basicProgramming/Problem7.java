package basicProgramming;

public class Problem7 {
    private static float Mean(float[] number){
        float a = 0.0f;
        for (int i = 0; i< number.length; i++)
            a += number[i];
        return a/number.length;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
