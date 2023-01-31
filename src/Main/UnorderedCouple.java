package Main;

public class UnorderedCouple <Obj1,Obj2>{
    private Obj1  obj1;
    private Obj2 obj2;
    public UnorderedCouple(Obj1 obj1, Obj2 obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public Obj1  getFirst() {
        return obj1;
    }
    public Obj2 getSecond(){
        return obj2;
    }
    public boolean CheckEquality(){
        return obj1.getClass()==obj2.getClass();
    }
}
