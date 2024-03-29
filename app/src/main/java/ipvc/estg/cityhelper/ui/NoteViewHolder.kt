package ipvc.estg.cityhelper.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.NO_POSITION
import ipvc.estg.cityhelper.R
import ipvc.estg.cityhelper.adapters.NoteAdapter

class NoteViewHolder(var noteAdapter: NoteAdapter, view: View, var onItemClickListener: OnItemClickListener? = null): RecyclerView.ViewHolder(view) {

    var title: TextView = view.findViewById(R.id.title)
    var description: TextView = view.findViewById(R.id.description)

    init {
        view.setOnClickListener(View.OnClickListener {
            if(adapterPosition != NO_POSITION) {
                onItemClickListener?.onItemClick(noteAdapter.getItemAt(adapterPosition))
            }
        })
    }
}