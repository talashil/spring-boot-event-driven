package com.wissensalt.rnd.sbed.sd.event.input;

import com.wissensalt.rnd.sbed.sd.event.IInboundEvent;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author : <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @since : 2019-08-03
 **/
public interface GreetingStreamInput extends IInboundEvent {
    String INPUT = "greetings-in";

    @Input(INPUT)
    @Override
    SubscribableChannel inboundMessage();
}
