package DiceGame.Player;

public class VirtualPlayer extends Player{
    private String FailMessage;
//    Getter
    public String getFailMessage() {
        return FailMessage;
    }

//    Constructor

    public VirtualPlayer(String name, String failMessage){
        this.setName(name);
        FailMessage = failMessage;
    }
//    Method
    public void FailureReact(){
        System.out.println(this.getName() + ": " + this.getFailMessage());
    }
}