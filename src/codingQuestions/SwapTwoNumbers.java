package codingQuestions;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println("Before Swap " + "num1 : " +num1 + " num2 : " +num2);
//        int temp = num2;
//        num2 = num1;
//        num1 = temp;
//        System.out.println("After Swap " + "num1 : " +num1 + " num2 : " +num2);

        num1 = num1 + num2; //num1 = 22
        num2 = num1 - num2; // 22 - 12 = 10
        num1 = num1 - num2; // 22 - 10 = 12
        System.out.println("After Swap " + "num1 : " +num1 + " num2 : " +num2);


    }
}
