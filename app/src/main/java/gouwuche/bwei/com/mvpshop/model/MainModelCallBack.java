package gouwuche.bwei.com.mvpshop.model;

import gouwuche.bwei.com.mvpshop.bean.ShopBean;

/**
 * Created by Adminjs on 2017/11/21.
 */
public interface MainModelCallBack {

   public void success(ShopBean bean);
   public void failure(Exception e);
}
