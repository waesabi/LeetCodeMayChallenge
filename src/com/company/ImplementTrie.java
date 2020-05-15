package com.company;

/*
    Accepted
 */
public class ImplementTrie {
    boolean isEndOfWord;
    ImplementTrie[] children;

    /** Initialize your data structure here. */
    public ImplementTrie() {
        isEndOfWord = false ;
        children = new ImplementTrie[26];
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        int len = word.length();
        ImplementTrie demo = this;
        for (int i = 0; i < len; i++) {
            int val = word.charAt(i) - 'a';
            if (demo.children[val] == null) {
                demo.children[val] = new ImplementTrie();
            }
            demo = demo.children[val];
        }
        demo.isEndOfWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        int len = word.length();
        ImplementTrie demo = this;
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i) - 'a';
            if (demo.children[index] == null) {
                return false;
            }
            demo = demo.children[index];
        }
        return (demo != null && demo.isEndOfWord);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        int len = prefix.length();
        ImplementTrie demo = this;
        for (int i = 0; i < len; i++) {
            int index = prefix.charAt(i) - 'a';
            if (demo.children[index] == null) {
                return false;
            }
            demo = demo.children[index];
        }
        return (demo != null);
    }

    public static void main(String[] args) {
        String[] arr = {"Trie","insert","insert","insert","insert","insert","insert","search","search","search",
                "search",
                "search",
            "search","search","search","search","startsWith","startsWith","startsWith","startsWith","startsWith",
                "startsWith","startsWith","startsWith","startsWith"};
        String[][] action = {{},{"app"},{"apple"},{"beer"},{"add"},{"jam"},{"rental"},{"apps"},{"app"},{"ad"},{
            "applepie"},{
            "rest"},{
            "jan"},{"rent"},{"beer"},{"jam"},{"apps"},{"app"},{"ad"},{"applepie"},{"rest"},{"jan"},{"rent"},{"beer"},
                {"jam"}};
        ImplementTrie trie = new ImplementTrie();
        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            String value = action[i][0];
            if (temp.equals("insert")) {
                trie.insert(value);
            }
            if (temp.equals("search")) {
                System.out.println(trie.search(value));
            }
            if (temp.equals("startsWith")) {
                System.out.println(trie.startsWith(value));
            }
        }
    }
}
