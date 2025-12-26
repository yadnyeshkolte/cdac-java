# 📚 Complete Java Collections Framework Notes

## Table of Contents
1. [Collections Hierarchy](#collections-hierarchy)
2. [List Interface](#list-interface)
3. [Set Interface](#set-interface)
4. [Queue Interface](#queue-interface)
5. [Map Interface](#map-interface)
6. [Complete Comparison Tables](#complete-comparison-tables)
7. [Time Complexity Comparison](#time-complexity-comparison)

---

## Collections Hierarchy

```
Collection (Interface)
├── List (Interface)
│   ├── ArrayList (Class)
│   ├── LinkedList (Class)
│   └── Vector (Class)
│       └── Stack (Class)
├── Set (Interface)
│   ├── HashSet (Class)
│   ├── LinkedHashSet (Class)
│   └── SortedSet (Interface)
│       └── TreeSet (Class)
└── Queue (Interface)
    ├── PriorityQueue (Class)
    └── Deque (Interface)
        └── ArrayDeque (Class)
        └── LinkedList (Class)

Map (Interface) - Separate hierarchy
├── HashMap (Class)
│   └── LinkedHashMap (Class)
├── TreeMap (Class)
├── Hashtable (Class)
└── SortedMap (Interface)
    └── TreeMap (Class)
```

---

## List Interface

### 🔵 ArrayList

**Definition**:  Resizable array implementation.  Best for random access and iteration.

**Key Characteristics**:
- ✅ Maintains insertion order
- ✅ Allows duplicates
- ✅ Allows null values
- ❌ Not synchronized (not thread-safe)
- 🚀 Fast random access O(1)
- 🐌 Slow insertion/deletion in middle O(n)

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util. Comparator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<String> list = new ArrayList<>(); // Initial capacity 10
        ArrayList<String> list2 = new ArrayList<>(20); // Custom capacity
        ArrayList<String> list3 = new ArrayList<>(list); // From another collection
        
        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Duplicates allowed
        list.add(null); // Null allowed
        
        // Adding at specific index
        list.add(1, "Mango"); // Shifts elements
        
        // Adding multiple elements
        list.addAll(List.of("Dragon Fruit", "Elderberry"));
        list.addAll(2, List.of("Fig", "Grape")); // Insert at index
        
        // Accessing elements
        String first = list.get(0); // O(1) operation
        String last = list. get(list.size() - 1);
        
        // Modifying elements
        list.set(0, "Avocado"); // Replace element
        
        // Removing elements
        list.remove("Banana"); // Remove by object
        list.remove(0); // Remove by index
        list.removeAll(List.of("Fig", "Grape")); // Remove multiple
        list.removeIf(fruit -> fruit.startsWith("D")); // Remove with condition (Java 8+)
        
        // Searching
        int index = list.indexOf("Cherry"); // First occurrence (-1 if not found)
        int lastIndex = list.lastIndexOf("Apple"); // Last occurrence
        boolean exists = list.contains("Mango");
        
        // Size operations
        int size = list.size();
        boolean isEmpty = list. isEmpty();
        
        // Sublist (view of portion)
        List<String> subList = list.subList(1, 4); // from index 1 to 3
        
        // Converting to array
        String[] array = list.toArray(new String[0]);
        Object[] objArray = list.toArray();
        
        // Sorting
        Collections.sort(list); // Natural order
        list.sort(Comparator.naturalOrder()); // Java 8+
        list.sort(Comparator.reverseOrder()); // Reverse order
        list.sort((a, b) -> a.length() - b.length()); // Custom comparator
        
        // Reversing
        Collections.reverse(list);
        
        // Shuffle
        Collections.shuffle(list);
        
        // Clear all
        list.clear();
        
        // Ensuring capacity
        list.ensureCapacity(100); // Avoid multiple resizing
        
        // Trimming
        list.trimToSize(); // Reduce capacity to current size
    }
}
```

#### ArrayList Iteration Methods

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);

// 1. Traditional for loop (useful when you need index)
for (int i = 0; i < numbers.size(); i++) {
    System.out.println("Index " + i + ": " + numbers.get(i));
}

// 2. Enhanced for loop (for-each) - Most readable
for (Integer num : numbers) {
    System.out.println(num);
}

// 3. Iterator - Safe for removing elements during iteration
Iterator<Integer> iterator = numbers.iterator();
while (iterator.hasNext()) {
    Integer num = iterator.next();
    if (num == 20) {
        iterator. remove(); // Safe removal
    }
    System.out.println(num);
}

// 4. ListIterator - Bidirectional iteration
ListIterator<Integer> listIterator = numbers.listIterator();
while (listIterator. hasNext()) {
    System.out.println(listIterator.next());
}
// Traverse backwards
while (listIterator. hasPrevious()) {
    System.out.println(listIterator.previous());
}

// 5. forEach with Lambda (Java 8+)
numbers.forEach(num -> System.out. println(num));

// 6. forEach with method reference
numbers.forEach(System.out::println);

// 7. Stream API (Java 8+)
numbers.stream().forEach(System.out::println);

// 8. Parallel stream for large lists
numbers.parallelStream().forEach(System.out::println);

// 9. Stream with operations
numbers.stream()
    .filter(num -> num > 15)
    .map(num -> num * 2)
    .forEach(System.out::println);
```

---

### 🔵 LinkedList

**Definition**: Doubly-linked list implementation. Best for frequent insertions/deletions. 

**Key Characteristics**: 
- ✅ Maintains insertion order
- ✅ Allows duplicates
- ✅ Allows null values
- ❌ Not synchronized
- 🐌 Slow random access O(n)
- 🚀 Fast insertion/deletion O(1) at ends
- 🎯 Implements both List and Deque interfaces

```java
import java.util. LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Adding elements
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        // Adding at beginning/end (Deque operations)
        list.addFirst("Zero"); // O(1)
        list.addLast("Fourth"); // O(1)
        list.offerFirst("Negative One"); // Returns boolean
        list.offerLast("Fifth"); // Returns boolean
        
        // Accessing elements
        String first = list.getFirst(); // Throws exception if empty
        String last = list.getLast();
        String peekFirst = list.peekFirst(); // Returns null if empty
        String peekLast = list.peekLast();
        
        // Removing elements
        String removedFirst = list.removeFirst(); // Throws exception if empty
        String removedLast = list. removeLast();
        String polledFirst = list.pollFirst(); // Returns null if empty
        String polledLast = list.pollLast();
        
        // Using as Stack (LIFO)
        list.push("A"); // Add to front
        list.push("B");
        String popped = list.pop(); // Remove from front
        
        // Using as Queue (FIFO)
        list.offer("A"); // Add to end
        list.offer("B");
        String polled = list.poll(); // Remove from front
        
        // Remove first/last occurrence
        list.removeFirstOccurrence("Second");
        list.removeLastOccurrence("Third");
        
        // Get element at index (O(n) operation)
        String element = list.get(2);
        
        // Clone
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        
        // Descending Iterator
        var descIterator = list.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}
```

---

### 🔵 Vector

**Definition**:  Synchronized version of ArrayList. Thread-safe but slower. 

**Key Characteristics**: 
- ✅ Maintains insertion order
- ✅ Allows duplicates
- ✅ Synchronized (thread-safe)
- 🐌 Slower than ArrayList due to synchronization
- 📦 Legacy class (prefer ArrayList with Collections.synchronizedList())

```java
import java.util.Vector;
import java.util. Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(); // Initial capacity 10
        Vector<Integer> vector2 = new Vector<>(20); // Custom capacity
        Vector<Integer> vector3 = new Vector<>(20, 5); // Capacity and increment
        
        // Adding elements
        vector.add(10);
        vector.add(20);
        vector.addElement(30); // Legacy method
        
        // Accessing
        int first = vector.firstElement(); // Throws exception if empty
        int last = vector.lastElement();
        int element = vector.elementAt(1); // Same as get()
        
        // Capacity operations
        int capacity = vector.capacity();
        vector.ensureCapacity(50);
        vector.trimToSize();
        
        // Enumeration (legacy way to iterate)
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration. hasMoreElements()) {
            System.out.println(enumeration. nextElement());
        }
        
        // Removing
        vector.removeElement(20); // Remove by object
        vector. removeElementAt(0); // Remove by index
        vector.removeAllElements(); // Clear all
        
        // Set size
        vector.setSize(10); // Truncates or pads with null
        
        // Copy to array
        Integer[] array = new Integer[vector.size()];
        vector.copyInto(array);
    }
}
```

---

### 🔵 Stack

**Definition**: LIFO (Last In First Out) data structure. Extends Vector.

**Key Characteristics**:
- ✅ LIFO order
- ✅ Synchronized (extends Vector)
- 📦 Legacy class (prefer Deque implementations)

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        // Push elements
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        
        // Peek at top (doesn't remove)
        String top = stack.peek(); // "Third"
        
        // Pop element (removes and returns)
        String popped = stack.pop(); // "Third"
        
        // Check if empty
        boolean isEmpty = stack.isEmpty();
        
        // Search (returns position from top, 1-based)
        int position = stack. search("First"); // 2 (from top)
        
        // Size
        int size = stack.size();
        
        // Example:  Reverse a string
        String str = "Hello";
        Stack<Character> charStack = new Stack<>();
        for (char c : str.toCharArray()) {
            charStack. push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversed.append(charStack.pop());
        }
        System.out.println(reversed); // "olleH"
    }
}
```

**💡 Modern Alternative**: Use `ArrayDeque` instead of Stack

```java
Deque<String> stack = new ArrayDeque<>();
stack.push("First");
stack.push("Second");
String top = stack.peek();
String popped = stack.pop();
```

---

## Set Interface

### 🟢 HashSet

**Definition**:  Hash table based Set.  No duplicate elements.

**Key Characteristics**:
- ❌ No insertion order (random order)
- ❌ No duplicates
- ✅ Allows one null
- ❌ Not synchronized
- 🚀 Fast operations O(1) average
- 🎯 Uses HashMap internally

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); // Default capacity 16, load factor 0.75
        HashSet<String> set2 = new HashSet<>(32); // Custom capacity
        HashSet<String> set3 = new HashSet<>(32, 0.80f); // Custom capacity and load factor
        
        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate - not added, returns false
        set.add(null); // Null allowed
        
        // Adding multiple
        set.addAll(Set. of("Mango", "Orange"));
        
        // Checking existence
        boolean exists = set.contains("Apple"); // O(1) average
        
        // Removing
        set. remove("Banana");
        set.removeAll(Set.of("Mango", "Orange")); // Remove multiple
        set.removeIf(fruit -> fruit.startsWith("C")); // Conditional remove
        
        // Size
        int size = set.size();
        boolean isEmpty = set.isEmpty();
        
        // Set operations
        HashSet<String> set1 = new HashSet<>(Set.of("A", "B", "C"));
        HashSet<String> set2 = new HashSet<>(Set.of("B", "C", "D"));
        
        // Union
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2); // {A, B, C, D}
        
        // Intersection
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // {B, C}
        
        // Difference
        HashSet<String> difference = new HashSet<>(set1);
        difference.removeAll(set2); // {A}
        
        // Check subset
        boolean isSubset = set1.containsAll(set2);
        
        // Clear
        set.clear();
        
        // Clone
        HashSet<String> cloned = (HashSet<String>) set.clone();
    }
}
```

---

### 🟢 LinkedHashSet

**Definition**: Hash table and linked list Set. Maintains insertion order.

**Key Characteristics**:
- ✅ Maintains insertion order
- ❌ No duplicates
- ✅ Allows one null
- ❌ Not synchronized
- 🚀 Fast operations O(1) average
- 📊 Slightly slower than HashSet

```java
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        // Adding elements - order is preserved
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate - not added
        
        // Iteration maintains insertion order
        for (Integer num :  set) {
            System.out.print(num + " "); // Output: 30 10 20
        }
        
        // All HashSet operations are same
        set.remove(10);
        set.contains(20);
        set.size();
        
        // Use case: Removing duplicates while maintaining order
        List<String> listWithDuplicates = List.of("A", "B", "A", "C", "B");
        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>(listWithDuplicates);
        List<String> uniqueList = new ArrayList<>(uniqueSet);
        // uniqueList:  [A, B, C] - order maintained
    }
}
```

---

### 🟢 TreeSet

**Definition**: Red-Black tree based NavigableSet. Elements are sorted. 

**Key Characteristics**: 
- ✅ Sorted order (natural or custom)
- ❌ No duplicates
- ❌ No null (throws NullPointerException)
- ❌ Not synchronized
- 🐌 Slower operations O(log n)
- 🎯 Implements NavigableSet

```java
import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.Comparator;

public class TreeSetExample {
    public static void main(String[] args) {
        // Natural ordering
        TreeSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);
        
        System.out.println(set); // [10, 20, 30, 40, 50] - sorted
        
        // Custom ordering (reverse)
        TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.addAll(set);
        System.out.println(reverseSet); // [50, 40, 30, 20, 10]
        
        // String TreeSet (alphabetical order)
        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("Dog");
        stringSet.add("Cat");
        stringSet.add("Elephant");
        stringSet.add("Ant");
        System.out.println(stringSet); // [Ant, Cat, Dog, Elephant]
        
        // Custom objects with Comparable
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("John", 25));
        people.add(new Person("Alice", 30));
        
        // Custom objects with Comparator
        TreeSet<Person> peopleByName = new TreeSet<>(
            (p1, p2) -> p1.getName().compareTo(p2.getName())
        );
        
        // NavigableSet operations
        
        // Access elements
        Integer first = set.first(); // 10 - smallest
        Integer last = set.last(); // 50 - largest
        
        // Polling (remove and return)
        Integer pollFirst = set.pollFirst(); // 10
        Integer pollLast = set. pollLast(); // 50
        
        // Range operations
        Integer lower = set.lower(30); // 20 - greatest element < 30
        Integer floor = set.floor(30); // 30 - greatest element <= 30
        Integer ceiling = set.ceiling(30); // 30 - smallest element >= 30
        Integer higher = set.higher(30); // 40 - smallest element > 30
        
        // Subset views
        NavigableSet<Integer> headSet = set.headSet(30, false); // < 30
        NavigableSet<Integer> tailSet = set.tailSet(30, true); // >= 30
        NavigableSet<Integer> subSet = set.subSet(20, true, 40, false); // [20, 40)
        
        // Descending operations
        NavigableSet<Integer> descendingSet = set.descendingSet();
        var descendingIterator = set.descendingIterator();
        
        // Example: Finding rank/position
        TreeSet<Integer> ranks = new TreeSet<>(Set.of(10, 20, 30, 40, 50));
        int elementsBelow30 = ranks.headSet(30, false).size(); // 2
        int rank = elementsBelow30 + 1; // 3rd position
    }
}

// Person class implementing Comparable
class Person implements Comparable<Person> {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Sort by age
    }
}
```

---

## Queue Interface

### 🟡 Queue (LinkedList Implementation)

**Definition**: FIFO (First In First Out) data structure. 

**Key Characteristics**: 
- ✅ FIFO order
- ✅ Allows duplicates
- ✅ Allows null (LinkedList implementation)
- ❌ Not synchronized

```java
import java.util.Queue;
import java.util. LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        // Adding elements (two ways)
        queue.offer("First");  // Returns false if fails (preferred)
        queue.add("Second");   // Throws exception if fails
        queue.offer("Third");
        
        // Accessing front element (two ways)
        String front1 = queue.peek(); // Returns null if empty (preferred)
        String front2 = queue.element(); // Throws exception if empty
        
        // Removing front element (two ways)
        String removed1 = queue.poll(); // Returns null if empty (preferred)
        String removed2 = queue.remove(); // Throws exception if empty
        
        // Size and empty check
        int size = queue.size();
        boolean isEmpty = queue.isEmpty();
        
        // Check contains
        boolean contains = queue.contains("Second");
        
        // Process all elements
        while (!queue.isEmpty()) {
            System.out. println(queue.poll());
        }
        
        // Common use case: BFS traversal
        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.offer(1);
        while (!bfsQueue.isEmpty()) {
            int node = bfsQueue.poll();
            // Process node and add children
        }
    }
}
```

---

### 🟡 PriorityQueue

**Definition**:  Heap-based priority queue. Elements ordered by priority.

**Key Characteristics**:
- ✅ Priority order (min-heap by default)
- ✅ Allows duplicates
- ❌ No null
- ❌ Not synchronized
- 🚀 O(log n) insertion and removal
- 🎯 Head is always smallest element

```java
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Min-heap (default) - smallest element has highest priority
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(50);
        minHeap.offer(20);
        minHeap.offer(40);
        minHeap.offer(10);
        minHeap.offer(30);
        
        System.out.println(minHeap. peek()); // 10 - smallest
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); // 10 20 30 40 50
        }
        System.out. println();
        
        // Max-heap - largest element has highest priority
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator. reverseOrder());
        maxHeap.offer(50);
        maxHeap.offer(20);
        maxHeap.offer(40);
        
        System.out.println(maxHeap.peek()); // 50 - largest
        while (! maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " "); // 50 40 20
        }
        System.out. println();
        
        // String PriorityQueue (alphabetical)
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.offer("Zebra");
        stringPQ.offer("Apple");
        stringPQ.offer("Mango");
        System.out.println(stringPQ.poll()); // Apple
        
        // Custom objects with Comparator
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
            (t1, t2) -> Integer.compare(t1.priority, t2.priority)
        );
        taskQueue.offer(new Task("Low priority task", 3));
        taskQueue.offer(new Task("High priority task", 1));
        taskQueue.offer(new Task("Medium priority task", 2));
        
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println(task.name + " - Priority: " + task.priority);
        }
        // Output: 
        // High priority task - Priority: 1
        // Medium priority task - Priority:  2
        // Low priority task - Priority: 3
        
        // Initial capacity
        PriorityQueue<Integer> pq = new PriorityQueue<>(20);
        
        // From another collection
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(List.of(5, 2, 8, 1));
        
        // Remove specific element (O(n) operation)
        pq. remove(5);
        
        // Contains (O(n) operation)
        boolean contains = pq.contains(10);
        
        // Convert to sorted array
        Integer[] array = pq.toArray(new Integer[0]);
        Arrays.sort(array); // Need to sort as internal order is not guaranteed
        
        // Common use case: Find K largest elements
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.offer(num);
            if (heap. size() > k) {
                heap.poll();
            }
        }
        System.out.println("K largest: " + heap); // [5, 6]
    }
}

class Task {
    String name;
    int priority;
    
    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}
```

---

### 🟡 Deque (ArrayDeque)

**Definition**: Double-ended queue.  Insert/remove from both ends.

**Key Characteristics**:
- ✅ Can be used as Stack or Queue
- ✅ Allows duplicates
- ❌ No null
- ❌ Not synchronized
- 🚀 Faster than LinkedList and Stack
- 🎯 Preferred over Stack and LinkedList

```java
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        
        // Adding at ends
        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("New First"); // Preferred (returns boolean)
        deque.offerLast("New Last");
        
        // Accessing ends
        String first = deque. getFirst(); // Throws exception if empty
        String last = deque.getLast();
        String peekFirst = deque.peekFirst(); // Returns null if empty (preferred)
        String peekLast = deque.peekLast();
        
        // Removing from ends
        String removedFirst = deque.removeFirst(); // Throws exception
        String removedLast = deque.removeLast();
        String polledFirst = deque.pollFirst(); // Returns null (preferred)
        String polledLast = deque.pollLast();
        
        // Using as Stack (LIFO)
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1); // Add to front
        stack.push(2);
        stack.push(3);
        System.out.println(stack. peek()); // 3
        System.out.println(stack.pop()); // 3
        
        // Using as Queue (FIFO)
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1); // Add to end
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek()); // 1
        System.out.println(queue.poll()); // 1
        
        // Iteration
        // Forward
        for (String item : deque) {
            System.out.println(item);
        }
        
        // Backward
        var descendingIterator = deque. descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
        
        // Size
        int size = deque.size();
        boolean isEmpty = deque.isEmpty();
        
        // Contains
        boolean contains = deque. contains("First");
        
        // Remove specific element (first occurrence)
        deque.remove("First");
        deque.removeFirstOccurrence("First");
        deque.removeLastOccurrence("Last");
        
        // Clear
        deque.clear();
    }
}
```

---

## Map Interface

### 🔴 HashMap

**Definition**: Hash table based key-value storage.

**Key Characteristics**:
- ❌ No order
- ❌ No duplicate keys (values can be duplicate)
- ✅ One null key, multiple null values
- ❌ Not synchronized
- 🚀 O(1) average for get/put
- 🎯 Most commonly used Map

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating HashMap
        HashMap<String, Integer> map = new HashMap<>(); // Default capacity 16, load factor 0.75
        HashMap<String, Integer> map2 = new HashMap<>(32); // Custom capacity
        HashMap<String, Integer> map3 = new HashMap<>(32, 0.80f); // Capacity and load factor
        
        // Adding key-value pairs
        map.put("Apple", 100);
        map.put("Banana", 150);
        map.put("Cherry", 200);
        map.put("Apple", 120); // Overwrites previous value
        map.put(null, 50); // Null key allowed
        map.put("Date", null); // Null value allowed
        
        // Adding multiple
        map.putAll(Map.of("Elderberry", 300, "Fig", 400));
        
        // putIfAbsent (only if key doesn't exist)
        map.putIfAbsent("Apple", 999); // Not added (Apple already exists)
        map.putIfAbsent("Grape", 250); // Added
        
        // Accessing values
        Integer value = map.get("Apple"); // 120
        Integer defaultValue = map.getOrDefault("Mango", 0); // 0 (key doesn't exist)
        
        // Checking existence
        boolean hasKey = map.containsKey("Apple");
        boolean hasValue = map. containsValue(100);
        
        // Removing
        map.remove("Banana"); // Remove by key
        map.remove("Cherry", 200); // Remove only if value matches
        
        // Replace
        map.replace("Apple", 130); // Replace if key exists
        map.replace("Apple", 130, 140); // Replace only if current value matches
        
        // Size
        int size = map.size();
        boolean isEmpty = map. isEmpty();
        
        // Get keys, values, entries
        var keys = map.keySet(); // Set of keys
        var values = map.values(); // Collection of values
        var entries = map.entrySet(); // Set of Map.Entry
        
        // Compute operations (Java 8+)
        map.compute("Apple", (key, val) -> val == null ? 1 : val + 1);
        map.computeIfAbsent("Honeydew", key -> 500);
        map.computeIfPresent("Apple", (key, val) -> val + 10);
        
        // Merge (Java 8+)
        map.merge("Apple", 50, (oldVal, newVal) -> oldVal + newVal);
        
        // Clear
        map.clear();
        
        // Clone
        HashMap<String, Integer> cloned = (HashMap<String, Integer>) map.clone();
    }
}
```

#### HashMap Iteration Methods

```java
HashMap<String, Integer> scores = new HashMap<>();
scores.put("John", 85);
scores.put("Jane", 92);
scores.put("Bob", 78);
scores.put("Alice", 88);

// 1. Using keySet() - iterate over keys
for (String key : scores.keySet()) {
    System.out.println(key + ": " + scores.get(key));
}

// 2. Using values() - iterate over values only
for (Integer value : scores. values()) {
    System.out.println(value);
}

// 3. Using entrySet() - iterate over key-value pairs (MOST EFFICIENT)
for (Map.Entry<String, Integer> entry : scores. entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
    // You can also modify value
    entry.setValue(entry.getValue() + 5); // Add 5 to each score
}

// 4. forEach with Lambda (Java 8+) - MOST CONCISE
scores.forEach((key, value) -> {
    System.out.println(key + ": " + value);
});

// 5. Iterator with entrySet()
Iterator<Map.Entry<String, Integer>> iterator = scores.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<String, Integer> entry = iterator. next();
    System.out.println(entry.getKey() + ": " + entry.getValue());
    // Safe removal during iteration
    if (entry.getValue() < 80) {
        iterator.remove();
    }
}

