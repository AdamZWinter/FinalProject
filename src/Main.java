import edu.greenriver.sdev333.BSTSet;
import edu.greenriver.sdev333.MathSet;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Adam Winter
 */
public class Main {
    public static void main(String[] args) {

            MathSet<String> set = new BSTSet<>();
            set.add("one");
            set.add("two");
            Iterable<String> keys = set.keys();
            Iterator itr = keys.iterator();
            assertEquals("one", itr.next());  //o before t
            assertEquals("two", itr.next());

            set.add("one");
            set.add("two");
            set.add("three");
            set.add("four");
            assertEquals(true, set.contains("three"));
            assertEquals(false, set.contains("five"));


            assertEquals(false, set.isEmpty());

            set.add("one");
            set.add("two");
            set.add("three");
            set.add("four");
            assertEquals(4, set.size());

            MathSet<String> other = new BSTSet<>();
            other.add("five");
            other.add("six");
            other.add("seven");
            other.add("eight");
            MathSet<String> union = set.union(other);
            Iterable<String> keys2 = union.keys();
            Iterator itr2 = keys2.iterator();
            assertEquals("eight", itr2.next());    // eight five four one seven six three two
            assertEquals("five", itr2.next());
            itr2.next();
            itr2.next();
            itr2.next();
            itr2.next();
            itr2.next();
            assertEquals("two", itr2.next());

            MathSet<String> set3 = new BSTSet<>();
            set3.add("one");
            set3.add("two");
            set3.add("three");
            set3.add("four");
            MathSet<String> other3 = new BSTSet<>();
            other3.add("three");
            other3.add("four");
            other3.add("seven");
            other3.add("eight");
            MathSet<String> intersection = set3.intersection(other3);
            Iterable<String> keys3 = intersection.keys();
            Iterator itr3 = keys3.iterator();
            assertEquals("four", itr3.next());
            assertEquals("three", itr3.next());


            MathSet<String> set4 = new BSTSet<>();
            set4.add("one");
            set4.add("two");
            set4.add("three");
            set4.add("four");
            MathSet<String> other4 = new BSTSet<>();
            other4.add("three");
            other4.add("four");
            other4.add("seven");
            other4.add("eight");
            MathSet<String> diff = set4.difference(other4);
            Iterable<String> keys4 = diff.keys();
            Iterator itr4 = keys4.iterator();
            assertEquals("one", itr4.next());
            assertEquals("two", itr4.next());



    }
}