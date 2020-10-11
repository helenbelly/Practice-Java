import java.util.Scanner;

class Permutation {


    public static void main(String[] args) {
//        String str = "ABC";
//        int n = str.length();
//        Permutation permutation = new Permutation();
//        permutation.permute(str, 0, n - 1);

        String original, reverse = "";
        Scanner bg = new Scanner(System.in);

        System.out.println("Enter a string:");
        original = bg.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");


//            private void permute(String str, int l, int r) {
//        if (l == r)
//            System.out.println(str);
//        else {
//            for (int i = l; i <= r; i++) {
//                str = swap(str, l, i);
//                permute(str, l + 1, r);
//                str = swap(str, l, i);
//            }
//        }
//    }
//    public String swap(String a, int i, int j)
//    {
//        char temp;
//        char[] charArray = a.toCharArray();
//        temp = charArray[i] ;
//        charArray[i] = charArray[j];
//        charArray[j] = temp;
//        return String.valueOf(charArray);
//


        }

    }
}


