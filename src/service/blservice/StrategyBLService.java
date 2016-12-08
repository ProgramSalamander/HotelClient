//package service.blservice;
//
//import java.util.ArrayList;
//
//import objects.*;
//
//public   interface StrategyBLService {
//	// �ṩ��������õĽӿ�
//
//		/**
//		 * @param input
//		 * @return �Ƶ���Ӵ�������
//		 */
//		public ResultMessage hotelstrategy_make(HotelStrategy strategy);
//
//		/**
//		 * @param strategy
//		 * @return �Ƶ���´�������
//		 */
//		public ResultMessage hotelstrategy_update(HotelStrategy strategy);
//
//		/**
//		 * @param strategy
//		 * @return ��վӪ����Ա��Ӵ�������
//		 */
//		public ResultMessage webstrategy_make(WebStrategy strategy);
//
//		/**
//		 * @param strategy
//		 * @return ��վӪ����Ա���´�������
//		 */
//		public ResultMessage webstrategy_update(WebStrategy strategy);
//
//		// �ṩ��ͬ����õĽӿ�
//		/**
//		 * @param hotelid
//		 * @param clientid
//		 * @return �õ���Ӧ�ͻ����õĶ�Ӧ�Ƶ�Ĵ��������б�
//		 */
//		public ArrayList<HotelStrategy> getStrategy(int hotelid, int clientid);
//
//		/**
//		 * @param clientid
//		 * @return �õ���Ӧ�ͻ�ʹ�õ���վ�Ĵ��������б�
//		 */
//		public ArrayList<WebStrategy> getStrategy(int clientid);
//}
package service.blservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import objects.ResultMessage;
import vo.HotelStrategyVO;
import vo.WebStrategyVO;

public interface StrategyBLService extends Remote{
	// 提供给界面调用的接口

	/**
	 * @param input
	 * @return 酒店添加促销策略
	 */
	public ResultMessage hotelstrategy_make(HotelStrategyVO strategyvo)throws RemoteException;

	/**
	 * @param strategy
	 * @return 酒店更新促销策略
	 */
	public ResultMessage hotelstrategy_update(HotelStrategyVO strategyvo)throws RemoteException;

	/**
	 * @param strategy
	 * @return 网站营销人员添加促销策略
	 */
	public ResultMessage webstrategy_make(WebStrategyVO strategyvo)throws RemoteException;

	/**
	 * @param strategy
	 * @return 网站营销人员更新促销策略
	 */
	public ResultMessage webstrategy_update(WebStrategyVO strategyvo)throws RemoteException;

	/**
	 * @param hotelid
	 * @param clientid
	 * @return 得到对应客户适用的对应酒店的促销策略列表
	 */
	public ArrayList<HotelStrategyVO> getStrategy(int hotelid, int clientid)throws RemoteException;

	/**
	 * @param clientid
	 * @return 得到对应客户使用的网站的促销策略列表
	 */
	public ArrayList<WebStrategyVO> getStrategy(int clientid)throws RemoteException;
}
