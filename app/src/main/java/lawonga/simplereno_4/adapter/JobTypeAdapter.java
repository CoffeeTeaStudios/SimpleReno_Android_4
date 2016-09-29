package lawonga.simplereno_4.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import lawonga.simplereno_4.R;

/**
 * Created by Andy on 9/13/2016.
 */
public class JobTypeAdapter extends RecyclerView.Adapter<JobTypeAdapter.JobTypeViewHolder> {
    private Context context;
    private ArrayList<String> categories;

    public JobTypeAdapter(ArrayList<String> categories) {
        this.categories = categories;
    }

    @Override
    public JobTypeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jobcategory, parent, false);
        return new JobTypeAdapter.JobTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(JobTypeViewHolder holder, int position) {
        holder.title.setText(categories.get(position));
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class JobTypeViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_jobcategory_tv_title) TextView title;
        @BindView(R.id.item_jobcategory_iv) ImageView imageView;

        public JobTypeViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Call on the activity to switch this fragment out

                }
            });
        }
    }
}
