package basicProgramming;

public class Problem6 {
    public static void DrawXYZ(int n){
        int i;
        for (i=1; i<= n; i++){
            if (i%3 == 0){
                System.out.println("X");
            }
        }
    }

    public static void main(String[] args) {
        DrawXYZ(3);
    }
}
