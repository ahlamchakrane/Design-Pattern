import adapter.AdapterImpl;
import adapter.AdapterImpl2;
import adapter.StandardImpl;

public class Application {
 public static void main(String[] args) {
	Client client = new Client();
	client.setStandard(new StandardImpl());
	client.setStandard(new AdapterImpl());
	client.setStandard(new AdapterImpl2());
	client.traitement(7, 4);
}
}
