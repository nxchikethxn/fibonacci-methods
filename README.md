# fibonacci-methods

The following project was coded in Java and demonstrates knowledge of 
recursive and iterative methods.

1. class *FibonacciSeq*: The following program was written in both iterative and recursive approaches.
These methods print out the 𝑛𝑡ℎ Fibonacci element (not the whole sequence). The efficiency of the two
methods in terms of Time Complexity and type the Big-O notation are written into the code as comments.
Both approaches are printed in the main method.

2. class *fibMethods*: Based on the class above, I further developed a program that adds each Fibonacci
number(starting from 0, 1) to a list(an array), and can perform remove, ifContains, grab, and
numItems operations. These operations are explained below and in the code.
* add(int item): adds a number to the list (allow to add duplicates)
* remove(int item): removes the item (if exists) from the list
* ifContains(int item): checks if the item exists in the list
* grab(): randomly draws a number from the list without removing
* numItems(): prints out the number of unique items in the list (without duplicates)
