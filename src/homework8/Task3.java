package homework8;

import java.util.HashMap;
import java.util.Map;

/*
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */
public class Task3 {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();

        for (String str : strings) {
            if (result.containsKey(str)) {
                result.put(str, true);
            } else {
                result.put(str, false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] arr = {"a", "cc", "a", "bb", "b", "ff", "bb", "ff"};
        System.out.println(wordMultiple(arr));
    }
}

