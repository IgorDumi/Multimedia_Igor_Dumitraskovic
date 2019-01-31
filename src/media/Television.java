package media;

public class Television {

    private int volume;
    private int currentProgram;
    private boolean isTurnedOn;

    public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.isTurnedOn = false;

    }

    public int getVolume() {
        return volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public void setisTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    public Television(int program, boolean isTurnedOn, int volume) {
        this.currentProgram = program;
        this.isTurnedOn = isTurnedOn;
        this.volume = volume;

    }

    public void info() {
        System.out.println("");

    }

    public void setIsTurnedOn(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
