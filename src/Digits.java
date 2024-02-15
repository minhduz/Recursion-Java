import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int newN = 0;
        //C1
//        char[] arr = ("" + number).toCharArray();
//        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        int reversedNumber = Integer.parseInt(String.valueOf(arr));
//        System.out.println("Reversed Number: " + reversedNumber);
//        System.out.println("Pow: " + Math.pow(reversedNumber,2));

        //C2
//        while (number != 0) {
//            newN = newN * 10 + number % 10;
//            number = number / 10;
//        }
//        System.out.println(newN);

        System.out.println(reverseRecursion(number,newN));
    }

    private static int reverseRecursion(int number, int newNum){
        if(number == 0){
            return newNum;
        }else {
            return reverseRecursion(number / 10, newNum = newNum * 10 + number % 10);
        }
    }





}
