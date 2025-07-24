ArrayList <Integer> nearlySorted(int arr[], int num, int k){
        
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        
        for(int i = 0 ; i<arr.length; i++){
            q.offer(arr[i]);
            if(q.size()>k){
                list.add(q.poll());
            }
        }
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        return list;
}
