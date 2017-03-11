package leetcode_38_count_and_say;

public class Solution {
    public static String countAndSay(int n) {
        //String str = Integer.toString(n - 1);
        String result = "1";
        
        if (n < 2) {
            return Integer.toString(n);
        } 
        
        for (int i = 0; i < n - 1; i++) {
            result = countNumber(result);      
        }
        
        return result;
    }
    
    public static String countNumber(String str) {
        int counter = 0;
        String output = "";
        
        if (str.length() == 0) {
        	return "";
        } else if (str.length() == 1) {
        	output = "1" + str.charAt(0);
        	return output;
        }
        
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) != str.charAt(i + 1)) {
                counter++;
                output = output + Integer.toString(counter) + str.charAt(i);
                counter = 0;
            } else {
                counter++;
            }
        }
        
        if(str.charAt(str.length() - 2) == str.charAt(str.length() - 1)) {
        	counter++;
            output = output + Integer.toString(counter) + str.charAt(str.length() - 2);
        } else {
        	output = output + Integer.toString(1) + str.charAt(str.length() - 1);
        }
        
        return output;
    }
}