package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 汽车年检表 car_yearly_insp_info
 * 
 * @author ruoyi
 * @date 2019-04-04
 */
public class CarYearlyInspInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 车辆id */
	private Integer carId;
	/** 年检时间 */
	private Date yeraInspDate;
	/** 年检费用 */
	private Double yearInspCost;
	/** 年检描述 */
	private String yearInspDes;
	/** 年检人员 */
	private String yearInspPeople;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setCarId(Integer carId) 
	{
		this.carId = carId;
	}

	public Integer getCarId() 
	{
		return carId;
	}
	public void setYeraInspDate(Date yeraInspDate) 
	{
		this.yeraInspDate = yeraInspDate;
	}

	public Date getYeraInspDate() 
	{
		return yeraInspDate;
	}
	public void setYearInspCost(Double yearInspCost) 
	{
		this.yearInspCost = yearInspCost;
	}

	public Double getYearInspCost() 
	{
		return yearInspCost;
	}
	public void setYearInspDes(String yearInspDes) 
	{
		this.yearInspDes = yearInspDes;
	}

	public String getYearInspDes() 
	{
		return yearInspDes;
	}
	public void setYearInspPeople(String yearInspPeople) 
	{
		this.yearInspPeople = yearInspPeople;
	}

	public String getYearInspPeople() 
	{
		return yearInspPeople;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("carId", getCarId())
            .append("yeraInspDate", getYeraInspDate())
            .append("yearInspCost", getYearInspCost())
            .append("yearInspDes", getYearInspDes())
            .append("yearInspPeople", getYearInspPeople())
            .toString();
    }
}
