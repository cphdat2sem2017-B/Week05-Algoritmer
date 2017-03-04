#Comparing Algorithms: Complexity Theory

## Intro

Example: Shampoo Algorithm (Dirty Hair Problem!)
5. Stop
Frequently, there may be a number of algorithms to solve the same problem. The question arises as to which one should be used. Is one algorithm better than another?

Another way of comparing algorithms is to look at the amount of space (memory) they require.

- Cheap car may consume much fuel
Each trade-off situation must be evaluated separately. You cannot tell in advance which solution is appropriate until you know the details of the situation. Thus, in advance you cannot specify the ‘best’ solution.


The actual absolute time taken to solve a problem depends

- etc


The **number of instructions will vary depending on the input**. A payroll program for 100 people will repeat more instructions than one for 10 people.


But what does differ is the number of times the loop is executed.



This is because as n grows very large, the difference between n and n/2 may will become less significant i.e. they are of the same order ( e.g. 2 billion versus 1 billion).



We can see for any two algorithms that an algorithm of O(log n ) is far superior to one of O( n ) as the following table illustrates:
---+---
  
## Binary Search Algorithm


```pascal
begin
	compute middle list
		found = true 
	else if e < middle item then
		search lower half 
	else if e > middle item then
		search upper half
The binary search (chop) algorithm is a standard algorithm for searching sorted lists. It is described in most textbooks dealing with algorithms.


10, 34, 2, 16, 23, 8, 12
```
```
2, 8, 10, 12, 16, 23, 34
```

We want to move the larger values to the end of the list. Remember we can only compare two values at any point.



We compare L[0] with L[1] swapping if L[0] > L[1] and so on as before, but this time we have only to proceed to the second last item in the list, since the last item is the largest. When we have finished, we now have the second largest item in the second last position. We have passed through the list twice.


Apply bubble sort to the list ```2,4,15,6,7,9,10``` Do you notice anything inefficient about it ?
###Complexity of Bubble Sort

algorithm | complexity
---+---

Alternatively, we can first sort the list using a sorting
