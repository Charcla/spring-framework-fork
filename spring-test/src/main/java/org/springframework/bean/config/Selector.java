package org.springframework.bean.config;

import org.springframework.bean.selector.AutoConfigurationImportSelector;
import org.springframework.bean.selector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
@Import(AutoConfigurationImportSelector.class)
//@Import(MyImportSelector.class)
public class Selector {
}
