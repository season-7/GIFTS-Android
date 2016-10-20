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
           /* "Fashionista",
            "Gadgets Person",
            "Books Reader",
            "Movie Freak",
            "Event Person",
            "Sporty Person"*/
    };

    int[] foodimages = new int[]{
            R.drawable.foodiepeople,
            R.drawable.artsperson
    };



    String[] currency = new String[]{
            "Indian Rupee",
            "Pakistani Rupee",
    };
    /////end foodie
    ////////

    ////arts

    String[] arts = new String[] {
            "Foodie",
            "Arts Person",
    };

    int[] artimages = new int[]{
            R.drawable.bookmanfinal,
            R.drawable.newmovies
    };



    String[] additional = new String[]{
            "Indian Rupee",
            "Pakistani Rupee",
    };
    /////end arts
    ////////
    String[] fashionista = new String[] {
            "Foodie",
            "Arts Person",
    };

    int[] fashionistaimages = new int[]{
            R.drawable.bookmanfinal,
            R.drawable.newmovies
    };

    // Array of strings to store additional information
    String[] additionalfashion = new String[]{
            "this",
            "that",
    };
    /////end foodie
    ////////

    String[] gadgets = new String[] {
            "Foodie",
            "Arts Person",
    };

    int[] gadgetimages = new int[]{
            R.drawable.bookmanfinal,
            R.drawable.newmovies
    };

    // Array of strings to store additional information
    String[] additionalgadget = new String[]{
            "nice",
            "cool",
    };
    /////end foodie
    ////////

    String[] books = new String[] {
            "Foodie",
            "Arts Person",
    };

    int[] bookimages = new int[]{
            R.drawable.bookmanfinal,
            R.drawable.newmovies
    };

    // Array of strings to store additional information
    String[] additionalbook = new String[]{
            "nice",
            "cool",
    };
    /////end foodie
    ////////


    public String cat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {


        Bundle bundle = this.getArguments();
        if (bundle != null) {
             cat = bundle.getString("category", "nothing");
            String desc = bundle.getString("desc", "nothing");
        }

        if(cat.equals("Foodie")){

            // Each row in the list stores gift, name and description
            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<9;i++){
                try {
                    HashMap<String, String> hm = new HashMap<String,String>();
                    hm.put("txt", " " + foods[i]);
                    hm.put("cur"," " + currency[i]);
                    hm.put("gift", Integer.toString(foodimages[i]) );
                    aList.add(hm);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Keys used in Hashmap
            String[] from = { "gift","txt"};


            // Ids of views in listview_layout
            int[] to = { R.id.flag,R.id.txt};

            // Instantiating an adapter to store each items
            // R.layout.listview_layout defines the layout of each item

            SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);

            setListAdapter(adapter);
            getActivity().setTitle(cat);

        }else if(cat.equals("Arts Person")){

            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<9;i++){
                try {
                    HashMap<String, String> hm = new HashMap<String,String>();
                    hm.put("txt", " " + arts[i]);
                    hm.put("cur"," " + additional[i]);
                    hm.put("gift", Integer.toString(artimages[i]) );
                    aList.add(hm);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Keys used in Hashmap
            String[] from = { "gift","txt"};

            // Ids of views in listview_layout
            int[] to = { R.id.flag,R.id.txt};

            // Instantiating an adapter to store each items
            // R.layout.listview_layout defines the layout of each item

            SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);

            setListAdapter(adapter);
            getActivity().setTitle(cat);




        }else if(cat.equals("Fashionista")){

            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<9;i++){
                try {
                    HashMap<String, String> hm = new HashMap<String,String>();
                    hm.put("txt", " " + fashionista[i]);
                    hm.put("cur"," " + additionalfashion[i]);
                    hm.put("gift", Integer.toString(fashionistaimages[i]) );
                    aList.add(hm);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Keys used in Hashmap
            String[] from = { "gift","txt","cur"};

            // Ids of views in listview_layout
            int[] to = { R.id.flag,R.id.txt,R.id.txt2};

            // Instantiating an adapter to store each items
            // R.layout.listview_layout defines the layout of each item

            SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);

            setListAdapter(adapter);
            getActivity().setTitle(cat);




        }else if(cat.equals("Gadgets Person")){
            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<9;i++){
                try {
                    HashMap<String, String> hm = new HashMap<String,String>();
                    hm.put("txt", " " + gadgets[i]);
                    hm.put("cur"," " + additionalgadget[i]);
                    hm.put("gift", Integer.toString(gadgetimages[i]) );
                    aList.add(hm);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Keys used in Hashmap
            String[] from = { "gift","txt","cur"};

            // Ids of views in listview_layout
            int[] to = { R.id.flag,R.id.txt,R.id.txt2};

            // Instantiating an adapter to store each items
            // R.layout.listview_layout defines the layout of each item

            SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);

            setListAdapter(adapter);
            getActivity().setTitle(cat);



        }else if(cat.equals("Books Reader")){

            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<9;i++){
                try {
                    HashMap<String, String> hm = new HashMap<String,String>();
                    hm.put("txt", " " + books[i]);
                    hm.put("cur"," " + additionalbook[i]);
                    hm.put("gift", Integer.toString(bookimages[i]) );
                    aList.add(hm);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Keys used in Hashmap
            String[] from = { "gift","txt","cur"};

            // Ids of views in listview_layout
            int[] to = { R.id.flag,R.id.txt,R.id.txt2};

            // Instantiating an adapter to store each items
            // R.layout.listview_layout defines the layout of each item

            SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);

            setListAdapter(adapter);
            getActivity().setTitle(cat);


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