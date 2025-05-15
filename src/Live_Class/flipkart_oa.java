package Live_Class;

import java.util.Scanner;
import  java.util.*;

public class flipkart_oa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            String originalString = sc.next();
            StringBuilder result = new StringBuilder();

            char[] sortedArray = originalString.toCharArray();
            Arrays.sort(sortedArray);
            String sortedString = new String(sortedArray);

            if (sortedString.equals(originalString)) {
                System.out.println(sortedString);
            } else {
                long index = -1;
                StringBuilder prefixBuilder = new StringBuilder();
                char distinctChar = 'b';

                for (int i = 0; i < n; i++) {
                    if (originalString.charAt(i) == sortedString.charAt(i)) {
                        result.append(sortedString.charAt(i));
                    } else {
                        distinctChar = sortedString.charAt(i);
                        index = i;
                        break;
                    }
                }

                prefixBuilder.append(result);
                result.append(distinctChar);

                long countOriginal = 0, countSorted = 0;

                for (int j = (int) index; j < n; j++) {
                    if (originalString.charAt(j) == distinctChar) {
                        countSorted++;
                    }
                }

                for (int j = (int) index; j < n; j++) {
                    if (originalString.charAt(j) == distinctChar) {
                        countOriginal++;
                        if (countOriginal != countSorted) {
                            result.append(originalString.charAt(j));
                        }
                    } else {
                        result.append(originalString.charAt(j));
                    }
                }

                String finalResult = result.toString();

                if (index + 1 < n && originalString.charAt((int) index + 1) == distinctChar) {
                    long flag = 0;

                    for (int j = (int) index + 1; j < n; j++) {
                        if (originalString.charAt(j) <= originalString.charAt((int) index)) {
                            prefixBuilder.append(originalString.charAt(j));
                        } else {
                            if (flag == 0) {
                                prefixBuilder.append(originalString.charAt((int) index));
                                flag = 1;
                            }
                            prefixBuilder.append(originalString.charAt(j));
                        }
                    }

                    if (flag == 0) {
                        prefixBuilder.append(originalString.charAt((int) index));
                    }

                    if (prefixBuilder.toString().compareTo(finalResult) < 0) {
                        finalResult = prefixBuilder.toString();
                    }
                }

                System.out.println(finalResult);
            }
        }

    }
}
