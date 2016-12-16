package pe.gob.ign.ignperu.Adaptador;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.R;



/**
 * Created by prueba on 10/11/2016.
 */
public class CustomAdapter extends PagerAdapter {
    private int[] imgs= {R.drawable.pic1, R.drawable.pic2,R.drawable.pic3, R.drawable.pic4};
    private LayoutInflater inflater;
    private Context ctx;

    public CustomAdapter(Context ctx){
        this.ctx= ctx;

    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.activity_swipe, container, false);
        ImageView img=(ImageView)v.findViewById(R.id.imageView);

        img.setImageResource(imgs[position]);

        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}
