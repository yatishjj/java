package stream.Generics;

import java.util.Date;

public class KeyValue2 {

    public static void main(String[] args) {
        Date objc=new Date();
        pairs<String, java.util.Date> object=new pairs<String,java.util.Date> ("1",objc);
        System.out.println("{"+object.getObj1()+"="+object.getObj2()+"}");
    }
}
class pairs<K,V>{
    private K obj1;
    private V obj2;

    public pairs(K obj1,V obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    public K getObj1() {
        return obj1;
    }
    public V getObj2() {
        return obj2;
    }

}
