package com.example.android.myclassroom;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
public class lectureAdapter extends ArrayAdapter<lecture> {
    public lectureAdapter(Context context, ArrayList<lecture> lectures) {
        super(context, 0, lectures);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.itemlist, parent, false);
        }
        lecture currentLec = getItem(position);
        TextView SubjectTextView = (TextView) listItemView.findViewById(R.id.subject_text_view);
        SubjectTextView.setText(currentLec.getSubject());
        TextView TimeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);
        TimeTextView.setText(currentLec.getTime());
        TextView FacultyTextView = (TextView) listItemView.findViewById(R.id.faculty_text_view);
        FacultyTextView.setText(currentLec.getFaculty());
        TextView RoomTextView = (TextView) listItemView.findViewById(R.id.room_text_view);
        RoomTextView.setText(currentLec.getRoom());

        return listItemView;
    }
}
