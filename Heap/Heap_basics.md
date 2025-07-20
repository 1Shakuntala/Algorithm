# Heap (Sorting)

### Time Complexity:
- From `n log n` to `n log k`

---

## Identification (Pattern)
1. `K` is given
2. Find `k` **smallest** or **largest**

---

## Two Heaps
- To find `k` smallest → use **max heap**
- To find `k` largest → use **min heap**

---

### Example: Find 3rd largest

Given:
```java
arr = [7, 10, 4, 3, 20, 15]
k = 3

→ Insert 7, 10, 4 → Min_Heap: [10, 7, 4] || k<3 ✅
→ Add 3 → Min_Heap: [10, 7, 4, 3]  || k!<3 ❌  →→ Pop 10 → Min_Heap: [7, 4, 3]  || k<3 ✅
→ Add 20 → Min_Heap: [20, 7, 4, 3] || k!<3 ❌  →→ Pop 20 → Min_Heap: [7, 4, 3]  || k<3 ✅
→ Add 10 → Min_Heap: [15, 7, 4, 3] || k!<3 ❌  →→ Pop 15 → Min_Heap: [7, 4, 3]  || k<3 ✅ 


// Max Heap
priority_queue<int> maxHeap;

// Min Heap
priority_queue<int, vector<int>, greater<int>> minHeap;

typedef pair<int, pair<int, int>> ppi;
// Use ppi instead of full type everywhere
