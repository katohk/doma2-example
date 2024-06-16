package com.github.katohk.sample.doma2.db001;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.core.annotation.AliasFor;
import org.springframework.transaction.annotation.Transactional;

@Retention(RetentionPolicy.RUNTIME)
@Transactional(rollbackFor = Exception.class)
public @interface Transactional001 {
	@AliasFor(annotation = Transactional.class, attribute="value")
	String value() default "txManager001";
}
