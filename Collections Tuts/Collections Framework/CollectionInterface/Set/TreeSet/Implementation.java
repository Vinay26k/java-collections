import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
// comparator
class Implementation{
    public static void main(String[] args) {
        Set<Integer> tree = new TreeSet<>();
        tree.add(8);
        tree.add(9);
        tree.add(4);
        tree.add(5);
        System.out.println("Treeset : "+ tree);

        //
        Set<Integer> tree1 = ascendingTree();
        System.out.println("Treeset : "+ tree1);

        //
        Set<Integer> tree2 = descendingTree();
        System.out.println("Treeset : "+ tree2);
    }
    public static Set<Integer> ascendingTree() {
        Set<Integer> tree = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2){
                return o1.compareTo(o2);
            }
        });
        tree.add(3);
        tree.add(1);
        tree.add(2);
        return tree;
    }
    public static Set<Integer> descendingTree() {
        Set<Integer> tree = new TreeSet<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1);
            }
        });
        tree.add(3);
        tree.add(1);
        tree.add(2);
        return tree;
    }
}