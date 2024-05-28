package Factory;

public class MessageFactory {

    public static Message getMessage(int i){
        if(i == 0){
            return new MessageSMS();
        }else if(i == 1){
            return new MessageEmail();
        }else{
            return new MessageEmail();
        }
    }
}
