import com.digitalcastaway.warehouse.Robot;
import com.digitalcastaway.warehouse.Warehouse;

public class Main {

    public static void main(String[] args) {
        Warehouse miAlmacen = Warehouse.generateWarehouse();

        for (int i = 0; i < 5; i++) {
            miAlmacen.removeRobot();
        }

    }
}
