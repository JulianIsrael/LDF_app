package com.ntv.ldf_app.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ntv.ldf_app.R;
import com.ntv.ldf_app.Schedule.WeeklySchedule;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Jose on 3/24/2015.
 */
public class ScheduleAdapter extends BaseAdapter {
    WeeklySchedule mWeeklySchedule;
    Context mContext;
    LayoutInflater inflater ;
    int mWeeklyScheduleID;

    public ScheduleAdapter(int weeklySchedule, Context context) {

        this.mWeeklyScheduleID = weeklySchedule;
        this.mWeeklySchedule = new WeeklySchedule(weeklySchedule);
        this.mContext = context;
        this.inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return (this.mWeeklySchedule.getmWeeklyMatch().size());
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return mWeeklyScheduleID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        ScheduleHolder holder = new ScheduleHolder();
        if(convertView==null) {

            convertView = inflater.inflate(R.layout.weekly_schedule_list_row, parent, false);
            holder.team1 = (TextView) convertView.findViewById(R.id.time1);
         //   holder.team2 = (TextView) convertView.findViewById(R.id.team_2_id);
            holder.teamLogo1= (ImageView) convertView.findViewById(R.id.image_team1);
            holder.teamLogo2= (ImageView) convertView.findViewById(R.id.image_team2);
            holder.time = (TextView) convertView.findViewById(R.id.time);
            holder.stadium = (TextView) convertView.findViewById(R.id.stadium);
            convertView.setTag(holder);

        }else{
            holder = (ScheduleHolder) convertView.getTag();
        }

        holder.team1.setText(mWeeklySchedule.getmWeeklyMatch().get(position).getTime());

        //     holder.team2.setText( mWeeklySchedule.getmWeeklyMatch().get(position).getTeamName(2));
        holder.teamLogo1.setImageResource(mWeeklySchedule.getmWeeklyMatch().get(position).getTeamImage(1));
        holder.teamLogo2.setImageResource(mWeeklySchedule.getmWeeklyMatch().get(position).getTeamImage(2));
        holder.time.setText(mWeeklySchedule.getmWeeklyMatch().get(position).getDate());

        holder.stadium.setText(mWeeklySchedule.getmWeeklyMatch().get(position).getStadium());

        return convertView;
    }

    class ScheduleHolder{
        TextView team1;
        TextView team2;
        ImageView teamLogo1;
        ImageView teamLogo2;
        TextView time;
        TextView stadium;
    }
}
