package org.module.common.dataservice.orderdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import org.module.common.po.OfficeLoadingListPO;
import org.module.common.po.State;


public interface OfficeLoadingListService extends Remote{
	/**
	 * 前置：无
	 * 后置：返回所有PO
	 * @return
	 */
	public ArrayList<OfficeLoadingListPO> getAll() throws RemoteException;
	/**
	 * 前置：不存在相同ID的寄件单
	 * 后置：增加一个PO
	 * @return
	 */
    public boolean add(OfficeLoadingListPO o) throws RemoteException;
    /**
	 * 前置：欲修改的PO存在
	 * 后置：更新PO信息
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean update(OfficeLoadingListPO newone) throws RemoteException;
   
	/**
     * 根据状态查找
     * @param s
     * @return
     */
	public ArrayList<OfficeLoadingListPO> getByState(State s) throws RemoteException;
}

