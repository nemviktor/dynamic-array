# Project: Structures - Dynamic array

## Story

In computer science, a _dynamic array_, **growable array, resizable array, dynamic table, mutable array, or array list** is a random access, variable-size list data structure that allows elements to be added or removed. It is supplied with standard libraries in many modern mainstream programming languages. Dynamic arrays overcome a limit of static arrays, which have a fixed capacity that needs to be specified at allocation.

A dynamic array is not the same thing as a dynamically allocated array, which is an array whose size is fixed when the array is allocated, although a dynamic array may use such a fixed-size array as a back end.

On the average, a well-implemented and properly used dynamic array has the following time complexity characteristics:

- _get_ a value by index: `O(1)`
- _insert/delete_ value at the end: `O(1)`
- _insert/delete_ value in the middle: `O(n)`

Many programming languages have dynamic array as a data type and this is the reason to get familiar with it.
For example Java's _ArrayList<>_, python's _list_ or _List<>_ in C# are both dynamic arrays.
