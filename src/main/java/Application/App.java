package Application;

import org.apache.log4j.Logger;

public class App {
    private static final Logger log = Logger.getLogger(App.class);
    public static void main(String[] args) {
    log.debug("Success");
    log.info("Hi");
    log.warn("Bye");
    log.error("tata");
    log.fatal("Check");
    }
}
