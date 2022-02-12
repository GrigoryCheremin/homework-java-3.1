public class BonusMilesService {
    public int calculate(int cost) {
        int price = 20; // цена бонусной мили, руб.
        int miles = cost / price;
        System.out.println("Количество бонусных миль:");
        return miles;
    }
}