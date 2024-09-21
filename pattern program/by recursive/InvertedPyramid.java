public class InvertedPyramid {
    
    static void printSpace(int space){
        if(space == 0){
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }

    static void printStar(int rows){
        if(rows == 0){
            return;
        }
        System.out.print("*");
        printStar(rows-1);
    }

    static void printInvertedPyramid(int currentRow , int cols){
        if(cols < 0){
            return;
        }
        printSpace(currentRow-1);
        printStar(cols);
        System.out.println();
        printInvertedPyramid(currentRow+1, cols-2);
    }

    public static void main(String[] args) {
        printInvertedPyramid(1, 5);
    }

}
