public class LeftHalfHollowPyramid {
    static void solidLine(int currentRow){
        if(currentRow == 0){
            return;
        }
        System.out.print("*");
        solidLine( currentRow -1);
    }


    static void hollowLine(int currentRow,int cols){
        if(cols > currentRow ){
            return;
        }
        if(cols == 1 || currentRow == cols){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        hollowLine(currentRow , cols +1);
    }

    static void printLeftHollowPyramid(int currentRow , int rows){
        if(currentRow > rows){
            return;
        }
        if(currentRow == 1 || currentRow == rows){
            solidLine(currentRow);
        }else{
            hollowLine(currentRow, 1);
        }
        System.out.println();
        printLeftHollowPyramid(currentRow+1, rows);
    }


    public static void main(String[] args) {
        printLeftHollowPyramid(1, 5);
    }
}