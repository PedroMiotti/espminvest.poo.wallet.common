package espminvest.poo.wallet.common.datatype;

import espminvest.poo.user.common.datatype.UserBean;

import java.util.List;

public class WalletBean {
    private int id;
    private int user;
    private Double balance;
    private List<CambioTransactionBean> cambioTransactions;
    private List<StockTransactionBean> stockTransactions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<CambioTransactionBean> getCambioTransactions() {
        return cambioTransactions;
    }

    public List<StockTransactionBean> getStockTransactions() {
        return stockTransactions;
    }

    public void setStockTransactions(List<StockTransactionBean> stockTransactions) {
        this.stockTransactions = stockTransactions;
    }

    public void setCambioTransactions(List<CambioTransactionBean> cambioTransactions) {
        this.cambioTransactions = cambioTransactions;
    }
}
