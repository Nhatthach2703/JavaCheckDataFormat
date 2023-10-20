/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.DataFormatRepository;

/**
 *
 * @author Xuan Vinh
 */
public class CheckDataFormat {
    DataFormatRepository program;

    public CheckDataFormat() {
        program = new DataFormatRepository();
    }

    public void run() {
        System.out.println("\nValidate Program:");
        program.Validate();
    }
}
