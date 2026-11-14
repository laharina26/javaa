import java.util.Scanner;

public class EmailOperations {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student email: ");
        String email = sc.nextLine();

        
        System.out.println("Length: " + email.length());

        // 2. Extract username
        int pos = email.indexOf('@');
        String username = email.substring(0, pos);
        System.out.println("Username: " + username);

        // 3. Extract domain and compare
        String domain = email.substring(pos + 1);
        System.out.println("Domain: " + domain);

        if (domain.equals("bmsce.ac.in"))
            System.out.println("Valid BMSCE email");
        else
            System.out.println("Not a BMSCE email");

        // 4. Convert to lowercase
        String lower = email.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // 5. Check prefix
        System.out.print("Enter registration number: ");
        String prefix = sc.nextLine();

        if (email.startsWith(prefix))
            System.out.println("Email starts with prefix");
        else
            System.out.println("Email does not start with prefix");

        // 6. Check suffix
        if (email.endsWith("bmsce.ac.in"))
            System.out.println("Email ends with valid domain");
        else
            System.out.println("Invalid domain ending");

        // 7. Replace domain
        String updated = email.replace(
            "bmsce.ac.in", "cse.bmsce.ac.in");
        System.out.println("Updated email: " + updated);

        // 8. Check contains
        System.out.print("Enter sequence to search: ");
        String key = sc.nextLine();

        if (email.contains(key))
            System.out.println("Sequence found");
        else
            System.out.println("Sequence not found");

        // 9. Remove leading and trailing spaces
        String trimmed = email.trim();
        System.out.println("Trimmed email: " + trimmed);

        // 10. Compare two emails ignoring case
        System.out.print("Enter another email: ");
        String email2 = sc.nextLine();

        if (email.equalsIgnoreCase(email2))
            System.out.println("Both emails are identical");
        else
            System.out.println("Emails are different");

        sc.close();
    }
}