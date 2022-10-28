package task2;

import java.util.*;

public class Supermarket {
    private static final List <String> NAMES = List.of(
       "ИВАНОВ ИВАН",
       "Сидоров Сидор",
       "Петров Петр",
       "лотлт",
            "ловтлцув",
            "цйыйцыйцы",
            "ыйцыйцыйцы",
            "цц   ц   ц   ",
            "цвшщовщощшвщ"
    );
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
    Queue<String> queue1 = new ArrayDeque<>(5);
    Queue<String> queue2 = new ArrayDeque<>(5);
    randomFilling(queue1);
    randomFilling(queue2);
        System.out.println(queue1);
        System.out.println(queue2);
    addInQueue("aaaaaaaaa", queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);
        remove(queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);
    }

    private static void addInQueue(String name, Queue queue1, Queue queue2){
        if (queue1.size()==5 && queue2.size()==5){
            System.out.println("Зовите Галю");
        }
        if (queue1.size()<queue2.size() && queue2.size()<=5){
            queue2.offer(name);
        }else queue1.offer(name);
    }
    public static void randomFilling(Queue<String> queue){
        int size = RANDOM.nextInt(5);
        for (int i = 0; i<=size; i++){
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
    public static void remove(Queue<String> queue1, Queue<String> queue2){
        if (RANDOM.nextBoolean()){
            queue1.poll();
        }else queue2.poll();
    }
}
