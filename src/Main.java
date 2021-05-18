
import java.util.List;
import java.util.Scanner;

import dao.AccountDAOImpl;
import entities.Account;

public class Main {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//
//		Account account = new Account();
//		
//		System.out.println("Nhap so tai khoan: ");
//		account.setAccountNo(input.nextLine());
//		System.out.println("Nhap ten tai khoan");
//		account.setCustomerName(input.nextLine());
//		System.out.println("Nhap so du trong tai khoan");
//		account.setBalance(input.nextFloat());
//
//		System.out.println("Nhập số tiền muốn gửi");
//		int sendingMoney = input.nextInt();
//		System.out.println("Nhập kỳ hạn");
//		int period = input.nextInt();
//		System.out.println("Nhập lãi suất");
//		float rate = input.nextFloat();
//		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
//		accountDAOImpl.calculateInterest(period, sendingMoney, rate, period);

		Account account = new Account();
		List<Account> listAccount = new AccountDAOImpl().getListAccount();
		for (Account acc : listAccount) {
			System.out.println(acc.toString());
		}
	}
}
