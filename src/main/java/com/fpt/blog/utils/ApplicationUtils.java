package com.fpt.blog.utils;

import com.fpt.blog.constants.BaseConstants;

public class ApplicationUtils {

    public static boolean isAllowedEmail(String email) {

        if (email == null || email.isBlank()) {
            return false;
        }
        String domain = email.substring(email.lastIndexOf("@") + 1);

        return BaseConstants.ALLOWED_DOMAINS.contains(domain);
    }

}
