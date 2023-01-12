package layout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.layout2.R

class DataAdapter(private val context: Context, val list: ArrayList<DataModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>()

{

    companion object
    {
        val VIEW_TYPE_ONE=1
        val VIEW_TYPE_TWO=2

    }
    class  view_holder_one(itemView:View):RecyclerView.ViewHolder(itemView)

    {
        val textData:TextView=itemView.findViewById(R.id.textViewData)
    }
    class  view_holder_two(itemView:View):RecyclerView.ViewHolder(itemView)

    {
        val textDatatwo:TextView=itemView.findViewById(R.id.textView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == VIEW_TYPE_ONE) {
            return view_holder_one(
                LayoutInflater.from(context).inflate(R.layout.layout_one, parent, false)
            )
        }
        else {
            return view_holder_two(LayoutInflater.from(context).inflate(R.layout.layout_two, parent, false)
            )
        }
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)
    {
        val data=list[position]

    }

    override fun getItemCount(): Int {
        return list.size
    }
}