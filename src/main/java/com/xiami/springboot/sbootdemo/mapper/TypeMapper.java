package com.xiami.springboot.sbootdemo.mapper;

import com.xiami.springboot.sbootdemo.domain.Type;
import org.springframework.stereotype.Repository;

/**
 * 类型
 * @author
 * @date
 */
@Repository
public interface TypeMapper {
    /**
     * 类别
     * @return
     */
    public Type selectType();
}
