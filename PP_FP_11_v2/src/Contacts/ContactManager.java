package Contacts;

public class ContactManager implements ContactManagerAPI{
    
    private Contact [] contacts ;

    /**
     * Método construtor para criar uma lista de contactos com 100 posições
     */
    public ContactManager() {
        this.contacts = new Contact[100];
    }

    /**
     * Método para ordenar contactos
     * @param p 
     */
    private void orderContacts(int p){
        //Para i = 0, i menor que o tamanho do array, i++
        for(int i = p; i < this.contacts.length; i++){
            //se o contacto na posição i for nulo e o na posição seguinte não for
            if(this.contacts[i] == null && this.contacts[i + 1] != null){
                //o contacto fica com o contacto da posição seguinte, e o último fica a null
                this.contacts[i] = this.contacts[i + 1];
                this.contacts[i + 1] = null;
            } else{
                break;
            }
        }
    }
    
    /**
     * Método para adicionar um contacto
     * @param c contacto a adicionar
     * @return 
     */
    @Override
    public boolean addContact(Contact c) {
        //Se o contacto passado por parâmetro for nulo, lança exceção
        if(c == null){
            throw new NullPointerException("Contact is empty");
        }
        
        //para i = 0, i menor que o tamanho do array, i++
        for(int i = 0; i < this.contacts.length; i++){
            //se a posição i do array estiver vazia, atribui-se c à posição i
            if(this.contacts[i] == null){
                this.contacts[i] = c;
                return true;
            }
        }
        
        return false;
    }

    /**
     * Método para remover um contacto da lista a partir da sua posição
     * @param position posição desse contacto na lista
     * @return true em caso de sucesso, false caso contrário
     */
    @Override
    public boolean removeContact(int position) {
        //se o contacto na posição recebida for nulo, lança exceção
        if(contacts[position] == null){
           throw new NullPointerException("Position is empty");  
        }
        
        //o contacto na posição recebida passa a null
        contacts[position] = null;
        //o contacto na posição i + 1 passará para a posição i no método orderContacts()
        orderContacts(position);
        
        return true; 
    }
    
    /**
     * Método para remover um contacto dado o contacto
     * @param c contacto a remover
     * @return 
     */
    @Override
    public boolean removeContact(Contact c) {
        //Se o contacto passado for nulo, lança exceção
        if(c == null){
           throw new NullPointerException("Contact is empty"); 
        }
        
        //para i = 0, i menor que o tamanho do array, i++
        for(int i = 0; i < this.contacts.length;i++){
            //se não existir um contacto nessa posição, não faz nada
            if(this.contacts[i] == null){
                break;
            }
            
            //se o contacto na posição i for igual ao contacto recebido
            if(this.contacts[i].equals(c)){
               //o contacto na posição i passa a null
               this.contacts[i] = null;
               //o contacto na posição i + 1 passará para a posição i no método orderContacts()
               orderContacts(i);
               
               return true;
            }
        }
        
        return false;
    }

    /**
     * Método para listar todos os contactos
     * @return 
     */
    @Override
    public String listAllContacts() {
        String s = "";
        
        //para i = 0, i menor que o tamanho do array, i++
        for(int i = 0; i < this.contacts.length; i++){
            //se o contacto na posição i for diferente de null
            if(this.contacts[i] != null){
                s += "Index[" + i + "] : \n";
                s += contacts[i].toString()+"\n\n";        
            } else{
                break;
            }
        }
        
        return s;
    }

    /**
     * Método que conta as posições ocupadas do vetor
     * @return 
     */
    @Override
    public int positionsFrees() {
        int pF = 0;
        
        //para i = 0, i menor que o tamanho do array, i++
        for(int i = 0; i < this.contacts.length; i++){
            //se o contacto na posição i for diferente de null
            if(this.contacts[i] != null){
                pF++;
            } else{
                break;
            }
        }
        
        return pF;
    }

    /**
     * Método que troca a ordem dos contactos
     * @param c1 contacto 1
     * @param c2 contacto 2
     * @return 
     */
    @Override
    public boolean swapContact(Contact c1, Contact c2) {
        //Se c1 for igual a null ou c2 igual a null, lança exceção
        if(c1 == null || c2 == null){
            throw new NullPointerException("Contact is null");
        }
        
        //para i = 0, i menor que o tamanho do array, i++
        for(int i = 0; i < this.contacts.length; i++){
            //se o contacto na posição i for nulo, lança exceção
            if(this.contacts[i] == null){
                throw new NullPointerException("Contact does not exist");
            }
            
            //Se o contacto na posição i for igual a c1, atruibui o valor de c2
            if(contacts[i].equals(c1)){
               contacts[i] = c2;           
            }
        }
        
        return true;
    }

    /**
     * Método que muda o nome do contacto
     * @param c contacto 
     * @param name nome a mudar
     * @return 
     */
    @Override
    public boolean changeContactName(Contact c, String name) {
        //para i = 0, i menor que o tamanho do array, i++
        for(int i = 0; i < this.contacts.length; i++){
            //Se o contacto na posição i for nulo, lança exceção
            if(this.contacts[i] == null){
                throw new NullPointerException("Contact does not exist");
            }
            
            //se o contacto na posição i for igual ao contacto passado por parâmetro
            if(this.contacts[i].equals(c)){
                //testar adicionar o nome
                try {
                    this.contacts[i].setName(name);
                }
                
                //se o nome não começar por letra maíuscula, lança exceção
                catch (StartsWithException ex) {
                    System.out.println(ex);
                }
            }
        }
        
        return true;
    }

    /**
     * Método para alterar o número de telefone
     * @param c contacto
     * @param number número novo
     * @return 
     */
    @Override
    public boolean changeContactNumber(Contact c, String number) {
        //para i = 0, i menor que o tamanho do array, i++
        for(int i = 0; i < this.contacts.length; i++){
            //se a posição i do array estiver vazia
            if(this.contacts[i] == null){
                throw new NullPointerException("Contact does not exist");
            }
            
            //se o contacto na posição i for igual ao enviado por parâmetro
            if(this.contacts[i].equals(c)){
                //testar alterar o número de telefone
                try {
                    this.contacts[i].setNumber(number);
                } 
                
                //caso o número de telefone não tenha 9 dígitos
                catch(LengthException ex) {
                    System.out.println(ex);
                }
            }
        }
        
        return true;
    }

    /**
     * Método para obter o contacto pelo número de telefone
     * @param number
     * @return 
     */
    @Override
    public Contact getContactWithNumber(String number) {
        //para i = 0, i menor que o tamanho do array, i++
        for(int i = 0; i < this.contacts.length; i++){
            //se não existir contacto na posição i, lança exceção
            if(this.contacts[i] == null){
               throw new NullPointerException("Contact does not exist"); 
            }
            
            //Se o número de telefone do contacto na posição i for igual ao número recebido por parâmetro
            if(this.contacts[i].getNumber().equals(number)){
                return this.contacts[i];
            }
        }
        
        return null;
    }  
}
