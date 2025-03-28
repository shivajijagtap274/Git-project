package UserdefinedException;

public class MainTest {

	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("balance:"+account.balance());
		account.withdraw(3500);
		System.out.println("current balance:"+account.balance());
	}
}
