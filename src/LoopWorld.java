public class LoopWorld {

    public static void main(String[] args) {
        LoopWorld loops = new LoopWorld();

    }

    public LoopWorld() {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
    }

    public void pattern1() {
        System.out.println("********* Pattern 1: ");
        for (int i = 0; i < 25; i = i + 5) {
            System.out.println(i);
        }
    }

    public void pattern2() {
        System.out.println("******** Pattern 2: ");
        for (int i = 2; i < 30; i = i + 5) {
            System.out.println(i);
        }
    }

    public void pattern3() {
        System.out.println("******** Pattern 3: ");
        for (int i = 25; i > 0; i = i - 4) {
            System.out.print(i);
        }
        System.out.println();
    }

    public void pattern4() {
        System.out.println("******** Pattern 4: ");
        for (int q = 1; q < 7; q++) {
            System.out.print(q * q);
        }
        System.out.println();
    }

    public void pattern5() {
        System.out.println("******** Pattern 5:");
        for (int row = 0; row < 4; row++) {
            for (int col = 1; col < 5; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        System.out.println("******** Pattern 6:");
        for (int line = 1; line < 6; line++) {
            for (int s = 0; s < line - 1; s++) {
                System.out.print(" ");
            }
            System.out.println(line);
        }
    }

    public void pattern7() {
        System.out.println("******** Pattern 7");
        for (int i = 1; i <= 5; i++) {
            for (int y = 0; y < 6 - i; y++) {
                System.out.print(i + " ");
            }
//        for (int col = 1; col < 5; col++) {
//            for (int row = 1; row < 2; row++) {
//                for (int line = 1; line < 5; line++)
//                    for (int s = 0; s < line - 1; s++) {
//                        System.out.print(col + " ");

            System.out.println();
        }
    }

    public void pattern8() {
        System.out.println("******** Pattern 8");
        for (int c = 1; c < 6; c++) {
            for (int s = 0; s < c - 1; s++) {
                System.out.print(" ");
            }
            for (int y = 0; y < 6 - c; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    public void pattern9() {
//        System.out.println("******** Pattern 5:");
//        for (int row = 0; row < 4; row++) {
//            for (int y = 0; y < 6 - y; y++) {
//                System.out.print(y + " ");
//                {
//                    for (int col = 1; col < 5; col++) {
//                        System.out.print(col + " ");
//                    }
//                    System.out.println();
//                }
//            }
//        }
//    }
}
