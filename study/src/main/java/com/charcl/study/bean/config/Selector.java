package com.charcl.study.bean.config;

import com.charcl.study.bean.selector.AutoConfigurationImportSelector;
import org.springframework.context.annotation.Import;

//@Configuration
@Import(AutoConfigurationImportSelector.class)
//@Import(MyImportSelector.class)
public class Selector {
}
