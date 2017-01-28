package com.bolyartech.forge.server.module.user_facebook;

import com.bolyartech.forge.server.module.user.ExternalUser;


public interface FacebookWrapper {
    ExternalUser checkToken(String token);
}
