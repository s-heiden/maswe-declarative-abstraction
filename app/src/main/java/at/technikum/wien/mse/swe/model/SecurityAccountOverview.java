package at.technikum.wien.mse.swe.model;


import at.sheiden.dzrlzr.model.Align;
import at.sheiden.dzrlzr.model.FixedWidthPrimitive;
import at.sheiden.dzrlzr.model.FixedWidthObject;

public class SecurityAccountOverview {

    @FixedWidthPrimitive(align = Align.RIGHT, length = 10, paddingCharacter = "0", startIndex = 40)
    private String accountNumber;

    @FixedWidthObject()
    private RiskCategory riskCategory;

    // @FixedWidthObject()
    private DepotOwner depotOwner;

    // @FixedWidthObject()
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
