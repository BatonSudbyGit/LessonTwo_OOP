package LessonTwo_Java_OOP.candies.present;
import LessonTwo_Java_OOP.instances.CandyCreator;
import LessonTwo_Java_OOP.candies.createCandies.Candy;
import LessonTwo_Java_OOP.candies.factory.ICandyFactory;
import LessonTwo_Java_OOP.candies.factory.INewPresentFactory;
import static LessonTwo_Java_OOP.instances.ConstForCandies.*;
//Create special candy for the New Year Present.
public class SpecialCandyForPresent extends Candy implements CandyCreator, ICandyFactory, INewPresentFactory {
    private String specialTaste;

    public SpecialCandyForPresent(int price, int weight, String size, String taste, String specialTaste) {
        super(price, weight, size, taste);
        this.specialTaste = specialTaste;
    }

    public SpecialCandyForPresent() {
    }

    public String getSpecialTaste() {
        return specialTaste;
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
    public Candy buyNewCandy() {
        return null;
    }

    @Override
    public String toString() {
        return "Candy {Type = " + this.getTaste() + " } {Taste = " + this.getSpecialTaste() + " } {Size = " + getSize() +
                "} {Weight = " + this.getWeight() + "} {Price = " + this.getPrice() + " rubles}";
    }

    @Override
    public Candy buyNewPresent() {
        return new SpecialCandyForPresent((int)(Math.random() * 10 + 1),(int)(Math.random() * 15 + 1),
                SIZE[(int)(Math.random() * SIZE.length)],TASTE[(int)(Math.random() * TASTE.length)],
                SPECIALTASTE[(int)(Math.random() * SPECIALTASTE.length)]);
    }
}