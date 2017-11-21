package gouwuche.bwei.com.mvpshop.view;

import gouwuche.bwei.com.mvpshop.bean.ShopBean;

/**
 * Created by Adminjs on 2017/11/21.
 */
public interface MainViewListener {
    public void success(ShopBean bean);
    public void failure(Exception e);
}
