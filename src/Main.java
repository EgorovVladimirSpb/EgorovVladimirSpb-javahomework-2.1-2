public class Main {

    public static void main(String[] args) {

        int refill_amount = 1100;
        // Ввелите сумму, на которую пополняется счет //

        int account_amount = 100;
        //Введите текущую сумму средств на счете //

        int bonus = refill_amount / 100;


        if (refill_amount >=1000) {
            bonus = refill_amount / 100;
        }
        else if (refill_amount <1000) {
            bonus = 0;
        }

        int final_amount = account_amount + refill_amount + bonus;

        System.out.println("Ваш бонус составил");
        System.out.println(bonus);
        System.out.println("Сумма на вашем счету");
        System.out.println(final_amount);


    }

}
