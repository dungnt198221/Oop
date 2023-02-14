package oopbaitaplon;

import java.io.Serializable;
import java.time.LocalDate;


// the Attribute, Constructor, getter and setter methods of class food.s
public class Food implements Serializable {
    public String name, typeFood, timeFirst,timeLast;
    public float quantily;
    public int separateSum;



    public Food(String name, String typeFood, String timeFirst, String timeLast, float quantily, int separateSum) {
        this.name = name;
        this.typeFood = typeFood;
        this.timeFirst = timeFirst;
        this.timeLast = timeLast;
        this.quantily = quantily;
        this.separateSum = separateSum;
    }
    public Food() {
    }

    public int totalCost(LocalDate startDate, LocalDate endDate, Float quantily){
        return 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public String getTimeFirst() {
        return timeFirst;
    }

    public void setTimeFirst(String timeFirst) {
        this.timeFirst = timeFirst;
    }

    public String getTimeLast() {
        return timeLast;
    }

    public void setTimeLast(String timeLast) {
        this.timeLast = timeLast;
    }

    public float getQuantily() {
        return quantily;
    }

    public void setQuantily(float quantily) {
        this.quantily = quantily;
    }


    public int getSeparateSum() {

        return separateSum;
    }

    public void setSeparateSum(int separateSum) {
        this.separateSum = separateSum;
    }


    
}


