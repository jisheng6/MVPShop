package gouwuche.bwei.com.mvpshop.presenter;

import gouwuche.bwei.com.mvpshop.bean.ShopBean;
import gouwuche.bwei.com.mvpshop.model.MainModel;
import gouwuche.bwei.com.mvpshop.model.MainModelCallBack;
import gouwuche.bwei.com.mvpshop.view.MainViewListener;

/**
 * Created by Adminjs on 2017/11/21.
 */
public class MainPresenter {
    private MainViewListener listener;
    private MainModel mainModel;

    public MainPresenter(MainViewListener listener) {
        this.listener = listener;
        this.mainModel = new MainModel();
    }

    public void getData(){
        mainModel.getData(new MainModelCallBack() {
            @Override
            public void success(ShopBean bean) {
                if (listener != null){
                    listener.success(bean);
                }
            }

            @Override
            public void failure(Exception e) {
                 if (listener != null){
                     listener.failure(e);
                 }
            }
        });
    }
    public void detach(){
        listener = null;
    }
}
