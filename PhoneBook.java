import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public Map<String, List<String>> getPhoneBook() {
        return phoneBook;
    }

    Map<String, List<String>> phoneBook = new HashMap<>();

   

    public String sort() {
        Map<Integer, List<Map.Entry>> sortedTree = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, List<String>> map : phoneBook.entrySet()) {
            if (sortedTree.containsKey(map.getValue().size())) {
                sortedTree.get(map.getValue().size()).add(map);
            } else {
                List<Map.Entry> hashList = new LinkedList<>();
                hashList.add(map);
                sortedTree.put(map.getValue().size(), hashList);
            }
        }
        
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<Integer, List<Map.Entry>> map : sortedTree.entrySet()) {
            for (Map.Entry entry : map.getValue()) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(", Телефон: ");
                List<String> values = (List<String>) entry.getValue();
                boolean temp = false;
                for (String value : values) {
                    if (temp) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(value);
                    temp = true;
                }

                stringBuilder.append("\n");
            }

        }
        return stringBuilder.toString();
    }


    public void contactAdd(String name, String phone) {
        if (this.phoneBook.containsKey(name)) {
            if (!this.phoneBook.get(name).contains(phone)) {
                phoneBook.get(name).add(phone);
            }
        } else {
            LinkedList list = new LinkedList();
            list.add(phone);
            this.phoneBook.put(name, list);
        }
    }

    

}