package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BonusCalcService {


    /**
     * A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point
     * for every dollar spent between $50 and $100 in each transaction.
     * (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).
     *
     * @param transactionAmountDollars
     * @return bonus amount
     */
    public int calculateBonus(int transactionAmountDollars) {
        if(transactionAmountDollars <= 50){
            return 0;
        } else if(transactionAmountDollars < 100){
            return transactionAmountDollars - 50;
        } else {
            return (transactionAmountDollars - 100)*2 + 50;
        }
    }
}
