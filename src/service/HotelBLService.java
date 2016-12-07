package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import objects.ResultMessage;
import vo.AccommodationVO;
import vo.HotelVO;
import vo.RoomVO;

public interface HotelBLService extends Remote{
	
	public ResultMessage hotelworker_login(String username,String password) throws RemoteException;
	
	// �ṩ��������õĽӿ�
	/**
	 * @param hotelid
	 * @return �Ƶ�鿴��ϸ��Ϣ
	 */
	public HotelVO hotel_checkInfo(int hotelid)throws RemoteException;

	/**
	 * @param vo
	 * @return �Ƶ������ϸ��Ϣ
	 */
	public ResultMessage hotel_updateInfo(HotelVO vo)throws RemoteException;

	/**
	 * @param room
	 * @return �Ƶ�¼����÷���
	 */
	public ResultMessage hotel_importRoom(RoomVO room)throws RemoteException;

	/**
	 * @param info
	 * @return �Ƶ������ס��Ϣ
	 */
	public ResultMessage hotel_updateAccomodation(AccommodationVO info)throws RemoteException;

//	// �ṩ��ͬ����õĽӿ�
//	/**
//	 * @param hotelid
//	 * @return ���ض�Ӧ�Ƶ�
//	 */
//	public Hotel searchHotel(int hotelid);
//
//	/**
//	 * @param clientid
//	 * @return ���ض�Ӧ�ͻ�Ԥ�����ľƵ��б�
//	 */
//	public ArrayList<Hotel> previousHotel(int clientid);
//
//	/**
//	 * @param hotel
//	 * @return ��ӾƵ�
//	 */
//	public ResultMessage addHotel(Hotel hotel);
//
//	/**
//	 * @param worker
//	 * @return ��ӾƵ깤����Ա
//	 */
//	public ResultMessage addHotelWorker(HotelWorker worker);
//
//	/**
//	 * @param hotelid
//	 * @return ���ض�Ӧ�Ƶ�Ĺ�����Ա
//	 */
//	public HotelWorker searchHotelWorker(int hotelid);
//
//	/**
//	 * @param hotelid
//	 * @param worker
//	 * @return ���¶�Ӧ�Ƶ�Ĺ�����Ա��Ϣ
//	 */
//	public ResultMessage updateHotelWokerInfo(int hotelid, HotelWorker worker);
}
