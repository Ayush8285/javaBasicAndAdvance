public class RightInvertedHollowTriangle {
    static void printSpace(int space){
        if(space == 0){
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }

    static void printSolidLine(int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printSolidLine(star-1);
    }

    static void printHollowLine(int currentRow,int cols){
        if(cols > currentRow){
            return;
        }
        if(cols == 1 || currentRow == cols){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        printHollowLine(currentRow, cols+1);
    }
    static int spaceCount = 0;
    static void printRightInvertedHollowTriangle(int rows,int cols){
        if(rows == 0){
            return;
        }
        printSpace(spaceCount);
        if(rows == cols || rows == 1){
            printSolidLine(rows);
        }else{
            printHollowLine(rows, 1);
        }
        System.out.println();
        spaceCount++;
        printRightInvertedHollowTriangle(rows-1, cols);
    }


    public static void main(String[] args) {
        printRightInvertedHollowTriangle(4, 4);
    }
}
