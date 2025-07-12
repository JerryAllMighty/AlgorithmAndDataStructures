# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def bfs(node: TreeNode, lev):
            if not node:
                return lev - 1

            left = bfs(node.left, lev + 1)
            right = bfs(node.right, lev + 1)

            return max(left, right)

        return bfs(root, 1)