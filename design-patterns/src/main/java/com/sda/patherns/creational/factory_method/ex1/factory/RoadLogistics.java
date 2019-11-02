package com.sda.patherns.creational.factory_method.ex1.factory;

import com.sda.patherns.creational.factory_method.ex1.transports.Transport;
import com.sda.patherns.creational.factory_method.ex1.transports.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
