package com.bank;

import java.util.Comparator;

public class BankTranNm implements Comparator<BankTran> {
	public int compare(BankTran b1, BankTran b2){
		return b1.tranNm.compareTo(b2.tranNm);
	}
}
