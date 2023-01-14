package com.cl.utils.algorithm;

import java.util.ArrayList;
import java.util.Comparator;

public class Hungarian {

    //分宿舍,改进方法
    public ArrayList<ArrayList<Classfier>> assignmentDormitory(ArrayList<Classfier> arrayList) {
        ArrayList<Classfier> dormitory = (ArrayList<Classfier>) arrayList.clone();

        //学生总数
        int n = dormitory.size();
        //宿舍容量
        ArrayList<ArrayList<Classfier>> dormitoryList = new ArrayList<>();
        //4人直接分一个宿舍
        if (n <= 4) {
            dormitoryList.add(dormitory);
            return dormitoryList;
        }
        for (int i =0; i<dormitory.size(); i++){
            ArrayList<Classfier> dorm = new ArrayList<>();
            dorm.add(dormitory.get(i));
            dormitoryList.add(dorm);
        }
        dormitoryList = mergeLessDorm(dormitoryList,1);
        dormitoryList.sort(new MyComparator());
        dormitoryList = mergeLessDorm(dormitoryList,2);
        dormitoryList.sort(new MyComparator());

        return dormitoryList;
    }

    //找出assignedDorm中第一个0，表示该位置的group未分配宿舍
    public int findAssignedIndex(int[] assignedDorm){
        //-1表示未找到，意味着所有团队都已分配
        int index = -1;
        //找出assignedDorm中第一个0，表示该位置的group未分配宿舍
        for (int i = 0; i < assignedDorm.length; i++){
            if (assignedDorm[i] == 0){
                index = i;
                break;
            }
        }
        return index;
    }

    //Algorithm: Bipartite Graph Construction 构建二分图
    public float[][] constructGroupBipartiteGraph(ArrayList<ArrayList<Classfier>> list) {
        int size = list.size();
        float[][] matrix = new float[size][size];
        //计算 list第j 个节点到list 第k 个节点的均方差
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (j == k) {
                    matrix[j][k] = 100000f;
                } else if (j < k) {
                    ArrayList<Classfier> arr = new ArrayList<>();
                    arr.addAll(list.get(j));
                    arr.addAll(list.get(k));
                    matrix[j][k] = Calculate.meanSquareError(arr);
                } else if (j > k) {
                    matrix[j][k] = matrix[k][j];
                }
            }
        }
        return matrix;
    }

    //Algorithm: Bipartite Graph Construction 构建二分图
    public float[][] constructBipartiteGraph(ArrayList<Classfier> list) {
        int size = list.size();
        float[][] matrix = new float[size][size];
        //计算 list第j 个节点到list 第k 个节点的编辑距离
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (j == k) {
                    matrix[j][k] = 100000f;
                } else if (j < k) {
                    matrix[j][k] = Calculate.meanSquareError(list.get(j), list.get(k));
                } else if (j > k) {
                    matrix[j][k] = matrix[k][j];
                }
            }
        }
        return matrix;
    }

    //合并学生数为n的宿舍
    private ArrayList<ArrayList<Classfier>> mergeLessDorm(ArrayList<ArrayList<Classfier>> list, int n){
        ArrayList<ArrayList<Classfier>> dormitory = new ArrayList<ArrayList<Classfier>>();

        //匈牙利算法匹配
        float[][] bGraph = constructGroupBipartiteGraph(list);
        HungarianAlgorithm hungarianAlgorithm = new HungarianAlgorithm(bGraph);
        int[] groupExecute = hungarianAlgorithm.execute();
        int[] assignedDorm = new int[groupExecute.length];
        while(findAssignedIndex(assignedDorm) != -1){
            int index = findAssignedIndex(assignedDorm);
            ArrayList<Classfier> dorm = new ArrayList<>();
            dorm.addAll(list.get(index));
            assignedDorm[index] = 1;
            int next = groupExecute[index];
            if (assignedDorm[next] == 0){
                assignedDorm[next] = 1;
                dorm.addAll(list.get(next));
            }
            dormitory.add(dorm);
        }
        dormitory.sort(new MyComparator());
        ArrayList<ArrayList<Classfier>> dormitoryList = new ArrayList<ArrayList<Classfier>>();

        //list的分配结果是dormitory，将dormitory未完全分配的group提取出
        for (int i =0; i< dormitory.size(); i++){
            if (dormitory.get(i).size() <= n){
                dormitoryList.add(dormitory.get(i));
            }
            else{
                break;
            }
        }
        if (dormitoryList.size() <= 1){
            return dormitory;
        }
        else if (dormitoryList.size() == 2){
            dormitory.removeAll(dormitoryList);
            dormitoryList.get(0).addAll(dormitoryList.get(1));
            dormitory.add(dormitoryList.get(0));
            return dormitory;
        }
        else {
            dormitory.removeAll(dormitoryList);
            dormitory.addAll(mergeLessDorm(dormitoryList,n));
            return dormitory;
        }
    }
}

class MyComparator implements Comparator<ArrayList<Classfier>>{
    @Override
    public int compare(ArrayList<Classfier> o1, ArrayList<Classfier> o2) {
        //根据元素内部元素的个数从大到小排序
        if (o1.size() !=o2.size()){
            return o1.size() > o2.size() ? 1:-1;
        }
        return 0;
    }
}