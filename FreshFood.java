package oopbaitaplon;

import java.time.LocalDate;
import java.time.Period;
import oopbaitaplon.Food;

public class FreshFood extends Food{
    public String freshFood = "Tươi";

    public FreshFood(String name, String typeFood, String timeFirst, String timeLast, float quantily, int separateSum, String freshFood) {
        super(name, typeFood, timeFirst, timeLast, quantily, separateSum);
        this.freshFood = freshFood;
    }

    public FreshFood(){

    }

    public String getFreshFood() {
        return freshFood;
    }

    @Override
    public int totalCost(LocalDate startDate, LocalDate endDate, Float quantily ){
        //Difference month
        Period different = Period.between(startDate, endDate);
        int diffMonth = different.getYears() * 12 + different.getMonths();
        int total;
        // Total cost
        if (diffMonth > 0) {
            total = (int) (quantily * 20000 * diffMonth);
        } else {
            total = (int) (quantily * 20000);
        }
        return total;
    }

}
