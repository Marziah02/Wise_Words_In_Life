package com.aaa.wisewordsinlife.wiseadapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.aaa.wisewordsinlife.wiseinterface.ImageClick;
import com.aaa.wisewordsinlife.R;
import com.aaa.wisewordsinlife.wiseactivities.FullScreenImage;

import java.util.ArrayList;
import java.util.List;



public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ContentView> {
    List<Integer> imgList = new ArrayList<>(  );


    public ImageAdapter(List<Integer> imgList) {
        this.imgList = imgList;

    }

    @NonNull
    @Override
    public ContentView onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {

        final View view = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.image_layout,viewGroup,false );

        return new ContentView (view);


    }

    @Override
    public void onBindViewHolder(@NonNull ContentView contentView, int position) {

        contentView.imageView.setImageResource( imgList.get( position ) );
        contentView.setImageClick( new ImageClick() {
            @Override
            public void onClickMe(View view, int position) {
                imgList.get(position);
                Intent intent = new Intent( view.getContext(), FullScreenImage.class );
//                intent.putExtra( "Images", String.valueOf( imgList ) );
                intent.putExtra( "Position",position );
                view.getContext().startActivity( intent );
            }
        } );


    }



    @Override
    public int getItemCount() {
        return imgList.size();
    }

    public class ContentView extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        ImageClick imageClick;
        public ContentView(@NonNull final View itemView) {
            super( itemView );
            imageView = (ImageView)itemView.findViewById( R.id.imgVW );
            itemView.setOnClickListener( this );
        }

        @Override
        public void onClick(View v) {
            this.imageClick.onClickMe( v,getLayoutPosition() );

        }

        public void setImageClick(ImageClick ic) {
            this.imageClick = ic;
        }

    }
}
