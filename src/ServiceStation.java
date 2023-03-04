import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ServiceStation <T extends Transport> {
    private Queue<T> queue = new LinkedList<>();


    public void addCarToQueue(T transport){
        queue.offer(transport);
    }

    public void carryOutAVehicleInspection() {
        T transport = queue.poll();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceStation<?> that = (ServiceStation<?>) o;
        return Objects.equals(queue, that.queue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queue);
    }
}