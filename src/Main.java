public class Main {
    public static void main(String[] args) {

        int account = 14000;
        int payment = 1050;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int finalAccount = account + payment + bonus;


        System.out.println("Количество бонусных рублей = " + bonus);
        System.out.println("Итоговый счет = " + finalAccount);
    }
}