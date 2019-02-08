package snehal.aad11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Item> {
    ArrayList<Item> animalList=new ArrayList<>();
    public MyAdapter(CustomAdapterActivity mainActivity, int custom_list_view_items, ArrayList<Item> animalList) {
        super(mainActivity,custom_list_view_items,animalList);
        animalList=animalList;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.custom_list_view_items,null);
        TextView textView=view.findViewById(R.id.textViewcustom);
        ImageView imageView=view.findViewById(R.id.ImageViewcustom);
        textView.setText(animalList.get(position).getAnimalName());
        imageView.setImageResource(animalList.get(position).getAnimalImage());
        return view;
    }
}