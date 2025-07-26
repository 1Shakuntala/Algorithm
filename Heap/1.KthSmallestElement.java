public static int findKthSmallest(int[] arr, int k) {
  PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());  
  for (int num : arr) {
        maxHeap.offer(num);
        if (maxHeap.size() > k) {
             maxHeap.poll();
        }
  }
  return maxHeap.peek();
}
