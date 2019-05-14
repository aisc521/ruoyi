package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.CarInfo;
import java.util.List;	

/**
 * 车辆 数据层
 * 
 * @author ruoyi
 * @date 2019-04-04
 */
public interface CarInfoMapper 
{
	/**
     * 查询车辆信息
     * 
     * @param carId 车辆ID
     * @return 车辆信息
     */
	public CarInfo selectCarInfoById(Integer carId);
	
	/**
     * 查询车辆列表
     * 
     * @param carInfo 车辆信息
     * @return 车辆集合
     */
	public List<CarInfo> selectCarInfoList(CarInfo carInfo);
	
	/**
     * 新增车辆
     * 
     * @param carInfo 车辆信息
     * @return 结果
     */
	public int insertCarInfo(CarInfo carInfo);
	
	/**
     * 修改车辆
     * 
     * @param carInfo 车辆信息
     * @return 结果
     */
	public int updateCarInfo(CarInfo carInfo);
	
	/**
     * 删除车辆
     * 
     * @param carId 车辆ID
     * @return 结果
     */
	public int deleteCarInfoById(Integer carId);
	
	/**
     * 批量删除车辆
     * 
     * @param carIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteCarInfoByIds(String[] carIds);
	
}