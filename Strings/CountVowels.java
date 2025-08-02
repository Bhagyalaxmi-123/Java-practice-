public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello Java World";
        int count = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total vowels: " + count);
    }
}