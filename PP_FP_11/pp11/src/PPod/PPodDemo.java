/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpcm_
 */
public class PPodDemo {

    public static void main(String[] args){
        
//        File f1 = new File("a",fileType.mp3,10,13);
//        File f2 = new File("b",fileType.mp3,10,15);
//        File f3 = new File("d",fileType.mp3,12,12);
//        File f4 = new File("c",fileType.mp3,12,10);
        
        
        
        
        PPod p = new PPod(typeOfShufflePlay.NameAsc);
        
//        try {
//            p.addFile(f1);
//        } catch (MemoryException ex) {
//            ex.printStackTrace();
//        } catch (NullPointerException ex) {
//            ex.printStackTrace();
//        }
        
//        try {
//            p.playTrack(0);
//        } catch (FileDoesNotExistException ex) {
//            ex.printStackTrace();
//        } catch (FileNotValidException ex) {
//            ex.printStackTrace();
//        }

//        try {
//            p.previousTrack();
//        } catch (FileDoesNotExistException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (FileNotValidException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        try {
//            p.nextTrack();
//        } catch (FileDoesNotExistException ex) {
//            ex.printStackTrace();
//        } catch (FileNotValidException ex) {
//            ex.printStackTrace();
//        }
                
//        try {
//            p.addFile(f1);
//        } catch (MemoryException | NullPointerException ex) {
//            ex.printStackTrace();
//        }
//        
//               try {
//            p.addFile(f2);
//        } catch (MemoryException | NullPointerException ex) {
//            ex.printStackTrace();
//        }
//               
//                      try {
//            p.addFile(f3);
//        } catch (MemoryException | NullPointerException ex) {
//            ex.printStackTrace();
//        }
//                      
//        try {
//            p.addFile(f4);
//        } catch (MemoryException | NullPointerException ex) {
//            ex.printStackTrace();
//        }
//        
//        try {
//            p.deleteFile(1);
//        } catch (FileDoesNotExistException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        try {
//            p.playTrack(0);
//        } catch (FileDoesNotExistException ex) {
//            ex.printStackTrace();
//        } catch (FileNotValidException ex) {
//            ex.printStackTrace();
//        }
        
//        try {
//            p.playALL();
//        } catch (FileDoesNotExistException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        System.out.println("------------------------");
//        
//        p.playShuffle();
//        
//         System.out.println("------------------------");
//         
//        try {
//            p.playALL();
//        } catch (FileDoesNotExistException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
//        }


        File f1 = new File("a",fileType.mp4,10,13);
        File f2 = new File("b",fileType.mp3,10,15);
        File f3 = new File("d",fileType.mp4,12,12);
        File f4 = new File("c",fileType.mp4,12,10);
        File f5 = null;
        

        try {
            p.addFile(f5);
        } catch (MemoryException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotValidException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           try {
            p.addFile(f4);
        } catch (MemoryException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotValidException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
           
              try {
            p.addFile(f3);
        } catch (MemoryException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotValidException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
              
                 try {
            p.addFile(f1);
        } catch (MemoryException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotValidException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        try {
            p.addFile(f2);
        } catch (MemoryException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotValidException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            p.playALL();
        } catch (FileDoesNotExistException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotValidException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
                PPod p1 = new PPod(typeOfShufflePlay.NameAsc);
        
//        try {
//            p1.addFile(f5);
//        } catch (MemoryException ex) {
//            //Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NullPointerException ex) {
//            Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (FileNotValidException ex) {
//            //Logger.getLogger(PPodDemo.class.getName()).log(Level.SEVERE, null, ex);
//        }
                        
               System.out.println(PPod.getNumberOfFailures() + ": errors in Total");
               
        try {
            p1.playTrack(10);
        } catch (FileDoesNotExistException ex) {
            System.out.println(ex.getMessage());
        } catch (FileNotValidException ex) {
            System.out.println(ex.getMessage());
        }
    
    }   
    
}
