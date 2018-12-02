package at.technikum.wien.mse.swe.model;


import at.sheiden.dzrlzr.model.Align;
import at.sheiden.dzrlzr.model.FixedWidthField;

public class SecurityAccountOverview {

    /*
    private static final int RISKCATEGORY_START_INDEX = 50;
    private static final int RISKCATEGORY_LENGTH = 2;
    private static final int LASTNAME_START_INDEX = 52;
    private static final int LASTNAME_LENGTH = 30;
    private static final int FIRSTNAME_START_INDEX = 82;
    private static final int FIRSTNAME_LENGTH = 30;
    private static final int CURRENCY_START_INDEX = 112;
    private static final int CURRENCY_LENGTH = 3;
    private static final int BALANCE_START_INDEX = 115;
    private static final int BALANCE_LENGTH = 17;
     */


    @FixedWidthField(align = Align.RIGHT, length = 10, paddingCharacter = "0", startIndex = 40)
    private String accountNumber;

    private RiskCategory riskCategory;

    private DepotOwner depotOwner;

    private Amount balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public RiskCategory getRiskCategory() {
        return riskCategory;
    }

    public void setRiskCategory(RiskCategory riskCategory) {
        this.riskCategory = riskCategory;
    }

    public DepotOwner getDepotOwner() {
        return depotOwner;
    }

    public void setDepotOwner(DepotOwner depotOwner) {
        this.depotOwner = depotOwner;
    }

    public Amount getBalance() {
        return balance;
    }

    public void setBalance(Amount balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "SecurityAccountOverview{" +
                "accountNumber='" + accountNumber + '\'' +
                ", riskCategory=" + riskCategory +
                ", depotOwner=" + depotOwner +
                ", balance=" + balance +
                '}';
    }
}
