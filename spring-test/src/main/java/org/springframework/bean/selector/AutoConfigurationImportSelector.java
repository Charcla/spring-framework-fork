package org.springframework.bean.selector;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

//用来模拟自动装配
public class AutoConfigurationImportSelector implements DeferredImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[0];
	}

	private static class AutoConfigurationGroup
			implements DeferredImportSelector.Group, BeanClassLoaderAware, BeanFactoryAware, ResourceLoaderAware{

		@Override
		public void setBeanClassLoader(ClassLoader classLoader) {

		}

		@Override
		public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

		}

		@Override
		public void setResourceLoader(ResourceLoader resourceLoader) {

		}

		@Override
		public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {

		}

		@Override
		public Iterable<Entry> selectImports() {
			return null;
		}
	}
}
