import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTestMain {


    public static void main(String[] args) {

        Employee e1 = new Employee("1", "Srini", 38, "Software Engineer-1");
        Employee e2 = new Employee("2", "Priya", 32, "Software Engineer-2");
        Employee e3 = new Employee("3", "Sheryus", 3, "Software Engineer-3");
        Employee e4 = new Employee("4", "Lakshmi", 3, "Software Engineer-3");
        Employee e5 = new Employee("5", "Venkat", 3, "Software Engineer-3");

        String matchValue = "3";
        boolean foundMatchValue = false;

        List employeeList = new ArrayList(Arrays.asList(e1,e2,e3,e4,e5));

        Iterator<Employee> listIterator = employeeList.iterator();

        while(listIterator.hasNext()){

            Employee e = listIterator.next();

            if (foundMatchValue) {
                listIterator.remove();
            }else{

                if (e.getId().equals(matchValue)) {
                    foundMatchValue = true;
                }

            }

            System.out.println(e.getId());

        }

        System.out.println("List of Employees"+ employeeList.toString());

    }


}
