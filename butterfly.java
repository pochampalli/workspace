public class butterfly {
    public static void main(String args[]) {
        int i, j;
        int n = 14;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j==1 && i>6 && i<=(n-1) || i==14 || j==14 && i>6 && i==(n-1) || i-j>=(n-1)/2 || i+j>=n+(n/2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
