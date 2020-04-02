package Contacts;

public interface ContactManagerAPI {
    public boolean addContact(Contact c);
    
    public boolean removeContact(Contact c);
    
    public boolean removeContact(int position);
    
    public String listAllContacts();
    
    public int positionsFrees();
    
    public boolean swapContact(Contact c1, Contact c2);
    
    public boolean changeContactName(Contact c, String name);
    
    public boolean changeContactNumber(Contact c, String number);
    
    public Contact getContactWithNumber(String number);
}
