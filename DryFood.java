package oopbaitaplon;

import java.time.LocalDate;
import java.time.Period;

public class DryFood extends Food{
    public String dryFood = "Khô";

    public DryFood(String name, String typeFood, String timeFirst, String timeLast, float quantily, int separateSum, String dryFood) {
        super(name, typeFood, timeFirst, timeLast, quantily, separateSum);
        this.dryFood = dryFood;
    }


    public DryFood(){

    }

    public String getDryFood() {
        return dryFood;
    }

    @Override
    public  int totalCost(LocalDate startDate, LocalDate endDate, Float quantily ){
    //Difference month
    Period different = Period.between(startDate, endDate);
        int diffMonth = different.getYears() * 12 + different.getMonths();
        int total;
        // Total cost
        if (diffMonth > 0) {
            total = (int) (quantily * 10000 * diffMonth);
        } else {
            total = (int) (quantily * 10000);
        }
        return total;
    }



}
