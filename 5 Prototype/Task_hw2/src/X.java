import java.util.ArrayList;

public class X {
    private ArrayList<Y> yList;

    public X() {
        yList = new ArrayList<>();
    }

    public void addY(Y y) {
        yList.add(y);
    }

    public ArrayList<Y> getYList() {
        return yList;
    }

    public X prototype() {
        X clone = new X();
        for (Y y : yList) {
            clone.addY(y.prototype());
        }
        return clone;
    }

    @Override
    public String toString(){
        String res = "";
        for(Y i : this.yList){
            res += i.getValue() + " ";
        }
        return res;
    }
}