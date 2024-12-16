package DEc_5th;

public class MyAccount implements CCAccount, DebitCardAccount, InsuraceAccount {

    @Override
    public void CreateAccount() {
        System.out.println("Account created for you.....");
    }

    @Override
    public void CloseAccount() {
        System.out.println("Account closed as per request.....");
    }

    @Override
    public void CalculateIntrest() {
        System.out.println("Interest calculated is.....");
    }

    @Override
    public void CreatePolicy() {
        System.out.println("Policy created for you.....");
    }

    @Override
    public void TerminatePolicy() {
        System.out.println("Policy terminated as per request.....");
    }

    @Override
    public void CalculatePolicy() {
        System.out.println("Premium calculated is.....");
    }

    @Override
    public void depositAmount() {
        System.out.println("Amount deposited successfully.....");
    }

    @Override
    public void withdrawAmount() {
        System.out.println("Amount withdrawal successful.....");
    }

    @Override
    public void CheckBalance() {
        System.out.println("Balance amount is.....");
    }

    @Override
    public void getOutstandingAmt() {
        System.out.println("Your outstanding balance is.....");
    }

    @Override
    public void getRedemptionPoints() {
        System.out.println("You have accumulated redemption points.....");
    }

    @Override
    public void getOfferDetails() {
        System.out.println("The offer details are.....");
    }

    public static void main(String[] args) {
        MyAccount maact = new MyAccount();
        maact.CreateAccount();
        System.out.println("Debit Card account details");
        maact.depositAmount();
        maact.withdrawAmount();
        maact.CheckBalance();
        System.out.println("Credit card account details");
        maact.getOutstandingAmt();
        maact.getOfferDetails();
        maact.getRedemptionPoints();
        maact.CloseAccount();
        System.out.println("Insurance policy details");
        maact.CalculateIntrest();
        maact.CreatePolicy();
        maact.TerminatePolicy();
        maact.CalculatePolicy();
    }
}
