package com.example.config;

import com.example.util.StringToBigDecimalConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebConfig
 * @Description TODO
 * @Author wangHao
 * @DATE 2020/4/20 23:07
 * @Version 1.0
 */
@Configuration
public class WebConfig  implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToBigDecimalConverter());
    }
}
