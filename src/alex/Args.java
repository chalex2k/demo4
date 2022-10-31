package alex;

import java.util.Arrays;

public class Args {
    public static void main(String[] args){
        String a = args[0];
        String b = args[1];
        System.out.println(a.equals(b));
        System.out.println(Arrays.toString(args));
        if (args[0].equals("--help")){
            System.out.println("THE HELP OF MY PROGRAM");
        }
    }
}
