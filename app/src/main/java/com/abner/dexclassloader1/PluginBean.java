package com.abner.dexclassloader1;

/**
 * Created by abner on 2016/7/25.
 */
public class PluginBean {
    String label;
    String pkgName;

    public PluginBean(String label, String pkgName)
    {
        this.label = label;
        this.pkgName = pkgName;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
