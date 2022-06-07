public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30; // Ожидаемый результат

        long actual = service.calculate(amount, registered); // Фактический результат

        System.out.println(expected == actual); // Вывод результата сравнения
    }
}