![Alt text](img/lotussm.png)
# 5th week of the 2nd semester
Topics: Algorithms, Recursion, Collections and Complexity



## Day 1 - Collections and efficiency
The goal is to get an understanding of how one views efficiency of computer programs. 

### Readings:

* [Theory of algorithms & big-O notation](study/complexity.md)

An alternative document to read wich covers approximately the same curriculum is [Peter Sestofts note on Search and Sort](study/SestoftSearchAndSort.pdf)

### Exercises:
* [Exercises](study/day1exercises.md)

## Day 2 - Recursion & binary trees
The goal is to be able to work with recursion - and in particular exemplified by binary trees.


### Readings:
The video's from Lynda.com gives the basics.

* [Binary tree](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Introduction-tree-data-structures/149042/177132-4.html?org=cphbusiness.dk) and [Binary Search Tree](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Understanding-binary-search-trees-BST/149042/177133-4.html?org=cphbusiness.dk) are well explained in these two sections at Linda.com

### Exercises:
* [Exercises from day 2](study/day2exercises.md)

### Demo code
Pytontutor.com has some tools for visualizing program executions. [This link should show our binary search tree.](http://pythontutor.com/java.html#code=public%20class%20YourClassNameHere%20%7B%0Apublic%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%09%09BinaryTree%20bt%20%3D%20new%20BinaryTree%28%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20bt.insert%282%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20bt.insert%281%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20bt.insert%283%29%3B%0A%09%09%0A%09%09boolean%20res%20%3D%20bt.lookup%282%29%3B%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A%09%09System.out.println%28res%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20res%20%3D%20bt.lookup%284%29%3B%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20System.out.println%28res%29%3B%0A%0A%09%09//int%20min%20%3D%20bt.minValue%28%29%3B%0A%09%09//System.out.println%28min%29%3B%0A%0A%09%7D%0A%7D%0A%0A%0Aclass%20BinaryTree%20%0A%7B%0A%09//%20Root%20node%20pointer.%20Will%20be%20null%20for%20an%20empty%20tree.%0A%09private%20Node%20root%3B%0A%09/*%0A%09--Node--%0A%09The%20binary%20tree%20is%20built%20using%20this%20nested%20node%20class.%0A%09Each%20node%20stores%20one%20data%20element,%20and%20has%20left%20and%20right%0A%09sub-tree%20pointer%20which%20may%20be%20null.%0A%09The%20node%20is%20a%20%22dumb%22%20nested%20class%20--%20we%20just%20use%20it%20for%0A%09storage%3B%20it%20does%20not%20have%20any%20methods.%0A%09%20*/%0A%09private%20class%20Node%20%7B%0A%09%09Node%20left%3B%0A%09%09Node%20right%3B%0A%09%09int%20data%3B%0A%09%09Node%28int%20newData%29%20%7B%0A%09%09%09left%20%3D%20null%3B%0A%09%09%09right%20%3D%20null%3B%0A%09%09%09data%20%3D%20newData%3B%0A%09%09%7D%0A%09%7D%0A%09/**%0A%09Creates%20an%20empty%20binary%20tree%20--%20a%20null%20root%20pointer.%0A%09%20*/%0A%09public%20BinaryTree%28%29%20%7B%0A%09%09root%20%3D%20null%3B%0A%09%7D%0A%09%0A%09/**%0A%09Returns%20true%20if%20the%20given%20target%20is%20in%20the%20binary%20tree.%0A%09Uses%20a%20recursive%20helper.%0A%09%20*/%0A%09public%20boolean%20lookup%28int%20data%29%20%7B%0A%09%09return%28lookup%28root,%20data%29%29%3B%0A%09%7D%0A%09%0A%09/**%0A%09Recursive%20lookup%20--%20given%20a%20node,%20recur%0A%09down%20searching%20for%20the%20given%20data.%0A%09%20*/%0A%09private%20boolean%20lookup%28Node%20node,%20int%20data%29%20%7B%0A%09%09if%20%28node%3D%3Dnull%29%20%7B%0A%09%09%09return%28false%29%3B%0A%09%09%7D%0A%09%09if%20%28data%3D%3Dnode.data%29%20%7B%0A%09%09%09return%28true%29%3B%0A%09%09%7D%0A%09%09else%20if%20%28data%3Cnode.data%29%20%7B%0A%09%09%09return%28lookup%28node.left,%20data%29%29%3B%0A%09%09%7D%0A%09%09else%20%7B%0A%09%09%09return%28lookup%28node.right,%20data%29%29%3B%0A%09%09%7D%0A%09%7D%0A%09%0A%09/**%0A%09Inserts%20the%20given%20data%20into%20the%20binary%20tree.%0A%09Uses%20a%20recursive%20helper.%0A%09%20*/%0A%09public%20void%20insert%28int%20data%29%20%7B%0A%09%09root%20%3D%20insert%28root,%20data%29%3B%0A%09%7D%0A%09%0A%09/**%0A%09Recursive%20insert%20--%20given%20a%20node%20pointer,%20recur%20down%20and%0A%09insert%20the%20given%20data%20into%20the%20tree.%20Returns%20the%20new%0A%09node%20pointer%20%28the%20standard%20way%20to%20communicate%0A%09a%20changed%20pointer%20back%20to%20the%20caller%29.%0A%09%20*/%0A%09private%20Node%20insert%28Node%20node,%20int%20data%29%20%7B%0A%09%09if%20%28node%3D%3Dnull%29%20%7B%0A%09%09%09node%20%3D%20new%20Node%28data%29%3B%0A%09%09%7D%0A%09%09else%20%7B%0A%09%09%09if%20%28data%20%3C%3D%20node.data%29%20%7B%0A%09%09%09%09node.left%20%3D%20insert%28node.left,%20data%29%3B%0A%09%09%09%7D%0A%09%09%09else%20%7B%0A%09%09%09%09node.right%20%3D%20insert%28node.right,%20data%29%3B%0A%09%09%09%7D%0A%09%09%7D%0A%09%09return%28node%29%3B%20//%20in%20any%20case,%20return%20the%20new%20pointer%20to%20the%20caller%0A%09%7D%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%0A%09%0A%09%0A%09%0A%09%0A%09%0A%0A%0A%0A%7D&cumulative=false&curInstr=1&heapPrimitives=false&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false)

## Day 3 - Recursive sorting algorithms
Sorting is one of the most important fundamental issues in computing - we will look at some of the recursive sorting algorithms.
In particular we will look at merge sort and quick sort.

### Readings for quicksort

* [Slides](slides/day3Rekursive sorting algorithms.pptx)
* [Animation](http://me.dt.in.th/page/Quicksort/)

### Readings for mergesort

* [Slides](slides/day3Rekursive sorting algorithms.pptx)
* [Animation](http://visualgo.net/sorting) - pick merge sort

## Day 4 - Hashing & Recap
Today we will work on a few more algorithms and datastructures to ground the previous few days.

### Readings
* [Hashing & Hashmaps](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Using-associative-arrays/149042/177125-4.html?org=cphbusiness.dk) - this section and the next two (three sections total "Using associative arrays", "Understanding hash functions" and "Using hash tables").

### Exercises
* [Exercises for day4](study/day4exercises.md)
* [Extra hard exercises](study/day4red.md)
 

##Day 5 - [Studypoint exercise](study/day5StudypointExercise.md)


