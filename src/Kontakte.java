import java.util.HashMap;
import java.util.Map;

public class Kontakte {

    private Node root;

    private class Node {
        public int numOfWords;
        public Map<Character, Node> children;

        public Node() {
            numOfWords = 0;
            children = new HashMap<>();
        }
    }

    public Kontakte() {
        this.root = new Node();
    }

    public void addName(String name) {
        Node current = root;
        for (int i = 0; i < name.length(); i++) {
            if (!current.children.containsKey(name.charAt(i))) {
                Node n = new Node();
                current.children.put(name.charAt(i), n);
            }
            current = current.children.get(name.charAt(i));
            current.numOfWords++;
        }
    }

    public int countPartial(String p) {
        Node current = root;
        for (int i = 0; i < p.length(); i++) {
            if (current.children.containsKey(p.charAt(i))) {
                current = current.children.get(p.charAt(i));
            } else {
                return 0;
            }
        }
        return current.numOfWords;
    }
}
