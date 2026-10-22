import javax.swing.JOptionPane;
public class NamesDialog {
    
    public static void main(String[] args){
       
        String firstName; //the user's first name
        String middleName;
        String lastName;

        //Get the users first name 
        firstName = 
            JOptionPane.showInputDialog("what is " + "your first name?");

        //Get the users middle name 
        middleName = 
            JOptionPane.showInputDialog("what is " + "your middle name?");

        //Get the users last name 
        lastName = 
            JOptionPane.showInputDialog("what is " + "your last name?");

        //Display a greeting
            JOptionPane.showMessageDialog(null, "Hello "+ firstName + " " 
            + middleName + " " + lastName + "🙂");

            System.exit(0);  
    }
}
