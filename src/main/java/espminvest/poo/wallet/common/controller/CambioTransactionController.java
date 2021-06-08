package espminvest.poo.wallet.common.controller;

import espminvest.poo.user.common.datatype.UserBean;
import espminvest.poo.wallet.common.datatype.CambioTransactionBean;
import espminvest.poo.wallet.common.datatype.WalletBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CambioTransactionController {

    // Accepting xxx-form-urlencoded
    @PostMapping(path = "/cambio/transaction", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CambioTransactionBean registerCambioTransaction(@RequestBody @ModelAttribute CambioTransactionBean cambioTransaction);

    @GetMapping(path = "/cambio/transaction/{id}")
    public CambioTransactionBean getCambioTransactionById(@PathVariable String id);

    @GetMapping(path = "/cambio/transactions/{walletId}")
    public List<CambioTransactionBean> getCambioTransactionByWalletId();

}
