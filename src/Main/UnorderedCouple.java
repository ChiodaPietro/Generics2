package Main;

public class UnorderedCouple <Obj>{
    private Obj  obj1;
    private Obj obj2;
    public UnorderedCouple(Obj obj1, Obj obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public Obj getFirst() {
        return obj1;
    }
    public Obj getSecond(){
        return obj2;
    }
    public boolean CheckEquality(){
        return obj1.getClass()==obj2.getClass();
    }
}
