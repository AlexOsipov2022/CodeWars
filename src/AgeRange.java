public class AgeRange {
    public static String datingRange(int age) {
        int min;
        int max;
        if(age <15){
        min = (int) (age - 0.10 * age);
        max = (int) (age + 0.10 * age);}
        else{
            min = (age / 2) + 7;
            max = (age - 7) * 2;
        }
        return min + "-" + max;
    }

    public static void main(String[] args) {
        System.out.println(datingRange(17));
    }
}
//https://www.codewars.com/kata/5803956ddb07c5c74200144e/train/java