
import java.util.ArrayList;
import java.util.List;



    public class Main {
        public static void main(String[] args) {
            Contact c1= new Contact("Bittu","Lohar","Dhanbad","Dhanbad","jharkhand",828204,900679,"bittulohar7@gmail.com");
            Contact c2 = new Contact("Ram","Ram","City Centre","Durgapur","West Bangal",700204,8202102,"citycentre17mail.com");
            Contact c3 = new Contact("Dj","Shadow","Mumbai","Mumbai","Maharastra",400001,994512,"nbdnsdngmail.com");
            List <Contact> AddressBook = new ArrayList<Contact>();
            AddressBook.add(c1);
            AddressBook.add(c2);
            AddressBook.add(c3);
            System.out.println(AddressBook);
        }
    }
