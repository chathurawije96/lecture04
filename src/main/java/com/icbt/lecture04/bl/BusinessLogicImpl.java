/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.lecture04.bl;

import com.icbt.lecture04.extentions.DBUtils;

/**
 *
 * @author hd
 */
public class BusinessLogicImpl {
    public static void businessLogic(DBUtils bUtils){
        bUtils.connect();
        
        bUtils.addData();
        bUtils.addData();
        bUtils.addData();
        bUtils.addData();
    }
    
}
