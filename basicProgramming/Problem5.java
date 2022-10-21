package basicProgramming;

public class Problem5 {
    public static boolean palindrome(String value){
        System.out.println(value);
        StringBuilder data = new StringBuilder(value); // StringBuilder membuat Builder string kosong
        data.reverse(); // reverse = membalikan huruf
        String rev = data.toString();
        if(value.equals(rev)) { // equals = membandungkan 2 buah object
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("kupu-kupu"));
    }
}
