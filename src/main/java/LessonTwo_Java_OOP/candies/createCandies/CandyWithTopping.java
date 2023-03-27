package LessonTwo_Java_OOP.candies.createCandies;
import LessonTwo_Java_OOP.instances.CandyCreator;
import LessonTwo_Java_OOP.candies.factory.ICandyFactory;
import static LessonTwo_Java_OOP.instances.ConstForCandies.*;
//Create the candy with topping for changing.
public class CandyWithTopping extends Candy implements CandyCreator, ICandyFactory {
    private String topping;

    public CandyWithTopping(int price, int weight, String size, String taste, String topping) {
        super(price, weight, size, taste);
        this.topping = topping;
    }

    public CandyWithTopping() {
    }

    public String getTopping() {
        return this.topping;
    }

    @Override
    public int getPriceCandy() {
        return this.getPrice();
    }

    @Override
    public int getWeightCandy() {
        return this.getWeight();
    }

    @Override
    public String toString() {
        return "Candy {Taste = " + this.getTaste() + "} {Topping = " + this.getTopping() + "} {Weight = " + this.getWeight() + "} {Price = " + this.getPrice() + " rubles}";
    }

    @Override
    public Candy buyNewCandy() {
        return new CandyWithTopping((int) (Math.random() * 15 + 1), (int) (Math.random() * 20 + 1 ),
                SIZE[(int) (Math.random() * SIZE.length)], TASTEFORCADYWITHTOPPING[(int) (Math.random() * TASTEFORCADYWITHTOPPING.length)],
                TOPPING[(int) (Math.random() * TOPPING.length)]);
    }

}