package patterns;

//Input Format: N = 3
//Result:
//        1
//        01
//        101
//
//Input Format: N = 6
//Result:
//        1
//        01
//        101
//        0101
//        10101
//        010101

public class BinaryNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j % 2);
            }
            System.out.println();
        }
    }
}
