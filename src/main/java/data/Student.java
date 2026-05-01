package data;

public class Student {
    private StudentState state;

    public void setState(StudentState state){
        this.state = state;
    }

    public void request(){
        state.handleRequest();
    }
}
