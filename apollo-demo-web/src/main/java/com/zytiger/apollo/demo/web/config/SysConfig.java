/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.zytiger.apollo.demo.web.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author auto
 * @version SysConfig.java, v 0.1 2018-07-20 16:27
 */
@Configuration
@Getter
public class SysConfig {
    /********************* 数据源 ******************/
    @Value("${jdbc.pool.validationQuery}")
    private String jdbcPoolValidationQuery;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    /*********************系统当前运行环境********************/
    @Value("${application.env}")
    private String applicationEnv;


}
