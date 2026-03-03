import java.util.HashMap;
import java.util.Map;

public class UnliCallsTextPackage implements UnliCallsTextOffer {

    private static final Map<String, String> offersMap = new HashMap<>();

    static {
        offersMap.put("Smart", "They do not offer any free calls or texts, and you will be charged per use.");
        offersMap.put("Globe", "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        offersMap.put("Ditto", "This plan includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return offersMap.getOrDefault(telcoName, "No details available.");
    }
}