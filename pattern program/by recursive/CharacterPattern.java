public class CharacterPattern {
    static char ch = 'A';
    static void printChar(int currentRow){
        if(currentRow == 0){
            return;
        }
        System.out.print(ch);
        printChar(currentRow-1);
    }
    static void printCharacterPattern(int currentRow , int rows){
        if(currentRow > rows){
            return;
        }
        printChar(currentRow);
        System.out.println();
        ch++;
        printCharacterPattern(currentRow+1, rows);
    }
    public static void main(String[] args) {
        printCharacterPattern(1, 4);
    }
}
