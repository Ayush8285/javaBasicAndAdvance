public class LeftInvertedPyramid {
    
    static void printStar(int rows){
        if(rows == 0){
            return;
        }
        System.out.print("*");
        printStar( rows - 1);
    }

    static void printLeftInvertedPyramid(int rows){
        if(rows == 0){
            return;
        }
        printStar(rows);
        System.out.println();
        printLeftInvertedPyramid(rows - 1);

    }

    public static void main(String[] args) {
        printLeftInvertedPyramid(4);
    }
}
