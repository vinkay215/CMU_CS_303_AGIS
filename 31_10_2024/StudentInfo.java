

package pkg31_10_2024;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentInfo {

   
    public static void main(String[] args) throws Exception {   //throws Exception avoids incorrect date format errors
        Scanner InKeyboard = new Scanner(System.in);
        //Menu choice
        System.out.println("Choose one of the options:");
        System.out.println("1. Info Student");
        System.out.println("2. Check if the input from the keyboard is a string");
        System.out.println("3. Check if the input from the keyboard is an integer: ");// down the line
        System.out.println("4. Info Student have date");// down the line
        System.out.println("Your choice is: ");
        
        int choice = InKeyboard.nextInt();
        InKeyboard.nextLine(); //Without this, case 4 error will occur at name
        
        switch (choice) {
        
            
        
        case 1:
            //Enter value
            System.out.print("Enter Full Name: ");
            String name = InKeyboard.nextLine();
            
            System.out.print("Enter age: ");
            int age = InKeyboard.nextInt();
            InKeyboard.nextLine(); 
            
            System.out.print("Enter birthday: ");
            String birthday = InKeyboard.nextLine();
            
            System.out.print("Enter sex: ");
            String sex = InKeyboard.nextLine();
            
            System.out.print("Enter specialized: ");
            String specialized = InKeyboard.nextLine();
            
            System.out.print("Enter GPA: ");
            String GPA = InKeyboard.nextLine();
            
            System.out.print("Enter hometown: ");
            String hometown = InKeyboard.nextLine();   
            
            //Print value
            System.out.println("");// down the line
            System.out.println("Full Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Birthday: " + birthday);
            System.out.println("Sex: " + sex);
            System.out.println("Specialized: " + specialized);
            System.out.println("GPA: " + GPA);
            System.out.println("Hometown: " + hometown);
            break;
            
            
        case 2:
            System.out.println("");// down the line
            System.out.println("Enter a string:");
            
            boolean hasString = InKeyboard.hasNext();
            System.out.println(hasString);
            break;
            
        case 3:
            System.out.println("");// down the line
            System.out.println("Enter an integer:"); 
            
            boolean isInteger = InKeyboard.hasNextInt();
            System.out.println(isInteger);
            break;
            
        case 4:
            System.out.print("Enter Full Name: ");
            String name4 = InKeyboard.nextLine();

            System.out.print("Enter birthday (dd/MM/yyyy): ");
            String birthdayInput = InKeyboard.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date birthdayDate = dateFormat.parse(birthdayInput);

            System.out.print("Enter sex: ");
            String sex4 = InKeyboard.nextLine();

            System.out.print("Enter specialized: ");
            String specialized4 = InKeyboard.nextLine();

            System.out.print("Enter GPA: ");
            String GPA4 = InKeyboard.nextLine();

            System.out.print("Enter hometown: ");
            String hometown4 = InKeyboard.nextLine();

            // Print value
            System.out.println("");
            System.out.println("Full Name: " + name4);
            System.out.println("Birthday: " + dateFormat.format(birthdayDate));
            System.out.println("Sex: " + sex4);
            System.out.println("Specialized: " + specialized4);
            System.out.println("GPA: " + GPA4);
            break;

        default:
            System.out.println("Invalid selection. Please select 1, 2, 3");
            break;
        }

        InKeyboard.close();
    }
    
}
