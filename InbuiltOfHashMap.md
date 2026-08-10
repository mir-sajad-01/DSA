1. put()

Adds key-value pair

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("A", 50); // overwrite

        System.out.println(map);
    }
}

Output:

{A=50, B=20}
🔹 2. get()

Returns value of key

System.out.println(map.get("A"));
System.out.println(map.get("C"));

Output:

50
null
🔹 3. containsKey()

Checks if key exists

System.out.println(map.containsKey("A"));
System.out.println(map.containsKey("Z"));

Output:

true
false
🔹 4. containsValue()

Checks if value exists

System.out.println(map.containsValue(20));

Output:

true
🔹 5. remove()

Removes key

map.remove("A");
System.out.println(map);

Output:

{B=20}
🔹 6. size()

Returns number of entries

System.out.println(map.size());

Output:

1
🔹 7. isEmpty()
System.out.println(map.isEmpty());

Output:

false
🔹 8. clear()
map.clear();
System.out.println(map);

Output:

{}
🔹 9. keySet()

Returns all keys

map.put("A", 10);
map.put("B", 20);

System.out.println(map.keySet());

Output:

[A, B]
🔹 10. values()

Returns all values

System.out.println(map.values());

Output:

[10, 20]
🔹 11. entrySet()

Returns key-value pairs

System.out.println(map.entrySet());

Output:

[A=10, B=20]
🔹 12. Loop using entrySet()

(Most important in interviews)

for (Map.Entry<String, Integer> e : map.entrySet()) {
    System.out.println(e.getKey() + " " + e.getValue());
}

Output:

A 10
B 20
🔹 13. getOrDefault()

Avoids null

System.out.println(map.getOrDefault("C", 0));

Output:

0
🔹 14. putIfAbsent()

Adds only if key not present

map.putIfAbsent("A", 100);
System.out.println(map);

Output:

{A=10, B=20}
🔹 15. replace()
map.replace("A", 99);
System.out.println(map);

Output:

{A=99, B=20}
🔹 16. replace(key, old, new)
map.replace("A", 99, 500);
System.out.println(map);

Output:

{A=500, B=20}
🔹 17. clone()
HashMap<String, Integer> newMap = (HashMap<String, Integer>) map.clone();
System.out.println(newMap);

Output:

{A=500, B=20}
🔹 18. equals()
System.out.println(map.equals(newMap));

Output:

true
🔹 19. forEach()
map.forEach((k, v) -> System.out.println(k + ":" + v));

Output:

A:500
B:20