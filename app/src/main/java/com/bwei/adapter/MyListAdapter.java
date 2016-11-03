package com.bwei.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwei.bean.MyGridView;
import com.example.wangkuan.gridviewjiehelistview.R;

import java.util.ArrayList;

/**
 * Created by wangkuan on 2016/11/3.
 */
public class MyListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<MyGridView> ls1;

    public MyListAdapter(Context context, ArrayList<MyGridView> ls1) {
        this.context = context;
        this.ls1 = ls1;
    }

    @Override
    public int getCount() {
        return ls1.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = View.inflate(context, R.layout.listitem, null);
        ImageView iv = (ImageView) inflate.findViewById(R.id.list_iv);
        TextView tv = (TextView) inflate.findViewById(R.id.list_tv);
        iv.setImageResource(ls1.get(i).getTuPian());
        tv.setText(ls1.get(i).getBiaoTi());
        return inflate;
    }
}
