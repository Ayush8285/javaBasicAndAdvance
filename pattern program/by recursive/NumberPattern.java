public class NumberPattern {
    static int num = 1;
    static void printNum(int currentRow){
        if(currentRow == 0){
            return;
        }
        System.out.print(num);
        num++;
        printNum(currentRow-1);
    }

    static void printNumberPattern(int currentRow , int rows){
        if(currentRow > rows){
            return;
        }
        printNum(currentRow);
        System.out.println();
        printNumberPattern(currentRow+1, rows);

    }
    public static void main(String[] args) {
        printNumberPattern(1, 4);
    }
}
