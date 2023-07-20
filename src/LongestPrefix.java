import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LongestPrefix {
    private Node root = new Node();

    private class Node {
        boolean isKey;
        Map<Character, Node> map;
        public Node() {
            this.isKey = false;
            this.map = new HashMap<>();
        }
    }

    public void addKey(String str) {
        Node pos = root;
        for (int i = 0; i < str.length(); i += 1) {
            char target = str.charAt(i);
            if (!pos.map.containsKey(target)) {
                Node newPos = new Node();
                if (i == str.length() - 1) {
                    newPos.isKey = true;
                }
                pos.map.put(target, newPos);
                pos = newPos;
            } else {
                if (i == str.length() - 1) {
                    pos.isKey = true;
                }
                pos = pos.map.get(target);
            }
        }
    }

    public List<String> showWords() {
        List<String> myList = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        DfsHelper(myList, sb, root);
        return myList;
    }

    private void DfsHelper(List<String> list, StringBuilder sb, Node pos) {
        if (pos.isKey) {
            list.add(sb.toString());
        }
        if (pos.map.isEmpty()) {
            return;
        }
        for (var entry: pos.map.entrySet()) {
            sb.append(entry.getKey());
            DfsHelper(list, sb, entry.getValue());
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public String LongestPrefixOf(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        Node pos = root;
        for (int i = 0; i < n; i += 1) {
            if (!pos.map.containsKey(str.charAt(i))) {
                return sb.toString();
            }
            sb.append(str.charAt(i));
            pos = pos.map.get(str.charAt(i));
        }
        return sb.toString();
    }

}
