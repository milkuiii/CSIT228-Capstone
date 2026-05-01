package data;

public class TanawState extends StudentState{
    // random time for how long they are in this state
    // can have indicator for later on if this state gets shorter

    @Override
    public void handleRequest() {
        System.out.println("CURRENT STATE: Tanaw State");
    }

}
