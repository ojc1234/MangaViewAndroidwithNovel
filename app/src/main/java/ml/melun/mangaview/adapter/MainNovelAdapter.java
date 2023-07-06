package ml.melun.mangaview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ml.melun.mangaview.R;
import ml.melun.mangaview.mangaview.MainPageWebtoon;
import ml.melun.mangaview.mangaview.Ranking;
import ml.melun.mangaview.ui.NpaLinearLayoutManager;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static ml.melun.mangaview.MainApplication.p;

public class MainNovelAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    LinearLayoutManager manager;
    Context context;
    boolean dark;
    LayoutInflater inflater;
    List<Ranking<?>> dataSet;
    MainAdapter.onItemClick listener;

    final static int HEADER = 23;

    final static int NN = 24;
    final static int AN = 25;
    final static int GN = 26;
    final static int CN = 27;
    final static int NB = 28;
    final static int AB = 29;
    final static int GB = 30;
    final static int CB = 31;



    public MainNovelAdapter(Context context) {
        this.context = context;
        this.dark = p.getDarkTheme();
        manager = new NpaLinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        inflater = LayoutInflater.from(context);
        dataSet = MainPageWebtoon.getBlankDataSet();
        setLoading();
        setHasStableIds(false);
        setLoading();
    }

    public void setLoading() {
        // show loading status to user
        dataSet = MainPageWebtoon.getBlankDataSet();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
