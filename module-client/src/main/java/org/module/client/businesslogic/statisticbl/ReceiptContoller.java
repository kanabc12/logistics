package org.module.client.businesslogic.statisticbl;

import java.util.ArrayList;

import org.module.client.businesslogicservice.statistic.IncomeService;
import org.module.client.main.Main;
import org.module.client.vo.ReceiptVO;

public class ReceiptContoller {
	private IncomeService income;
	private Receipt receipt;
	private ArrayList<ReceiptVO> list  ;
	public ReceiptContoller() {
		super();
		this.income = new Income();
		receipt = new Receipt();
	}

	public ArrayList<ReceiptVO> showIncomeList(long startTime, long endTime) {
		
		this.list = income.getAllIncomeList(Main.currentUser.getDepartmeny(), startTime, endTime);
		return list;
	}

	public ArrayList<ReceiptVO> getAll(){
		this.list =  this.receipt.getAll();
		return list;
	}
	
	public boolean add(ReceiptVO vo) {
		this.list.add(vo);
		return this.receipt.add(vo);
	}

	public boolean update(ReceiptVO vo){
		for (ReceiptVO receiptVO : list) {
			if(vo.getID().equals(receiptVO.getID())){
				list.remove(receiptVO);
				list.add(vo);
				return this.update(vo);
			}
		}
	
		return false;
	}
}
