package com.example.mitchelle.giftzawadi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class FurtherDesFragment extends ListFragment  {
    private ImageView movetofinal;


    //// For foodie
    String[] foods = new String[] {
            "Foodie",
            "Arts Person",
            "Fashionista",
            "Gadgets Person",
            "Books Reader",
            "Movie Freak",
            "Event Person",
            "Sporty Person"
    };

    int[] foodimages = new int[]{
            R.drawable.foodiepeople,
            R.drawable.artsperson,
            R.drawable.fashion,
            R.drawable.gadgetpeople,
            R.drawable.bookmanfinal,
            R.drawable.newmovies,
            R.drawable.eventsperson,
            R.drawable.finalactiveman


    };
    /////end foodie
    ////////

    // Array of strings to store currencies
    String[] currency = new String[]{
            "Indian Rupee",
            "Pakistani Rupee",
            "Sri Lankan Rupee",
            "Renminbi",
            "Bangladeshi Taka",
            "Nepalese Rupee",
            "Afghani",
            "North Korean Won",
            "South Korean Won",
            "Japanese Yen"
    };
    public String cat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {


        Bundle bundle = this.getArguments();
        if (bundle != null) {
             cat = bundle.getString("category", "nothing");
            String desc = bundle.getString("desc", "nothing");
        }

        if(cat.equals("Foodie")){

            // Each row in the list stores country name, currency and flag
            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<9;i++){
                try {
                    HashMap<String, String> hm = new HashMap<String,String>();
                    hm.put("txt", " " + foods[i]);
                    hm.put("cur"," " + currency[i]);
                    hm.put("flag", Integer.toString(foodimages[i]) );
                    aList.add(hm);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Keys used in Hashmap
            String[] from = { "flag","txt"};

            // Ids of views in listview_layout
            int[] to = { R.id.flag,R.id.txt};

            // Instantiating an adapter to store each items
            // R.layout.listview_layout defines the layout of each item

            SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);

            setListAdapter(adapter);
            getActivity().setTitle(cat);

        }else if(cat.equals("Foodie")){




        }else if(cat.equals("Foodie")){


        }else if(cat.equals("Foodie")){


        }else if(cat.equals("Foodie")){


        }else if(cat.equals("Foodie")){


        }else if(cat.equals("Foodie")){


        }else if(cat.equals("Foodie")){


        }else if(cat.equals("Foodie")){


        }





        return super.onCreateView(inflater, container, savedInstanceState);



    }

    @Override
    public void onListItemClick(ListView l, View v, int pos, long id) {
        super.onListItemClick(l, v, pos, id);
        Intent intent = new Intent(getActivity(), FinalActivity.class);
        startActivity(intent);

    }





}