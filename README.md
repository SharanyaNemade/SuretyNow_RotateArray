# SuretyNow_RotateArray




A group of n children is playing a game in which they are standing in a straight line. Each child has a hoop on the floor to stand in. There are exactly as many hoops as children, hence n in total. On their shirts, each child has a number.
The game starts when the captain calls out a random number k. Each child then moves to the next hoop on their right, wrapping around to the leftmost hoop when they reach the rightmost hoop. This process is repeated k times.

Your task is to simulate this game by writing the function rotateArray. As input, you are given the number of childrenn, the value of k, and an array arr containing the numbers written on the children's shirts in their original order from left to right. The function must return an array containing the new arrangement of the children after they have completed the moves.



# Example 1

Input:

n = 5
k=2
arr = 12345

Output:
-45123

Explanation:
The value of k is 2, so each child moves 2 positions to the right in the line. The first child with number 1 moves to the position of number 3, the second child with number 2 moves to the position of number 4, and so on. The last two children with numbers 4 and 5 "go off" at the right end of the line and reappear at the left end in positions 1 and 2, respectively





Let’s treat this as what it really is: a right-rotation problem on a fixed-size array. No theatrics, just clean logic.

# Problem distilled

You have n children in a line → array of size n Each move shifts everyone one position to the right
After k moves → right rotate the array by k positions
Wrapping is allowed (circular rotation)
This is a textbook circular right shift.



Key insight (don’t overcomplicate it)

Rotating an array of length n by k steps:
Rotating by n gives the same array
So only k % n actually matters
Effective rotations = k % n


Example breakdown

Input:
n = 5
k = 2
arr = [1, 2, 3, 4, 5]


Right rotate by 2:

Take last 2 elements → [4, 5]
Put them in front
Append the remaining elements → [1, 2, 3]

Result:
[4, 5, 1, 2, 3]



Time & space efficiency

Time complexity: O(n)
Space complexity: O(n)

Deterministic, readable, and interview-safe
Executive takeaway

This problem isn’t about simulation—it’s about recognizing array rotation mechanics. Once you reduce the moves using modulo arithmetic, the solution becomes straightforward and scalable.
