/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod_pp11;

/**
 *
 * @author Jéssica Beatriz
 * 
 * Interface PPod
 */
public interface PPod {
    public void addFile(File file) throws MemoriaMaxima;
    public void deleteFile(int index);
    public void playTrack(int index) throws IndiceValido;
    public void nextTrack();
    public void previousTrack();
}
