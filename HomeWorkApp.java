/** 
 * Java 1. Homework 3
 * @author Stas Zaitsev
 * @version 9/27/2021
 */

public class HomeWorkApp {   
    public static void main(String[] args) {
        Staff[] staffArr = new Staff[5];
        staffArr[0] = new Staff("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        staffArr[1] = new Staff("Vasiliev Vasily", "QA", "vasvas@mailbox.com", "892312313", 30000, 33);
        staffArr[2] = new Staff("Gubaidulina Zulfia", "Manager", "gubzul@mailbox.com", "892312314", 30000, 28);
        staffArr[3] = new Staff("Smirnova Maria", "SEO", "smimar@mailbox.com", "892312315", 30000, 45);
        staffArr[4] = new Staff("Tom Cruise", "Developer", "tomcru@mailbox.com", "892312316", 30000, 59);
        
        for (Staff staff : staffArr) {
            int temp = staff.getAge();
            if (temp > 40) {
                System.out.println(staff);
            }
        }
    }
}