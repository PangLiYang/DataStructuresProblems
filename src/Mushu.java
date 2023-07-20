import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Mushu<T> {
    private Node root;

    private class Node {
        public T item;
        public ArrayList<Node> children;
    }

    public Node getAncestor (int k, Node target) {
        List<Node> list = new LinkedList<>();
        ancestorHelper(root, target, list);
        return list.get(list.size() - 1 - k);
    }

    private boolean ancestorHelper(Node current, Node target, List<Node> list) {
        list.add(current);
        if (current == target) {
            return true;
        }
        for (Node child: current.children) {
            if (ancestorHelper(child, target, list)) {
                return true;
            }
        }
        list.remove(current);
        return false;
    }
}