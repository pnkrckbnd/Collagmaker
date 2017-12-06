package sub.q.studio;

import android.content.*;
import android.os.*;
import android.graphics.*;
import android.widget.*;
import android.view.*;
import android.support.v7.widget.*;
import android.support.v4.app.*;
import java.util.*;

public class ImgGridFragment extends Fragment
{
	RecyclerView recyclerView;
	Context context;
	List<Bitmap> mBitmaps;

	public ImgGridFragment(List<Bitmap> bitmaps)
	{
		mBitmaps = bitmaps;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.fragment_image_gridview, container);
	}

	@Override
	public void onViewCreated(View v, Bundle savedInstanceState)
	{
		super.onViewCreated(v, savedInstanceState);
		recyclerView = (RecyclerView) v.findViewById(R.id.rvMain);
		RecycleViewAdapter adapter = new RecycleViewAdapter(mBitmaps);
		recyclerView.setAdapter(adapter);
		LinearLayoutManager layout = new LinearLayoutManager(v.getContext());
		recyclerView.setLayoutManager(layout);

		
	}

	
	
	
	
	
	
	
	
}

