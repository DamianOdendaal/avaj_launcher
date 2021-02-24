package handlers;
import handlers.Logger;
import java.util.Scanner;


public class InputHandler {
    public static void takeInput(){
        Logger inputLogger = new Logger();
        Scanner avajScanner = new Scanner(System.in);
        String line = "";
        try {
            while (avajScanner.hasNextLine()) {
                line = avajScanner.nextLine();
                if (line != ""){
                    System.out.println(line);
                    break;
                }
                continue;
            }

        }
        catch (Exception e){
            inputLogger.logData("error", "Error at InputHandler");
            avajScanner.close();
        }
    }
}


