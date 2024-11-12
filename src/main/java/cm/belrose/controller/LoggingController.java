package cm.belrose.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping(value = "/hellologging")
    ResponseEntity<String>hello() {

        logger.trace("== TRACE TRACE TRACE TRACE TRACE  Message");
        logger.debug("== DEBUG DEBUG DEBUG DEBUG DEBUG Message");
        logger.info("== INFO INFO INFO INFO INFO Message");
        logger.warn("== WARN WARN WARN WARN WARN Message");
        logger.error("== ERROR ERROR ERROR ERROR ERROR Message");
        return ResponseEntity.of(Optional.of("hellologging"));
    }
}


