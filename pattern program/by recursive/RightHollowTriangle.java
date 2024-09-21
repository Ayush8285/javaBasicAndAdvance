public class RightHollowTriangle {
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
        if(cols == 1 || cols == currentRow){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        printHollowLine(currentRow, cols+1);
    }

    static void printRightHollowTriangle(int currentRow , int rows,int cols){
        if(currentRow > rows){
            return;
        }
        printSpace(cols-1);
        if(currentRow == 1 || currentRow == rows){
            printSolidLine(currentRow);
        }else{
            printHollowLine(currentRow, 1);
        }
        System.out.println();
        printRightHollowTriangle(currentRow+1, rows,cols-1);
    }

    public static void main(String[] args) {
        printRightHollowTriangle(1, 4,4);
    }
}
