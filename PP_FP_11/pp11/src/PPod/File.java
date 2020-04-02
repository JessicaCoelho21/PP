package PPod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jpcm_
 */
public class File {
    private String name;
    private fileType extension;
    private int size;
    private int duration;

    public File(String name, fileType extension, int size, int duration) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.duration = duration;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public fileType getExtension() {
        return extension;
    }

    public void setExtension(fileType extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public  boolean equals(Object obj){
        
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(!(obj instanceof File)){
            return false;
        }
        
        File f = (File) obj;
        
        if(f.name != this.name || f.duration != this.duration ||
                f.size != this.size || f.extension != this.extension){
            return false;
        }
        
        return true;
    }
     
    public String toString(){
        
        String s = "";
        s += "Name: " + this.name + "\n";
        s += "Duration: " + this.duration + " secs" + "\n";
        //só preciso disto para tocar a música
        return s;
        
    }
    
}
