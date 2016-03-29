package sleutelspel;

public class GameManager {
    
    private String map1;
    private String map2;
    private String map3;
    private String map4;
    private int currentMap;
    private TextReader textReader;
    private int [][] tiles;
    
    public GameManager(){
        this.currentMap = 1;
        
        this.map1 = "Map1.txt";
        this.map2 = "Map2.txt";
        this.map3 = "Map3.txt";
        this.map4 = "Map4.txt";

        this.textReader = new TextReader();
        
    }
    

    
    public void loadMap(int currentMap){
        switch (currentMap){
            case 1: this.tiles = this.textReader.readFile(this.map1);
                this.currentMap++;
                break;
            case 2: this.tiles = this.textReader.readFile(this.map2);
                this.currentMap++;
                break;
            case 3: this.tiles = this.textReader.readFile(this.map3);
                this.currentMap++;
                break;
            case 4: this.tiles = this.textReader.readFile(this.map4);
                break;
        }
    }

    public int getCurrentMap() {
        return currentMap;
    }

    public int[][] getTiles() {
        return tiles;
    }
    
    
    
}