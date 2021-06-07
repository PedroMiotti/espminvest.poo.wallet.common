package espminvest.poo.wallet.common.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service.wallet")
public interface WalletController {

    @GetMapping("wallets/{id}")
    WalletController wallet(String id);
}
