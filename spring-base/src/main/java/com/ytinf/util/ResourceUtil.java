package com.ytinf.util;

import org.springframework.core.io.Resource;

import java.util.List;

public class ResourceUtil {
    private Resource[] resources ;  // 描述所有的资源
    // setter、getter方法、略 ...


    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
    }
}
