package com.sda.logger;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.*;

/**
 * SEVERE (highest)
 * WARNING
 * INFO
 * CONFIG
 * FINE
 * FINER
 * FINEST
 */
public class DemoJavaLogger {

    static String className = DemoJavaLogger.class.getName();
    private static final Logger logger = Logger.getLogger(className);

    public static void main(String[] args) {

        logger.severe("some sever message");
        logger.warning("some warning message");
        logger.info("some info message");
        logger.setLevel(Level.ALL);

//    exista un logger si un ConsoleHandler implicit, setati pe INFO level,
//    in fisierul logging.properties din folderul lib al jre
//    un nou logger trimite mesajele automat catre handlerul implicit

/*
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
*/

        List<String> names = Arrays.asList("ana", "alex", "cristi");
        logger.log(Level.FINE, "processing {0} entries in loop", names.size()); // {0} este locul unde este inserat parametrul names.size()

        for (int i = 0; i < names.size(); i++) {
            logger.log(Level.FINER, "processing[{0}]: {1}", new Object[]{i, names.get(i)});
        }

        try {
            // something that can throw
            throw new FileNotFoundException("could not find file");
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.toString(), ex);
        }
    }
}
