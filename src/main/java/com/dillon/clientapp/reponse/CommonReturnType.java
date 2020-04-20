package com.dillon.clientapp.reponse;

import lombok.Data;

/**
 * @author DillonXie
 * @version 1.0
 * @date 2020/4/19 21:21
 */
@Data
public class CommonReturnType {
    private String status;
    private Object data;

    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }

    public static CommonReturnType create(Object result,String status){
        CommonReturnType commonReturnType=new CommonReturnType();
        commonReturnType.setStatus(status);
        commonReturnType.setData(result);
        return commonReturnType;
    }
}
