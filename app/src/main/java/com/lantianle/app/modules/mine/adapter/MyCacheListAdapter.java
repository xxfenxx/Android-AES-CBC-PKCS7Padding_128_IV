package com.lantianle.app.modules.mine.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.baselibrary.recycleradapter.BaseQuickAdapter;
import com.android.baselibrary.recycleradapter.BaseViewHolder;
import com.android.baselibrary.util.GlideUtils;
import com.lantianle.app.R;
import com.lantianle.app.service.DownLoadInfo;
import com.lantianle.app.util.Utils;

import java.util.List;

/**
 * Created by yongqianggeng on 2018/10/5.
 */

public class MyCacheListAdapter extends BaseQuickAdapter<DownLoadInfo, BaseViewHolder> {
    public MyCacheListAdapter(int layoutResId, @Nullable List<DownLoadInfo> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, DownLoadInfo item) {
        TextView textView = helper.getView(R.id.size_tv);
        textView.setText(Utils.getBytesToMBString(item.getTotalBytes()) + "");
        TextView nameTv = helper.getView(R.id.name_tv);
        nameTv.setText(item.getName());
        ImageView img = helper.getView(R.id.img);
        GlideUtils
                .getInstance()
                .LoadNewContextBitmap(mContext,
                        item.getCover(),
                        img,
                        R.mipmap.video_cover,
                        R.mipmap.video_cover,
                        GlideUtils.LOAD_BITMAP);
    }
}
