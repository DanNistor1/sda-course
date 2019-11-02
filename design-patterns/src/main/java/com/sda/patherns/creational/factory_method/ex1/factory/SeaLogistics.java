package com.sda.patherns.creational.factory_method.ex1.factory;

import com.sda.patherns.creational.factory_method.ex1.transports.Ship;
import com.sda.patherns.creational.factory_method.ex1.transports.Transport;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
