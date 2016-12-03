/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
public class TypeInterface {
    public static void main(String args[]){
        final Value<String > value=new Value<>();
        System.out.println(value.getOrDefault("22",Value.defaultValue()));
    }
}
