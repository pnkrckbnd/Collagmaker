package sub.q.studio;
import android.support.v7.widget.*;
import android.view.*;
import java.util.*;
import android.graphics.*;
import android.widget.*;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ImgGridViewHolder> {
	List<Bitmap> bitmaps;
	

	public RecycleViewAdapter(List<Bitmap> bitmaps){
		this.bitmaps = bitmaps;
	}
	
	
	@Override
	public ImgGridViewHolder onCreateViewHolder(ViewGroup viewGroup, int pos){
		View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_thumb_view, viewGroup);
		ImgGridViewHolder holder = new ImgGridViewHolder(view);
		return holder;
	}

	@Override
	public void onBindViewHolder(ImgGridViewHolder holder, int pos){
		Bitmap thumbImg = bitmaps.get(pos);
		String dimens = (thumbImg.getWidth() + " x " + thumbImg.getHeight());
		
		holder.mImageView.setImageBitmap(thumbImg);
		holder.mTextView.setText(dimens);
	}

	@Override
	public int getItemCount(){
		// TODO: Implement this method
		return (null == bitmaps ? 0 : bitmaps.size());
	}


	protected class ImgGridViewHolder extends RecyclerView.ViewHolder {
		public ImageView mImageView;
		public TextView mTextView;
		
		public ImgGridViewHolder(View view){
			super(view);
			mImageView = (ImageView)view.findViewById(R.id.ivImage);
			mTextView = (TextView)view.findViewById(R.id.tvDimens);
		}
	}
}
