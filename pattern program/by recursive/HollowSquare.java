public class HollowSquare {
    
    static void solidLine(int rows){
        if(rows == 0){
            return;
        }
        System.out.print("*");
        solidLine(rows-1);
    }



    static void hollowLine(int rows , int cols){
        if(cols >rows){
            return;
        }
        if(cols == 1 || cols == rows){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        hollowLine(rows, cols+1);
    }



    static void printhollowSquare(int currentRow ,int rows){
        if(currentRow > rows){
            return;
        }
        if(currentRow == 1 || rows == currentRow ){
            solidLine(rows);
        }else{
            hollowLine(rows, 1);
        }
        System.out.println();
        printhollowSquare(currentRow +1, rows);
    }


    
    public static void main(String[] args) {
        printhollowSquare(1,4);
    }
}
