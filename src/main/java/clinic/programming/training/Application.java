
package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    public void doIt(){
        List<String> list = new ArrayList<>();
        list.add("Greetings");

        for (String elemento : list){
            System.out.println(elemento);
        }
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
        Application app = new Application();
        app.doIt();
    }
}