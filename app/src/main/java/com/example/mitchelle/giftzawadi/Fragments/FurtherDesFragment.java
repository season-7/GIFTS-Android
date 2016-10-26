package com.example.mitchelle.giftzawadi.Fragments;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.mitchelle.giftzawadi.Activities.FinalActivity;
import com.example.mitchelle.giftzawadi.R;

public class FurtherDesFragment extends ListFragment  {
    private ImageView movetofinal;


    //// For foodie
    String[] foods = new String[] {
            "Sweet Person",
            "Snacks Person",

    };

    int[] foodimages = new int[]{
            R.drawable.sweetorsnack,
            R.drawable.snackperson
    };



    String[] currency = new String[]{
            "Sugar is the Way to go",
            "Not too much Sugar",
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

    String[] movie = new String[] {
            "Horror",
            "Action",
    };

    int[] movieimages = new int[]{
            R.drawable.bookmanfinal,
            R.drawable.newmovies
    };

    // Array of strings to store additional information
    String[] additionalmovie = new String[]{
            "horror",
            "action",
    };
    /////end foodie
    ////////

    String[] events = new String[] {
            "Horror",
            "Action",
    };

    int[] eventimages = new int[]{
            R.drawable.bookmanfinal,
            R.drawable.newmovies
    };

    // Array of strings to store additional information
    String[] additionalevent = new String[]{
            "horror",
            "action",
    };
    /////end foodie


    String[] sporty = new String[] {
            "Football Fan",
            "Jogging",
    };

    int[] sportyimages = new int[]{
            R.drawable.bookmanfinal,
            R.drawable.newmovies
    };

    // Array of strings to store additional information
    String[] additionalsporty = new String[]{
            "jersey",
            "timer",
    };
    /////end foodie


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
            String[] from = { "gift","txt","cur"};


            // Ids of views in listview_layout
            int[] to = { R.id.flag,R.id.txt,R.id.txt2};

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


        }else if(cat.equals("Movie Freak")){

            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<9;i++){
                try {
                    HashMap<String, String> hm = new HashMap<String,String>();
                    hm.put("txt", " " + movie[i]);
                    hm.put("cur"," " + additionalmovie[i]);
                    hm.put("gift", Integer.toString(movieimages[i]) );
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


        }else if(cat.equals("Event Person")){
            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<9;i++){
                try {
                    HashMap<String, String> hm = new HashMap<String,String>();
                    hm.put("txt", " " + events[i]);
                    hm.put("cur"," " + additionalevent[i]);
                    hm.put("gift", Integer.toString(eventimages[i]) );
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


        }else if(cat.equals("Sporty Person")){

            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<9;i++){
                try {
                    HashMap<String, String> hm = new HashMap<String,String>();
                    hm.put("txt", " " + sporty[i]);
                    hm.put("cur"," " + additionalsporty[i]);
                    hm.put("gift", Integer.toString(sportyimages[i]) );
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