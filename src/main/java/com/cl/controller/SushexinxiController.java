package com.cl.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.cl.entity.DormInfoEntity;
import com.cl.entity.view.DormInfoView;

import com.cl.service.SushexinxiService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;


/**
 * 宿舍信息
 * 后端接口
 */
@RestController
@RequestMapping("/sushexinxi")
public class SushexinxiController {
    @Autowired
    private SushexinxiService sushexinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, DormInfoEntity sushexinxi, HttpServletRequest request){

        EntityWrapper<DormInfoEntity> ew = new EntityWrapper<DormInfoEntity>();
		PageUtils page = sushexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sushexinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, DormInfoEntity sushexinxi, HttpServletRequest request){
        EntityWrapper<DormInfoEntity> ew = new EntityWrapper<DormInfoEntity>();
		PageUtils page = sushexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sushexinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DormInfoEntity sushexinxi){
       	EntityWrapper<DormInfoEntity> ew = new EntityWrapper<DormInfoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( sushexinxi, "sushexinxi")); 
        return R.ok().put("data", sushexinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DormInfoEntity sushexinxi){
        EntityWrapper<DormInfoEntity> ew = new EntityWrapper<DormInfoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( sushexinxi, "sushexinxi")); 
		DormInfoView sushexinxiView =  sushexinxiService.selectView(ew);
		return R.ok("查询宿舍信息成功").put("data", sushexinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DormInfoEntity sushexinxi = sushexinxiService.selectById(id);
        return R.ok().put("data", sushexinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DormInfoEntity sushexinxi = sushexinxiService.selectById(id);
        return R.ok().put("data", sushexinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DormInfoEntity sushexinxi, HttpServletRequest request){
    	sushexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sushexinxi);

        sushexinxiService.insert(sushexinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DormInfoEntity sushexinxi, HttpServletRequest request){
    	sushexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sushexinxi);

        sushexinxiService.insert(sushexinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DormInfoEntity sushexinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(sushexinxi);
        sushexinxiService.updateById(sushexinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        sushexinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DormInfoEntity> wrapper = new EntityWrapper<DormInfoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = sushexinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
