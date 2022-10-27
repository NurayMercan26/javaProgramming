package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("list = " + list);
        System.out.println(list.get(4));

        Set<Integer>hashset = new HashSet<>();

        hashset.addAll(Arrays.asList(10,200,300,40,90));
        hashset.addAll(Arrays.asList(10,200,300,40,90));
        hashset.addAll(Arrays.asList(10,200,300,40,90));
        hashset.addAll(Arrays.asList(10,200,300,40,90));
        hashset.addAll(Arrays.asList(10,200,300,40,90));
        hashset.addAll(Arrays.asList(null,null,null));

        System.out.println("hashset = " + hashset);
        //System.out.println(hashset.get(6));


        Set<Integer> lınkedHashSet = new LinkedHashSet<>();

        lınkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        lınkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        lınkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        lınkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        lınkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        lınkedHashSet.addAll(Arrays.asList(null,null,null));


        System.out.println("lınkedHashSet = " + lınkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //treeSet.addAll(Arrays.asList(null,null,null));

        System.out.println("treeSet = " + treeSet);


    }

}
