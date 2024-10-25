public class StringUtilities {

    private StringBuilder stringBuilder = new StringBuilder();

    private int charsAdded = 0;

    public void addChar(StringBuilder stringBuilder, char c){
//        this.stringBuilder.append(c);                                       for memory space run out exception
        stringBuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str){
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addSuffix(String str){
        return str + "__Suffix";
    }
}
