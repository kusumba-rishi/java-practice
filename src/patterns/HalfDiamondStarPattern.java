package patterns;

//Input Format: N = 3
//Result:
//        *
//        **
//        ***
//        **
//        *
//Input Format: N = 6
//Result:
//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        *****
//        ****
//        ***
//        **
//        *

public class HalfDiamondStarPattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                int stars = 2 * n - i;
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
