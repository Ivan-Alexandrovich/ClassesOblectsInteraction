package Ivan.com;

public class Cat {
    private String name;
    private int foodQuantity; //сколько кот съедает за раз
    private boolean isFull; //сыт ли он или голоден
    //конструктор
    public Cat (String name, int foodQuantity) {
        this.name = name;
        this.foodQuantity = foodQuantity;
        this.isFull = false; //по умолчанию кот голоден
    }
    //метод выводит всю информацию про кота
    public void info () {
        System.out.println("Cat: " + name + ", appetite: " + foodQuantity + ", is full (" + isFull + ")");
    }
    //метод отнимает количество еды из тарелки, сколько ест кот и ставит меняет переменную сытость на правду
    public void eat (Plate plate) {
        if (plate.getFoodAmount() > foodQuantity) {
            plate.decreaseFood (foodQuantity);
            isFull = true;
        }
    }
}
