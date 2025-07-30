package codingQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello Good Morning";
        StringBuilder sb = new StringBuilder(s);
        String reversedString = sb.reverse().toString();
        System.out.println(reversedString);

        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length-1;
        while(i<=j) {
            char temp = charArray[i];
            charArray[i++] = charArray[j];
            charArray[j--] = temp;
        }
        System.out.println(new String(charArray));
    }
}
