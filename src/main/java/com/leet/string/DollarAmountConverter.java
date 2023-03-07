package com.leet.string;

import java.text.DecimalFormat;

public class DollarAmountConverter {

    public static void main(String[] args)
    {
        final var dollarAmount = "1,233,222";
        System.out.println(convert(dollarAmount));
    }

    private static String convert(String dollarAmount) {
        final var decimalFormat = new DecimalFormat("#.0");

        final var amount = Integer.parseInt(dollarAmount.replaceAll(",", ""));

        if(amount > 1000000)
        {
            final var millions = (double) amount /1000000;
            return decimalFormat.format(millions) + "M";
        }
        return dollarAmount;
    }

}
