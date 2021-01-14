package com.kerkapp.authservice.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserEventStream {

    String OUTPUT = "churchUserChanged";

    @Output(OUTPUT)
    MessageChannel churchUserChanged();
}
