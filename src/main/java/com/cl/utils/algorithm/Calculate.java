package com.cl.utils.algorithm;

import java.util.ArrayList;

/**
 * @author hi
 * 计算均方差
 */
public class Calculate {

    public Calculate(){}

    public static float meanSquareError(Classfier... params){
        int size = params.length;
        float res = 0f;
        //6个维度
        for (int i = 0; i < params[0].getFenglei().length; i++) {
            float pjz = 0f;
            float jfc = 0f;
            for (int j = 0; j < size; j++) {
                pjz += params[j].getFenglei()[i];
            }
            //计算平均值
            pjz /= size;
            for (int j = 0; j < size; j++) {
                //计算均方差
                jfc += Math.pow(params[j].getFenglei()[i] - pjz, 2);
            }
            jfc /= size;
            res += (float) Math.sqrt(jfc);
        }
        res = (float) (Math.round(res * 1000000)) / 1000000;

        return res;
    }

    //Algorithm :计算均方差
    public static float meanSquareError(ArrayList<Classfier> list) {
        int size = list.size();
        float res = 0f;
        //6个维度
        for (int i = 0; i < list.get(0).getFenglei().length; i++) {
            float pjz = 0f;
            float jfc = 0f;
            for (int j = 0; j < size; j++) {
                pjz += list.get(j).getFenglei()[i];
            }
            //计算平均值
            pjz /= size;
            for (int j = 0; j < size; j++) {
                //计算均方差
                jfc += Math.pow(list.get(j).getFenglei()[i] - pjz, 2);
            }
            jfc /= size;
            res += (float) Math.sqrt(jfc);
        }
        res = (float) (Math.round(res * 1000000)) / 1000000;
        return res;
    }

    //计算全部宿舍均方差之和(目标函数)
    public static float minCostFunction(ArrayList<ArrayList<Classfier>> arrayLists){
        float cost = 0f;
        for (ArrayList<Classfier> list: arrayLists){
            if (list.size() == 1){
                continue;
            }
            else {
                cost += Calculate.meanSquareError(list);
            }
        }
        return cost;
    }

    //计算欧式距离
    public static float EuclideanDistance(Classfier paramA, Classfier paramB){
        float distance = 0f;

        for (int i = 0; i < paramA.getFenglei().length; ++i){
            distance += Math.pow(paramA.getFenglei()[i] - paramB.getFenglei()[i],2);
        }
        return (float)Math.sqrt(distance);
    }

    //计算欧式距离
    public static float EuclideanDistance(float[] arrA, int[] arrB){
        float distance = 0f;

        for (int i = 0; i < arrA.length; i++){
            distance += Math.pow(arrA[i] - arrB[i],2);
        }
        return (float)Math.sqrt(distance);
    }
}
