package objectOrientedProgramming;

public class Problem1 {
    void luasPersegi(int persegi){
        System.out.println("Luas ");
        System.out.println("Persegi : " + persegi * persegi);
    }

    void luasSegitiga(int a, int t){
        System.out.println("Segitiga : " + (a *t)/2);
    }
    void luasPersegiPanjang(int p, int l){
        System.out.println("Persegi Panjang : " + p * l);
    }

    void kelilingPersegi(int kelPersegi){
        System.out.println("Keliling ");
        System.out.println("Persegi : " + 4 * kelPersegi);
    }

    void kelilingSegitiga(int a1, int t1){
        System.out.println("Segitiga : " + a1 * t1);
    }

    void  kelilingPersegiPanjang(int p1, int l1){
        System.out.println("Persegi : " + (2*p1 + 2*l1));
    }
}
