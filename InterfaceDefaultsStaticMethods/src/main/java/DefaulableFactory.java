import java.util.function.Supplier;

/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
  interface DefaulableFactory {
    static Defaulable create(Supplier<Defaulable> supplier){
        return supplier.get();
    }
}
