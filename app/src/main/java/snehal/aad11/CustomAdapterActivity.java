package snehal.aad11;

import android.app.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomAdapterActivity extends Activity {
    ListView simpleList;
    ArrayList<Item> animalList = new ArrayList<>();
    Button imswt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = findViewById(R.id.simpleList1);
        animalList.add(new Item("Tiger" , R.drawable.i1));
        animalList.add(new Item("Cat" , R.drawable.i2));
        animalList.add(new Item("Bird" , R.drawable.i3));
        animalList.add(new Item("Parrot" , R.drawable.i4));
        animalList.add(new Item("Dog" , R.drawable.i5));
        MyAdapter myAdapter = new MyAdapter(this,R.layout.custom_list_view_items,animalList);
        simpleList.setAdapter(myAdapter);

    }
}
