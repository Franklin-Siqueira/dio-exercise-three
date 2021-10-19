package one.innovation.digital.collections.listslinkedlists;

import java.util.*;

public class ListSample {
    public static void main(String[] args) {
        // Given a alumni grades list with 7 elements: [7, 8.5, 9.3, 5, 7, 0, 3.6], try:
        /*
        List grades = new ArrayList(); // before java 5
        ArrayList<Double> grades = new ArrayList<>();
        List<Double> grades = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*
        List<Double> grades = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        grades.add(10d);
        System.out.println(grades);
        */
        /*
        List<Double> grades = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        // Error
        grades.add(1d);
        grades.remove(5d);
        System.out.println(grades);
        */
        System.out.println("Begin processing...\n");
        System.out.println("Create a List and add 7 grades:");
        // Generics(jdk 5) - Diamond Operator(jdk 7)
        List<Double> gradesNewListInstance = new ArrayList<>();
        gradesNewListInstance.add(7.0);
        gradesNewListInstance.add(8.5);
        gradesNewListInstance.add(9.3);
        gradesNewListInstance.add(5.0);
        gradesNewListInstance.add(7.0);
        gradesNewListInstance.add(0.0);
        gradesNewListInstance.add(3.6);
        //
        System.out.println(gradesNewListInstance.toString());
        System.out.printf("Show grade 5.0 index position: % 2d \n", gradesNewListInstance.indexOf(5d));
        //
        System.out.println("Add grade 8.0 to the List at 4th index position: ");
        gradesNewListInstance.add(4, 8d);
        System.out.println(gradesNewListInstance);
        // Change a specific value
        System.out.println("Grade substitution: grade 5.0 now 6.0: ");
        gradesNewListInstance.set(gradesNewListInstance.indexOf(5d), 6.0);
        System.out.println(gradesNewListInstance);
        // Get element with a specific value
        System.out.printf("Grade 5.0 is on the List: %s \n", gradesNewListInstance.contains(5d));
        /*
        // With an inline for loop
        System.out.println("Show all grades in input order: ");
        for (Double grade : gradesNewListInstance) System.out.printf("Grade: % 2d \n", grade);
        */
        // Get element at index position (beginning at 0 - standard)
        System.out.printf("Show 3rd grade: % .2f \n", gradesNewListInstance.get(2));
        // Unnecessary call to toString() method
        System.out.printf("Grades: %s \n", gradesNewListInstance.toString());
        System.out.printf("Show lower grade: % .2f \n", Collections.min(gradesNewListInstance));
        System.out.printf("Show higher grade: % .2f \n", Collections.max(gradesNewListInstance));
        // Iteration 1
        Iterator<Double> iteratorInstance = gradesNewListInstance.iterator();
        Double sum = 0d;
        while(iteratorInstance.hasNext()){
            Double next = iteratorInstance.next();
            sum += next;
        }
        System.out.printf("Sum of all values: % .2f \n", sum);
        System.out.printf("Average of all values: % .2f \n", (sum/gradesNewListInstance.size()));
        System.out.println("Remove grade 0: ");
        gradesNewListInstance.remove(0d);
        System.out.println(gradesNewListInstance);
        System.out.println("Remove grade at index 0");
        gradesNewListInstance.remove(0);
        System.out.println(gradesNewListInstance);
        System.out.println("Remove grades below 7.0 and print List: ");
        // Iteration 2
        /*
        while(newIteratorInstance.hasNext()) {
            Double next = newIteratorInstance.next();
            if(next < 7) newIteratorInstance.remove();
        }*/
        // More adequate and elegant way
        gradesNewListInstance.removeIf(next -> next < 7);
        System.out.println(gradesNewListInstance);
        /*
        // Exercise
        System.out.println("Remove gradesNewListInstance List contents");
        gradesNewListInstance.clear();
        System.out.println(gradesNewListInstance);
        */
        System.out.printf("Check: gradesNewListInstance List is empty (boolean): %s\n", gradesNewListInstance.isEmpty());
        // Exercise
        /*
        // Solve the following exercise employing LinkedList methods:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        */
        // First approach
        // LinkedList<Double> gradesLinkedListInstance = new LinkedList<>();
        // gradesLinkedListInstance.addAll(gradesNewListInstance);
        // Better approach
        System.out.println("Create a LinkedList and populate it with gradesNewListInstance:");
        LinkedList<Double> gradesLinkedListInstance = new LinkedList<>(gradesNewListInstance);
        System.out.printf("New LinkedList from gradesLinkedListInstance: %s\n", gradesLinkedListInstance);
        System.out.printf("Show first grade in the Linked list: % .2f\n", gradesLinkedListInstance.get(0));
        Double firstElement = gradesLinkedListInstance.poll();
        System.out.printf("Show first element and remove, after removing it: % .2f\n", firstElement);
        // Finally show resulting LinkedList
        System.out.printf("Resulting LinkedList: %s\n", gradesLinkedListInstance);
        // End
        System.out.println("End processing...\n");
    }
}
