public class LogicalOperators {
    public static void main(String[] args) {
        
        System.out.printf("%s%n%s:%b%n%s:%b%n%s:%b%n%s:%b%n%n",
"Conditional AND (&&)", "false && false", (false && false),
        "false && true", (false && true),
        "true && false", (true && false),
        "true && true", (true && true));
        
        System.out.printf("%s%n%s:%b%n%s:%b%n%s:%b%n%s:%b%n%n",
"Conditional OR (II)", "false || false", (false || false),
        "false || true", (false || true),
        "true || false", (true || false),
        "true || true", (true || true));

        System.out.printf("%s%n%s:%b%n%s:%b%n%s:%b%n%s:%b%n%n",
"Boolean Logical AND (&)", "false & false", (false & false),
        "false & true", (false & true),
        "true & false", (true & false),
        "true & true", (true & true));

        System.out.printf("%s%n%s:%b%n%s:%b%n%s:%b%n%s:%b%n%n",
"Boolean Logical inclusive OR (|)",
        "false | false", (false | false),
        "false | true", (false | true),
        "true | false", (true | false),
        "true | true", (true | true));

        System.out.printf("%s%n%s:%b%n%s:%b%n%s:%b%n%s:%b%n%n",
"Boolean Logical exclusive OR (^)",
        "false ^ false", (false ^ false),
        "false ^ true", (false ^ true),
        "true ^ false", (true ^ false),
        "true ^ true", (true ^ true));

        System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)",
        "!false", (!false), "!true", (!true));
    }
}
