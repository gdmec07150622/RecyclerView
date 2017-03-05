package com.me.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 2017/3/5.
 */

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.ViewHolder> {

    private List<Name> mNameList;


    //内部类
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;

        public ViewHolder(View view) {
            super(view);
            name=(TextView)view.findViewById(R.id.name);
        }
    }

   //构造函数
    //把数据传进来，并赋值给一个全局变量mNameList
    public NameAdapter(List<Name> nameList){
        mNameList=nameList;
    }

    //创建ViewHolder实例
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.name_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return  holder;
    }

    //为Recycler子项的数据进行赋值
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Name name=mNameList.get(position);
        holder.name.setText(name.getName());

    }

    @Override
    public int getItemCount() {
        return mNameList.size();//数据源长度
    }
}
