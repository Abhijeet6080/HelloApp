public class HelloAppUC6 {

    public static void main(String[] args) {

        String greeting;

        // Check if no arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop to append names
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                String names = nameBuilder.substring(0, nameBuilder.length() - 2);
                greeting = "Hello, " + names + "!";
            } else {
                greeting = "Hello, World!";
            }
        }

        // Print the greeting
        System.out.println(greeting);
    }
}