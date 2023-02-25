package fourthhomework.task1;

import fourthhomework.task1.CashMachine;

public class CashMachineRunner {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(3, 5, 5);
        System.out.println("Summary cash: " + cashMachine.sumOfMoney());

        cashMachine.addMoney(6, 0, 0);
        System.out.println("Summary cash: " + cashMachine.sumOfMoney());

        cashMachine.withdrawMoney(480);
        System.out.println("Summary cash: " + cashMachine.sumOfMoney());

        cashMachine.withdrawMoney(480);
        System.out.println("Summary cash: " + cashMachine.sumOfMoney());
    }
}
