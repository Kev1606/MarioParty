package juegos;

/**
 *
 * @author Joctan Esquivel
 */
public class SongThread extends Thread{
    private boolean isRunning =true;
    private String path;
    
    public SongThread(String path){
        this.path = path;
        
    }

    @Override
    public void run(){
        while (isRunning){
            try{
                Reproductor cancion = new Reproductor(path);
                cancion.playWav();
                isRunning = false;
                
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } catch (Exception ex) {
                System.out.println(ex);
                System.out.println("ABAJO");
            }
        }
        
    } 
}