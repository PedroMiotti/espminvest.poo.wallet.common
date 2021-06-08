package espminvest.poo.wallet.common.datatype;

import espminvest.poo.cambio.common.datatype.EstimateBean;

import java.util.Date;

public class CambioTransactionBean {
    private String id;
    private WalletBean wallet;
    private int estimate;
    private Date date;
    private Double qtd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WalletBean getWallet() {
        return wallet;
    }

    public void setWallet(WalletBean wallet) {
        this.wallet = wallet;
    }

    public int getEstimate() {
        return estimate;
    }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date data) {
        this.date = date;
    }

    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
}
