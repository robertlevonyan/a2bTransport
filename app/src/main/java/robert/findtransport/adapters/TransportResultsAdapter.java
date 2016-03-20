package robert.findtransport.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import robert.findtransport.R;
import robert.findtransport.models.Transport;

/**
 * Created by robert on 3/20/16.
 */
public class TransportResultsAdapter extends RecyclerView.Adapter<TransportResultsAdapter.TransportViewHolder> {

    private Context context;
    private List<Transport> transports;

    public TransportResultsAdapter(Context context, List<Transport> transports) {
        this.context = context;
        this.transports = transports;
    }

    @Override
    public TransportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_result_list, null);

        return new TransportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TransportViewHolder holder, int position) {
        Transport transport = transports.get(position);

        holder.getTransportAvatar().setImageResource(transport.getTransportIcon());
        holder.getTransportNumber().setText(transport.getTransportNumber());
        holder.getTransportType().setText(transport.getTransportType());
        holder.getTransportRoutes().setText(transport.getTransportRoutes());

    }

    @Override
    public int getItemCount() {
        return transports.size();
    }

    public class TransportViewHolder extends RecyclerView.ViewHolder {

        private ImageView transportAvatar;
        private TextView transportNumber;
        private TextView transportType;
        private TextView transportRoutes;

        public TransportViewHolder(View itemView) {
            super(itemView);
        }

        public ImageView getTransportAvatar() {
            return transportAvatar;
        }

        public TextView getTransportNumber() {
            return transportNumber;
        }

        public TextView getTransportType() {
            return transportType;
        }

        public TextView getTransportRoutes() {
            return transportRoutes;
        }
    }
}
