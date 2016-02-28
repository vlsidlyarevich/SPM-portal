package com.itibo.spm_portal.login_form.config.core;

import com.itibo.spm_portal.login_form.config.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Администратор on 28.02.2016.
 */
public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses(){

        return new Class[] {AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return null;
    }

    @Override
    protected String[] getServletMappings(){
        return new String[] {"/"};
    }

}
