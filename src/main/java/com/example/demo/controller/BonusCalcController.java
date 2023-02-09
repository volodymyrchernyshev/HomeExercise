package com.example.demo.controller;

import com.example.demo.controller.api.BonusCalcRequest;
import com.example.demo.controller.api.BonusCalcResponse;
import com.example.demo.service.BonusCalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BonusCalcController {


    @Autowired
    private BonusCalcService service;

    @PostMapping(path="/calculateBonus", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public BonusCalcResponse greeting(@RequestBody BonusCalcRequest request) {
        int bonus = service.calculateBonus(request.getTransactionAmountDollars());
        return new BonusCalcResponse(bonus);
    }

}
