package com.loop.utilities;

import java.awt.*;

public class TestExcel {
    public static void main(String[] args) {
        ExcelUtils excelUtils = new ExcelUtils("C:/Users/geyba/Desktop/Book1.xlsx","Sheet1");

        System.out.println("data from excel = "+excelUtils.getCellData(0,0));


    }
}
