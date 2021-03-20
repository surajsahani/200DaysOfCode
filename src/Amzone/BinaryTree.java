package Amzone;

import java.util.Map;

//105. Construct Binary Tree from Preorder and Inorder Traversal
//Medium
//
//4875
//
//124
//
//Add to List
//
//Share
//Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
//
// 
//
//Example 1:
//
//
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
//Example 2:
//
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
//Constraints:
//
//1 <= preorder.length <= 3000
//inorder.length == preorder.length
//-3000 <= preorder[i], inorder[i] <= 3000
//preorder and inorder consist of unique values.
//Each value of inorder also appears in preorder.
//preorder is guaranteed to be the preorder traversal of the tree.
//inorder is guaranteed to be the inorder traversal of the tree.

class Solution {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public TreeNode preIn(int[] pre, int sp, int ep, int[] in, int si, int ei) {
        if (si > ei || sp > ep) {
            return null;
        }
        TreeNode root = new TreeNode(pre[sp]);
        int idx = map.get(pre[sp]);
        // int idx = si;
        // while (pre[sp] != in[idx]) {
        //     if (pre[sp] == in[idx])
        //         break;
        //     idx++;
        // }
        int count = idx - si;
        
        root.left = preIn(pre, sp + 1, sp + count, in, si, idx - 1);
        root.right = preIn(pre, sp + count + 1, ep, in, idx + 1, ei);
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length <= 1) {
            if (preorder.length == 0) {
                return null;
            }
            return new TreeNode(inorder[0]);
        }
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return preIn(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
}
C++

class Solution {
public:
    unordered_map<int, int> map;
    TreeNode* preIn(vector<int>& pre, int ps, int pe, vector<int>& in, int is, int ie) {
        if (is > ie || ps > pe) {
            return NULL;
        }
        TreeNode* root = new TreeNode(pre[ps]);
        int idx = map.at(pre[ps]);
        int count = idx - is;
        root->left = preIn(pre, ps + 1, ps + count, in, is, idx - 1);
        root->right = preIn(pre, ps + count + 1, pe, in, idx + 1, ie);
        return root;
    }
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        if (inorder.size() <= 1) {
            if (inorder.size() == 0) {
                return NULL;
            }
            return new TreeNode(preorder[0]);
        }
        for (int i = 0; i < inorder.size(); i++) {
            map[inorder[i]] = i;
        }
        return preIn(preorder, 0, preorder.size() - 1, inorder, 0, inorder.size() - 1);
    }
};
Javascript

let map = new Map();
var buildTree = function(preorder, inorder) {
    function preIn(pre, ps, pe, ino, is, ie) {
        if (ps > pe || is > ie)
            return null;
        var root = new TreeNode(pre[ps]);
        var idx = map.get(pre[ps]);
        var count = idx - is;
        
        root.left = preIn(pre, ps + 1, ps + count, ino, is, idx - 1);
        root.right = preIn(pre, ps + count + 1, pe, ino, idx + 1, ie);
        return root;
    }
    if (inorder.length <= 1) {
        if (inorder.length == 0) {
            return null;
        }
        return new TreeNode(preorder[0]);
    }
    for (let i = 0; i < inorder.length; i++) {
        map.set(inorder[i], i);
    }
    return preIn(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
};