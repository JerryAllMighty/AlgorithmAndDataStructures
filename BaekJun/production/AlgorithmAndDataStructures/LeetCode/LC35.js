/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
 var searchInsert = function(nums, target) {
  answer = nums.indexOf(target)  
  if (answer === -1){
      return getSuitablePlace(nums, target)
  }
  else{ return answer}
};

var getSuitablePlace = function(nums, target){
  answer = -1
  for(var i = 0; i < nums.length; i++){
      if (nums[i]> target){
          answer = i
          return answer
      }
  }
  if (answer === -1){return nums.length}
}