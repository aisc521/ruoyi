package com.ruoyi.web.controller.car;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.CarYearlyInspInfo;
import com.ruoyi.system.service.ICarYearlyInspInfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 汽车年检 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-04
 */
@Controller
@RequestMapping("/system/carYearlyInspInfo")
public class CarYearlyInspInfoController extends BaseController
{
    private String prefix = "system/carYearlyInspInfo";
	
	@Autowired
	private ICarYearlyInspInfoService carYearlyInspInfoService;
	
	@RequiresPermissions("system:carYearlyInspInfo:view")
	@GetMapping()
	public String carYearlyInspInfo()
	{
	    return prefix + "/carYearlyInspInfo";
	}
	
	/**
	 * 查询汽车年检列表
	 */
	@RequiresPermissions("system:carYearlyInspInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(CarYearlyInspInfo carYearlyInspInfo)
	{
		startPage();
        List<CarYearlyInspInfo> list = carYearlyInspInfoService.selectCarYearlyInspInfoList(carYearlyInspInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出汽车年检列表
	 */
	@RequiresPermissions("system:carYearlyInspInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CarYearlyInspInfo carYearlyInspInfo)
    {
    	List<CarYearlyInspInfo> list = carYearlyInspInfoService.selectCarYearlyInspInfoList(carYearlyInspInfo);
        ExcelUtil<CarYearlyInspInfo> util = new ExcelUtil<CarYearlyInspInfo>(CarYearlyInspInfo.class);
        return util.exportExcel(list, "carYearlyInspInfo");
    }
	
	/**
	 * 新增汽车年检
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存汽车年检
	 */
	@RequiresPermissions("system:carYearlyInspInfo:add")
	@Log(title = "汽车年检", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(CarYearlyInspInfo carYearlyInspInfo)
	{		
		return toAjax(carYearlyInspInfoService.insertCarYearlyInspInfo(carYearlyInspInfo));
	}

	/**
	 * 修改汽车年检
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		CarYearlyInspInfo carYearlyInspInfo = carYearlyInspInfoService.selectCarYearlyInspInfoById(id);
		mmap.put("carYearlyInspInfo", carYearlyInspInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存汽车年检
	 */
	@RequiresPermissions("system:carYearlyInspInfo:edit")
	@Log(title = "汽车年检", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(CarYearlyInspInfo carYearlyInspInfo)
	{		
		return toAjax(carYearlyInspInfoService.updateCarYearlyInspInfo(carYearlyInspInfo));
	}
	
	/**
	 * 删除汽车年检
	 */
	@RequiresPermissions("system:carYearlyInspInfo:remove")
	@Log(title = "汽车年检", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(carYearlyInspInfoService.deleteCarYearlyInspInfoByIds(ids));
	}
	
}
