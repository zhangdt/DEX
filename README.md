# DEX
利用DexClassLader来加载sd卡上jar文件

package com.dynamic.impl;

import android.app.Activity;
import android.widget.Toast;

import com.dynamic.interfaces.IDynamic;

public class Dynamic implements IDynamic {

    private Activity mActivity;  
    
    @Override  
    public void init(Activity activity) {  
        mActivity = activity;  
    }  
      
    @Override  
    public void showBanner() {  
        Toast.makeText(mActivity, "我是ShowBannber方法", 1500).show();  
    }  
  
    @Override  
    public void showDialog() {  
        Toast.makeText(mActivity, "我是ShowDialog方法", 1500).show();  
    }  
  
    @Override  
    public void showFullScreen() {  
        Toast.makeText(mActivity, "我是ShowFullScreen方法", 1500).show();  
    }  
  
    @Override  
    public void showAppWall() {  
        Toast.makeText(mActivity, "我是ShowAppWall方法", 1500).show();  
    }  
  
    @Override  
    public void destory() {  
    }  
  
} 

将Dynamic打成jar放在sd卡下 在程序中动态加载它
