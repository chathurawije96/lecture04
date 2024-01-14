/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.lecture04.extentions;

/**
 *
 * @author hd
 */
public class MongoDBUtils implements DBUtils{

    @Override
    public void connect() {
        System.err.println("Connected to the Mongo DB");
    }

    @Override
    public void addData() {
       System.err.println("Added data to the Mongo DB");
    }
}
