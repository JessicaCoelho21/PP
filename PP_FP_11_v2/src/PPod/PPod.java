/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod;

import static PPod.ShufflePlay.takeOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpcm_
 */
public class PPod {
    private File [] files;
    private int index;
    private int maxSize;
    private typeOfShufflePlay type;
    private static int numberOfFailures = 0;

    public PPod(typeOfShufflePlay type) {
        this.files = new File [20];
        this.index = 0;
        this.maxSize = 102400;
        this.type = type;
    }
    
    private int totalSize(){
        int size=0;
        
        for(int i=0;i<files.length;i++){
            try{
                if(files[i] == null){
                    throw new NullPointerException();
                }
                size += files[i].getSize();
            }
            catch(NullPointerException exp){                
            }
        }
        
        return size;
        
    }
    
    private boolean positionFree(){
        for(int i=0;i<files.length;i++){
            if(files[i] == null){
                return false;
            }
        }
        return true;
    }
    
    public void addFile(File file) throws MemoryException,NullPointerException, FileNotValidException{
               
        if(file == null){
            numberOfFailures++;
            throw new NullPointerException("Valor nulo"); 
        }
        if(totalSize() + file.getSize() > this.maxSize){
            numberOfFailures++;
            throw new MemoryException("Memory Full");
        }
        if(positionFree()){
            numberOfFailures++;
            throw new MemoryException("Memory Full");
        }
        if(file.getSize() <= 0){
            numberOfFailures++;
            throw new FileNotValidException("File not valid");
        }
        
//        if(file.getExtension() != fileType.mp3){
//            numberOfFailures++;
//            throw new FileNotValidException("File not valid");
//        }
        
        for(int i=0;i<files.length;i++){
            if(files[i] == null){
                files[i] = file;
                break;
            }
        }

    }
    
    public void deleteFile(int index) throws FileDoesNotExistException{
        
        if(files[index] == null){
            throw new FileDoesNotExistException("That file does not exist in the memory!");
        }else if(index > 19 || index < 0){
            throw new IndexOutOfBoundsException("Invalid position!");
        }else{
           files[index] = null; 
        }
        
    }
    
    public void playTrack(int index) throws FileDoesNotExistException, FileNotValidException{
        if(files[index] == null){
            throw new FileDoesNotExistException("That file does not exist in the memory!");
        }else if(files[index].getExtension() != fileType.mp3){
            throw new FileNotValidException("That format is not valid!");
        }else if(files[index].getDuration() < 0){
            throw new FileNotValidException("That duration is not valid!"); 
        }
        else{
            System.out.println("Position in array: "+ index);
            System.out.println(files[index].toString());
        }
        
    }
    
    public void nextTrack(){
        
        boolean stop = false;
        while(stop==false){
            try{
                playTrack(++this.index);
                stop=true;
            }catch(ArrayIndexOutOfBoundsException ex){
                this.index = 0;
                stop = true;
                System.out.println(ex);
            } catch (FileDoesNotExistException ex) {
                System.out.println(ex);
            } catch (FileNotValidException ex) {
                System.out.println(ex);
            }
        }
        
//        int id = 0;
//        
//        if(this.index == 19){
//            id = this.index; 
//            this.index = 0;
//        }else{
//            id = this.index;
//            this.index++;
//        }
//
//        
//        while(files[index] != null && this.index != id){
//
//            
//
//            if(this.index==19){
//                this.index=-1;
//            }
//            this.index++;
//        }
//
//        
//        playTrack(this.index);

    }
    
    public void previousTrack() throws FileDoesNotExistException, FileNotValidException{
        
        int id = 0;
        
        if(this.index == 0){
            id = this.index; 
            this.index = 19;
        }else{
            id = this.index;
            this.index--;
        }
        

        
        while(files[index] != null && this.index != id ){
            
            if(this.index==0){
                this.index = 20;
            }
            
            this.index--;          
        }
        
        playTrack(this.index);
        
    }
    
    public void playShuffle(){
        takeOrder(this.files,this.type); 
    }
    
    public void playALL() throws FileDoesNotExistException, FileNotValidException{
        for(int i=0;i<files.length;i++){
            if(files[i] != null){
                System.out.println("Indíce [" + i + "]");
                playTrack(i);
            }
        }
    }

    public static int getNumberOfFailures() {
        return numberOfFailures;
    }    
}
