public class Main {

    public static void main(String[] args) {

        int refillAmount = 5;
        // Ввелите сумму, на которую пополняется счет //
        int accountAmount = 0;
        //Введите текущую сумму средств на счете //
        int bonus = 0;

        if (refillAmount >=1000) {
            bonus = refillAmount / 100;
        }

        int final_amount = accountAmount + refillAmount + bonus;

        System.out.println("Ваш бонус составил");
        System.out.println(bonus);
        System.out.println("Сумма на вашем счету");
        System.out.println(final_amount);


    }

}