// 6. Stream API (Java 8+)
scores.entrySet().stream()
    .forEach(entry -> System. out.println(entry.getKey() + ": " + entry.getValue()));

// 7. Stream with filtering
scores.entrySet().stream()
    .filter(entry -> entry.getValue() > 80)
    .forEach(entry -> System.out.println(entry. getKey() + ": " + entry.getValue()));

// 8. Sorted iteration by key
scores.entrySet().stream()
    .sorted(Map.Entry.comparingByKey())
    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

// 9. Sorted iteration by value
scores.entrySet().stream()
    .sorted(Map.Entry.comparingByValue())
    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

// 10. Reverse sorted by value
scores.entrySet().stream()
    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    .forEach(entry -> System. out.println(entry.getKey() + ": " + entry.getValue()));
```

---

### 🔴 LinkedHashMap

**Definition**: HashMap with linked list.  Maintains insertion or access order.

**Key Characteristics**:
- ✅ Maintains insertion order (or access order)
- ❌ No duplicate keys
- ✅ One null key, multiple null values
- ❌ Not synchronized
- 📊 Slightly slower than HashMap

```java
import java.util.LinkedHashMap;
import java. util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Insertion order (default)
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("C", 3);
        map.put("A", 1);
        map.put("B", 2);
        
        // Iteration maintains insertion order
        for (Map. Entry<String, Integer> entry :  map.entrySet()) {
            System.out.print(entry.getKey() + " "); // C A B
        }
        System.out.println();
        
        // Access order (LRU cache)
        LinkedHashMap<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap. put("A", 1);
        accessOrderMap.put("B", 2);
        accessOrderMap.put("C", 3);
        
        accessOrderMap.get("A"); // Access A
        accessOrderMap.get("B"); // Access B
        
        for (String key : accessOrderMap.keySet()) {
            System.out. print(key + " "); // C A B (least recently accessed to most)
        }
        System.out.println();
        
        // LRU Cache implementation
        int capacity = 3;
        LinkedHashMap<Integer, String> lruCache = new LinkedHashMap<Integer, String>(
            capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > capacity; // Remove oldest when size exceeds capacity
            }
        };
        
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");
        lruCache.put(4, "Four"); // Removes 1 (least recently used)
        
        System.out.println(lruCache); // {2=Two, 3=Three, 4=Four}
        
        // All HashMap methods are available
        lruCache.get(2);
        lruCache.remove(3);
        lruCache.containsKey(4);
    }
}
```

---

### 🔴 TreeMap

**Definition**: Red-Black tree based NavigableMap.  Keys are sorted.

**Key Characteristics**: 
- ✅ Sorted by keys (natural or custom order)
- ❌ No duplicate keys
- ❌ No null keys (null values allowed)
- ❌ Not synchronized
- 🐌 O(log n) for get/put
- 🎯 Implements NavigableMap

```java
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util. Comparator;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Natural ordering (ascending)
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(50, "Fifty");
        map.put(20, "Twenty");
        map.put(40, "Forty");
        map.put(10, "Ten");
        map.put(30, "Thirty");
        
        System.out.println(map); // {10=Ten, 20=Twenty, 30=Thirty, 40=Forty, 50=Fifty}
        
        // Reverse ordering
        TreeMap<Integer, String> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.putAll(map);
        System.out.println(reverseMap); // {50=Fifty, 40=Forty, ... }
        
        // String keys (alphabetical)
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("Zebra", 1);
        stringMap.put("Apple", 2);
        stringMap.put("Mango", 3);
        System.out.println(stringMap); // {Apple=2, Mango=3, Zebra=1}
        
        // NavigableMap operations
        
        // First and last entries
        Map.Entry<Integer, String> firstEntry = map.firstEntry(); // 10=Ten
        Map.Entry<Integer, String> lastEntry = map. lastEntry(); // 50=Fifty
        Integer firstKey = map.firstKey(); // 10
        Integer lastKey = map.lastKey(); // 50
        
        // Polling (remove and return)
        Map.Entry<Integer, String> pollFirst = map.pollFirstEntry();
        Map.Entry<Integer, String> pollLast = map. pollLastEntry();
        
        // Neighboring entries
        Map.Entry<Integer, String> lower = map.lowerEntry(30); // 20=Twenty (< 30)
        Map.Entry<Integer, String> floor = map.floorEntry(30); // 30=Thirty (<= 30)
        Map.Entry<Integer, String> ceiling = map.ceilingEntry(30); // 30=Thirty (>= 30)
        Map.Entry<Integer, String> higher = map.higherEntry(30); // 40=Forty (> 30)
        
        Integer lowerKey = map.lowerKey(30); // 20
        Integer floorKey = map. floorKey(30); // 30
        Integer ceilingKey = map.ceilingKey(30); // 30
        Integer higherKey = map.higherKey(30); // 40
        
        // Submap views
        NavigableMap<Integer, String> headMap = map.headMap(30, false); // < 30
        NavigableMap<Integer, String> tailMap = map.tailMap(30, true); // >= 30
        NavigableMap<Integer, String> subMap = map.subMap(20, true, 40, false); // [20, 40)
        
        // Descending operations
        NavigableMap<Integer, String> descendingMap = map. descendingMap();
        var descendingKeySet = map.descendingKeySet();
        
        // Common use case: Range queries
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(85, "John");
        scores.put(92, "Jane");
        scores.put(78, "Bob");
        scores.put(88, "Alice");
        
        // Get all scores between 80 and 90
        NavigableMap<Integer, String> rangeScores = scores.subMap(80, true, 90, true);
        System.out.println(rangeScores); // {85=John, 88=Alice}
        
        // Get top 3 scores
        int count = 0;
        for (Map.Entry<Integer, String> entry : scores.descendingMap().entrySet()) {
            if (count++ == 3) break;
            System.out.println(entry. getValue() + ": " + entry.getKey());
        }
    }
}
```

---

### 🔴 Hashtable

**Definition**: Legacy synchronized hash table. Thread-safe but slower. 

**Key Characteristics**: 
- ❌ No order
- ❌ No null keys or values
- ✅ Synchronized (thread-safe)
- 📦 Legacy class (prefer ConcurrentHashMap)

```java
import java.util.Hashtable;
import java.util. Enumeration;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        
        // Adding
        table.put("Apple", 100);
        table.put("Banana", 150);
        // table.put(null, 200); // NullPointerException
        // table.put("Cherry", null); // NullPointerException
        
        // Accessing
        Integer value = table.get("Apple");
        
        // Removing
        table.remove("Banana");
        
        // Size
        int size = table.size();
        
        // Enumeration (legacy)
        Enumeration<String> keys = table.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System. out.println(key + ":  " + table.get(key));
        }
        
        Enumeration<Integer> values = table.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
        
        // Modern alternative
        // ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
    }
}
```

---

## Complete Comparison Tables

### 📊 List Implementations Comparison

| Feature | ArrayList | LinkedList | Vector | Stack |
|---------|-----------|------------|--------|-------|
| **Data Structure** | Dynamic array | Doubly linked list | Dynamic array | Extends Vector |
| **Insertion Order** | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes (LIFO) |
| **Allows Duplicates** | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Allows Null** | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Synchronized** | ❌ No | ❌ No | ✅ Yes | ✅ Yes |
| **Random Access** | ✅ Fast O(1) | ❌ Slow O(n) | ✅ Fast O(1) | ✅ Fast O(1) |
| **Insertion/Deletion (middle)** | 🐌 Slow O(n) | 🚀 Fast O(1) | 🐌 Slow O(n) | 🐌 Slow O(n) |
| **Insertion/Deletion (ends)** | 🚀 Fast O(1) | 🚀 Fast O(1) | 🚀 Fast O(1) | 🚀 Fast O(1) |
| **Memory** | Contiguous | Non-contiguous | Contiguous | Contiguous |
| **Iterator** | Fast-fail | Fast-fail | Fast-fail | Fast-fail |
| **Best For** | Random access | Frequent insert/delete | Thread-safe (legacy) | LIFO operations |
| **Worst For** | Insert/delete middle | Random access | Performance | Modern code |

### 📊 Set Implementations Comparison

| Feature | HashSet | LinkedHashSet | TreeSet |
|---------|---------|---------------|---------|
| **Data Structure** | HashMap | HashMap + LinkedList | Red-Black Tree |
| **Insertion Order** | ❌ No | ✅ Yes | ❌ No (sorted) |
| **Sorted Order** | ❌ No | ❌ No | ✅ Yes |
| **Allows Duplicates** | ❌ No | ❌ No | ❌ No |
| **Allows Null** | ✅ One null | ✅ One null | ❌ No |
| **Synchronized** | ❌ No | ❌ No | ❌ No |
| **Add/Remove/Contains** | 🚀 O(1) average | 🚀 O(1) average | 🐌 O(log n) |
| **Memory** | Less | More (linked list) | More (tree) |
| **Iterator** | Fast-fail | Fast-fail | Fast-fail |
| **Best For** | Fast lookup | Order + uniqueness | Sorted uniqueness |
| **Use Case** | Remove duplicates | Maintain order | Range operations |

### 📊 Queue Implementations Comparison

| Feature | LinkedList (Queue) | PriorityQueue | ArrayDeque |
|---------|-------------------|---------------|------------|
| **Data Structure** | Doubly linked list | Min-heap | Circular array |
| **Order** | FIFO | Priority order | FIFO/LIFO |
| **Allows Duplicates** | ✅ Yes | ✅ Yes | ✅ Yes |
| **Allows Null** | ✅ Yes | ❌ No | ❌ No |
| **Synchronized** | ❌ No | ❌ No | ❌ No |
| **Offer/Poll** | 🚀 O(1) | 🐌 O(log n) | 🚀 O(1) |
| **Peek** | 🚀 O(1) | 🚀 O(1) | 🚀 O(1) |
| **Best For** | FIFO queue | Priority-based | Stack/Queue |
| **Use Case** | BFS, task queue | Job scheduling | Most queues |

### 📊 Map Implementations Comparison

| Feature | HashMap | LinkedHashMap | TreeMap | Hashtable |
|---------|---------|---------------|---------|-----------|
| **Data Structure** | Hash table | HashMap + LinkedList | Red-Black Tree | Hash table |
| **Insertion Order** | ❌ No | ✅ Yes | ❌ No (sorted) | ❌ No |
| **Sorted Order** | ❌ No | ❌ No | ✅ Yes (by keys) | ❌ No |
| **Null Key** | ✅ One | ✅ One | ❌ No | ❌ No |
| **Null Values** | ✅ Yes | ✅ Yes | ✅ Yes | ❌ No |
| **Synchronized** | ❌ No | ❌ No | ❌ No | ✅ Yes |
| **Get/Put/Remove** | 🚀 O(1) average | 🚀 O(1) average | 🐌 O(log n) | 🚀 O(1) average |
| **Memory** | Less | More | More | Less |
| **Best For** | General use | Order + lookup | Sorted keys | Legacy thread-safe |
| **Use Case** | Most common | LRU cache | Range queries | Old code |

---

## Time Complexity Comparison

### ArrayList vs LinkedList

| Operation | ArrayList | LinkedList |
|-----------|-----------|------------|
| `get(index)` | O(1) | O(n) |
| `add(element)` at end | O(1) amortized | O(1) |
| `add(index, element)` | O(n) | O(n) |
| `addFirst(element)` | O(n) | O(1) |
| `addLast(element)` | O(1) | O(1) |
| `remove(index)` | O(n) | O(n) |
| `removeFirst()` | O(n) | O(1) |
| `removeLast()` | O(1) | O(1) |
| `contains(element)` | O(n) | O(n) |
| `iterator. remove()` | O(n) | O(1) |

### HashSet vs TreeSet

| Operation | HashSet | TreeSet |
|-----------|---------|---------|
| `add(element)` | O(1) average | O(log n) |
| `remove(element)` | O(1) average | O(log n) |
| `contains(element)` | O(1) average | O(log n) |
| `first()` / `last()` | N/A | O(log n) |
| Iteration (sorted) | N/A | O(n) |

### HashMap vs TreeMap

| Operation | HashMap | TreeMap |
|-----------|---------|---------|
| `put(key, value)` | O(1) average | O(log n) |
| `get(key)` | O(1) average | O(log n) |
| `remove(key)` | O(1) average | O(log n) |
| `containsKey(key)` | O(1) average | O(log n) |
| `firstKey()` / `lastKey()` | N/A | O(log n) |
| Iteration (sorted) | N/A | O(n) |

### Queue Operations

| Operation | LinkedList | PriorityQueue | ArrayDeque |
|-----------|-----------|---------------|------------|
| `offer(element)` | O(1) | O(log n) | O(1) |
| `poll()` | O(1) | O(log n) | O(1) |
| `peek()` | O(1) | O(1) | O(1) |
| `remove(element)` | O(n) | O(n) | O(n) |
| `contains(element)` | O(n) | O(n) | O(n) |

---
