package com.sda.patherns.structural.bridge;

import com.sda.patherns.structural.bridge.devices.Device;
import com.sda.patherns.structural.bridge.devices.Radio;
import com.sda.patherns.structural.bridge.devices.Tv;
import com.sda.patherns.structural.bridge.remotes.AdvancedRemote;
import com.sda.patherns.structural.bridge.remotes.BasicRemote;

public class DemoBridgePattern {

    public static void main(String[] args) {

        Device radio = new Radio();
        Device tv = new Tv();

        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(radio);
        basicRemote.volumeUp();
        radio.printStatus();
        System.out.println();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);
        advancedRemote.mute();
        tv.printStatus();
    }
}
