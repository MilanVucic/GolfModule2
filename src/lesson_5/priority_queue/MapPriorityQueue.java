package lesson_5.priority_queue;

import java.util.*;

public class MapPriorityQueue<T extends HasPriority> implements MyPriorityQueue<T> {
    SortedMap<Integer, List<T>> items;

    public MapPriorityQueue() {
        items = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }

    @Override
    public void enqueue(T item) {
        int priority = item.getPriority();
        if (items.containsKey(priority)) {
            items.get(priority).add(item);
        } else {
            List<T> list = new ArrayList<>();
            list.add(item);
            items.put(priority, list);
        }
    }

    @Override
    public T deque() {
        Integer key = items.firstKey();
        if (key == null) {
            // maybe throw an exception?
            return null;
        } else {
            List<T> list = items.get(key);
            T item = list.removeFirst();
            if (list.size() == 0) {
                items.remove(key);
            }
            return item;
        }
    }

    @Override
    public int size() {
        int size = 0;
        for (Integer integer : items.keySet()) {
            size += items.get(integer).size();
        }
        return size;
    }
}
