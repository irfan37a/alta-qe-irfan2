package basicProgramming;

public class Problem2 {
    public static void main(String[] args) {
        int studentScore = 80;

        if(studentScore >= 80){
            System.out.println("Nilai A");
        }else if (studentScore >= 65){
            System.out.println("Nilai B+");
        } else if (studentScore >= 50) {
            System.out.println("Nilai B");
        } else if (studentScore >= 35) {
            System.out.println("Nilai C");
        } else if (studentScore >= 0) {
            System.out.println("Nilai D");
        } else {
            System.out.println("invalid");
        }
    }
}
