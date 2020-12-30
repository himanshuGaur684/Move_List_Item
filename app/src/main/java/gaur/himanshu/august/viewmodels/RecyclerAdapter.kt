package gaur.himanshu.august.viewmodels

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {


    var list = listOf<String>()

    fun setContentList(list: List<String>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val text_view = view.findViewById<TextView>(R.id.list_item_tv)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdapter.MyViewHolder {
        val views = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(views)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.MyViewHolder, position: Int) {
        holder.text_view.text = list[position]
    }

    override fun getItemCount(): Int {
        return this.list.size
    }
}