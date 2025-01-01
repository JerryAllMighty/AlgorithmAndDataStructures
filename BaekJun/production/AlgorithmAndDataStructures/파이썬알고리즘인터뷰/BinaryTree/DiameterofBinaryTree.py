from collections import deque


class TreeNode:
    def __init__(self, val, left, right):
        self.val = val
        self.left = left
        self.right = right

def diameterOfBinaryTree(root):
    q = deque([root])
    idx = 0
    while idx == len(root):
        node = q.popleft()
        curr_Node = TreeNode(node)
        curr_Node.left = root[idx+1]
        curr_Node.right = root[idx+2]
        q.append(curr_Node)
        idx += 1

    while :
        curr_Node = q.popleft()





print(diameterOfBinaryTree([1,2,3,4,5]))