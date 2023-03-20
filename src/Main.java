public class Main {
    public static void main(String[] args) {

    int account = 14000;
    int payment = 1010;

    int bonus ;
       if (payment >= 1100) {
        bonus = payment / 100;
    } else {
        bonus = 0;
       }

   int finalAccount = account + payment + bonus;


        System.out.println("Количество бонусных рублей = " + bonus);
        System.out.println("Итоговый счет = " + finalAccount);
    }
}