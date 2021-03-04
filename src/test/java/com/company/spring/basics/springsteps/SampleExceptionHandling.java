package com.company.spring.basics.springsteps;

import org.apache.commons.logging.LogFactory;

// Default error handling - example of what was used before Spring Boot!
public class SampleExceptionHandling {
    private Log logger = LogFactory.getLog(SampleExceptionHandling.class);

    @ExceptionHandler(value = Exception.class)
    public String handleError(HttpServletRequest req, Exception exception) {
        logger.error("Request: " + req.getRequestURL() + " raised " + exception);
        return "error";
    }
    
}
