package Contacts;

import java.util.Objects;

public class InternationalContact extends Contact{
    
    private String countryID;
    private String country;

    /**
     * Método construtor para instanciar um contacto internacional
     * @param countryID
     * @param country
     * @param name
     * @param surname
     * @param number
     * @throws StartsWithException
     * @throws LengthException 
     */
    public InternationalContact(String countryID, String country, String name, String surname, String number) throws StartsWithException, LengthException {
        super(name, surname, number);
        
        //se o indicativo do país não começar com 00, lança exceção
        if(!(countryID.startsWith("00"))){
            throw  new StartsWithException("Doesn't start with 00");
        }
        
        //se o nome do país não começar com letra maiúscula, lança exceção
        if(!(country.substring(0, 1).equals(country.substring(0,1).toUpperCase()))){
            throw  new StartsWithException("Doesn't start with UpperCase on the 1st letter in name!");
        }
        
        this.countryID = countryID;
        this.country = country;   
    }

    /**
     * Método getter para obter o indicativo do país
     * @return 
     */
    public String getCountryID() {
        return countryID;
    }

    /**
     * Método setter para atribuir um indicativo do país
     * @param countryID
     * @throws StartsWithException 
     */
    public void setCountryID(String countryID) throws StartsWithException {
        //se o indicativo não começar com 00, lança exceção
        if(!(countryID.startsWith("00"))){
            throw  new StartsWithException("Doesn't start with 00");
        }
        
        this.countryID = countryID;
    }

    /**
     * Método getter para obter o país
     * @return 
     */
    public String getCountry() {
        return country;
    }

    /**
     * Método setter para atribuir um país
     * @param country
     * @throws StartsWithException 
     */
    public void setCountry(String country) throws StartsWithException {
        //se o nome do país não começar com letra maiúscula, lança exceção
        if(!(country.substring(0, 1).equals(country.substring(0,1).toUpperCase()))){
            throw new StartsWithException("Doesn't start with UpperCase on the 1st letter in name!");
        }
        
        this.country = country;
    }

    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString() {
        String s = super.toString();
        s += "Country: " + this.country;
        
        return s;
    }

    /**
     * Método equals
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final InternationalContact other = (InternationalContact) obj;
            
        if (!Objects.equals(this.getName(), other.getName())) {
            return false;
        }
        
        if (!Objects.equals(this.getSurname(), other.getSurname())) {
            return false;
        }
        
        if (!Objects.equals(this.getNumber(), other.getNumber())) {
            return false;
        }
        
        if(!Objects.equals(this.countryID, other.countryID)){
            return false;
        }
        
        return true;
    } 
}