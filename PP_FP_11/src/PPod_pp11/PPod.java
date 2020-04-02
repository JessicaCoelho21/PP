package PPod_pp11;

/**
 * Interface PPod
 */
public interface PPod {
    public void addFile(File file) throws MemoriaMaxima;
    
    public void deleteFile(int index);
    
    public void playTrack(int index) throws IndiceValido;
    
    public void nextTrack();
    
    public void previousTrack();
}
