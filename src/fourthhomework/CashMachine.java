package fourthhomework;

/**
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10
 * (не нужно рассматривать более сложные варианты выдачи наличных, чтобы не усложнять алгоритм).
 */
public class CashMachine {

    private int fiftyUE;
    private int twentyUE;
    private int tenUE;

    public CashMachine(int fiftyUE, int twentyUE, int tenUE) {
        this.fiftyUE = fiftyUE;
        this.twentyUE = twentyUE;
        this.tenUE = tenUE;
    }

    public int getFiftyUE() {
        return fiftyUE;
    }

    public void setFiftyUE(int fiftyUE) {
        this.fiftyUE = fiftyUE;
    }

    public int getTwentyUE() {
        return twentyUE;
    }

    public void setTwentyUE(int twentyUE) {
        this.twentyUE = twentyUE;
    }

    public int getTenUE() {
        return tenUE;
    }

    public void setTenUE(int tenUE) {
        this.tenUE = tenUE;
    }

    public void addMoney(int fiftyUE, int twentyUE, int tenUE) {
        int sum = sumOfMoney();
        setFiftyUE(getFiftyUE() + fiftyUE);
        setTwentyUE(getTwentyUE() + twentyUE);
        setTenUE(getTenUE() + tenUE);
        System.out.println("Add " + sum + " UE");
    }

    public int sumOfMoney() {
        return getFiftyUE() * 50 + getTwentyUE() * 20 + getTenUE() * 10;
    }

    public Boolean withdrawMoney(int UE) {
        int fiftyUE = UE / 50;
        int twentyUE = UE % 50 / 20;
        int tenUE = UE % 50 % 20 / 10;
        if (UE > sumOfMoney()) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            setFiftyUE(getFiftyUE() - fiftyUE);
            setTwentyUE(getTwentyUE() - twentyUE);
            setTenUE(getTenUE() - tenUE);
            System.out.println(fiftyUE + " fiftyUE banknotes, " + twentyUE + " twentyUE banknotes, " + tenUE + " tenUE banknote were issued");
            return true;
        }
    }
}
