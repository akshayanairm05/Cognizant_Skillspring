# Exercise 2: E-commerce Platform Search Function

## Scenario

Implement the search functionality for an e-commerce platform using Linear Search and Binary Search algorithms and compare their performance.

---

## 1. Understanding Asymptotic Notation

### Big O Notation

Big O notation is used to describe the time complexity of an algorithm. It helps in analyzing how the execution time increases as the input size grows and allows comparison between different algorithms.

### Search Operation Cases

**Linear Search**
- Best Case: O(1) – Element found at the first position.
- Average Case: O(n)
- Worst Case: O(n) – Element found at the last position or not found.

**Binary Search**
- Best Case: O(1) – Element found at the middle position.
- Average Case: O(log n)
- Worst Case: O(log n)

---

## 2. Setup

A `Product` class is created with the following attributes:
- `productId`
- `productName`
- `category`

---

## 3. Implementation

- Products are stored in an array for Linear Search.
- The array is sorted using `productId` before performing Binary Search.
- Both Linear Search and Binary Search are implemented to search for a product using its `productId`.

---

## 4. Analysis

| Algorithm | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

### Suitable Algorithm

Binary Search is more suitable for an e-commerce platform because it searches efficiently in a sorted list of products. It performs faster than Linear Search for large datasets due to its logarithmic time complexity.

---

## Conclusion

This exercise demonstrates the implementation of both Linear Search and Binary Search. Binary Search provides better performance for sorted data, while Linear Search can be used when the data is unsorted.
