package com.example.wangkuan.gridviewjiehelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bwei.adapter.MyGridAdapter;
import com.bwei.adapter.MyListAdapter;
import com.bwei.bean.MyGridView;
import com.bwei.view.MyGrid;
import com.bwei.view.MyList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MyList lv;
    private ArrayList<MyGridView> ls1 = new ArrayList<MyGridView>();
    private MyGrid gv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shuJu();
        lv = (MyList) findViewById(R.id.listview);
        gv = (MyGrid) findViewById(R.id.girdview);
        gv.setAdapter(new MyGridAdapter(getApplicationContext(), ls1));
        lv.setAdapter(new MyListAdapter(getApplicationContext(), ls1));
    }


    private void shuJu() {
        ls1.add(new MyGridView(R.mipmap.gv1, "作家协会"));
        ls1.add(new MyGridView(R.mipmap.gv2, "美术家协会"));
        ls1.add(new MyGridView(R.mipmap.gv3, "杂技家协会"));
        ls1.add(new MyGridView(R.mipmap.gv4, "戏剧协会"));
        ls1.add(new MyGridView(R.mipmap.gv5, "舞蹈家协会"));
        ls1.add(new MyGridView(R.mipmap.gv6, "音乐家协会"));
        ls1.add(new MyGridView(R.mipmap.gv7, "曲艺家协会"));
        ls1.add(new MyGridView(R.mipmap.gv8, "民间文艺家协会"));
        ls1.add(new MyGridView(R.mipmap.gv9, "书法家协会"));
        ls1.add(new MyGridView(R.mipmap.gv10, "电影家协会"));
        ls1.add(new MyGridView(R.mipmap.gv11, "摄影家协会"));
        ls1.add(new MyGridView(R.mipmap.gv12, "电视艺术家协会"));
        ls1.add(new MyGridView(R.mipmap.gv13, "评论家协会"));
        ls1.add(new MyGridView(R.mipmap.gv14, "飞天俱乐部"));


    }
}
