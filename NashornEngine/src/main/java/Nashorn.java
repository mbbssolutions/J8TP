import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by Pavan_Karasala on 11/5/2016.
 */
public class Nashorn {
    public static void main(String args[]) throws ScriptException {
        ScriptEngineManager manager =new ScriptEngineManager();
        ScriptEngine engine=manager.getEngineByName("JavaScript");

        System.out.println(engine.getClass().getName());
        System.out.println("Result: "+engine.eval("function f(){return 1;};f()+1;"));
    }
}
