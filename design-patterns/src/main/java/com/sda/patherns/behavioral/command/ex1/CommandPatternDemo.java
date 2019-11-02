package com.sda.patherns.behavioral.command.ex1;


import com.sda.patherns.behavioral.command.ex1.commands.BuyStock;
import com.sda.patherns.behavioral.command.ex1.commands.Order;
import com.sda.patherns.behavioral.command.ex1.commands.SellStock;
import com.sda.patherns.behavioral.command.ex1.invoker.Broker;
import com.sda.patherns.behavioral.command.ex1.request.Stock;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        Order buyStockOrder = new BuyStock(abcStock);
        Order sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
