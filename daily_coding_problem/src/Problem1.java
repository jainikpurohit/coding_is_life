/* Problem Statement:

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

*/

// using hashset
boolean checkSum (int[] input, int k) {
  HashSet<Integer> comp = new HashSet<>();
  
  for(int num : input){
    if(comp.contains(k - num)){
    	return true;
    }
    comp.add(num);
  }
  return false;
}


// using bst like approach
boolean hasSum(int[] input, int k){
  int i = 0;
  int j = input.length;
  
  Arrays.sort(input);
  
  while(i < j){
    if(input[i] + input[j] > k){
    	j--;
    } else if(input[i] + input[j] < k){
    	i++;
    } else {
    	return true;
    }
  }
  
  return false;
}
