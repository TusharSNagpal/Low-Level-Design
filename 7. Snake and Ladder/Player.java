public class Player {
    private int id;
    public int curPos;

    Player(int id){
        this.id = id;
        this.curPos = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurPos() {
        return curPos;
    }

    public void setCurPos(int curPos) {
        this.curPos = curPos;
    }
}
