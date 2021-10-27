package com.Paolo.demo;

import com.Paolo.bean.newArray;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class RestRotate {

    private  AtomicLong counter =new AtomicLong();
    private newArray ar=new newArray();
    private List<newArray> list=new ArrayList<newArray>();

    @GetMapping("/Rotate")
    public List<newArray> getLastArray (){
    return list;
    }

    @PostMapping("/Rotate/add")
    @ResponseStatus(HttpStatus.CREATED)
    public newArray addArray(@RequestBody newArray array){
        int n=(array.getDimension());
        array.setINPUT(createArray(n).toString());
        array.setOUTPUT(rotateArray(createArray(n),n).toString());
        array.setId(n);
        list.add(array);
        return array;
    }

    public List<List<Integer>> createArray(int n) {

        List<List<Integer>> array=new ArrayList<>();
        int inc=1;
        for(int i=0;i<n;i++){

            array.add(new ArrayList());
            for(int j=0;j<n;j++)
            {
                array.get(i).add(inc);
                inc++;
            }}

        return array;

    }

    public static List<List<Integer>> rotateArray(List<List<Integer>> array , Integer n) {
        List<List<Integer>> arr=new ArrayList<>();
        for (int i = 0; i < n; ++i){
            arr.add(new ArrayList());
            for (int j = 0; j < n; ++j)
                arr.get(i).add(array.get(j).get(n-i-1));
        }
        return arr;
    }
}
