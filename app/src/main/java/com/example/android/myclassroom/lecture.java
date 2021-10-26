package com.example.android.myclassroom;

public class lecture {
    String subject, time, room, faculty;

    public lecture(String sub, String t, String r, String fac) {
        subject = sub;
        time = t;
        room = r;
        faculty = fac;
    }

    public String getSubject() {
        return subject;
    }
    public String getTime() {
        return time;
    }
    public String getRoom()
    {
        return room;
    }
    public String getFaculty()
    {
        return faculty;
    }
}

