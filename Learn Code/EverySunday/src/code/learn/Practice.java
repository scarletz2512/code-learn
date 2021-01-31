package code.learn;

import java.util.Map;
import java.util.Set;

public class Practice {


    public void sevenBoom(int[] arr) {

        if (arr.length == 0) {
            System.out.println("\nThere is no 7 in the array");
            return;
        }

        if (isContainSeven(arr))

            System.out.println("\nBoom!");
        else
            System.out.println("\nThere is no 7 in the array");
    }

    private boolean isDivisibleBySeven(int number) {
        String s = number + "";

        if (s.contains("7"))
            return true;
        return false;
    }

    private boolean isContainSeven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isDivisibleBySeven(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public int bugger(int number){

        int result = 0;

        if (number<9)
            return 0;
        do{
            number = multi(number);
            result = result + 1;
        }while (number>9);

        return result;
    }

    private int multi(int number){
        String s = number + "";
        int result = 1;
        for (int i = 0; i < s.length(); i++) {

            result =  result * Integer.parseInt(s.charAt(i)+"");
        }

        return result;
    }




}
