class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length-1]);
        arr[arr.length-1] = -1;
        for(int i = arr.length-2 ; i >= 0 ;i--)
        {
            if(stack.peek() < arr[i])
            {
                int temp = stack.pop();
                stack.push(arr[i]);
                arr[i] = temp;
                
            }
            else{
                arr[i] = stack.peek();
            }
        }

        return arr;
    }
}