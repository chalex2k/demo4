import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1] ++;
            return digits;
        }
        boolean ost = true;
        for (int i = digits.length - 1; i >= 0 && ost; i--){
            if (digits[i] == 9){
                digits[i] = 0;
            }
            else {
                digits[i]++;
                ost = false;
            }
        }
        if (ost){
            int[] newd = new int[digits.length + 1];
            newd[0] = 1;
            for(int i = 1; i < newd.length; i++) {
                newd[i] = 0;
            }
            return newd;
        }
        return digits;

    }

    public static void main(String[] args) {
        int[] a = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(a)));
    }
}
