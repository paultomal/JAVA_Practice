public class Main {
    public static void main(String[] args) {
        StringOperation stringOperation = StringUtils::countVowels;
        System.out.println(stringOperation.performOperation("Paul"));

    }
}