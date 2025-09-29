package com.voicereminder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ReminderAdapter extends RecyclerView.Adapter<ReminderAdapter.ViewHolder> {
    private ArrayList<Reminder> reminders;
    private MainActivity context;

    public ReminderAdapter(ArrayList<Reminder> reminders, MainActivity context) {
        this.reminders = reminders;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.reminder_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Reminder reminder = reminders.get(position);
        holder.reminderText.setText(reminder.getText());
        holder.reminderTime.setText(reminder.getTimestamp());
    }

    @Override
    public int getItemCount() {
        return reminders.size();
    }

    public void updateList(ArrayList<Reminder> newList) {
        reminders = newList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView reminderText;
        TextView reminderTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            reminderText = itemView.findViewById(R.id.reminderText);
            reminderTime = itemView.findViewById(R.id.reminderTime);
        }
    }
}
