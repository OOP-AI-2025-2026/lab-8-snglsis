package ua.opnu;
import java.util.Arrays;
import java.util.function.Predicate;

public class FilterUtil {
    public static <T> T[] filter(T[] input,  Predicate<T> predicate )  {
        T[] temp = (T[]) new Object[input.length];
        int size = 0;
        for (T element : input) {
            if (predicate.test(element)) {
                temp[size++] = element;
            }
        }
        return Arrays.copyOf(temp, size);
    }
}
