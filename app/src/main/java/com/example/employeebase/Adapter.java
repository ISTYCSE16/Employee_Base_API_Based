package com.example.employeebase;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    public List<ModelClass>userList;

    public Adapter(List<ModelClass>userList) {this.userList = userList;} // Since we are setting that here, we can always dynamically make a list and pass it here

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int pic = userList.get(position).getImageView();
        String name = userList.get(position).getName();
        String posit = userList.get(position).getPosition();
        String phoneNumber = userList.get(position).getPhoneNumber();
        String projects = userList.get(position).getProjects();

        holder.setData(pic, name, posit, phoneNumber);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailsPage.class);
                intent.putExtra("personImage", pic);
                intent.putExtra("name", name);
                intent.putExtra("position", posit);
                intent.putExtra("phoneNumber", phoneNumber);
                intent.putExtra("projects", projects);

                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView pic;
        private TextView name;
        private TextView time;
        private TextView message;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            pic = itemView.findViewById(R.id.personImage);
            name = itemView.findViewById(R.id.employeeName);
            message = itemView.findViewById(R.id.position);
            time = itemView.findViewById(R.id.phoneNumber);
        }

        public void setData(int picture, String _name, String _position, String _phoneNumber){
            pic.setImageResource(picture);
            name.setText(_name);
            message.setText(_position);
            time.setText(_phoneNumber);

        }
    }
}
