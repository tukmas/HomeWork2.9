import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <T extends Transport> {
    private Queue<T> queue = new LinkedList<>();


    public void addCarToQueue(T transport){
        queue.offer(transport);
    }

    public void carryOutAVehicleInspection() {
        T transport = queue.poll();
    }

}