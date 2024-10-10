package HW11;

public class Generic<T> {
    private T any;
    public Generic (T any){
        this.any = any;
    }
    @Override
    public String toString(){
      return "Value: " + any.toString();
    }
}
