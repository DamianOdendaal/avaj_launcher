package handlers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class Logger {
    public static void logData(String level, String message){
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());
        try {
            FileHandler handler = new FileHandler("logs.txt");
            logger.addHandler(handler);
            logger.setLevel(Level.CONFIG);
            logger.setLevel(Level.INFO);
            logger.setLevel(Level.FINER);
            logger.setLevel(Level.SEVERE);

            switch (level){
                case "info":
                    logger.info(message);
                    break;

                case "error":
                    logger.finer(message);
                    break;

                case "break":
                    logger.severe(message);
                    break;
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
