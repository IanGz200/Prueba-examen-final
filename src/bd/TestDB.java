/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.util.ArrayList;
import modelo.Test;

/**
 * -Comenta la clase-
 *
 * @author IanGz
 */
public class TestDB {

    private static ArrayList<Test> tests = new ArrayList<>();

    /**
     *
     * @return
     */
    public static ArrayList<Test> getTests() {
        return tests;
    }

    /**
     *
     * @param id
     * @return
     */
    public static Test findById(int id) {

        return null;

    }

    /**
     *
     * @param test
     */
    public static void saveTest(Test test) {

        tests.add(tests.size(), test);
        
    }

}
