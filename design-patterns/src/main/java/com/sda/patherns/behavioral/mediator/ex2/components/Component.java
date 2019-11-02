package com.sda.patherns.behavioral.mediator.ex2.components;

import com.sda.patherns.behavioral.mediator.ex2.mediator.Mediator;

public interface Component {

    void setMediator(Mediator mediator);

    String getName();
}
