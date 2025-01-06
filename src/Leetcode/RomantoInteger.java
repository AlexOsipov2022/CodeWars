package Leetcode;

public class RomantoInteger {
    public static int romanToInt(String s){
        int result=0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result = result + 1;
            } else if (s.charAt(i) == 'V') {
                result = result + 5;
            } else if (s.charAt(i) == 'X') {
                result = result + 10;
            } else if (s.charAt(i) == 'L') {
                result = result + 50;
            } else if (s.charAt(i) == 'C') {
                result = result + 100;
            } else if (s.charAt(i) == 'D') {
                result = result + 500;
            } else if (s.charAt(i) == 'M') {
                result = result + 1000;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XIL"));
    }
}
//https://leetcode.com/problems/roman-to-integer/description/