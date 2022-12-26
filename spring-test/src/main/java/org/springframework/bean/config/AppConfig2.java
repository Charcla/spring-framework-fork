package org.springframework.bean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("org.springframework.bean.threecache")
@EnableAspectJAutoProxy
public class AppConfig2 {
}
