package RedRover_HW_13;

public class HW_13_1 {
    public static void main(String[] args) {


        System.out.println(abbrevName("Jhon Willson"));

    }
    public static String abbrevName(String name) {
        String[] initials = name.split(" ");
        return (initials[0].charAt(0) + "." + initials[1].charAt(0)).toUpperCase();
//        return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
    }
}
//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
