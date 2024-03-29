class GfG {
    int maxLen(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int res = 0, sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(map.containsKey(sum))
                res = Math.max(res, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return res;
    }
}
