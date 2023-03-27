import java.util.HashMap;
import java.util.Map;

public class Messages{
    private Map<String,String> messages = new HashMap<>();

    public Messages(Repositable<Map<String,String>> messages) {
        this.messages = messages.getData();
    }

    public Map<String, String> getMessages() {
        return messages;
    }

    public void setMessages(Map<String, String> messages) {
        this.messages = messages;
    }
}
