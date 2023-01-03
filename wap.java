public class wap {
    public static void main(String args[]) {
        int i, j, k;
        int n = 14;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i==1 || j==1 && j<=14 || i==14 || j==1 && j<=14 ||j==14 && i<=14 || i+j<=(n+2)/2 || j-i>=(n-1)/2)  {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


