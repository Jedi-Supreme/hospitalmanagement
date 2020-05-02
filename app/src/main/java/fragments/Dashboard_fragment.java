package fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jedi_supreme.hospitalmanagement.R;
import com.jedi_supreme.hospitalmanagement.adapters.gridAdapter;

public class Dashboard_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_dashboard,container,false);

        GridView dashGrid = view.findViewById(R.id.dash_gridview);

        String[] text_arr = new String[]{"Records", "Nurses", "Doctors","Pharmacy","Cashier","Finance","Administrator"};
        int[] icons_id_arr = new int[]{R.drawable.patient_records, R.drawable.nurse_male_dark, R.drawable.doctor_male, R.drawable.medicine_icon, R.drawable.cashier_icon, R.drawable.finance_icon, R.drawable.system_admin_icon};

        if (container != null) {
            gridAdapter grid_adapter = new gridAdapter(container.getContext(),text_arr,icons_id_arr);
            dashGrid.setAdapter(grid_adapter);
        }

        return view;
    }
}
