package com.sda.patherns.creational.factory_method.ex1.factory;

import com.sda.patherns.creational.factory_method.ex1.transports.Transport;

public abstract class Logistics {

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    abstract Transport createTransport();
}
