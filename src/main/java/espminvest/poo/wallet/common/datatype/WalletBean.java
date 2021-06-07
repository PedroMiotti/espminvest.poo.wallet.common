package espminvest.poo.wallet.common.datatype;

import espminvest.poo.user.common.datatype.UserBean;

import java.util.List;

public class WalletBean {
    private String id;
    private UserBean user_id;
    private Double balance;
    private List<CambioTransactionBean> cambioTransactions;

}
