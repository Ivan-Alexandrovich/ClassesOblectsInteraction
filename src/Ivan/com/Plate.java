package Ivan.com;

public class Plate {
    private int foodAmount; //количество еды на тарелке
    //конструктор
    public Plate (int foodAmount) {
        this.foodAmount = foodAmount;
    }
    //метод выводит информацию про оставшееся количество еды на тарелке
    public void info () {
        System.out.println("Plate: " + foodAmount);
    }

    public void decreaseFood (int foodQuantity) {
        if (foodAmount > foodQuantity) {
            foodAmount -= foodQuantity;
        }
    }

    public int getFoodAmount () {
        return foodAmount;
    }

    public void foodIncrease (int amount) {
        foodAmount += amount;
    }
}
