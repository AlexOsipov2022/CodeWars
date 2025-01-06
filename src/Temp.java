public class Temp {
    public static void main(String[] args) {

        String str1 = "aa";
        String str2 = "bb";
        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = str2.concat(str3);
        System.out.println(str4);

        int a = 15;
        String str5 = String.format("%s %s",str4, a);
        System.out.println(str5);
    }
}
