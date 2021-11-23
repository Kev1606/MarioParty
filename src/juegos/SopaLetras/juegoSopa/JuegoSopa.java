package juegos.SopaLetras.juegoSopa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JuegoSopa {
    private String[] arrayPalabras = new String[4];
    private ArrayList<String> todasPalabras;
    private Random aleatorio;
    private String[][] enSopa;
    
    private int dimensioneSopa;
    private int numDimension;
    
    public JuegoSopa(){
        this.todasPalabras = new ArrayList<>();
        this.aleatorio = new Random();
        leePalabras();
        palabrasAleatorias();
    }
    
    private void palabrasAleatorias(){
        String palabra;
        for (int i = 0; i < arrayPalabras.length; i++) {
            palabra = todasPalabras.get(aleatorio.nextInt(100));
            this.arrayPalabras[i] = palabra;
        }
    }
    
    
    private void leePalabras(){
        try (Scanner s = new Scanner(new File("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\Sopa\\src\\palabras\\palabras.txt")).useDelimiter("\\s*,\\s*")) {  
            while (s.hasNext()) {
                this.todasPalabras.add(s.next());
            }
        }
        catch (FileNotFoundException e) {  
        }
    }
    
    public String[] getPalabras(){
        return this.arrayPalabras;
    }
    
    public int getNumDimension(){
        return this.numDimension;
    }
    
    public int getDimensiones(){
        dimensioneSopa = aleatorio.nextInt(3)+1;
        this.numDimension = dimensioneSopa;
        switch (dimensioneSopa) {
            case 1:
                dimensioneSopa = 10;
                break;
            case 2:
                dimensioneSopa = 15;
                break;
            case 3:
                dimensioneSopa = 20;
                break;
            default:
                break;
        }
        enSopa = new String[dimensioneSopa][dimensioneSopa];
        return dimensioneSopa;
    }
    
    
}
