package alfianagramerry.mobpro.tugasbesar.androidtutorial.Adapter;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/*
 * Created by Alfian Hadi Pratama on 25/12/2017.
 */

public class Data1 extends RecyclerView.Adapter<Data1.ViewHolder> {

    private ArrayList<ListData> listData;
    private Context context;
    String app;

    public Data1(Context context, ArrayList<ListData> listData) {
        this.listData = listData;
        this.context = context;
    }

    @Override
    public Data1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_view, parent, false));
    }

    @Override
    public void onBindViewHolder(Data1.ViewHolder holder, int position) {
        holder.textView.setText(listData.get(position).getTitle());

        // Toast.makeText(context,"The Item Clicked is: "+position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView textView;

        private ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.title);
            itemView.setOnClickListener(this);
            context = itemView.getContext();
        }

        @SuppressLint("Assert")
        @Override
        public void onClick(View view) {

            app = "alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain."+textView.getText()+"."+textView.getText();
            Intent intent = null;
            intent = new Intent(Intent.ACTION_MAIN)
                    .addCategory(intent.CATEGORY_LAUNCHER)
                    .setClassName(context, app)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    .addFlags(Intent.FLAG_FROM_BACKGROUND)
                    .setComponent(new ComponentName(context, app));
            context.getApplicationContext().startActivity(intent);
/*
            final Intent intent;
            switch (getAdapterPosition()) {
                case 0:
                    intent = new Intent(context, GyroscopeSensor.class);
                    break;

                case 1:
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.youtube.com"));
                    break;

                default:
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.facebook.com"));
                    break;
            }
            context.startActivity(intent); */

        }
    }
}
