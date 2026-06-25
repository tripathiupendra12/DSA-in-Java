
public class StarPattern {

        // Pattern 1

        public static void hollow_rectangle(int n, int m) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if((i == 0 || i == n-1) || (j == 0 || j == m-1)) {
                    System.out.print("* ");
                } else {
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

        // Pattern 2

        public static void half_pyramid(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j >= n-i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

        // Pattern 3

        public static void inverted_half_pyramid_with_num(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }

        // Pattern 4

        public static void floyd_triangle(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }

        // Pattern 5

        public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               if((i+j)%2 == 0) {
                System.out.print("1");
               } else {
                System.out.print("0");
               }
            }
            System.out.println();
        }
    }

        // Pattern 6

        public static void butterfly_pattern(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2*(n-i-1); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n-1; i >= 0; i--) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2*(n-i-1); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

        // Pattern 7

        public static void solid_rhombus(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

       // Pattern 8

    //    int n = 5;
    //    for (int i = 0; i < n; i++) {
    //        for (int j = 0; j < n-i-1; j++) {
    //            System.out.print("  ");
    //        }
    //        for (int j = 0; j < n; j++) {
    //            if((i == 0 || i == n-1) || (j == 0 || j == n-1)) {
    //             System.out.print("* ");
    //            } else {
    //             System.out.print("  ");
    //            }
    //        }
    //        System.out.println();
    //    }

    // Pattern 9

    public static void diamond(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n-i-1; j++) {
            System.out.print("  ");
        }
        for (int j = 0; j < 2*i+1; j++) {
            System.out.print("* ");
        }
        System.out.println("  ");
    }
     for (int i = n; i > 0; i--) {
        for (int j = 0; j < n-i; j++) {
            System.out.print("  ");
        }
        for (int j = 0; j < 2*i-1; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    }

    // Pattern 10

    //  int n = 5;
    // for (int i = 0; i < n; i++) {
    //     for (int j = 0; j < n-i-1; j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 0; j < i+1; j++) {
    //         System.out.print(i+1+ " ");
    //     }
    //     System.out.println();
    // }
     public static void main(String[] args) {
        diamond(4);
    }
}