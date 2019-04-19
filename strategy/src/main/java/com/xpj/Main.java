package com.xpj;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext(SelectItem.RETURN);
        BigDecimal result = cashContext.getResult(BigDecimal.valueOf(500));
        System.out.println(result);
    }
}
