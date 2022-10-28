package racing;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation  {
    private final Queue<Transport> queue = new LinkedList<>();

    private void addTransportInQueue(Transport transport){
        queue.offer(transport);
    }
    public void addCar(Car car){
        addTransportInQueue(car);
    }
    public void addTruck(Truck truck){
        addTransportInQueue(truck);
    }
    public void spendTechnicalInspection(){
        if (!queue.isEmpty()){
         Transport transport = queue.poll();
            System.out.println("Машина "+ transport+ "прошла техосмотр");
        }
    }

}
