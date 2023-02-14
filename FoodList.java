package oopbaitaplon;


import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FoodList {

    private ArrayList<Food> list = new ArrayList<>();
    private int currentIndex = 0;


    // show food ordinal
    public String getCurrentFoodInfo(){
        return "Record " + (currentIndex + 1) + " of " + list.size();
    }
    
    // change food ordinal
    public void setCurrentFood(Food food){
        currentIndex = list.indexOf(food);
    }
    
// get food ordinal first
    public void first() {
        if (currentIndex > 0) {
            currentIndex = 0;
        }
    }

    // get food ordinal previous
    public void previous() {
        if (currentIndex > 0) {
            currentIndex--;
        }
    }
// get food ordinal next
    public void next() {
        if (currentIndex < list.size() - 1) {
            currentIndex++;
        }
    }

// get food ordinal last
    public void last() {
        currentIndex = list.size() - 1;
    }

// get food first
    public int getCurrentFoodIndex() {
        return currentIndex;
    }
// get food now
    public Food getCurrentFood() {
        if (list.size() == 0) {
            return null;
        }
        return list.get(currentIndex);
    }

// add food

    public void add(Food food) {
        list.add(food);
    }
    public void addFoodList(ArrayList<Food> food){
        list.addAll(food);
    }
    

    // render Foods to table food.
    public void renderToTable(DefaultTableModel tblModel){
        tblModel.setRowCount(0);
        int ID=0;
        for (Food food : list) {
            ID++;
            String s = Integer.toString(ID);
            Object[] row = new Object[]{
              s, food.getName(), food.getTypeFood(), food.getQuantily(), food.getTimeFirst(), food.getTimeLast(), food.getSeparateSum()
            };
            tblModel.addRow(row);
        }

        tblModel.fireTableDataChanged(); // cap nhap lai du lieu duoc hien thi
    }
    
    // Search food by name
    public Food searchByName(String name) {
        for (Food food : list) {
            if (food.getName().equals(name)) {
                return food;
            }
        }
        return null;
    }

    public ArrayList<Food> searchByTypeFood(String name) {
        ArrayList<Food> list1 = new ArrayList<>();
        for (Food food : list) {
            if (food.getTypeFood().equals(name)) {
                list1.add(food);
            }
        }
        return list1;
    }

    
    // Delete food by name
    public boolean deleteByName(String name) {
        for (Food food : list) {
            if (food.getName().equals(name)) {
                list.remove(food);
                return true;
            }
        }
        return false;
    }

    // Search food by time to enter the warehouse
    public Food searchByTimeFirst(String timefirst) {
        for (Food food : list) {
            if (food.getTimeFirst().equals(timefirst)) {
                return food;
            }
        }
        return null;
    }
    // Search food by expired time
    public Food searchByTimeLast(String timelast) {
        for (Food food : list) {
            if (food.getTimeLast().equals(timelast)) {
                return food;
            }
        }
        return null;
    }

    // Check the shelf life of the food.
    public boolean checkTimeLast(){
        LocalDate d1 = LocalDate.now();
        for (Food food : list) {
            LocalDate d2 = LocalDate.parse(food.getTimeLast());
            if(d1.isAfter(d2)){
                deleteByName(food.getName());
                return true;
            }
        }
        return false;
    }
    //the total cost of storing food for a month.
    public int totalMonth(String d){
        int total = 0;
        LocalDate d1 = LocalDate.parse(d);
        for (Food food : list) {
            LocalDate d2 = LocalDate.parse(food.getTimeLast());
            if(d1.isBefore(d2)){
                total += food.getSeparateSum();
            }
        }
        return total;
    }

}
