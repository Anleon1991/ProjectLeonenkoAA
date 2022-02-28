package task5;
public class Thing {
    String name;
    int size;
    int value;

    public Thing(String name, int size, int value){
        this.name = name;
        this.size = size;
        this.value = value;
    }

    public int getSize(){
        return size;
    }
    public int getValue() {
        return value;
    }
    public String toString(){
        return "Название предмета: " + name + "\n";
    }

}
