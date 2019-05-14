package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 车辆表 sys_car_info
 * 
 * @author ruoyi
 * @date 2019-04-04
 */
public class CarInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 车辆信息id */
	private Integer carId;
	/** 车牌号码 */
	private String carLicense;
	/** 车辆类型 */
	private Integer carType;
	/** 车辆所有人姓名 */
	private String carOwerName;
	/** 车辆所有人地址 */
	private String carOwnerAddress;
	/** 车辆使用性质 */
	private Integer carUseType;
	/** 车辆品牌型号 */
	private String carBrand;
	/** 车辆识别代码 */
	private String carIdCode;
	/** 车辆发动机号码 */
	private String carEngineNum;
	/** 车辆注册日期 */
	private Date carRegistDate;
	/** 车辆发证日期 */
	private Date carCertificateDate;
	/** 核载人数 */
	private Integer carNuclearNum;
	/** 车辆总质量 */
	private Double carTotalMass;
	/** 汽车整备质量 */
	private Double carCurbWeight;
	/** 创建时间 */
	private Date createDate;

	public void setCarId(Integer carId) 
	{
		this.carId = carId;
	}

	public Integer getCarId() 
	{
		return carId;
	}
	public void setCarLicense(String carLicense) 
	{
		this.carLicense = carLicense;
	}

	public String getCarLicense() 
	{
		return carLicense;
	}
	public void setCarType(Integer carType) 
	{
		this.carType = carType;
	}

	public Integer getCarType() 
	{
		return carType;
	}
	public void setCarOwerName(String carOwerName) 
	{
		this.carOwerName = carOwerName;
	}

	public String getCarOwerName() 
	{
		return carOwerName;
	}
	public void setCarOwnerAddress(String carOwnerAddress) 
	{
		this.carOwnerAddress = carOwnerAddress;
	}

	public String getCarOwnerAddress() 
	{
		return carOwnerAddress;
	}
	public void setCarUseType(Integer carUseType) 
	{
		this.carUseType = carUseType;
	}

	public Integer getCarUseType() 
	{
		return carUseType;
	}
	public void setCarBrand(String carBrand) 
	{
		this.carBrand = carBrand;
	}

	public String getCarBrand() 
	{
		return carBrand;
	}
	public void setCarIdCode(String carIdCode) 
	{
		this.carIdCode = carIdCode;
	}

	public String getCarIdCode() 
	{
		return carIdCode;
	}
	public void setCarEngineNum(String carEngineNum) 
	{
		this.carEngineNum = carEngineNum;
	}

	public String getCarEngineNum() 
	{
		return carEngineNum;
	}
	public void setCarRegistDate(Date carRegistDate) 
	{
		this.carRegistDate = carRegistDate;
	}

	public Date getCarRegistDate() 
	{
		return carRegistDate;
	}
	public void setCarCertificateDate(Date carCertificateDate) 
	{
		this.carCertificateDate = carCertificateDate;
	}

	public Date getCarCertificateDate() 
	{
		return carCertificateDate;
	}
	public void setCarNuclearNum(Integer carNuclearNum) 
	{
		this.carNuclearNum = carNuclearNum;
	}

	public Integer getCarNuclearNum() 
	{
		return carNuclearNum;
	}
	public void setCarTotalMass(Double carTotalMass) 
	{
		this.carTotalMass = carTotalMass;
	}

	public Double getCarTotalMass() 
	{
		return carTotalMass;
	}
	public void setCarCurbWeight(Double carCurbWeight) 
	{
		this.carCurbWeight = carCurbWeight;
	}

	public Double getCarCurbWeight() 
	{
		return carCurbWeight;
	}
	public void setCreateDate(Date createDate) 
	{
		this.createDate = createDate;
	}

	public Date getCreateDate() 
	{
		return createDate;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("carId", getCarId())
            .append("carLicense", getCarLicense())
            .append("carType", getCarType())
            .append("carOwerName", getCarOwerName())
            .append("carOwnerAddress", getCarOwnerAddress())
            .append("carUseType", getCarUseType())
            .append("carBrand", getCarBrand())
            .append("carIdCode", getCarIdCode())
            .append("carEngineNum", getCarEngineNum())
            .append("carRegistDate", getCarRegistDate())
            .append("carCertificateDate", getCarCertificateDate())
            .append("carNuclearNum", getCarNuclearNum())
            .append("carTotalMass", getCarTotalMass())
            .append("carCurbWeight", getCarCurbWeight())
            .append("createDate", getCreateDate())
            .toString();
    }
}
