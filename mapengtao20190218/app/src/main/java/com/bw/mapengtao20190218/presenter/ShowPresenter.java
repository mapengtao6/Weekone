package com.bw.mapengtao20190218.presenter;

import com.bw.mapengtao20190218.MainActivity;
import com.bw.mapengtao20190218.model.ShowModel;
import com.bw.mapengtao20190218.view.ShowView;

import org.json.JSONArray;

public class ShowPresenter {

    private final ShowModel showModel;
    private final ShowView showView;

    //    实例化
    public ShowPresenter(ShowView view) {
        showModel = new ShowModel();

        showView = view;
    }

    public void related() {
        showModel.getGoodsData();
        showModel.setOnShowLisenter(new ShowModel.OnShowLisenter() {
            @Override
            public void onResult(JSONArray data) {
                showView.getVewData(data);
            }
        });
    }
}
