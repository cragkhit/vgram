package trie;

import java.util.HashMap;
/***
 * Copied from http://www.programcreek.com/2014/05/leetcode-implement-trie-prefix-tree-java/
 */
class TrieNode {
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf;

    public TrieNode() {}

    public TrieNode(char c){
        this.c = c;
    }
}