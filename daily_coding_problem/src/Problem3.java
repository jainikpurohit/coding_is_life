/* Problem Statement:

Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class

class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
The following test should pass:

node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'

*/

// Better approach is to use Queue. I am planning to write a program on that too.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string using Pre order traversal.
    public String serialize(TreeNode root) {
        String serial = "";
        return serialize(root, serial);
    }
    
    public String serialize(TreeNode root, String serial){
        if(root == null){
            serial += "null,";
        } else {
            serial += root.val + ",";
            serial = serialize(root.left, serial);
            serial = serialize(root.right, serial);
        }
        return serial;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] inputs = data.split(",");
        return deserialize(inputs, new int[]{0});
    }
    
    public TreeNode deserialize(String[] nodes, int[] index){
        if(index[0] > nodes.length || "null".equals(nodes[index[0]])){
            index[0]++;
            return null;    
        }
        TreeNode root = new TreeNode(Integer.valueOf(nodes[index[0]++]));
        root.left = deserialize(nodes, index);
        root.right = deserialize(nodes, index);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
