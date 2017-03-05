package com.me.android.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Name> nameList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNames();//初始化数据
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);

        //指定RecyclerView 布局方式  线性布局
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        NameAdapter adapter=new NameAdapter(nameList);//将数据传入NameAdapter的构造函数中
        recyclerView.setAdapter(adapter);
    }

    private void initNames(){
        for(int i=0;i<=20;i++){
            Name name1=new Name("张三");
            nameList.add(name1);
            Name name2=new Name("李四");
            nameList.add(name2);
            Name name3=new Name("王五");
            nameList.add(name3);
            Name name4=new Name("赵六");
            nameList.add(name4);
        }
    }
}
