import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Richard Ludwig
 * @version 1.0
 * Classe com metódos para manipulação de Strings.
 */
public class MyString{
    public static String month(int a){
        String[] r = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        return r[a];
    }
    public static String dayOfWeek(int a){
        String[] r = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return r[a];
    }
    public static String[] orderAlfabethically(String[] a, boolean allowDuplicity){
        String[] result;
        ArrayList<String> b = new ArrayList<>();
        for (String element : a){
            b.add(element);
        }
        if(allowDuplicity){
            Collections.sort(b);
            result = new String[b.size()];
            for (int i=0; i<b.size(); i++){
                result[i]=b.get(i);
            }
        }
        else{
            String actual;
            for (int i =0; i<a.length; i++){
                actual=a[i];
                for (int j = 1; j<a.length; i++){
                    if(actual.equals(a[j])){
                        a
                    }
                }
            }

        }
        return result;
    }
    public static String[] orderAlfabethically(String[] a){
        return orderAlfabethically(a, true);
    }
}
