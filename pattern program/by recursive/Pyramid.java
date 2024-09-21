public class Pyramid {
    
    static void printSpace(int space){
        if(space == 0){
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }

    static void printRightTriangle(int currentRow){
        if(currentRow == 0){
            return;
        }
        System.out.print("*");
        printRightTriangle(currentRow-1);
    }

    static void printLeftTriangle(int currentRow){
        if(currentRow == 0){
            return;
        }
         System.out.print("*");
         printLeftTriangle(currentRow-1);
    }
    static void printPyramid(int currentRow , int rows){
        if(currentRow > rows){
            return;
        }
        printSpace(rows-currentRow);
        printRightTriangle(currentRow);
        printLeftTriangle(currentRow-1);
        System.out.println();
        printPyramid(currentRow+1, rows);
    }

    public static void main(String[] args) {
        printPyramid(1, 5);
    }
}
