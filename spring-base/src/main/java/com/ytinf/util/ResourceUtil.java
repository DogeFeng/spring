package com.ytinf.util;

import org.springframework.core.io.Resource;

public class ResourceUtil {
    private Resource fileResource ;
    private Resource classpathResource ;
    private Resource urlResource ;
    // sette、getter略


    public Resource getFileResource() {
        return fileResource;
    }

    public void setFileResource(Resource fileResource) {
        this.fileResource = fileResource;
    }

    public Resource getClasspathResource() {
        return classpathResource;
    }

    public void setClasspathResource(Resource classpathResource) {
        this.classpathResource = classpathResource;
    }

    public Resource getUrlResource() {
        return urlResource;
    }

    public void setUrlResource(Resource urlResource) {
        this.urlResource = urlResource;
    }
}
