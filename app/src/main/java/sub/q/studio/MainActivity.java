package sub.q.studio;

import android.content.*;
import android.os.*;
import android.graphics.*;


import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import java.util.*;
import android.view.View.*;
import com.google.api.services.customsearch.*;
import com.google.api.services.customsearch.model.*;
import com.google.api.client.googleapis.services.*;
import android.content.res.*;
import org.apache.http.client.*;
import android.support.v4.app.*;
import android.support.v7.*;
import android.support.v7.app.*;
import android.graphics.drawable.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity
{
	public static final GoogleClientRequestInitializer KEY_INITIALIZER =
	new CustomsearchRequestInitializer("collagemaker-1512357997022");
	
	private ActionBar mActionBar;
	private EditText imageQueryEditText;
	private Button searchBtn;
	private Button uploadImgBtn;
	private Button randomImgBtn;
	
	private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Toolbar tb = (Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(mActionBar);
		mActionBar = getSupportActionBar();
		
		imageQueryEditText = (EditText)findViewById(R.id.imageQueryEditText);
		searchBtn = (Button)findViewById(R.id.searchBtn);
		searchBtn.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v){
					if(v.getId() == R.id.searchBtn) {
						List<Bitmap> bitmaps = searchForImages("");
						
						FragmentManager fm = getSupportFragmentManager();
						FragmentTransaction ft = fm.beginTransaction();
						if(fm.findFragmentByTag("imgViewFrag") == null) {
							ft.add(R.id.imageViewFragmentFrame, new ImgGridFragment(bitmaps), "imgViewFrag");
						}
						else {
							ft.replace(R.id.imageViewFragmentFrame, new ImgGridFragment(bitmaps), "imgViewFrag");
							ft.addToBackStack(null);
						}
						ft.commit();						
					}
				}
		});
		uploadImgBtn = (Button)findViewById(R.id.uploadImgBtn);
		randomImgBtn = (Button)findViewById(R.id.randomImgBtn);
		
		
		
		
    }

	
	
	
	
	private List<Bitmap> searchForImages(String query){
	
		List<Bitmap> bitmaps = new ArrayList<Bitmap>();
		Random r = new Random();
		int size = r.nextInt(r.nextInt(100));
		for(int i = 0; i < size; i++) {
			bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.abc_ic_star_black_48dp));
		}

		return bitmaps;
	}	
}
