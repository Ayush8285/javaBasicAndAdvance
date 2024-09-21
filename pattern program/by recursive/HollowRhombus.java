public class HollowRhombus {
    static void printSpace(int space){
        if(space == 0){
            return;
        }
        System.out.print(" ");
        printSpace( space-1);
    }
    static void solidLine(int star){
        if (star == 0) {
            return;
        }
        System.out.print("*");
        solidLine(star-1);
    }
    static void hollowLine(int rows , int cols){
        if(cols > rows){
            return;
        }
        if(cols == 1 || cols == rows){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        hollowLine(rows, cols+1);
    }
    static void printHollowRhombus(int currentRow ,int  rows,int cols){
        if(currentRow > rows){
            return;
        }
        printSpace(cols);
        if(currentRow == 1 || currentRow == rows){
            solidLine(rows);
        }else{
            hollowLine(rows, 1);
        }
        System.out.println();
        printHollowRhombus(currentRow+1, rows, cols-1);
    }

    public static void main(String[] args) {
        printHollowRhombus(1, 3, 3);
    }
}
