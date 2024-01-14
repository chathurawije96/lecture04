/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.lecture04.extentions;

import com.icbt.lecture04.bl.BusinessLogicImpl;

/**
 *
 * @author hd
 */
public class App {
    public static void main(String[] args) {
        DBUtils bUtils = new MySQLDBUtils();
        BusinessLogicImpl.businessLogic(bUtils);
    }
    
}
