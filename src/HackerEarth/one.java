//package HackerEarth;
//
//import java.util.*;
//
//
//public class one {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<String> lines = new ArrayList<>();
//
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine().trim();
//            if (line.isEmpty()) break;
//            lines.add(line);
//        }
//
//        sc.close();
//        checkScope(lines);
//    }
//
//    public static void checkScope(List<String> lines) {
//        Deque<Map<String, Integer>> scopeStack = new ArrayDeque<>();
//        scopeStack.push(new HashMap<>()); // Global Scope
//
//        for (String line : lines) {
//            line = line.trim();
//
//            if (line.equals("{")) {
//                scopeStack.push(new HashMap<>()); // New local scope
//            } else if (line.equals("}")) {
//                if (!scopeStack.isEmpty()) scopeStack.pop(); // Remove local scope
//            } else if (line.startsWith("var ")) {
//                // Variable declaration
//                String[] parts = line.substring(4).split("=");
//                if (parts.length == 2) {
//                    String varName = parts[0].trim();
//                    int value = Integer.parseInt(parts[1].replace(";", "").trim());
//                    if (!scopeStack.peek().containsKey(varName)) {
//                        scopeStack.peek().put(varName, value);
//                    }
//                }
//            } else if (line.startsWith("print(") && line.endsWith(");")) {
//                // Print statement
//                String varName = line.substring(6, line.length() - 2).trim();
//                Integer value = null;
//
//                for (Map<String, Integer> scope : scopeStack) {
//                    if (scope.containsKey(varName)) {
//                        value = scope.get(varName);
//                        break;
//                    }
//                }
//
//                if (value != null) {
//                    System.out.println(value);
//                } else {
//                    System.out.println("undefined");
//                }
//            }
//        }
//    }
//}
