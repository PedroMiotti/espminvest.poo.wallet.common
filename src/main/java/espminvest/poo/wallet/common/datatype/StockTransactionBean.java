package espminvest.poo.wallet.common.datatype;

import espminvest.poo.stock.common.datatype.EstimateBean;

import java.util.Date;

public class StockTransactionBean {
    private int id;
    private WalletBean wallet;
    private EstimateBean estimate;
    private Date date;
    private Double qtd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WalletBean getWallet() {
        return wallet;
    }

    public void setWallet(WalletBean wallet) {
        this.wallet = wallet;
    }

    public EstimateBean getEstimate() {
        return estimate;
    }

    public void setEstimate(EstimateBean estimate) {
        this.estimate = estimate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
}
