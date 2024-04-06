package eif.viko.lt.gposkaite.Java2;

import eif.viko.lt.gposkaite.Java2.models.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class WebSocketController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(@RequestBody ChatMessage message) {
        return message;
    }
}