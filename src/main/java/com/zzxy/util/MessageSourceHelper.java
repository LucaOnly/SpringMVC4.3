package com.zzxy.util;
import java.util.Locale;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;  
  
/** 
 * 国际化信息工具类 
 */  
public class MessageSourceHelper {  
      
    private static ReloadableResourceBundleMessageSource messageSource;  
      
    public void setMessageSource(ReloadableResourceBundleMessageSource messageSource) {  
        MessageSourceHelper.messageSource = messageSource;  
    }  
      
    public static String  getMessage(String code, Object[] args, String defaultMessage, Locale locale) {  
        String msg = messageSource.getMessage(code, args, defaultMessage, locale);  
        return msg != null ? msg.trim() : defaultMessage;  
    }  
}  