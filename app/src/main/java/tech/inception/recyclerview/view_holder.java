package tech.inception.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ghumman on 4/14/2017.
 */

public class view_holder extends RecyclerView.ViewHolder {


    // text view boxes for views in cell layout
    public TextView order_id , user_id , date , time ;

    public view_holder(View itemView) {
        super(itemView);


        // here itemView contain the cell layout
        // finding view by id , here we use itemView.findViewById becoz itemView contains cell layout
        order_id = (TextView) itemView.findViewById(R.id.order_id_text);
        user_id = (TextView) itemView.findViewById(R.id.user_id_text);
        date = (TextView) itemView.findViewById(R.id.date_id_text);
        time = (TextView) itemView.findViewById(R.id.time_id_text);
    }
}
