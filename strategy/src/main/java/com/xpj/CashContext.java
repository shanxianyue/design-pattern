package com.xpj;

import java.math.BigDecimal;


public class CashContext {
    private CashSuper cashSuper;

    public CashContext(SelectItem type) {
        switch (type) {
            case REBATE:
                cashSuper = new CashRebate(BigDecimal.valueOf(0.8));
                break;
            case RETURN:
                cashSuper = new CashReturn(BigDecimal.valueOf(300), BigDecimal.valueOf(200));
                break;
            default:
                cashSuper = new CashNormal();
                break;
        }
    }

    public BigDecimal getResult(BigDecimal money){
        return cashSuper.acceptCash(money);
    }
}
