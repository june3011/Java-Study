package kr.hs.dgsw.java.dept23.d0602;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {

	private final Map<String, Account> accountMap = new HashMap<String, Account>();
	
	public void makeAccount(String name) {
		Account account = new Account(name);
		accountMap.put(name, account);
	}
	
	public void deposit(String name, int amount) {
		// ���� �ð��� �ɸ�

		Account account = accountMap.get(name);
		synchronized (account) {
			if (account != null) {
				int balance = account.getBalance();
				System.out.printf("%s : �ܾ� �о�� - %d\n", Thread.currentThread().getName(), balance);
				
				try {
					
					Thread.sleep(new Random().nextInt(1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
				
				System.out.printf("%s : ���� ���� - %d\n", Thread.currentThread().getName(), balance);
				
				int newBalance = balance + amount;
				
				account.setBalance(newBalance);
				
				System.out.printf("%s : ���� �Ϸ� - %d\n", Thread.currentThread().getName(), account.getBalance());
			}
		}
		
		// ���� �ð��� �ɸ�
	}
	
	public Account getAccount(String name) {
		return accountMap.get(name);
	}
	
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.makeAccount("ȫ�浿");
		
		Thread thread1 = new Thread(new DepositThread(bank, 50000));
		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Account account = bank.getAccount("ȫ�浿");
		System.out.printf("%s ������ �ܾ��� %d �� ���ҽ��ϴ�.", account.getName(), account.getBalance());
		
	}
	
}