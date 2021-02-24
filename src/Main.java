
import java.io.IOException;
import java.util.logging.*;
import handlers.Logger;
import handlers.InputHandler;

public class Main {



    public static void main(String[] args){
//        Logger avajLogger = new Logger();
        InputHandler avajData = new InputHandler();
        avajData.takeInput();
    }

}
