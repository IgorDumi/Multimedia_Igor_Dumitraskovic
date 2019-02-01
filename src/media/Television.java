package media;

public class Television {
    
    private int volume;
    private int currentProgram;
    private boolean isTurnedOn;
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setCurrentProgram(int program) {
        this.currentProgram = program;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setIsTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }
    
    public boolean getIsTurnedOn() {
        return this.isTurnedOn;
    }
    
    public Television() {
        this.currentProgram = 1;
        this.isTurnedOn = false;
        this.volume = 0;
    }
    
    public Television(int program, boolean isTurnedOn, int volume) {
        this.currentProgram = program;
        this.isTurnedOn = isTurnedOn;
        this.volume = volume;
    }
    
    public void info() {
        System.out.println("Uključen: " + this.isTurnedOn);
        System.out.println("Zvuk je na: " + this.volume);
        System.out.println("Trenutni program: " + this.currentProgram);
        System.out.println("");
    }
    
}