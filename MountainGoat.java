import java.util.Random;
public class MountainGoat{
    String[] food = {"a tin can","some grass","a diamond ring","some hay"};
    public void eat(){
        int num = new Random().nextInt(food.length);
        System.out.println("The goat ate "+food[num]+".");
    }
}

