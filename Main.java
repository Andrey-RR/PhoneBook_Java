public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.contactAdd("Иванов", "454545");
        phoneBook.contactAdd("Иванов", "454545");
        phoneBook.contactAdd("Иванов", "456330");
        phoneBook.contactAdd("Петров", "994822");
        phoneBook.contactAdd("Петров", "994848");
        phoneBook.contactAdd("Петров", "994321");
        phoneBook.contactAdd("Сидоров", "551122");
        phoneBook.contactAdd("Сидоров", "545454");
        phoneBook.contactAdd("Смирнов", "332241");
        phoneBook.contactAdd("Волков", "886767");
        phoneBook.contactAdd("Волков", "882232");
        
        

        System.out.println(phoneBook.getPhoneBook() + "\n");
        
        System.out.println(phoneBook.sort());
        

    }
}