package espminvest.poo.wallet.common.controller;

import espminvest.poo.wallet.common.datatype.StockTransactionBean;
import espminvest.poo.wallet.common.datatype.TransactionBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static espminvest.poo.wallet.common.constants.Constants.BASE_URL_STOCK_TRANSACTION;

public interface StockTransactionController {

    // Accepting xxx-form-urlencoded
    @PostMapping(path = BASE_URL_STOCK_TRANSACTION + "/buy/{walletId}", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public StockTransactionBean buyStockTransaction(@PathVariable int walletId, @RequestBody @ModelAttribute TransactionBean stockTransaction);

    // Accepting xxx-form-urlencoded
    @PostMapping(path = BASE_URL_STOCK_TRANSACTION + "/sell/{walletId}", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public StockTransactionBean sellStockTransaction(@PathVariable int walletId, @RequestBody @ModelAttribute TransactionBean stockTransaction);

    @GetMapping(path = BASE_URL_STOCK_TRANSACTION + "/{id}")
    public StockTransactionBean getStockTransactionById(@PathVariable String id);

    @GetMapping(path = BASE_URL_STOCK_TRANSACTION + "/{walletId}")
    public List<StockTransactionBean> getStockTransactionByWalletId();



}
