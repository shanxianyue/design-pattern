package com.xpj;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CashReturn extends CashSuper {

    /**
     * 满减收费 例：满300减200，此时moneyCondition为300，moneyReturn为200
     */
    /**满减条件*/
    private BigDecimal moneyCondition = BigDecimal.ZERO;
    /**满减优惠金额*/
    private BigDecimal moneyReturn = BigDecimal.ZERO;

    public CashReturn(BigDecimal moneyCondition, BigDecimal moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    BigDecimal acceptCash(BigDecimal money) {
        BigDecimal result = money;
        if (money.compareTo(moneyCondition) > 0){
            result = money.subtract(money.divide(moneyCondition, 0, RoundingMode.FLOOR).multiply(moneyReturn));
        }
        return result;
    }
}
