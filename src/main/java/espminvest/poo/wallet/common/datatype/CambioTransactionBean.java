package espminvest.poo.wallet.common.datatype;

import espminvest.poo.cambio.common.datatype.EstimateBean;

import java.util.Date;

public class CambioTransactionBean {
    private String id;
    private WalletBean wallet;
    private EstimateBean estimate;
    private Date data;
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

    public EstimateBean getEstimate() {
        return estimate;
    }

    public void setEstimate(EstimateBean estimate) {
        this.estimate = estimate;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
}
