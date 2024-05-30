public class Main {
    public static void main(String[] args) {
        System.out.println("Акция 100 + 1");

        int balance = 500; // Баланс до пополнения

        System.out.println("Ваш баланс = " + balance);

        int replenishment = 1200; // Сумма пополнения

        System.out.println("Сумма пополнения = " + replenishment);

        int bonus = 0;

        if (replenishment > 1000) {
            bonus = (replenishment) / 100;
        }

        int totalBalance = balance + replenishment + bonus;

        System.out.println("На вашем счету = " + totalBalance);
        System.out.println("Бонусных рублей = " + bonus);

    }
}