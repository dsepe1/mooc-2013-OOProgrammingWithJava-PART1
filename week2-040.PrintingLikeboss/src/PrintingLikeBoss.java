public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int stars = 1;
        int i = 0;
        while (i < size) {
            printWhitespaces(size - stars);
            printStars(stars);
            stars++;
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int stars = 1;
        int i = 0;
        int whiteSpace = height;
        while (i < height) {
            printWhitespaces(whiteSpace - 1);
            printStars(stars);
//            printWhitespaces(whiteSpace - 1);
            i++;
            stars += 2;
            whiteSpace--;
        }
        
        //base stand
        printWhitespaces(height - 2);
        printStars(3);
//        printWhitespaces(height - 2);
//        System.out.println("");
        printWhitespaces(height - 2);
        printStars(3);
//        printWhitespaces(stars);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
