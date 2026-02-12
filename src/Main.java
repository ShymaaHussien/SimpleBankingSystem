import model.CurrentAccount;
import model.SavingsAccount;
import service.BankService;
import service.BankServiceImpl;

public class Main {

    public static void main(String[] args) {

        BankService bankService = new BankServiceImpl();

        bankService.addAccount(new SavingsAccount("SA101", "Shymaa", 2000));
        bankService.addAccount(new CurrentAccount("CA201", "Ahmed", 1500));

        bankService.deposit("SA101", 500);
        bankService.withdraw("SA101", 1000);

        bankService.withdraw("CA201", 300);

        bankService.displayAccount("SA101");
        bankService.displayAccount("CA201");
    }
}
