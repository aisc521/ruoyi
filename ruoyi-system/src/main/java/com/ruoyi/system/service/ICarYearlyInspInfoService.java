package com.ruoyi.system.service;

import com.ruoyi.system.domain.CarYearlyInspInfo;
import java.util.List;

/**
 * 汽车年检 服务层
 * 
 * @author ruoyi
 * @date 2019-04-04
 */
public interface ICarYearlyInspInfoService 
{
	/**
     * 查询汽车年检信息
     * 
     * @param id 汽车年检ID
     * @return 汽车年检信息
     */
	public CarYearlyInspInfo selectCarYearlyInspInfoById(Integer id);
	
	/**
     * 查询汽车年检列表
     * 
     * @param carYearlyInspInfo 汽车年检信息
     * @return 汽车年检集合
     */
	public List<CarYearlyInspInfo> selectCarYearlyInspInfoList(CarYearlyInspInfo carYearlyInspInfo);
	
	/**
     * 新增汽车年检
     * 
     * @param carYearlyInspInfo 汽车年检信息
     * @return 结果
     */
	public int insertCarYearlyInspInfo(CarYearlyInspInfo carYearlyInspInfo);
	
	/**
     * 修改汽车年检
     * 
     * @param carYearlyInspInfo 汽车年检信息
     * @return 结果
     */
	public int updateCarYearlyInspInfo(CarYearlyInspInfo carYearlyInspInfo);
		
	/**
     * 删除汽车年检信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCarYearlyInspInfoByIds(String ids);
	
}
