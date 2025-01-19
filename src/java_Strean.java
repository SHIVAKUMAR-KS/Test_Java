import java.util.Arrays;
import java.util.OptionalInt;

public class java_Strean {
    public static void main(String[] args) {
        int arr[]={1,5,7,2,7};
        int sum= Arrays.stream(arr).sum();
        System.out.println(sum);

        int hashed= Arrays.stream(arr).hashCode();
        System.out.println(hashed);

        long count= Arrays.stream(arr).count();
        System.out.println(count);

        OptionalInt mx= Arrays.stream(arr).max();
        System.out.println(mx);

    }
}
