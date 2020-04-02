/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod;

/**
 *
 * @author jpcm_
 */
public  class ShufflePlay {
    
    public static void takeOrder(File [] files,typeOfShufflePlay type){
        switch(type){
            case NameAsc:
                orderNameAsc(files);
                break;
            case NameDesc:
                orderNameDesc(files);
                break;
            case DurationDesc:
                orderDurationDesc(files);
                break;
            case DurationAsc:
                orderDurationAsc(files);
                break;
        }
    }
    

           
    public static void orderNameAsc(File file[]){
        
        int count = 0;
        File temp = null;
        File files[] = new File[20];
        
        
        for(int i=0;i<file.length;i++){
            if(file[i] != null){
                files[i] = file[i];
            }
        }
      
        for(int i=0;i<files.length-1;i++){
            if(files[i] == null && files[i+1] != null){
                files[i] = files[i+1];
                files[i+1] = null;
                
            }
        }
        
        for(int i=0;i<files.length;i++){
            if(files[i] != null){
                count++;
            }
        }
        
        try{
            for(int i=0;i<count;i++){
                for(int j=0;j<count;j++){
                    if(files[i].getName().compareToIgnoreCase(files[j].getName()) < 0){
                        temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
        }catch(NullPointerException npe){
            
        }
        
        for(int i =0;i<count;i++){
            if(files[i] != null){
                System.out.println(files[i].toString());
            }
        }
        
    }
    
    public static void orderNameDesc(File files[]){
        
        int count = 0;
        File temp = null;
        

        for(int i=0;i<files.length-1;i++){
            if(files[i] == null && files[i+1] != null){
                files[i] = files[i+1];
                files[i+1] = null;
                
            }
        }
        
        for(int i=0;i<files.length;i++){
            if(files[i] != null){
                count++;
            }
        }
        
        try{
            for(int i=0;i<count;i++){
                for(int j=0;j<count;j++){
                    if(files[i].getName().compareToIgnoreCase(files[j].getName()) > 0){
                        temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
        }catch(NullPointerException npe){
            
        }
        
        for(int i =0;i<count;i++){
            if(files[i] != null){
                System.out.println(files[i].toString());
            }
        }
        
    }
    
    
    public static void orderDurationAsc(File files[]){
        
        int count = 0;
        File temp = null;
        

        for(int i=0;i<files.length-1;i++){
            if(files[i] == null && files[i+1] != null){
                files[i] = files[i+1];
                files[i+1] = null;
                
            }
        }
        
        for(int i=0;i<files.length;i++){
            if(files[i] != null){
                count++;
            }
        }
        
        try{
            for(int i=0;i<count;i++){
                for(int j=0;j<count;j++){
                    if(files[i].getDuration() < files[j].getDuration()){
                        temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
        }catch(NullPointerException npe){
            
        }
        
        for(int i =0;i<count;i++){
            if(files[i] != null){
                System.out.println(files[i].toString());
            }
        }
        
    }
    
    public static void orderDurationDesc(File files[]){
        
        int count = 0;
        File temp = null;
        

        for(int i=0;i<files.length-1;i++){
            if(files[i] == null && files[i+1] != null){
                files[i] = files[i+1];
                files[i+1] = null;
                
            }
        }
        
        for(int i=0;i<files.length;i++){
            if(files[i] != null){
                count++;
            }
        }
        
        try{
            for(int i=0;i<count;i++){
                for(int j=0;j<count;j++){
                    if(files[i].getDuration() < files[j].getDuration()){
                        temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
        }catch(NullPointerException npe){
            
        }
        
        for(int i =0;i<count;i++){
            if(files[i] != null){
                System.out.println(files[i].toString());
            }
        }
        
    }
    
    
    
    
    
}
