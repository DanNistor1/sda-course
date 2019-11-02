package com.sda.patherns.behavioral.command.ex1.commands;

import com.sda.patherns.behavioral.command.ex1.request.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}

