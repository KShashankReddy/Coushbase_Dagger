package com.example.shashankreddy.couachbase_dagger_demo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.couchbase.lite.Document;

import java.util.ArrayList;

/**
 * Created by shashank reddy on 2/8/2017.
 */
public class TodoAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Document> documentList;

    public TodoAdapter(Context context, ArrayList<Document> documentList) {
        this.context = context;
        this.documentList = documentList;
    }

    public int getCount() {
        return this.documentList.size();
    }

    public Object getItem(int position) {
        return this.documentList.get(position);
    }

    public long getItemId(int position) {
        return 0;
    }

    public int getIndexOf(String id) {
        for(int i = 0; i < this.documentList.size(); i++) {
            if(this.documentList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        TextView todoTitle = null;
        Document currentDocument;
        try {
            if(convertView == null) {
                todoTitle = new TextView(this.context);
                todoTitle.setPadding(10, 25, 10, 25);
            } else {
                todoTitle = (TextView) convertView;
            }
            currentDocument = this.documentList.get(position);
            todoTitle.setText(String.valueOf(currentDocument.getProperty("todo")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return todoTitle;
    }

}
