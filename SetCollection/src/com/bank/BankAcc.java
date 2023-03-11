package com.bank;

import java.util.Iterator;
import java.util.TreeSet;

public class BankAcc {

	public static void main(String[] args) {
		TreeSet<BankTran> cust1 = new TreeSet<BankTran>(new BankTranNm());
		cust1.add(new BankTran(201, "Travel"));
		cust1.add(new BankTran(101, "BookTicket"));
		cust1.add(new BankTran(401, "Cafe"));
		cust1.add(new BankTran(301, "Restaurant"));
		
		Iterator<BankTran> i = cust1.iterator();
		while (i.hasNext()) {
			BankTran bankTran = i.next();
			System.out.println(bankTran.tranId+"-"+bankTran.tranNm);
			
		}
	}
}
