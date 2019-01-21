package org.goodev.retrofitdemo.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.okhttp.OkHttpClient;


import retrofit.Callback;

import org.goodev.retrofitdemo.R;
import org.goodev.retrofitdemo.model.Contacto;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ContactoAdapter{

    private List<Contacto> mDataset;
    private Context mContext;

    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    private ContactoAdapter.OnItemClickListener mOnItemClickListener;

    public ContactoAdapter(Context mContext,List<Contacto> mDataset) {
        this.mDataset = mDataset;
        this.mContext = mContext;
    }
/*
    @NonNull
    @Override
    public FamiliaObjetoItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ConstraintLayout view  = (ConstraintLayout) LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.contacto_layout,parent,false);
        return new FamiliaObjetoItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  FamiliaObjetoItemHolder holder, int position) {
        final int mPosition = position;
        final FamiliaObjetoItemHolder mHolder = holder;

        if(!TextUtils.isEmpty(mDataset.get(mPosition).getPhoto())) {
            ImageLoaderFactory.getImageLoader(mContext).loadImage(mDataset.get(mPosition).getPhoto(), holder.mImageViewIcon);
            OkHttpClient okHttpClient;

            okHttpClient = new OkHttpClient();
            okHttpClient.setConnectTimeout(500, TimeUnit.MILLISECONDS);

            Picasso picasso = new Picasso.Builder(mContext)
                    .downloader(new OkHttpDownloader(okHttpClient))
                    .build();

            picasso
                    .load(mDataset.get(position).getPhoto())
                    .into(holder.mImageViewIcon, new Callback() {

                        @Override
                        public void onError() {
                            mHolder.mImageViewIcon.setImageResource(R.drawable.ic_launcher_background);
                            mHolder.mImageViewIcon.setVisibility(View.VISIBLE);
                        }

                        @Override
                        public void onSuccess() {
                            mHolder.mImageViewIcon.setVisibility(View.VISIBLE);
                        }
                    });
        }else{
            mHolder.mImageViewIcon.setImageResource(R.drawable.ic_launcher_background);
            mHolder.mImageViewIcon.setVisibility(View.VISIBLE);
        }

        mHolder.mTextViewName.setText(mDataset.get(position).getFirstName());
        mHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(mDataset.get(mPosition));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


    public  static class FamiliaObjetoItemHolder extends RecyclerView.ViewHolder {
        private TextView mTextViewName;
        private ImageView mImageViewIcon;

        private FamiliaObjetoItemHolder(View itemView) {
            super(itemView);
            mImageViewIcon = itemView.findViewById(R.id.familia_icon);
            mTextViewName = itemView.findViewById(R.id.name);
        }
    }
*/
    public interface OnItemClickListener{
        void onItemClick(Contacto contacto);
    }
}

