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

	public ImgGridFragment(Context context)
	{
		this.context = context;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View v = inflater.inflate(R.layout.fragment_image_gridview, container, false);
		recyclerView = (RecyclerView) v.findViewById(R.id.rvMain);
		
		TextView tv = (TextView) v.findViewById(R.id.fragmentImageGridviewTextView);
		Random r = new Random();
		tv.setText("Number: " + String.valueOf(r.nextInt(10)));
		
		
		return v;
	}

	
	
	
	
	
	
	
}

