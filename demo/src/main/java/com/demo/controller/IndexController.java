package com.demo.controller;

import com.jfinal.core.Controller;

/**
 * @Auther: guoyongkui
 * @Date: 2018/11/9 22:26
 * @ProjectName: demo
 * @Description:
 */
public class IndexController  extends Controller {

    public void index(){
        renderJson("汤迎春是吃货");
    }
}
