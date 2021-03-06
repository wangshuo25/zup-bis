package cn.zup.bis.controller.bireport;

import cn.zup.bis.entity.bireport.ParamDto;
import cn.zup.bis.entity.model.Dimension;
import cn.zup.bis.service.model.CubeService;
import cn.zup.bis.service.model.DimensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/bireport")
public class DimController {
	
	@Autowired
	private CubeService service;
	
	@Autowired
	private DimensionService dimService;

	@RequestMapping(value="/queryDims.action")
	public @ResponseBody
    Object queryDims(Integer cubeId){
		return service.listDims(cubeId);
	}
//
//	@RequestMapping(value="/paramFilter.action")
//	public String paramFilter(ParamDto param, ModelMap model) throws Exception{
//
//		Dimension d = dimService.getDimInfo(param.getId(), param.getCubeId());
//		List<Map<String, Object>> ls = service.paramFilter(d, null, param.getDsid());
//		model.addAttribute("datas", ls);
//		model.addAttribute("dimType", d.getType());
//		model.addAttribute("vals", param.getVals());
//		model.addAttribute("dimId", param.getId());
//		if(d.getType().equals("month") || d.getType().equals("day")){
//			model.addAttribute("st", param.getSt());
//			model.addAttribute("end", param.getEnd());
//		}
//		return "bireport/DimFilter-pfilter";
//	}
//
//	@RequestMapping(value="/paramSearch.action")
//	public String paramSearch(ParamDto param, String keyword, ModelMap model) throws Exception{
//
//		Dimension d = dimService.getDimInfo(param.getId(), param.getCubeId());
//		List<Map<String, Object>> ls = service.paramFilter(d, keyword, param.getDsid());
//		model.addAttribute("datas", ls);
//		model.addAttribute("dimType", d.getType());
//		model.addAttribute("vals", param.getVals());
//		model.addAttribute("dimId", param.getId());
//		return "bireport/DimFilter-search";
//	}
//
//	@RequestMapping(value="/DimFilter.action")
//	public String dimFilter(ParamDto param, ModelMap model) throws Exception{
//		Dimension d = dimService.getDimInfo(param.getId(), param.getCubeId());
//		List<Map<String, Object>> ls = service.paramFilter(d, null, param.getDsid());
//		model.addAttribute("datas", ls);
//		model.addAttribute("dimType", d.getType());
//		model.addAttribute("vals", param.getVals());
//		model.addAttribute("dimId", param.getId());
//		if(d.getType().equals("month") || d.getType().equals("day")){
//			model.addAttribute("st", param.getSt());
//			model.addAttribute("end", param.getEnd());
//		}
//		model.addAttribute("filtertype", param.getFiltertype());
//		model.addAttribute("dateformat", param.getDateformat());
//		return "bireport/DimFilter";
//	}
}
