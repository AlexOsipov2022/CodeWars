package RedRover_HW_13;

public class HW_13_7 {
    public static Integer basicMath(String op, int v1, int v2) {
//        return (op=="+") ? (v1+v2) : (op=="-") ? (v1-v2) : (op=="*") ? (v1*v2) : (v2==0) ? null : (v1/v2);
        if (op == "+") {
            return v1 + v2;
        } else if (op == "-") {
            return v1 - v2;
        } else if (op == "*") {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
//https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java

//          ('+', 4, 7) --> 11
//        ('-', 15, 18) --> -3
//        ('*', 5, 5) --> 25
//        ('/', 49, 7) --> 7