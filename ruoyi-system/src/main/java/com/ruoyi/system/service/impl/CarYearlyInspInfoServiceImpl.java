package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CarYearlyInspInfoMapper;
import com.ruoyi.system.domain.CarYearlyInspInfo;
import com.ruoyi.system.service.ICarYearlyInspInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 汽车年检 服务层实现
 * 
 * @author ruoyi
 * @date 2019-04-04
 */
@Service
public class CarYearlyInspInfoServiceImpl implements ICarYearlyInspInfoService 
{
	@Autowired
	private CarYearlyInspInfoMapper carYearlyInspInfoMapper;

	/**
     * 查询汽车年检信息
     * 
     * @param id 汽车年检ID
     * @return 汽车年检信息
     */
    @Override
	public CarYearlyInspInfo selectCarYearlyInspInfoById(Integer id)
	{
	    return carYearlyInspInfoMapper.selectCarYearlyInspInfoById(id);
	}
	
	/**
     * 查询汽车年检列表
     * 
     * @param carYearlyInspInfo 汽车年检信息
     * @return 汽车年检集合
     */
	@Override
	public List<CarYearlyInspInfo> selectCarYearlyInspInfoList(CarYearlyInspInfo carYearlyInspInfo)
	{
	    return carYearlyInspInfoMapper.selectCarYearlyInspInfoList(carYearlyInspInfo);
	}
	
    /**
     * 新增汽车年检
     * 
     * @param carYearlyInspInfo 汽车年检信息
     * @return 结果
     */
	@Override
	public int insertCarYearlyInspInfo(CarYearlyInspInfo carYearlyInspInfo)
	{
	    return carYearlyInspInfoMapper.insertCarYearlyInspInfo(carYearlyInspInfo);
	}
	
	/**
     * 修改汽车年检
     * 
     * @param carYearlyInspInfo 汽车年检信息
     * @return 结果
     */
	@Override
	public int updateCarYearlyInspInfo(CarYearlyInspInfo carYearlyInspInfo)
	{
	    return carYearlyInspInfoMapper.updateCarYearlyInspInfo(carYearlyInspInfo);
	}

	/**
     * 删除汽车年检对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCarYearlyInspInfoByIds(String ids)
	{
		return carYearlyInspInfoMapper.deleteCarYearlyInspInfoByIds(Convert.toStrArray(ids));
	}
	
}
