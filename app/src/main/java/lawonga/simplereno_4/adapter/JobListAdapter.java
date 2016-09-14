package lawonga.simplereno_4.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import lawonga.simplereno_4.model.JobModel;

/**
 * Created by Andy on 9/13/2016.
 */
public class JobListAdapter extends RecyclerView.Adapter<JobListAdapter.ViewHolder> {

    Context context;
    ArrayList<JobModel> jobObjects;

    public JobListAdapter(Context context, ArrayList<JobModel> jobObjects) {
        this.context = context;
        this.jobObjects = jobObjects;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return jobObjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
