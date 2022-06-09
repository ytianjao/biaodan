package com.biaodan.demo.dao;

import com.biaodan.demo.model.BiaodanTable2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月07日 18:40
 */

@Mapper
public interface BiaodanDao {
//    @Select("select * from biaodan_table where biaodan_id=1")
    @Select("select * from biaodan_table2")
    List<BiaodanTable2> findBiaoDanData();

    @Update("update biaodan_table2 set " +
            "col1=#{biaodanTable2.col1}," +
            "col2=#{biaodanTable2.col2}," +
            "col3=#{biaodanTable2.col3}," +
            "col4=#{biaodanTable2.col4}," +
            "col5=#{biaodanTable2.col5}," +
            "col6=#{biaodanTable2.col6}," +
            "col7=#{biaodanTable2.col7}," +
            "col8=#{biaodanTable2.col8}," +
            "col9=#{biaodanTable2.col9}," +
            "col10=#{biaodanTable2.col10}," +
            "col11=#{biaodanTable2.col11} where id=#{id}")
//    @Update("update biaodan_table2 set col1=#{biaodanTable2.col1} where id=#{id}")
    int updateBiaoDanRow(Long id, BiaodanTable2 biaodanTable2);
}
