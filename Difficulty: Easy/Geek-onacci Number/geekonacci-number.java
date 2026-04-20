import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int N = sc.nextInt();

            System.out.println(geek(N, A, B, C));
        }
    }
    static int geek(int n,int A,int B,int C){
        if(n==1){
            return A;
        }
        if(n==2){
            return B;
        }
        if(n==3){
            return C;
        }
        return geek(n-1,A,B,C)+geek(n-2,A,B,C)+geek(n-3,A,B,C);
    }
}