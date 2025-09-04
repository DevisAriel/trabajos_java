package Pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;;

public class prueba {

    private List<String> stringList = new ArrayList<String>();

    private Set<String> stringset = new HashSet<String>();

    private Map<Integer, String> stringMap = new HashMap<Integer, String>();
    public void Prueba() {

        stringList.add("Hola");
        stringList.add("mundo");
        stringList.add(0, "!");
        stringset.add("null");
        stringMap.put(1, "Holis");
        stringMap.get(1);

        for (String s : stringList ) {
            if (s.equals("hola")) {
                stringList.remove(s);
                break;
            }
        }

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("hola")) {
                stringList.remove(s);
                break;
            }
        }
    }
}

