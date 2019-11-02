package com.sda.patherns.behavioral.command.ex1.commands;

import com.sda.patherns.behavioral.command.ex1.request.Stock;

public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
