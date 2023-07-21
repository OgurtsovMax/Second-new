public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 98; //вес в кг
        double height = 1.87; //рост в метрах

        int index = service.calculate(weight , height);


        System.out.println();
        System.out.println("Вес " + weight + "кг");
        System.out.println("Рост " + height + "м");
        System.out.println("Индекс " + index);

    }
}