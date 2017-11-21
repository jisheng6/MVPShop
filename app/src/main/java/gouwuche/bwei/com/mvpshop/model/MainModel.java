package gouwuche.bwei.com.mvpshop.model;

import gouwuche.bwei.com.mvpshop.bean.ShopBean;
import gouwuche.bwei.com.mvpshop.okhttp.AbstractUiCallBack;
import gouwuche.bwei.com.mvpshop.okhttp.OkhttpUtils;

/**
 * Created by Adminjs on 2017/11/21.
 */
public class MainModel {

    public void getData(final MainModelCallBack callBack) {
        OkhttpUtils.getInstance().asy(null, "http://120.27.23.105/product/getCarts?uid=100", new AbstractUiCallBack<ShopBean>() {


            @Override
            public void success(ShopBean bean) {
                callBack.success(bean);
            }

            @Override
            public void failure(Exception e) {
                 callBack.failure(e);
            }
        });
    }

}
