package com.xpj;

import java.math.BigDecimal;

/**
 * 正常收费子类
 */
public class CashNormal extends CashSuper {
    BigDecimal acceptCash(BigDecimal money) {
        return money;
    }
}
