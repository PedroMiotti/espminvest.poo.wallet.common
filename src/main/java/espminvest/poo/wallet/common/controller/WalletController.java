package espminvest.poo.wallet.common.controller;

import espminvest.poo.user.common.datatype.UserBean;
import espminvest.poo.wallet.common.datatype.WalletBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("service.wallet")
public interface WalletController {


    // Accepting xxx-form-urlencoded
    @PostMapping(path = "/wallets", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public WalletBean saveWallet(@RequestBody @ModelAttribute WalletBean wallet);

    @GetMapping(path = "/wallets/{id}")
    public WalletBean getWalletByUserId(@PathVariable String id);

    @DeleteMapping(path = "/wallets/{id}")
    public void deleteWallet(@PathVariable String id);

}
