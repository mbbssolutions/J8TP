import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by Pavan_Karasala on 10/18/2016.
 */
public class ParameterNames {
    public static void main(String args[]) throws NoSuchMethodException {
        Method method=ParameterNames.class.getMethod("main",String[].class);
        for(final Parameter parameter:method.getParameters()){
            System.out.println("Parameter :"+parameter);
        }
    }
}
