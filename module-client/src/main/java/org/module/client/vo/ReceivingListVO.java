package org.module.client.vo;

import org.module.common.po.ReceivingListPO;
import org.module.common.po.State;

public class ReceivingListVO  extends AbstractVO{

	private String date;
	/***
	 * 收件人
	 */
	private String receiver;
	private String orderId;
	private State  state;
	
	public ReceivingListVO(String date, String receiver, String orderId,
			State state) {
		super();
		this.date = date;
		this.receiver = receiver;
		this.orderId = orderId;
		this.state = state;
	}
	
	public ReceivingListVO(ReceivingListPO receivingListPO) {
		this(receivingListPO.getDate(),receivingListPO.getReceiver(),
				receivingListPO.getOrderId(),receivingListPO.getState());
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}

	public ReceivingListPO toPO() {
		// TODO Auto-generated method stub
		return new ReceivingListPO(
				this.date,
				this.receiver,
				this.orderId ,
				this.state
				);
	}

	public String[] toArray(){
		String[] s = {
				this.date,
				this.receiver,
				this.orderId 
		};
		return s;
	}
	
	@Override
	public String get(int i) {
		// TODO Auto-generated method stub
		return this.toArray()[i];
	}

	@Override
	public String[] names() {
		String[] s = {
				"收件日期","签收人","快递单号"
		};
	    return s;
	}
		
		

}
