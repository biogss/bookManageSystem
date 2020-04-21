package com.example.util;

import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

/**
 * @ClassName StringToBigDecimalConverter
 * @Description TODO
 * @Author wangHao
 * @DATE 2020/4/20 23:01
 * @Version 1.0
 */
public class StringToBigDecimalConverter implements Converter<String, BigDecimal> {
    @Override
    public BigDecimal convert(String source) {
        return new BigDecimal(source);
    }
}
