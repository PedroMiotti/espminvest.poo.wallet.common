package espminvest.poo.wallet.common.controller;

import espminvest.poo.user.common.datatype.UserBean;
import espminvest.poo.wallet.common.datatype.CambioTransactionBean;
import espminvest.poo.wallet.common.datatype.TransactionBean;
import espminvest.poo.wallet.common.datatype.WalletBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static espminvest.poo.wallet.common.constants.Constants.BASE_URL_CAMBIO_TRANSACTION;

public interface CambioTransactionController {

    // Accepting xxx-form-urlencoded
    @PostMapping(path = BASE_URL_CAMBIO_TRANSACTION + "/buy/{walletId}", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CambioTransactionBean buyCambioTransaction(@PathVariable int walletId, @RequestBody @ModelAttribute TransactionBean cambioTransaction);

    // Accepting xxx-form-urlencoded
    @PostMapping(path = BASE_URL_CAMBIO_TRANSACTION + "/sell/{walletId}", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CambioTransactionBean sellCambioTransaction(@PathVariable int walletId, @RequestBody @ModelAttribute TransactionBean cambioTransaction);

    @GetMapping(path = BASE_URL_CAMBIO_TRANSACTION + "/{id}")
    public CambioTransactionBean getCambioTransactionById(@PathVariable String id);

    @GetMapping(path = BASE_URL_CAMBIO_TRANSACTION + "/{walletId}")
    public List<CambioTransactionBean> getCambioTransactionByWalletId();

}
