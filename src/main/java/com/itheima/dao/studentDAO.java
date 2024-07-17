package com.itheima.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper
//public interface studentDAO  {
//    @Select("select * from test.student where s_id = #{id}")
//    public student select(Integer id);
//
//}
@Mapper
public interface studentDAO  extends BaseMapper<student> {


}
