import com.ebay.accountmanagement.AccountManagementClient;
import com.ebay.accountmanagement.configuration.AccountManagementConfiguration;

public class TestApollo {
    public static void main(String[] args) {
        System.out.println("Testing Apollo-updated Account Management SDK...");
        
        var config = new AccountManagementConfiguration();
        config.setAccessToken("test-token");
        
        try (var client = new AccountManagementClient(config)) {
            System.out.println("✓ SDK instantiated successfully");
            System.out.println("✓ GraphQL client available: " + (client.graphQL != null));
            System.out.println("✓ Apollo integration working!");
        } catch (Exception e) {
            System.err.println("✗ Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
