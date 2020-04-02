package PPod_pp11;

public class Shuffle {
    
    /**
     * Método para ordenar a lista de reprodução por ordem ascendente de nome
     * @param file faixa recebida
     */
    public static void orderNameAsc(File file[]){
        int count = 0;
        File temp = null;
        File files[] = new File[20];
        
        //Para i = 0, i menor que o tamanho do array, i++
        for(int i = 0; i < file.length; i++){
            if(file[i] != null){
                files[i] = file[i];
            }
        }
      
        for(int i = 0; i < files.length - 1; i++){
            if(files[i] == null && files[i + 1] != null){
                files[i] = files[i + 1];
                files[i + 1] = null;
            }
        }
        
        for(int i = 0; i < files.length; i++){
            if(files[i] != null){
                count++;
            }
        }
        
        try{
            for(int i = 0; i < count; i++){
                for(int j = 0; j < count; j++){
                    if(files[i].getNome().compareToIgnoreCase(files[j].getNome()) < 0){
                        temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
        } catch(NullPointerException npe){
            System.out.println("Erro");
        }
        
        for(int i = 0; i < count; i++){
            if(files[i] != null){
                System.out.println(files[i].toString());
            }
        }
    }
    
    /**
     * Método para ordenar as música por ordem descendente alfabética
     * @param files 
     */
    public static void orderNameDesc(File files[]){
        int count = 0;
        File temp = null;
        
        for(int i = 0; i < files.length - 1; i++){
            if(files[i] == null && files[i + 1] != null){
                files[i] = files[i + 1];
                files[i + 1] = null;
                
            }
        }
        
        for(int i = 0; i < files.length; i++){
            if(files[i] != null){
                count++;
            }
        }
        
        try{
            for(int i = 0; i < count; i++){
                for(int j = 0; j < count; j++){
                    if(files[i].getNome().compareToIgnoreCase(files[j].getNome()) > 0){
                        temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
        }catch(NullPointerException npe){
            System.out.println("Erro");
        }
        
        for(int i = 0; i < count; i++){
            if(files[i] != null){
                System.out.println(files[i].toString());
            }
        }
    }
    
    /**
     * Método que ordena as músicas por ordem ascendente de duração
     * @param files 
     */
    public static void orderDurationAsc(File files[]){
        int count = 0;
        File temp = null;
        
        for(int i = 0; i < files.length - 1; i++){
            if(files[i] == null && files[i + 1] != null){
                files[i] = files[i + 1];
                files[i + 1] = null;
            }
        }
        
        for(int i = 0; i < files.length; i++){
            if(files[i] != null){
                count++;
            }
        }
        
        try{
            for(int i = 0; i < count; i++){
                for(int j = 0; j < count; j++){
                    if(files[i].getDuracao() < files[j].getDuracao()){
                        temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
        }catch(NullPointerException npe){
            System.out.println("Erro"); 
        }
        
        for(int i = 0; i < count; i++){
            if(files[i] != null){
                System.out.println(files[i].toString());
            }
        }
    }
    
    /**
     * Método que ordena as músicas por ordem descrescente de duração
     * @param files 
     */
    public static void orderDurationDesc(File files[]){
        int count = 0;
        File temp = null;

        for(int i = 0; i < files.length - 1; i++){
            if(files[i] == null && files[i + 1] != null){
                files[i] = files[i + 1];
                files[i + 1] = null;
            }
        }
        
        for(int i = 0; i < files.length; i++){
            if(files[i] != null){
                count++;
            }
        }
        
        try{
            for(int i = 0; i < count; i++){
                for(int j = 0; j < count; j++){
                    if(files[i].getDuracao() < files[j].getDuracao()){
                        temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
        }catch(NullPointerException npe){
            System.out.println("Erro");
        }
        
        for(int i = 0; i < count; i++){
            if(files[i] != null){
                System.out.println(files[i].toString());
            }
        }
    }
}
