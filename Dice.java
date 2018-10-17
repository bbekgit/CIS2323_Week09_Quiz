import java.util.Random;


public class Dice
{

    int value;

    public Dice()
    {
        value = 0;
    }

    public void rollDice()
    {
        Random myRand = new Random();
        this.value = myRand.nextInt(6) + 1;
    }

    public void set(int value){
        this.value = value;
    }

    public int get(){
        return this.value;
    }

}