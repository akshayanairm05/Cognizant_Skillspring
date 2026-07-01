# Exercise 7: Financial Forecasting

## Scenario

Develop a financial forecasting tool that predicts future values based on past growth rates using recursion.

---

## 1. Understanding Recursive Algorithms

### What is Recursion?

Recursion is a programming technique in which a method calls itself to solve a problem. Each recursive call works on a smaller part of the problem until a base condition is reached. It simplifies problems that can be divided into similar subproblems.

---

## 2. Setup

A recursive method is created to calculate the future value using:
- Current Value
- Growth Rate
- Number of Years

---

## 3. Implementation

- Implemented a recursive method to calculate the future value.
- The current value is increased by the growth rate for each recursive call.
- The recursion stops when the number of years becomes zero.

---

## 4. Analysis

### Time Complexity

The recursive method makes one recursive call for each year.

**Time Complexity:** O(n)

where **n** is the number of years.

### Optimization

The recursive solution can be optimized by:
- Using an iterative approach to avoid recursive function calls.
- Using memoization when recursive subproblems repeat.

For this problem, since each recursive call is unique, an iterative solution is generally more memory-efficient.

---

## Conclusion

This exercise demonstrates the use of recursion to calculate future financial values. The recursive approach is simple and easy to understand, while iterative methods are more suitable for larger inputs.
