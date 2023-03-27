package LessonTwo_Java_OOP.candies.createCandies;
import LessonTwo_Java_OOP.instances.CandyCreator;
import LessonTwo_Java_OOP.candies.factory.ICandyFactory;
import static LessonTwo_Java_OOP.instances.ConstForCandies.*;
//Create the caramel's candy for changing.
public class Caramel extends Candy implements CandyCreator, ICandyFactory {
    private String caramel;

    public Caramel(int price,
                   int weight,
                   String size,
                   String taste,
                   String caramel) {
        super(price,weight,size,taste);
        this.caramel = caramel;
    }

    public Caramel() {
    }

    public String getCaramel() {
        return this.caramel;
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
        return "Candy {Type = " + this.getTaste() + " } {Taste = " + this.getCaramel() + " } {Size = " + getSize() +
                "} {Weight = " + this.getWeight() + "} {Price = " + this.getPrice() + " rubles}";
    }

    @Override
    public Candy buyNewCandy() {
        return new Caramel((int)(Math.random() * 10 + 1),(int)(Math.random() * 15 + 1),
                SIZE[(int)(Math.random() * SIZE.length)],TASTEFORCARAMEL[(int)(Math.random() * TASTEFORCARAMEL.length)],
                CARAMEL[(int)(Math.random() * CARAMEL.length)]);
    }
}