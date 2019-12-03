public class Action {
    private boolean etat;
    private int val;

    public Action(boolean etat, int val) {
        this.etat = etat;
        this.val = val;
    }

    public boolean getEtat() {
        return etat;
    }

    public int getVal() {
        return val;
    }

}
