import java.util.Random;

public class Ghost {
    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        ghost.getColor();
    }
        private String color;

        public void getColor() {
            Integer random = new Random().nextInt(4);
            if (random == 0) {
                color = "white";
            } else if (random == 1) {
                color = "yellow";
            } else if (random == 2) {
                color = "purple";
            } else {
                color = "red";
            }
            System.out.println(color);
        }

    }

//https://www.codewars.com/kata/53f1015fa9fe02cbda00111a