package LessonTwo_Java_OOP.candies.present;
import LessonTwo_Java_OOP.candies.createCandies.Candy;

import java.util.ArrayList;
//Create three different sizes of the New Year Present.
public class NewYearPresent {
    public static ArrayList<Candy> smallPresent(ArrayList<Candy> listOgPresent){
        for (int i = 1; i < 10; i++) {
            listOgPresent.add(new SpecialCandyForPresent().buyNewPresent());
        }
        return listOgPresent;
    }
    public static ArrayList<Candy> mediumPresent(ArrayList<Candy> listOfPresent) {
        for (int i = 1; i < 20; i++) {
            listOfPresent.add(new SpecialCandyForPresent().buyNewPresent());
        }
        return listOfPresent;
    }
    public static ArrayList<Candy> bigPresent(ArrayList<Candy> listOfPresent) {
        for (int i = 1; i < 30; i++) {
            listOfPresent.add(new SpecialCandyForPresent().buyNewPresent());
        }
        return listOfPresent;
    }
}