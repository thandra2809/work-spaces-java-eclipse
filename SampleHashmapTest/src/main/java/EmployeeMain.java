import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeMain {

    public static void main(String[] args) {

        String matchValue = "4";
        boolean foundMatchValue = false;

        Employee e1 = new Employee("1", "Srini", 38, "Software Engineer-1");
        Employee e2 = new Employee("2", "Priya", 32, "Software Engineer-2");
        Employee e3 = new Employee("3", "Sheryus", 3, "Software Engineer-3");
        Employee e4 = new Employee("4", "Lakshmi", 3, "Software Engineer-3");
        Employee e5 = new Employee("5", "Venkat", 3, "Software Engineer-3");

        HashMap map = new HashMap();

        map.put("1", e1);
        map.put("2", e2);
        map.put("3", e3);
        map.put("4", e4);
        map.put("5", e5);

        Iterator employeeKeySet = map.keySet().iterator();


        while (employeeKeySet.hasNext()) {
            String keyValue = employeeKeySet.next().toString();
            System.out.println(keyValue);
            System.out.println(map.get(keyValue));

          /*  if(keyValue.equals(matchValue)){
                foundMatchValue = true;
            }*/

            if (foundMatchValue) {
                employeeKeySet.remove();
            } else {
                if (keyValue.equals(matchValue)) {
                    foundMatchValue = true;
                }

            }

        }

        System.out.println("This is the size::: "+map.toString());


    }
}
