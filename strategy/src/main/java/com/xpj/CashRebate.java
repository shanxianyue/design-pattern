package com.xpj;

import java.math.BigDecimal;

/**
 * 打折收费类
 */
public class CashRebate extends CashSuper {

    /**打折率 如8折就是0.8*/
    private BigDecimal moneyRebate = BigDecimal.ONE;

    public CashRebate(BigDecimal moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    BigDecimal acceptCash(BigDecimal money) {
        return money.subtract(moneyRebate);
    }
}
