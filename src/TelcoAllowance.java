import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
    private static final Map<String, String> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", "15 GB");
        allowanceMap.put("Globe", "10 GB");
        allowanceMap.put("Ditto", "8 GB");
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        // Use getOrDefault to handle unknown telcos, replacing the 'default' case of your switch
        String allowance = allowanceMap.getOrDefault(telcoName, "0 GB");
        return  allowance + " for ₱" + money;
    }
}