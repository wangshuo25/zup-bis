package cn.zup.bis.dao.bireport;

import cn.zup.bis.entity.bireport.OlapInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OlapDao {

	List<Map<String, Object>> listDims(@Param("cubeId") Integer cubeId);

	OlapInfo getOlap(@Param("pageId") Integer pageId);

	List<OlapInfo> listreport(@Param("keyword") String keyword);

	void deleteOlap(@Param("pageId") Integer pageId);

	void insertOlap(OlapInfo olap);

	void renameOlap(OlapInfo olap);

	void updateOlap(OlapInfo olap);

	Integer maxOlapId();

	Integer olapExist(@Param("pageName") String pageName);

	List<Map<String, Object>> listKpiDesc(@Param("cubeId") Integer cubeId);
}
