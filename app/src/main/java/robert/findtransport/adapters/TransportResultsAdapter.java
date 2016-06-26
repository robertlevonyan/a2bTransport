package robert.findtransport.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import robert.findtransport.R;
import robert.findtransport.activities.DetailsActivity;
import robert.findtransport.models.Transport;

/**
 * Created by robert on 3/20/16.
 */
public class TransportResultsAdapter extends RecyclerView.Adapter<TransportResultsAdapter.TransportViewHolder> {

    private Context context;
    private List<Transport> transports;
    private List<String[]> allRoutes;

    private String t;
    private int spanCount;
    private int lastPosition = -1;

    public TransportResultsAdapter(Context context, List<Transport> transports) {
        this.context = context;
        this.transports = transports;
        allRoutes = new ArrayList<>();
    }

    @Override
    public TransportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_result_list, null, false);

        final TextView transportNumber = (TextView) view.findViewById(R.id.transport_number);
        final TextView transportType = (TextView) view.findViewById(R.id.transport_type);
        final TextView transportRoutes = (TextView) view.findViewById(R.id.transport_routes);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("Details_number", transportNumber.getText().toString());
                intent.putExtra("Details_type", transportType.getText().toString());
                intent.putExtra("Details_stops", transportRoutes.getText().toString());
                for (int i = 0; i < allRoutes.size(); i++) {
                    if (Arrays.toString(allRoutes.get(i)).contains(transportNumber.getText().toString().replace("\t", ""))) {

                        if (transportType.getText().toString().equalsIgnoreCase(context.getResources().getString(R.string.bus))) {
                            t = "A";
                        } else if (transportType.getText().toString().equalsIgnoreCase(context.getResources().getString(R.string.microbus))) {
                            t = "M";
                        } else if (transportType.getText().toString().equalsIgnoreCase(context.getResources().getString(R.string.trolleybus))) {
                            t = "T";
                        }
                        if (Arrays.toString(allRoutes.get(i)).contains(t)
                                && Arrays.toString(allRoutes.get(i)).contains(transportRoutes.getText().toString().split(" - ")[0])
                                && Arrays.toString(allRoutes.get(i)).contains(transportRoutes.getText().toString().split(" - ")[1])) {
                            intent.putExtra("Details_route", allRoutes.get(i));
                        }
                    }
                }
                context.startActivity(intent);
            }
        });

        return new TransportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TransportViewHolder holder, int position) {

        Transport transport = transports.get(position);
        allRoutes.add(transport.getRoute().split("\t"));

        char[] current = transport.getRoute().toCharArray();

        if (Character.isDigit(current[0]) && !Character.isDigit(current[1])) {
            if (current[1] == context.getResources().getString(R.string.part_a).charAt(0)) {
                switch (current[3]) {
                    case 'T':
                        holder.getTransportType().setText(R.string.trolleybus);
                        break;
                    case 'M':
                        holder.getTransportType().setText(R.string.microbus);
                        break;
                    case 'A':
                        holder.getTransportType().setText(R.string.bus);
                        break;
                    default:
                        holder.getTransportType().setText(R.string.na);
                        break;
                }
            } else {
                switch (current[2]) {
                    case 'T':
                        holder.getTransportType().setText(R.string.trolleybus);
                        break;
                    case 'M':
                        holder.getTransportType().setText(R.string.microbus);
                        break;
                    case 'A':
                        holder.getTransportType().setText(R.string.bus);
                        break;
                    default:
                        holder.getTransportType().setText(R.string.na);
                        break;
                }
            }
        } else if (Character.isDigit(current[0]) && Character.isDigit(current[1]) && Character.isDigit(current[2])) {
            switch (current[4]) {
                case 'T':
                    holder.getTransportType().setText(R.string.trolleybus);
                    break;
                case 'M':
                    holder.getTransportType().setText(R.string.microbus);
                    break;
                case 'A':
                    holder.getTransportType().setText(R.string.bus);
                    break;
                default:
                    holder.getTransportType().setText(R.string.na);
                    break;
            }
        } else if (Character.isDigit(current[0]) && Character.isDigit(current[1])) {
            if (current[2] == context.getResources().getString(R.string.part_a).charAt(0)) {
                switch (current[4]) {
                    case 'T':
                        holder.getTransportType().setText(R.string.trolleybus);
                        break;
                    case 'M':
                        holder.getTransportType().setText(R.string.microbus);
                        break;
                    case 'A':
                        holder.getTransportType().setText(R.string.bus);
                        break;
                    default:
                        holder.getTransportType().setText(R.string.na);
                        break;
                }
            } else {
                switch (current[3]) {
                    case 'T':
                        holder.getTransportType().setText(R.string.trolleybus);
                        break;
                    case 'M':
                        holder.getTransportType().setText(R.string.microbus);
                        break;
                    case 'A':
                        holder.getTransportType().setText(R.string.bus);
                        break;
                    default:
                        holder.getTransportType().setText(R.string.na);
                        break;
                }
            }
        }

        if (Character.isDigit(current[2])) {
            holder.getTransportNumber().setText(current, 0, 3);
            holder.getTransportNumber().setTextSize(30f);
        } else if (current[2] == context.getResources().getString(R.string.part_a).charAt(0)) {
            holder.getTransportNumber().setText(current, 0, 3);
            holder.getTransportNumber().setTextSize(30f);
        } else {
            holder.getTransportNumber().setText(current, 0, 2);
            holder.getTransportNumber().setTextSize(45f);
        }

        if (holder.getTransportType().getText().equals(context.getResources().getString(R.string.trolleybus))) {
            holder.getTransportAvatar().setBackground(context.getResources().getDrawable(R.drawable.tbus));
        } else if (holder.getTransportType().getText().equals(context.getResources().getString(R.string.microbus))) {
            holder.getTransportAvatar().setBackground(context.getResources().getDrawable(R.drawable.mbus));
        } else if (holder.getTransportType().getText().equals(context.getResources().getString(R.string.bus))) {
            holder.getTransportAvatar().setBackground(context.getResources().getDrawable(R.drawable.bus));
        }

        String[] firstAndLastStop = transport.getRoute().split("\t");
        holder.getTransportRoutes().setText(String.format("%s - %s", firstAndLastStop[2], firstAndLastStop[firstAndLastStop.length - 1]));

        holder.getResultMain().setBackgroundColor(transport.getBackgroundColor());

        holder.getTransportNumber().setTextColor(transport.getTextColor());
        holder.getTransportType().setTextColor(transport.getTextColor());
        holder.getTransportRoutes().setTextColor(transport.getTextColor());

    }

    @Override
    public int getItemCount() {
        return transports.size();
    }

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public void onViewDetachedFromWindow(TransportViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.getResultMain().clearAnimation();
    }

    public class TransportViewHolder extends RecyclerView.ViewHolder {

        private RelativeLayout resultMain;
        private ImageView transportAvatar;
        private TextView transportNumber;
        private TextView transportType;
        private TextView transportRoutes;

        public TransportViewHolder(View itemView) {
            super(itemView);

            resultMain = (RelativeLayout) itemView.findViewById(R.id.result_main);
            transportAvatar = (ImageView) itemView.findViewById(R.id.transport_icon);
            transportNumber = (TextView) itemView.findViewById(R.id.transport_number);
            transportType = (TextView) itemView.findViewById(R.id.transport_type);
            transportRoutes = (TextView) itemView.findViewById(R.id.transport_routes);

        }

        public RelativeLayout getResultMain() {
            return resultMain;
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
