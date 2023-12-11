package DiceGame.Dice;

public class Dice {

    public static int roll(int specialValue){
        double randomValue = Math.random();
        int DiceValue;
        if (randomValue < 0.04) {
            DiceValue = specialValue;
        } else {
            DiceValue = (int) (Math.random() * 6) + 1;
        }
        System.out.println("Get " + DiceValue + " point");
        return DiceValue;
    }
}
