package com.xpj;

import java.math.BigDecimal;

/**
 * 现金收费抽象类
 */
public abstract class CashSuper {
    /**
     * 功能描述: 现金收取
     * @param: money 原价
     * @return: BigDecimal 当前价
     */
    abstract BigDecimal acceptCash(BigDecimal money);
}
