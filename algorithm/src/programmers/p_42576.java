package programmers;

import java.util.*;

public class p_42576 {
    static String[] participant = {"mislav", "stanko", "mislav", "ana"};
    static String[] completion = {"stanko", "ana", "mislav"};

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if (map.get(participant[i]) == null) {
                map.put(participant[i], 1);
            } else {
                int cnt = map.get(participant[i]);
                map.put(participant[i], cnt + 1);
            }
        }

        for (String key : completion) {
            int cnt = map.get(key);
            map.put(key, cnt - 1);
        }

        Set<String> key = map.keySet();
        Iterator<String> iterator = key.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (map.get(name) == 1) {
                System.out.println(name);
            }
        }

    }
}
