1. add()

Adds element to set (no duplicates allowed)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // duplicate

        System.out.println(set);
    }
}

Output:

[10, 20]
2. remove()

Removes element

set.remove(10);
System.out.println(set);

Output:

[20]
3. contains()

Checks if element exists

System.out.println(set.contains(20));
System.out.println(set.contains(50));

Output:

true
false
4. size()

Returns number of elements

System.out.println(set.size());

Output:

1
5. isEmpty()

Checks if set is empty

System.out.println(set.isEmpty());

Output:

false
6. clear()

Removes all elements

set.clear();
System.out.println(set);

Output:

[]
7. iterator()

Used to iterate manually

HashSet<Integer> set = new HashSet<>();
set.add(1);
set.add(2);

Iterator<Integer> it = set.iterator();
while(it.hasNext()) {
    System.out.println(it.next());
}

Output:

1
2
8. forEach()

Loop using lambda

set.forEach(x -> System.out.println(x));

Output:

1
2
9. addAll()

Adds all elements from another set

HashSet<Integer> set1 = new HashSet<>();
set1.add(1);

HashSet<Integer> set2 = new HashSet<>();
set2.add(2);
set2.add(3);

set1.addAll(set2);
System.out.println(set1);

Output:

[1, 2, 3]
10. removeAll()

Removes common elements

set1.removeAll(set2);
System.out.println(set1);

Output:

[1]
11. retainAll()

Keeps only common elements (intersection)

set1.add(2);
set1.add(3);

set1.retainAll(set2);
System.out.println(set1);

Output:

[2, 3]
12. toArray()

Convert set to array

Object[] arr = set2.toArray();
System.out.println(Arrays.toString(arr));

Output:

[2, 3]
13. clone()

Creates copy of set

HashSet<Integer> newSet = (HashSet<Integer>) set2.clone();
System.out.println(newSet);

Output:

[2, 3]
14. equals()

Compares two sets

System.out.println(set2.equals(newSet));

Output:

true