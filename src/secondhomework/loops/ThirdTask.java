package secondhomework.loops;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию
 * Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 */

public class ThirdTask {
    static int salary = 600;
    static int moneyOnLife = 300;
    static double investingPerMonth = 0.1;
    static double incomeFromInvesting = 0.02;
    static int periodInMonths = 38;
    static int salaryUp = 400;
    static int salaryUpPeriod = 6;
    static double money = 0;
    static double investingMoney = 0;

    public static void main(String[] args) {

        for (int currentMonth = 1; currentMonth <= periodInMonths; currentMonth++) {
            if (currentMonth % salaryUpPeriod == 0) {
                salary += salaryUp;
            }
            money += salary - moneyOnLife - investingPerMonth * salary;
            investingMoney += salary * investingPerMonth + investingMoney * incomeFromInvesting;
        }
        System.out.println(money + investingMoney + "$");
    }
}


