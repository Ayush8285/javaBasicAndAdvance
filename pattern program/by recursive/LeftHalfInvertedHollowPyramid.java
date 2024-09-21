public class LeftHalfInvertedHollowPyramid {
    
    static void solidLine(int rows){
        if(rows == 0){
            return;
        }
        System.out.print("*");
        solidLine(rows -1);
    }

    static void hollowLine(int currentRow , int cols){
        if(cols > currentRow){
            return;
        }
        if(cols == 1 || currentRow == cols){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        hollowLine(currentRow, cols + 1);
    }


    static void printLeftHalfInvertedHollowPyramid(int currentRow , int rows){
        if(currentRow == 0){
            return;
        }
        if(currentRow == 1 || currentRow == rows){
            solidLine(currentRow);
        }else{
            hollowLine(currentRow, 1);
        }
        System.out.println();
        printLeftHalfInvertedHollowPyramid(currentRow-1 , rows);
    }

    public static void main(String[] args) {
        printLeftHalfInvertedHollowPyramid(7, 7);
    }
}
