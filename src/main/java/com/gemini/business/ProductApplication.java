package com.gemini.business;

import com.gemini.boot.framework.core.CoreApplication;
import com.gemini.boot.framework.core.exception.CoreException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 小明不读书
 * @date 2018-11-04
 */

@ComponentScan("com.gemini")
@EnableCaching
@EnableTransactionManagement
@SpringBootApplication
public class ProductApplication {
    public static void main(String[] args) throws CoreException {
        CoreApplication.run(ProductApplication.class, args);
    }
}
