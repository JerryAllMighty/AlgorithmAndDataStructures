graph = {
    1: [2, 3, 4],
    2: [5],
    3: [5],
    4: [],
    5: [6, 7],
    6: [],
    7: [3],
}

def dfs_recursive(node, visited):
    visited.append(node)

    for adj in graph[node]:
        if adj not in visited:
            dfs_recursive(adj, visited)

    return visited


def dfs_stack(start):
    visited = []
    stack = [start]
    while stack:
        top = stack.pop()
        visited.append(top)
        for adj in graph[top]:
            if adj not in visited:
                stack.append(adj)

    return visited

assert dfs_recursive(1, []) == [1, 2, 5, 6, 7, 3, 4]
assert dfs_stack(1) == [1, 4, 3, 5, 7, 6, 2]