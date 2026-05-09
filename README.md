# Assignment 4

## A. Project Overview

A graph is a structure of vertices (nodes) and edges (connections).  
In this project, the graph is implemented using an adjacency list.

Two algorithms are used:
- BFS (Breadth-First Search) — explores level by level
- DFS (Depth-First Search) — goes deep before backtracking

---

## B. Class Descriptions

### Vertex
Stores vertex id.

### Edge
Represents connection between two vertices.

### Graph
Stores graph using adjacency list.

Methods:
- addVertex()
- addEdge()
- printGraph()
- bfs()
- dfs()

### Adjacency List
Each vertex has a list of its neighbors.  
Efficient for memory.

---

## C. Algorithm Descriptions

### BFS
Steps:
1. Start from node
2. Use queue
3. Visit neighbors level by level

Use cases:
- Shortest path
- Level traversal

Time: O(V + E)

---

### DFS
Steps:
1. Start from node
2. Use recursion
3. Go deep, then backtrack

Use cases:
- Cycle detection
- Path search

Time: O(V + E)

---

## D. Experimental Results

| Size | BFS (ns) | DFS (ns) |
|------|----------|----------|
| 10   | 524333   | 108708   |
| 30   | 160958   | 466750   |
| 100  | 556416   | 750416   |

Observations:
- Time increases with size
- BFS and DFS are similar
- Matches O(V + E)

---

## E. Screenshots

![Снимок экрана 2026-05-09 в 15.09.53.png](docs/screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-05-09%20%D0%B2%2015.09.53.png)\
![Снимок экрана 2026-05-09 в 15.10.07.png](docs/screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-05-09%20%D0%B2%2015.10.07.png)\
![Снимок экрана 2026-05-09 в 15.10.23.png](docs/screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-05-09%20%D0%B2%2015.10.23.png)

---

## F. Reflection

I learned how graphs work and how BFS and DFS operate.  
BFS is better for shortest paths, DFS for deep search.

Main difficulty was handling visited nodes and organizing code.