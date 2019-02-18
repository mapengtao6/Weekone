package com.bw.mapengtao20190218;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.bw.mapengtao20190218.adapter.MyAdapter;
import com.bw.mapengtao20190218.presenter.ShowPresenter;
import com.bw.mapengtao20190218.view.ShowView;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity implements ShowView {

    private RecyclerView rlv;
    private ShowPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        找控件
        rlv = findViewById(R.id.rlv);

//        创建管理者
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

//        设置布局管理器
        rlv.setLayoutManager(linearLayoutManager);

        presenter = new ShowPresenter(this);

        presenter.related();
    }

    @Override
    public void getVewData(JSONArray data) {

        MyAdapter myAdapter = new MyAdapter(this,data);
        rlv.setAdapter(myAdapter);
//        Log.i("ooo",myAdapter.toString());

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}
