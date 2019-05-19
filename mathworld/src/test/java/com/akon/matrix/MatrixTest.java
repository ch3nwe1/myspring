package com.akon.matrix;


import org.junit.Test;
import org.la4j.Matrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * 矩阵测试
 */
public class MatrixTest {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void zeroTest(){

        Matrix matrix = Matrix.zero(10, 10);

        logger.info("===========================" + matrix);
    }

    @Test
    public void constantTest(){

        Matrix constant = Matrix.constant(5, 5, 1);

        logger.info(constant.toCSV());
    }

    /**
     * 对角矩阵
     */
    @Test
    public void diagonalTest(){

        Matrix diagonal = Matrix.diagonal(10, 2);

        logger.info(diagonal.toCSV());

    }

    /**
     * 单元矩阵
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     * 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000
     */
    @Test
    public void unitTest(){

        Matrix unit = Matrix.unit(10, 10);

        logger.info(unit.toCSV());

    }

    /**
     * 1.000, 0.000, 0.000, 0.000, 0.000
     * 0.000, 1.000, 0.000, 0.000, 0.000
     * 0.000, 0.000, 1.000, 0.000, 0.000
     * 0.000, 0.000, 0.000, 1.000, 0.000
     * 0.000, 0.000, 0.000, 0.000, 1.000
     */
    @Test
    public void identityTest(){
        Matrix identity = Matrix.identity(5);
        logger.info(identity.toCSV());
    }

    /**
     * 0.727, 0.531, 0.160, 0.188
     * 0.517, 0.268, 0.261, 0.051
     * 0.804, 0.762, 0.530, 0.530
     */
    @Test
    public void randomTest(){

        Matrix random = Matrix.random(3, 4, new Random(47));
        logger.info(random.toCSV());

    }

}
