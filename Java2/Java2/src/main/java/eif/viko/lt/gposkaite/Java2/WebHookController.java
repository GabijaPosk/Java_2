package eif.viko.lt.gposkaite.Java2;

import eif.viko.lt.gposkaite.Java2.models.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class WebHookController {
    private static final Logger log = LoggerFactory.getLogger(WebHookController.class);

    @Autowired
    private SimpMessagingTemplate template;

    @PostMapping("/webhook")
    public void handleWebhook(@RequestBody ChatMessage data) {
        log.info("Received webhook with data: {}", data);
        template.convertAndSend("/topic/messages", data);
    }
}
